package com.jzhl.plate.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * plate_device
 * @author 
 */
public class PlateDevice implements Serializable {
    /**
     * ID
     */
    private Integer id;

    /**
     * 公司id(总后台分配)
     */
    private Integer companyId;

    /**
     * 项目id(总后台分配)
     */
    private Integer heId;

    /**
     * 物联小区id
     */
    private Integer devDistrictId;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 说明
     */
    private String deviceDesc;

    /**
     * 设备序列号
     */
    private String deviceSerial;

    /**
     * 车牌设备ip
     */
    private String ip;

    /**
     * 车牌设备端口
     */
    private Integer port;

    /**
     * 车牌设备序列号
     */
    private String serialno;

    /**
     * 车牌设备用户名
     */
    private String userName;

    /**
     * 车牌设备密码
     */
    private String passWd;

    /**
     * 车牌设备序通道号
     */
    private Integer channelNum;

    /**
     * 心跳时间
     */
    private Date heartTime;

    /**
     * 标明设备是进口还是出口 1：进 2 出
     */
    private Integer inOut;

    /**
     * 经度
     */
    private BigDecimal longitude;

    /**
     * 纬度
     */
    private BigDecimal latitude;

    /**
     * 在线状态 1在线 0不在线
     */
    private String online;

    /**
     * 备用字段1
     */
    private String reserveOne;

    /**
     * 备用字段2
     */
    private String reserveTwo;

    /**
     * 状态（0正常 1停用）
     */
    private String status;

    /**
     * 是否删除（0存在 1删除）
     */
    private String delFlag;

    /**
     * 创建人id
     */
    private Integer buildUserid;

    /**
     * 创建时间
     */
    private Date buildTime;

    /**
     * 修改人id
     */
    private Integer updateUserid;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getHeId() {
        return heId;
    }

    public void setHeId(Integer heId) {
        this.heId = heId;
    }

    public Integer getDevDistrictId() {
        return devDistrictId;
    }

