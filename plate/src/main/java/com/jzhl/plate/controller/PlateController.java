package com.jzhl.plate.controller;

import com.alibaba.fastjson.JSONObject;
import com.jzhl.plate.bean.BaseResult;
import com.jzhl.plate.bean.Resp;
import com.jzhl.plate.model.*;
import com.jzhl.plate.service.PlateConfigService;
import com.jzhl.plate.service.PlateDeviceService;
import com.jzhl.plate.service.PlateFeeConfigService;
import com.jzhl.plate.service.PlateRecordService;
import com.jzhl.plate.utils.PlateUtils;
import com.jzhl.plate.utils.RedisUtil;
import com.jzhl.plate.utils.StringUtils;
import com.jzhl.plate.utils.ZenithUtils;
import io.swagger.models.auth.In;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

@Controller
@RequestMapping("/plate")
public class PlateController {

    @Resource
    RedisUtil redisUtil;

    @Resource
    PlateUtils plateUtils;

    @Resource
    PlateDeviceService plateDeviceService;

    @Resource
    PlateConfigService plateConfigService;

    @Resource
    PlateRecordService plateRecordService;

    @Resource
    PlateFeeConfigService plateFeeConfigService;


    /**
     *  臻识车牌 -- 心跳反馈      47.92.114.198
     * @param request
     * @param response
     */
    @ResponseBody
    @RequestMapping("/heart")
    public void  heart(HttpServletRequest request, HttpServletResponse response)  throws Exception{

        Thread.sleep(2000);

        String deviceName = request.getParameter("device_name");
        String ipaddr = request.getParameter("ipaddr");
        String port = request.getParameter("port");
        String userName = request.getParameter("user_name");
        String passWd = request.getParameter("pass_wd");
        String serialno = request.getParameter("serialno");
        String channelNum = request.getParameter("channel_num");

        if(serialno != null){
            //查询redis中看看是否存在开闸记录
            if(!StringUtils.isEmpty(redisUtil.get("plate_open_" + serialno))){
                // 回复命令，控制设备开闸
                ZenithUtils.openDoor(response);

                redisUtil.remove("plate_open_" + serialno);

                //更新物联小区停车数量
                PlateDevice plateDevice = plateDeviceService.selectByExample(serialno);
                if(plateDevice != null){
                    PlateConfig plateConfig = plateConfigService.selectByExample(plateDevice.getDevDistrictId());
                    if(plateConfig != null) {
                        plateConfigService.updateByExampleSelective(plateDevice.getDevDistrictId(), plateConfig.getCarNumber(), "add");
                    }
                }
            }

            //将车牌识别设备的心跳时间添加到 redis  中
            Map<String, Date> map = (Map<String, Date>)redisUtil.get("plate_heart");
            if(map == null){
                map = new HashMap<>();
            }

            map.put(serialno,new Date());

            redisUtil.set("plate_heart",map);
        }
    }


    /**
     * 臻识设备 -- 识别车牌反馈数据
     * @param request
     * @param response
     */
    @ResponseBody
    @RequestMapping("/result")
    public void plateResult(HttpServletRequest request, HttpServletResponse response){
        Integer[] array = {5,6,8,9,10,15,16,17};
        JSONObject data = null;
        Resp stu = null;
        try {
            InputStream is = request.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "utf-8"));
            String line = null;
            StringBuffer content = new StringBuffer();
            while ((line = br.readLine()) != null) {
                content.append(line);
            }
            String reqStr = content.toString().trim();
            if (!StringUtils.isEmpty(reqStr)) {
                if (reqStr.contains("=")) {
                    reqStr = reqStr.replaceAll("=", ":");
                }
                if (!reqStr.startsWith("{")) {
                    reqStr = "{" + reqStr;
                }
                if (!reqStr.endsWith("}")) {
                    reqStr = reqStr + "}";
                }
                data = JSONObject.parseObject(reqStr);

                stu=(Resp) JSONObject.toJavaObject(data, Resp.class);
            }

