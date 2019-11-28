package com.jzhl.plate.model;

import java.io.Serializable;
import java.util.Date;

/**
 * plate_config
 * @author 
 */
public class PlateConfig implements Serializable {
    /**
     * ID
     */
    private Integer id;

    /**
     * 设备小区id
     */
    private Integer devDistrictId;

    /**
     * 小区运行模式(0普通模式1封闭模式)
     */
    private String devDistrictModel;

    /**
     * 车位数量
     */
    private Integer carNumber;

    /**
     * 没车位时是否控制外来车辆(0没车位也允许1没车位时不允许)
     */
    private String foreignControl;

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

    public Integer getDevDistrictId() {
        return devDistrictId;
    }

    public void setDevDistrictId(Integer devDistrictId) {
        this.devDistrictId = devDistrictId;
    }

    public String getDevDistrictModel() {
        return devDistrictModel;
    }

    public void setDevDistrictModel(String devDistrictModel) {
        this.devDistrictModel = devDistrictModel;
    }

    public Integer getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(Integer carNumber) {
        this.carNumber = carNumber;
    }

    public String getForeignControl() {
        return foreignControl;
    }

    public void setForeignControl(String foreignControl) {
        this.foreignControl = foreignControl;
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
        PlateConfig other = (PlateConfig) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDevDistrictId() == null ? other.getDevDistrictId() == null : this.getDevDistrictId().equals(other.getDevDistrictId()))
            && (this.getDevDistrictModel() == null ? other.getDevDistrictModel() == null : this.getDevDistrictModel().equals(other.getDevDistrictModel()))
            && (this.getCarNumber() == null ? other.getCarNumber() == null : this.getCarNumber().equals(other.getCarNumber()))
            && (this.getForeignControl() == null ? other.getForeignControl() == null : this.getForeignControl().equals(other.getForeignControl()))
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
        result = prime * result + ((getDevDistrictId() == null) ? 0 : getDevDistrictId().hashCode());
        result = prime * result + ((getDevDistrictModel() == null) ? 0 : getDevDistrictModel().hashCode());
        result = prime * result + ((getCarNumber() == null) ? 0 : getCarNumber().hashCode());
        result = prime * result + ((getForeignControl() == null) ? 0 : getForeignControl().hashCode());
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
        sb.append(", devDistrictId=").append(devDistrictId);
        sb.append(", devDistrictModel=").append(devDistrictModel);
        sb.append(", carNumber=").append(carNumber);
        sb.append(", foreignControl=").append(foreignControl);
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