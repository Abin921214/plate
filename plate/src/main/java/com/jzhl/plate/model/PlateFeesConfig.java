package com.jzhl.plate.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * plate_fees_config
 * @author 
 */
public class PlateFeesConfig implements Serializable {
    /**
     * ID
     */
    private Integer id;

    /**
     * 设备小区id
     */
    private Integer devDistrictId;

    /**
     * 区域时间最小小时数
     */
    private Integer minTime;

    /**
     * 区域时间最大小时数
     */
    private Integer maxTime;

    /**
     * 区域金额
     */
    private BigDecimal money;

    /**
     * 排序 0前 999后
     */
    private Integer sort;

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

    public Integer getMinTime() {
        return minTime;
    }

    public void setMinTime(Integer minTime) {
        this.minTime = minTime;
    }

    public Integer getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(Integer maxTime) {
        this.maxTime = maxTime;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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
        PlateFeesConfig other = (PlateFeesConfig) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDevDistrictId() == null ? other.getDevDistrictId() == null : this.getDevDistrictId().equals(other.getDevDistrictId()))
            && (this.getMinTime() == null ? other.getMinTime() == null : this.getMinTime().equals(other.getMinTime()))
            && (this.getMaxTime() == null ? other.getMaxTime() == null : this.getMaxTime().equals(other.getMaxTime()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
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
        result = prime * result + ((getMinTime() == null) ? 0 : getMinTime().hashCode());
        result = prime * result + ((getMaxTime() == null) ? 0 : getMaxTime().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
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
        sb.append(", minTime=").append(minTime);
        sb.append(", maxTime=").append(maxTime);
        sb.append(", money=").append(money);
        sb.append(", sort=").append(sort);
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