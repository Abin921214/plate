package com.jzhl.plate.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * plate_record
 * @author 
 */
public class PlateRecord implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 车牌号
     */
    private String license;

    /**
     * vip 名称
     */
    private String vip;

    /**
     * 入口设备序列号
     */
    private String iSerialno;

    /**
     * 出口设备序列号
     */
    private String oSerialno;

    /**
     * 入口时间
     */
    private Date iTime;

    /**
     * 出口时间
     */
    private Date oTime;

    /**
     * 入口车牌大图
     */
    private String iImage;

    /**
     * 入口车牌小图
     */
    private String iImageFragment;

    /**
     * 出口车牌大图
     */
    private String oImage;

    /**
     * 出口车牌小图
     */
    private String oImageFragment;

    /**
     * 支付金额
     */
    private BigDecimal money;

    /**
     * 状态（1进口 2出口 3异常, 4待支付 5已支付）
     */
    private String inOut;

    /**
     * 状态（0正常 1停用）
     */
    private String status;

    /**
     * 是否删除（0存在 1删除）
     */
    private String isDel;

    /**
     * 最新动态时间
     */
    private Date buildTime;

    /**
     * 支付记录id
     */
    private String payNo;

    /**
     * 小区id
     */
    private Integer heId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 公司ID
     */
    private Integer companyId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getiSerialno() {
        return iSerialno;
    }

    public void setiSerialno(String iSerialno) {
        this.iSerialno = iSerialno;
    }

    public String getoSerialno() {
        return oSerialno;
    }

    public void setoSerialno(String oSerialno) {
        this.oSerialno = oSerialno;
    }

    public Date getiTime() {
        return iTime;
    }

    public void setiTime(Date iTime) {
        this.iTime = iTime;
    }

    public Date getoTime() {
        return oTime;
    }

    public void setoTime(Date oTime) {
        this.oTime = oTime;
    }

    public String getiImage() {
        return iImage;
    }

    public void setiImage(String iImage) {
        this.iImage = iImage;
    }

    public String getiImageFragment() {
        return iImageFragment;
    }

    public void setiImageFragment(String iImageFragment) {
        this.iImageFragment = iImageFragment;
    }

    public String getoImage() {
        return oImage;
    }

    public void setoImage(String oImage) {
        this.oImage = oImage;
    }

    public String getoImageFragment() {
        return oImageFragment;
    }

    public void setoImageFragment(String oImageFragment) {
        this.oImageFragment = oImageFragment;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getInOut() {
        return inOut;
    }

    public void setInOut(String inOut) {
        this.inOut = inOut;
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

    public Date getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(Date buildTime) {
        this.buildTime = buildTime;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public Integer getHeId() {
        return heId;
    }

    public void setHeId(Integer heId) {
        this.heId = heId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
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
        PlateRecord other = (PlateRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLicense() == null ? other.getLicense() == null : this.getLicense().equals(other.getLicense()))
            && (this.getVip() == null ? other.getVip() == null : this.getVip().equals(other.getVip()))
            && (this.getiSerialno() == null ? other.getiSerialno() == null : this.getiSerialno().equals(other.getiSerialno()))
            && (this.getoSerialno() == null ? other.getoSerialno() == null : this.getoSerialno().equals(other.getoSerialno()))
            && (this.getiTime() == null ? other.getiTime() == null : this.getiTime().equals(other.getiTime()))
            && (this.getoTime() == null ? other.getoTime() == null : this.getoTime().equals(other.getoTime()))
            && (this.getiImage() == null ? other.getiImage() == null : this.getiImage().equals(other.getiImage()))
            && (this.getiImageFragment() == null ? other.getiImageFragment() == null : this.getiImageFragment().equals(other.getiImageFragment()))
            && (this.getoImage() == null ? other.getoImage() == null : this.getoImage().equals(other.getoImage()))
            && (this.getoImageFragment() == null ? other.getoImageFragment() == null : this.getoImageFragment().equals(other.getoImageFragment()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getInOut() == null ? other.getInOut() == null : this.getInOut().equals(other.getInOut()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()))
            && (this.getBuildTime() == null ? other.getBuildTime() == null : this.getBuildTime().equals(other.getBuildTime()))
            && (this.getPayNo() == null ? other.getPayNo() == null : this.getPayNo().equals(other.getPayNo()))
            && (this.getHeId() == null ? other.getHeId() == null : this.getHeId().equals(other.getHeId()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLicense() == null) ? 0 : getLicense().hashCode());
        result = prime * result + ((getVip() == null) ? 0 : getVip().hashCode());
        result = prime * result + ((getiSerialno() == null) ? 0 : getiSerialno().hashCode());
        result = prime * result + ((getoSerialno() == null) ? 0 : getoSerialno().hashCode());
        result = prime * result + ((getiTime() == null) ? 0 : getiTime().hashCode());
        result = prime * result + ((getoTime() == null) ? 0 : getoTime().hashCode());
        result = prime * result + ((getiImage() == null) ? 0 : getiImage().hashCode());
        result = prime * result + ((getiImageFragment() == null) ? 0 : getiImageFragment().hashCode());
        result = prime * result + ((getoImage() == null) ? 0 : getoImage().hashCode());
        result = prime * result + ((getoImageFragment() == null) ? 0 : getoImageFragment().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getInOut() == null) ? 0 : getInOut().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        result = prime * result + ((getBuildTime() == null) ? 0 : getBuildTime().hashCode());
        result = prime * result + ((getPayNo() == null) ? 0 : getPayNo().hashCode());
        result = prime * result + ((getHeId() == null) ? 0 : getHeId().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", license=").append(license);
        sb.append(", vip=").append(vip);
        sb.append(", iSerialno=").append(iSerialno);
        sb.append(", oSerialno=").append(oSerialno);
        sb.append(", iTime=").append(iTime);
        sb.append(", oTime=").append(oTime);
        sb.append(", iImage=").append(iImage);
        sb.append(", iImageFragment=").append(iImageFragment);
        sb.append(", oImage=").append(oImage);
        sb.append(", oImageFragment=").append(oImageFragment);
        sb.append(", money=").append(money);
        sb.append(", inOut=").append(inOut);
        sb.append(", status=").append(status);
        sb.append(", isDel=").append(isDel);
        sb.append(", buildTime=").append(buildTime);
        sb.append(", payNo=").append(payNo);
        sb.append(", heId=").append(heId);
        sb.append(", remark=").append(remark);
        sb.append(", companyId=").append(companyId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}