    public void setDevDistrictId(Integer devDistrictId) {
        this.devDistrictId = devDistrictId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceDesc() {
        return deviceDesc;
    }

    public void setDeviceDesc(String deviceDesc) {
        this.deviceDesc = deviceDesc;
    }

    public String getDeviceSerial() {
        return deviceSerial;
    }

    public void setDeviceSerial(String deviceSerial) {
        this.deviceSerial = deviceSerial;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getSerialno() {
        return serialno;
    }

    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWd() {
        return passWd;
    }

    public void setPassWd(String passWd) {
        this.passWd = passWd;
    }

    public Integer getChannelNum() {
        return channelNum;
    }

    public void setChannelNum(Integer channelNum) {
        this.channelNum = channelNum;
    }

    public Date getHeartTime() {
        return heartTime;
    }

    public void setHeartTime(Date heartTime) {
        this.heartTime = heartTime;
    }

    public Integer getInOut() {
        return inOut;
    }

    public void setInOut(Integer inOut) {
        this.inOut = inOut;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public String getOnline() {
        return online;
    }

    public void setOnline(String online) {
        this.online = online;
    }

    public String getReserveOne() {
        return reserveOne;
    }

    public void setReserveOne(String reserveOne) {
        this.reserveOne = reserveOne;
    }

    public String getReserveTwo() {
        return reserveTwo;
    }

    public void setReserveTwo(String reserveTwo) {
        this.reserveTwo = reserveTwo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public Integer getBuildUserid() {
        return buildUserid;
    }

    public void setBuildUserid(Integer buildUserid) {
        this.buildUserid = buildUserid;
    }

    public Date getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(Date buildTime) {
        this.buildTime = buildTime;
    }

    public Integer getUpdateUserid() {
        return updateUserid;
    }

    public void setUpdateUserid(Integer updateUserid) {
        this.updateUserid = updateUserid;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PlateDevice other = (PlateDevice) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getHeId() == null ? other.getHeId() == null : this.getHeId().equals(other.getHeId()))
            && (this.getDevDistrictId() == null ? other.getDevDistrictId() == null : this.getDevDistrictId().equals(other.getDevDistrictId()))
            && (this.getDeviceName() == null ? other.getDeviceName() == null : this.getDeviceName().equals(other.getDeviceName()))
            && (this.getDeviceDesc() == null ? other.getDeviceDesc() == null : this.getDeviceDesc().equals(other.getDeviceDesc()))
            && (this.getDeviceSerial() == null ? other.getDeviceSerial() == null : this.getDeviceSerial().equals(other.getDeviceSerial()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getPort() == null ? other.getPort() == null : this.getPort().equals(other.getPort()))
            && (this.getSerialno() == null ? other.getSerialno() == null : this.getSerialno().equals(other.getSerialno()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getPassWd() == null ? other.getPassWd() == null : this.getPassWd().equals(other.getPassWd()))
            && (this.getChannelNum() == null ? other.getChannelNum() == null : this.getChannelNum().equals(other.getChannelNum()))
            && (this.getHeartTime() == null ? other.getHeartTime() == null : this.getHeartTime().equals(other.getHeartTime()))
            && (this.getInOut() == null ? other.getInOut() == null : this.getInOut().equals(other.getInOut()))
            && (this.getLongitude() == null ? other.getLongitude() == null : this.getLongitude().equals(other.getLongitude()))
            && (this.getLatitude() == null ? other.getLatitude() == null : this.getLatitude().equals(other.getLatitude()))
            && (this.getOnline() == null ? other.getOnline() == null : this.getOnline().equals(other.getOnline()))
            && (this.getReserveOne() == null ? other.getReserveOne() == null : this.getReserveOne().equals(other.getReserveOne()))
            && (this.getReserveTwo() == null ? other.getReserveTwo() == null : this.getReserveTwo().equals(other.getReserveTwo()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDelFlag() == null ? other.getDelFlag() == null : this.getDelFlag().equals(other.getDelFlag()))
            && (this.getBuildUserid() == null ? other.getBuildUserid() == null : this.getBuildUserid().equals(other.getBuildUserid()))
            && (this.getBuildTime() == null ? other.getBuildTime() == null : this.getBuildTime().equals(other.getBuildTime()))
            && (this.getUpdateUserid() == null ? other.getUpdateUserid() == null : this.getUpdateUserid().equals(other.getUpdateUserid()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getHeId() == null) ? 0 : getHeId().hashCode());
        result = prime * result + ((getDevDistrictId() == null) ? 0 : getDevDistrictId().hashCode());
        result = prime * result + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        result = prime * result + ((getDeviceDesc() == null) ? 0 : getDeviceDesc().hashCode());
        result = prime * result + ((getDeviceSerial() == null) ? 0 : getDeviceSerial().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getPort() == null) ? 0 : getPort().hashCode());
        result = prime * result + ((getSerialno() == null) ? 0 : getSerialno().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getPassWd() == null) ? 0 : getPassWd().hashCode());
        result = prime * result + ((getChannelNum() == null) ? 0 : getChannelNum().hashCode());
        result = prime * result + ((getHeartTime() == null) ? 0 : getHeartTime().hashCode());
        result = prime * result + ((getInOut() == null) ? 0 : getInOut().hashCode());
        result = prime * result + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        result = prime * result + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        result = prime * result + ((getOnline() == null) ? 0 : getOnline().hashCode());
        result = prime * result + ((getReserveOne() == null) ? 0 : getReserveOne().hashCode());
        result = prime * result + ((getReserveTwo() == null) ? 0 : getReserveTwo().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDelFlag() == null) ? 0 : getDelFlag().hashCode());
        result = prime * result + ((getBuildUserid() == null) ? 0 : getBuildUserid().hashCode());
        result = prime * result + ((getBuildTime() == null) ? 0 : getBuildTime().hashCode());
        result = prime * result + ((getUpdateUserid() == null) ? 0 : getUpdateUserid().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", companyId=").append(companyId);
        sb.append(", heId=").append(heId);
        sb.append(", devDistrictId=").append(devDistrictId);
        sb.append(", deviceName=").append(deviceName);
        sb.append(", deviceDesc=").append(deviceDesc);
        sb.append(", deviceSerial=").append(deviceSerial);
        sb.append(", ip=").append(ip);
        sb.append(", port=").append(port);
        sb.append(", serialno=").append(serialno);
        sb.append(", userName=").append(userName);
        sb.append(", passWd=").append(passWd);
        sb.append(", channelNum=").append(channelNum);
        sb.append(", heartTime=").append(heartTime);
        sb.append(", inOut=").append(inOut);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", online=").append(online);
        sb.append(", reserveOne=").append(reserveOne);
        sb.append(", reserveTwo=").append(reserveTwo);
        sb.append(", status=").append(status);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", buildUserid=").append(buildUserid);
        sb.append(", buildTime=").append(buildTime);
        sb.append(", updateUserid=").append(updateUserid);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}