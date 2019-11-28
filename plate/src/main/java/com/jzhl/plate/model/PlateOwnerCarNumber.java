package com.jzhl.plate.model;

import java.io.Serializable;
import java.util.Date;

/**
 * plate_owner_car_number
 * @author 
 */
public class PlateOwnerCarNumber implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 车牌ID
     */
    private String carNumber;

    /**
     * 车牌类型 0：未知车牌:、1：蓝牌小汽车、2：:黑牌小汽车、3：单排黄牌、4：双排黄牌、 5：警车车牌、6：武警车牌、7：个性化车牌、8：单排军车牌、9：双排军车牌、10：使馆车牌、11：香港进出中国大陆车牌、12：农用车牌、13：教练车牌、14：澳门进出中国大陆车牌、15：双层武警车牌、16：武警总队车牌、17：双层武警总队车牌、18：民航车牌、19：新能源车牌
     */
    private Integer carType;

    /**
     * 车牌颜色 0：未知、1：蓝色、2：黄色、3：白色、4：黑色、5：绿色
     */
    private Integer plateColor;

    /**
     * 车身颜色 预留
     */
    private Integer carColor;

    /**
     * vip类型 0：普通车牌 1：月租车 2：星租车 3：季租车 4：年租车
     */
    private Integer vipType;

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
     * 小区ID
     */
    private Integer heId;

    /**
     * 公司ID
     */
    private Integer companyId;

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

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public Integer getCarType() {
        return carType;
    }

    public void setCarType(Integer carType) {
        this.carType = carType;
    }

    public Integer getPlateColor() {
        return plateColor;
    }

    public void setPlateColor(Integer plateColor) {
        this.plateColor = plateColor;
    }

    public Integer getCarColor() {
        return carColor;
    }

    public void setCarColor(Integer carColor) {
        this.carColor = carColor;
    }

    public Integer getVipType() {
        return vipType;
    }

    public void setVipType(Integer vipType) {
        this.vipType = vipType;
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
        PlateOwnerCarNumber other = (PlateOwnerCarNumber) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCarNumber() == null ? other.getCarNumber() == null : this.getCarNumber().equals(other.getCarNumber()))
            && (this.getCarType() == null ? other.getCarType() == null : this.getCarType().equals(other.getCarType()))
            && (this.getPlateColor() == null ? other.getPlateColor() == null : this.getPlateColor().equals(other.getPlateColor()))
            && (this.getCarColor() == null ? other.getCarColor() == null : this.getCarColor().equals(other.getCarColor()))
            && (this.getVipType() == null ? other.getVipType() == null : this.getVipType().equals(other.getVipType()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getHeId() == null ? other.getHeId() == null : this.getHeId().equals(other.getHeId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
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
        result = prime * result + ((getCarNumber() == null) ? 0 : getCarNumber().hashCode());
        result = prime * result + ((getCarType() == null) ? 0 : getCarType().hashCode());
        result = prime * result + ((getPlateColor() == null) ? 0 : getPlateColor().hashCode());
        result = prime * result + ((getCarColor() == null) ? 0 : getCarColor().hashCode());
        result = prime * result + ((getVipType() == null) ? 0 : getVipType().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getHeId() == null) ? 0 : getHeId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
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
        sb.append(", carNumber=").append(carNumber);
        sb.append(", carType=").append(carType);
        sb.append(", plateColor=").append(plateColor);
        sb.append(", carColor=").append(carColor);
        sb.append(", vipType=").append(vipType);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", memberId=").append(memberId);
        sb.append(", mobile=").append(mobile);
        sb.append(", name=").append(name);
        sb.append(", heId=").append(heId);
        sb.append(", companyId=").append(companyId);
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