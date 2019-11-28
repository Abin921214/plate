package com.jzhl.plate.service;

import com.jzhl.plate.bean.BaseResult;
import com.jzhl.plate.mapper.PlateDeviceDAO;
import com.jzhl.plate.mapper.PlateDeviceLogDAO;
import com.jzhl.plate.model.PlateDevice;
import com.jzhl.plate.model.PlateDeviceExample;
import com.jzhl.plate.model.PlateDeviceLog;
import com.jzhl.plate.utils.DateUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class PlateDeviceService {

    @Resource
    PlateDeviceDAO plateDeviceDAO;

    @Resource
    PlateDeviceLogDAO plateDeviceLogDAO;


    /**
     * 设备上下线日志   '在线状态 1在线 0不在线',
     * @param deviceSerial   设备序列号
     * @param time           设备的记录时间
     */
    public void deviceOnLineAndOffLine(String deviceSerial, Date time){

        boolean device = false;
        PlateDeviceExample plateDeviceExample = new PlateDeviceExample();
        PlateDeviceExample.Criteria criteria = plateDeviceExample.createCriteria();
        criteria.andDeviceSerialEqualTo(deviceSerial);
        criteria.andStatusEqualTo("0");
        criteria.andDelFlagEqualTo("0");
        List<PlateDevice> plateDeviceList = plateDeviceDAO.selectByExample(plateDeviceExample);

        PlateDevice plateDevice = new PlateDevice();
        plateDevice.setUpdateTime(new Date());

        if(plateDeviceList.size() > 0){
            if(DateUtils.calLastedTime(time) > 60 * 5){
                //大于5分钟
                if(plateDeviceList.get(0).getOnline().equals("1")){
                    plateDevice.setOnline("0");
                    device = true;
                }
            }else{
                if(plateDeviceList.get(0).getOnline().equals("0")){
                    plateDevice.setOnline("1");
                    device = true;
                }
            }
        }

        if(device){
            plateDeviceDAO.updateByExampleSelective(plateDevice, plateDeviceExample);
            PlateDeviceLog plateDeviceLog = new PlateDeviceLog();
            plateDeviceLog.setDeviceId(plateDeviceList.get(0).getId());
            plateDeviceLog.setBuildTime(new Date());
            if(plateDevice.getOnline().equals("0")){
                plateDeviceLog.setLogType("offLine");
            }else{
                plateDeviceLog.setLogType("onLine");
            }

            plateDeviceLogDAO.insertSelective(plateDeviceLog);
        }

    }


    /**
     * 根据设备序列号查询对应的设备信息
     * @param deviceSerial
     * @return
     */
    public PlateDevice selectByExample(String deviceSerial){
        PlateDeviceExample plateDeviceExample = new PlateDeviceExample();
        PlateDeviceExample.Criteria criteria = plateDeviceExample.createCriteria();
        criteria.andDeviceSerialEqualTo(deviceSerial);
        criteria.andStatusEqualTo("0");
        criteria.andDelFlagEqualTo("0");

        List<PlateDevice> plateDeviceList = plateDeviceDAO.selectByExample(plateDeviceExample);
        if(plateDeviceList.size() > 0){
            return plateDeviceList.get(0);
        }
        return null;
    }

}