            /**
             * 车牌类型 0：未知车牌:、1：蓝牌小汽车、2：:
             * 黑牌小汽车、3：单排黄牌、4：双排黄牌、 5：
             * 警车车牌、6：武警车牌、7：个性化车牌、8：单
             * 排军车牌、9：双排军车牌、10：使馆车牌、11：
             * 香港进出中国大陆车牌、12：农用车牌、13：教
             * 练车牌、14：澳门进出中国大陆车牌、15：双层
             * 武警车牌、16：武警总队车牌、17：双层武警总
             * 队车牌、18：民航车牌、19：新能源车牌
             *
             * 军用车牌全部放行   5,6,8,9,10,15,16,17
             */
            if(stu != null){
                String imageFile = stu.getAlarmInfoPlate().getResult().getPlateResult().getImageFile();  //全图
                String imageFragmentFile = stu.getAlarmInfoPlate().getResult().getPlateResult().getImageFragmentFile(); // 小图
                String license = stu.getAlarmInfoPlate().getResult().getPlateResult().getLicense();
                Integer isFakePlate = stu.getAlarmInfoPlate().getResult().getPlateResult().getIsFakePlate();  // 真伪车牌  是否伪车牌，0：真实车牌，1：伪车牌

                if(isFakePlate != null){
                     if(isFakePlate == 0){
                         boolean flag = Arrays.asList(array).contains(stu.getAlarmInfoPlate().getResult().getPlateResult().getType());
                         if(!flag){
                             plateUtils.addRecord(request,license, stu.getAlarmInfoPlate().getSerialno(),imageFile, imageFragmentFile,response);
                         }else{
                             ZenithUtils.openSpecial(license,response);
                         }
                     }
                }else{
                    boolean flag = Arrays.asList(array).contains(stu.getAlarmInfoPlate().getResult().getPlateResult().getType());
                    if(!flag){
                        plateUtils.addRecord(request, license, stu.getAlarmInfoPlate().getSerialno(),imageFile, imageFragmentFile,response);
                    }else{
                        ZenithUtils.openSpecial(license,response);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 小程序端调用的接口，获取支付信息
     * @param serialno
     * @return
     */
    @RequestMapping("/payInfo")
    @ResponseBody
    public BaseResult getPlatePayInfo(String serialno){

        System.out.println("--------------------  start payInfo ----------------------------");

        Integer id = (Integer) redisUtil.get("plate_pay_" + serialno);
        if(!StringUtils.isEmpty(id)){

            System.out.println("------------------id: " + id);

            PlateRecord plateRecord = plateRecordService.selectByExampleAndId(id);
            if(plateRecord == null){
                redisUtil.set("plate_open_" + serialno, new Date());
                return new BaseResult("0","待支付信息异常", null);
            }else{

                List<PlateFeesConfig> plateFeesConfigList = null;
                PlateDevice plateDevice = plateDeviceService.selectByExample(serialno);
                if(plateDevice != null){
                    plateFeesConfigList = plateFeeConfigService.getPlateFeesConfig(plateDevice.getDevDistrictId());
                }else{
                    plateFeesConfigList = new ArrayList<>();
                }

                Map<String, Object> map = new HashMap<>();
                map.put("config", plateFeesConfigList);
                map.put("record", plateRecord);

                return new BaseResult("1","ok", map);
            }
        }

        return new BaseResult("0","无待支付信息", null);
    }


    /**
     * 支付成功之后调用该接口修改对应的订单状态
     * @param id
     */
    @RequestMapping("/payOkUpdateRecord")
    @ResponseBody
    public BaseResult payOkUpdateRecord(Integer id){
        if(id != null){
            return plateRecordService.updatePlateRecord(id);
        }
        return new BaseResult("0","异常错误",null);
    }


}
