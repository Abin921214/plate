package com.jzhl.plate.model;

import java.io.Serializable;
import java.util.Date;

/**
 * plate_visitor_car_number
 * @author 
 */
public class PlateVisitorCarNumber implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 小区ID
     */
    private Integer heId;

    /**
     * 公司ID
     */
    private Integer companyId;

    /**
     * 车牌ID
     */
    private String carNumber;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 过期时间
     */
    private Date endTime;

    /**
     * app用户id
     */
    private Integer memberId;

    /**
     * 车主电话号码
     */
    private String mobile;

    /**
     * 车主姓名
     */
    private String name;

    /**
     * 状态（0正常 1停用）
     */
    private String status;

    /**
     * 是否删除（0存在 1删除）
     */
    private String isDel;

    /**
     * 创建人ID
     */
    private Integer buildUserid;

    /**
     * 创建时间
     */
    private Date buildTime;

    /**
     * 修改人ID
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

    public Integer getHeId() {
        return heId;
    }

    public void setHeId(Integer heId) {
        this.heId = heId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
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
        PlateVisitorCarNumber other = (PlateVisitorCarNumber) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHeId() == null ? other.getHeId() == null : this.getHeId().equals(other.getHeId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getCarNumber() == null ? other.getCarNumber() == null : this.getCarNumber().equals(other.getCarNumber()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()))
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
        result = prime * result + ((getHeId() == null) ? 0 : getHeId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getCarNumber() == null) ? 0 : getCarNumber().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
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
        sb.append(", heId=").append(heId);
        sb.append(", companyId=").append(companyId);
        sb.append(", carNumber=").append(carNumber);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", memberId=").append(memberId);
        sb.append(", mobile=").append(mobile);
        sb.append(", name=").append(name);
        sb.append(", status=").append(status);
        sb.append(", isDel=").append(isDel);
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