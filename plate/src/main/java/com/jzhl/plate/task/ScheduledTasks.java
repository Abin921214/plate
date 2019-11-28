package com.jzhl.plate.task;

import com.jzhl.plate.model.PlateDevice;
import com.jzhl.plate.model.PlateRecord;
import com.jzhl.plate.model.PlateVisitorCarNumber;
import com.jzhl.plate.service.PlateDeviceService;
import com.jzhl.plate.service.PlateRecordService;
import com.jzhl.plate.service.PlateVisitorCarNumberService;
import com.jzhl.plate.utils.DateUtils;
import com.jzhl.plate.utils.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 *  创建定时任务
 *  每过5s在控制台打印当前时间。
 *
 * @Scheduled(fixedRate = 5000) ：上一次开始执行时间点之后5秒再执行
 * @Scheduled(fixedDelay = 5000) ：上一次执行完毕时间点之后5秒再执行
 * @Scheduled(initialDelay=1000, fixedRate=5000) ：第一次延迟1秒后执行，之后按fixedRate的规则每5秒执行一次
 * @Scheduled(cron=” /5 “) ：通过cron表达式定义规则，什么是cro表达式，自行搜索引擎。
 */

@Component     // 暂时关闭  需要是开启
public class ScheduledTasks {

    @Resource
    RedisUtil redisUtil;

    @Resource
    PlateDeviceService plateDeviceService;

    @Resource
    PlateVisitorCarNumberService plateVisitorCarNumberService;

    @Resource
    PlateRecordService plateRecordService;


    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /**
     * 检测车牌识别设备是否掉线 以及上下线日志
     */
    @Scheduled(fixedRate = 1000 * 60 * 5)
    @Transactional
    public void reportCurrentTime() {
        Map<String, Date> map = (Map<String, Date>)redisUtil.get("plate_heart");
        if(map != null){
            for (Map.Entry<String, Date> entry : map.entrySet()) {
                if(entry.getValue() != null && !entry.getKey().equals("")){
                    PlateDevice plate = plateDeviceService.selectByExample(entry.getKey());
                    if(plate != null){
                        plateDeviceService.deviceOnLineAndOffLine(plate.getDeviceSerial(),entry.getValue());
                    }
                }
            }
        }
    }


    /**
     * 更新访客车牌  失效的车牌全部删除
     */
    @Scheduled(fixedRate = 1000 * 60 * 60)
    @Transactional
    public void updateVisitorCar() {
        plateVisitorCarNumberService.updateVisitorCar();
    }


    /**
     * 车牌通行记录处理 【处理一个月前的数据 in_out 状态为 2 3 4】
     * 如果存在则先移除该对应的图片
     */
    @Scheduled(fixedRate = 1000 * 60 * 60 * 6)
    public void delPlateRecordAndFileImage(){
        plateRecordService.delPlateRecordAndFileImage();
    }

}
