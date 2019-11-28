package com.jzhl.plate.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlateRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PlateRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNull() {
            addCriterion("license is null");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNotNull() {
            addCriterion("license is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseEqualTo(String value) {
            addCriterion("license =", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotEqualTo(String value) {
            addCriterion("license <>", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThan(String value) {
            addCriterion("license >", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("license >=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThan(String value) {
            addCriterion("license <", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThanOrEqualTo(String value) {
            addCriterion("license <=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLike(String value) {
            addCriterion("license like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotLike(String value) {
            addCriterion("license not like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseIn(List<String> values) {
            addCriterion("license in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotIn(List<String> values) {
            addCriterion("license not in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseBetween(String value1, String value2) {
            addCriterion("license between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotBetween(String value1, String value2) {
            addCriterion("license not between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andVipIsNull() {
            addCriterion("vip is null");
            return (Criteria) this;
        }

        public Criteria andVipIsNotNull() {
            addCriterion("vip is not null");
            return (Criteria) this;
        }

        public Criteria andVipEqualTo(String value) {
            addCriterion("vip =", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotEqualTo(String value) {
            addCriterion("vip <>", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipGreaterThan(String value) {
            addCriterion("vip >", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipGreaterThanOrEqualTo(String value) {
            addCriterion("vip >=", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipLessThan(String value) {
            addCriterion("vip <", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipLessThanOrEqualTo(String value) {
            addCriterion("vip <=", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipLike(String value) {
            addCriterion("vip like", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotLike(String value) {
            addCriterion("vip not like", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipIn(List<String> values) {
            addCriterion("vip in", values, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotIn(List<String> values) {
            addCriterion("vip not in", values, "vip");
            return (Criteria) this;
        }

        public Criteria andVipBetween(String value1, String value2) {
            addCriterion("vip between", value1, value2, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotBetween(String value1, String value2) {
            addCriterion("vip not between", value1, value2, "vip");
            return (Criteria) this;
        }

        public Criteria andISerialnoIsNull() {
            addCriterion("i_serialno is null");
            return (Criteria) this;
        }

        public Criteria andISerialnoIsNotNull() {
            addCriterion("i_serialno is not null");
            return (Criteria) this;
        }

        public Criteria andISerialnoEqualTo(String value) {
            addCriterion("i_serialno =", value, "iSerialno");
            return (Criteria) this;
        }

        public Criteria andISerialnoNotEqualTo(String value) {
            addCriterion("i_serialno <>", value, "iSerialno");
            return (Criteria) this;
        }

        public Criteria andISerialnoGreaterThan(String value) {
            addCriterion("i_serialno >", value, "iSerialno");
            return (Criteria) this;
        }

        public Criteria andISerialnoGreaterThanOrEqualTo(String value) {
            addCriterion("i_serialno >=", value, "iSerialno");
            return (Criteria) this;
        }

        public Criteria andISerialnoLessThan(String value) {
            addCriterion("i_serialno <", value, "iSerialno");
            return (Criteria) this;
        }

        public Criteria andISerialnoLessThanOrEqualTo(String value) {
            addCriterion("i_serialno <=", value, "iSerialno");
            return (Criteria) this;
        }

        public Criteria andISerialnoLike(String value) {
            addCriterion("i_serialno like", value, "iSerialno");
            return (Criteria) this;
        }

        public Criteria andISerialnoNotLike(String value) {
            addCriterion("i_serialno not like", value, "iSerialno");
            return (Criteria) this;
        }

        public Criteria andISerialnoIn(List<String> values) {
            addCriterion("i_serialno in", values, "iSerialno");
            return (Criteria) this;
        }

        public Criteria andISerialnoNotIn(List<String> values) {
            addCriterion("i_serialno not in", values, "iSerialno");
            return (Criteria) this;
        }

        public Criteria andISerialnoBetween(String value1, String value2) {
            addCriterion("i_serialno between", value1, value2, "iSerialno");
            return (Criteria) this;
        }

        public Criteria andISerialnoNotBetween(String value1, String value2) {
            addCriterion("i_serialno not between", value1, value2, "iSerialno");
            return (Criteria) this;
        }

        public Criteria andOSerialnoIsNull() {
            addCriterion("o_serialno is null");
            return (Criteria) this;
        }

        public Criteria andOSerialnoIsNotNull() {
            addCriterion("o_serialno is not null");
            return (Criteria) this;
        }

        public Criteria andOSerialnoEqualTo(String value) {
            addCriterion("o_serialno =", value, "oSerialno");
            return (Criteria) this;
        }

        public Criteria andOSerialnoNotEqualTo(String value) {
            addCriterion("o_serialno <>", value, "oSerialno");
            return (Criteria) this;
        }

        public Criteria andOSerialnoGreaterThan(String value) {
            addCriterion("o_serialno >", value, "oSerialno");
            return (Criteria) this;
        }

        public Criteria andOSerialnoGreaterThanOrEqualTo(String value) {
            addCriterion("o_serialno >=", value, "oSerialno");
            return (Criteria) this;
        }

        public Criteria andOSerialnoLessThan(String value) {
            addCriterion("o_serialno <", value, "oSerialno");
            return (Criteria) this;
        }

        public Criteria andOSerialnoLessThanOrEqualTo(String value) {
            addCriterion("o_serialno <=", value, "oSerialno");
            return (Criteria) this;
        }

        public Criteria andOSerialnoLike(String value) {
            addCriterion("o_serialno like", value, "oSerialno");
            return (Criteria) this;
        }

        public Criteria andOSerialnoNotLike(String value) {
            addCriterion("o_serialno not like", value, "oSerialno");
            return (Criteria) this;
        }

        public Criteria andOSerialnoIn(List<String> values) {
            addCriterion("o_serialno in", values, "oSerialno");
            return (Criteria) this;
        }

        public Criteria andOSerialnoNotIn(List<String> values) {
            addCriterion("o_serialno not in", values, "oSerialno");
            return (Criteria) this;
        }

        public Criteria andOSerialnoBetween(String value1, String value2) {
            addCriterion("o_serialno between", value1, value2, "oSerialno");
            return (Criteria) this;
        }

        public Criteria andOSerialnoNotBetween(String value1, String value2) {
            addCriterion("o_serialno not between", value1, value2, "oSerialno");
            return (Criteria) this;
        }

        public Criteria andITimeIsNull() {
            addCriterion("i_time is null");
            return (Criteria) this;
        }

        public Criteria andITimeIsNotNull() {
            addCriterion("i_time is not null");
            return (Criteria) this;
        }

        public Criteria andITimeEqualTo(Date value) {
            addCriterion("i_time =", value, "iTime");
            return (Criteria) this;
        }

        public Criteria andITimeNotEqualTo(Date value) {
            addCriterion("i_time <>", value, "iTime");
            return (Criteria) this;
        }

        public Criteria andITimeGreaterThan(Date value) {
            addCriterion("i_time >", value, "iTime");
            return (Criteria) this;
        }

        public Criteria andITimeGreaterThanOrEqualTo(Date value) {
            addCriterion("i_time >=", value, "iTime");
            return (Criteria) this;
        }

        public Criteria andITimeLessThan(Date value) {
            addCriterion("i_time <", value, "iTime");
            return (Criteria) this;
        }

        public Criteria andITimeLessThanOrEqualTo(Date value) {
            addCriterion("i_time <=", value, "iTime");
            return (Criteria) this;
        }

        public Criteria andITimeIn(List<Date> values) {
            addCriterion("i_time in", values, "iTime");
            return (Criteria) this;
        }

        public Criteria andITimeNotIn(List<Date> values) {
            addCriterion("i_time not in", values, "iTime");
            return (Criteria) this;
        }

        public Criteria andITimeBetween(Date value1, Date value2) {
            addCriterion("i_time between", value1, value2, "iTime");
            return (Criteria) this;
        }

        public Criteria andITimeNotBetween(Date value1, Date value2) {
            addCriterion("i_time not between", value1, value2, "iTime");
            return (Criteria) this;
        }

        public Criteria andOTimeIsNull() {
            addCriterion("o_time is null");
            return (Criteria) this;
        }

        public Criteria andOTimeIsNotNull() {
            addCriterion("o_time is not null");
            return (Criteria) this;
        }

        public Criteria andOTimeEqualTo(Date value) {
            addCriterion("o_time =", value, "oTime");
            return (Criteria) this;
        }

        public Criteria andOTimeNotEqualTo(Date value) {
            addCriterion("o_time <>", value, "oTime");
            return (Criteria) this;
        }

        public Criteria andOTimeGreaterThan(Date value) {
            addCriterion("o_time >", value, "oTime");
            return (Criteria) this;
        }

        public Criteria andOTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("o_time >=", value, "oTime");
            return (Criteria) this;
        }

        public Criteria andOTimeLessThan(Date value) {
            addCriterion("o_time <", value, "oTime");
            return (Criteria) this;
        }

        public Criteria andOTimeLessThanOrEqualTo(Date value) {
            addCriterion("o_time <=", value, "oTime");
            return (Criteria) this;
        }

        public Criteria andOTimeIn(List<Date> values) {
            addCriterion("o_time in", values, "oTime");
            return (Criteria) this;
        }

        public Criteria andOTimeNotIn(List<Date> values) {
            addCriterion("o_time not in", values, "oTime");
            return (Criteria) this;
        }

        public Criteria andOTimeBetween(Date value1, Date value2) {
            addCriterion("o_time between", value1, value2, "oTime");
            return (Criteria) this;
        }

        public Criteria andOTimeNotBetween(Date value1, Date value2) {
            addCriterion("o_time not between", value1, value2, "oTime");
            return (Criteria) this;
        }

        public Criteria andIImageIsNull() {
            addCriterion("i_image is null");
            return (Criteria) this;
        }

        public Criteria andIImageIsNotNull() {
            addCriterion("i_image is not null");
            return (Criteria) this;
        }

        public Criteria andIImageEqualTo(String value) {
            addCriterion("i_image =", value, "iImage");
            return (Criteria) this;
        }

        public Criteria andIImageNotEqualTo(String value) {
            addCriterion("i_image <>", value, "iImage");
            return (Criteria) this;
        }

        public Criteria andIImageGreaterThan(String value) {
            addCriterion("i_image >", value, "iImage");
            return (Criteria) this;
        }

        public Criteria andIImageGreaterThanOrEqualTo(String value) {
            addCriterion("i_image >=", value, "iImage");
            return (Criteria) this;
        }

        public Criteria andIImageLessThan(String value) {
            addCriterion("i_image <", value, "iImage");
            return (Criteria) this;
        }

        public Criteria andIImageLessThanOrEqualTo(String value) {
            addCriterion("i_image <=", value, "iImage");
            return (Criteria) this;
        }

        public Criteria andIImageLike(String value) {
            addCriterion("i_image like", value, "iImage");
            return (Criteria) this;
        }

        public Criteria andIImageNotLike(String value) {
            addCriterion("i_image not like", value, "iImage");
            return (Criteria) this;
        }

        public Criteria andIImageIn(List<String> values) {
            addCriterion("i_image in", values, "iImage");
            return (Criteria) this;
        }

        public Criteria andIImageNotIn(List<String> values) {
            addCriterion("i_image not in", values, "iImage");
            return (Criteria) this;
        }

        public Criteria andIImageBetween(String value1, String value2) {
            addCriterion("i_image between", value1, value2, "iImage");
            return (Criteria) this;
        }

        public Criteria andIImageNotBetween(String value1, String value2) {
            addCriterion("i_image not between", value1, value2, "iImage");
            return (Criteria) this;
        }

        public Criteria andIImageFragmentIsNull() {
            addCriterion("i_image_fragment is null");
            return (Criteria) this;
        }

        public Criteria andIImageFragmentIsNotNull() {
            addCriterion("i_image_fragment is not null");
            return (Criteria) this;
        }

        public Criteria andIImageFragmentEqualTo(String value) {
            addCriterion("i_image_fragment =", value, "iImageFragment");
            return (Criteria) this;
        }

        public Criteria andIImageFragmentNotEqualTo(String value) {
            addCriterion("i_image_fragment <>", value, "iImageFragment");
            return (Criteria) this;
        }

        public Criteria andIImageFragmentGreaterThan(String value) {
            addCriterion("i_image_fragment >", value, "iImageFragment");
            return (Criteria) this;
        }

        public Criteria andIImageFragmentGreaterThanOrEqualTo(String value) {
            addCriterion("i_image_fragment >=", value, "iImageFragment");
            return (Criteria) this;
        }

        public Criteria andIImageFragmentLessThan(String value) {
            addCriterion("i_image_fragment <", value, "iImageFragment");
            return (Criteria) this;
        }

        public Criteria andIImageFragmentLessThanOrEqualTo(String value) {
            addCriterion("i_image_fragment <=", value, "iImageFragment");
            return (Criteria) this;
        }

        public Criteria andIImageFragmentLike(String value) {
            addCriterion("i_image_fragment like", value, "iImageFragment");
            return (Criteria) this;
        }

        public Criteria andIImageFragmentNotLike(String value) {
            addCriterion("i_image_fragment not like", value, "iImageFragment");
            return (Criteria) this;
        }

        public Criteria andIImageFragmentIn(List<String> values) {
            addCriterion("i_image_fragment in", values, "iImageFragment");
            return (Criteria) this;
        }

        public Criteria andIImageFragmentNotIn(List<String> values) {
            addCriterion("i_image_fragment not in", values, "iImageFragment");
            return (Criteria) this;
        }

        public Criteria andIImageFragmentBetween(String value1, String value2) {
            addCriterion("i_image_fragment between", value1, value2, "iImageFragment");
            return (Criteria) this;
        }

        public Criteria andIImageFragmentNotBetween(String value1, String value2) {
            addCriterion("i_image_fragment not between", value1, value2, "iImageFragment");
            return (Criteria) this;
        }

        public Criteria andOImageIsNull() {
            addCriterion("o_image is null");
            return (Criteria) this;
        }

        public Criteria andOImageIsNotNull() {
            addCriterion("o_image is not null");
            return (Criteria) this;
        }

        public Criteria andOImageEqualTo(String value) {
            addCriterion("o_image =", value, "oImage");
            return (Criteria) this;
        }

        public Criteria andOImageNotEqualTo(String value) {
            addCriterion("o_image <>", value, "oImage");
            return (Criteria) this;
        }

        public Criteria andOImageGreaterThan(String value) {
            addCriterion("o_image >", value, "oImage");
            return (Criteria) this;
        }

        public Criteria andOImageGreaterThanOrEqualTo(String value) {
            addCriterion("o_image >=", value, "oImage");
            return (Criteria) this;
        }

        public Criteria andOImageLessThan(String value) {
            addCriterion("o_image <", value, "oImage");
            return (Criteria) this;
        }

        public Criteria andOImageLessThanOrEqualTo(String value) {
            addCriterion("o_image <=", value, "oImage");
            return (Criteria) this;
        }

        public Criteria andOImageLike(String value) {
            addCriterion("o_image like", value, "oImage");
            return (Criteria) this;
        }

        public Criteria andOImageNotLike(String value) {
            addCriterion("o_image not like", value, "oImage");
            return (Criteria) this;
        }

        public Criteria andOImageIn(List<String> values) {
            addCriterion("o_image in", values, "oImage");
            return (Criteria) this;
        }

        public Criteria andOImageNotIn(List<String> values) {
            addCriterion("o_image not in", values, "oImage");
            return (Criteria) this;
        }

        public Criteria andOImageBetween(String value1, String value2) {
            addCriterion("o_image between", value1, value2, "oImage");
            return (Criteria) this;
        }

        public Criteria andOImageNotBetween(String value1, String value2) {
            addCriterion("o_image not between", value1, value2, "oImage");
            return (Criteria) this;
        }

        public Criteria andOImageFragmentIsNull() {
            addCriterion("o_image_fragment is null");
            return (Criteria) this;
        }

        public Criteria andOImageFragmentIsNotNull() {
            addCriterion("o_image_fragment is not null");
            return (Criteria) this;
        }

        public Criteria andOImageFragmentEqualTo(String value) {
            addCriterion("o_image_fragment =", value, "oImageFragment");
            return (Criteria) this;
        }

        public Criteria andOImageFragmentNotEqualTo(String value) {
            addCriterion("o_image_fragment <>", value, "oImageFragment");
            return (Criteria) this;
        }

        public Criteria andOImageFragmentGreaterThan(String value) {
            addCriterion("o_image_fragment >", value, "oImageFragment");
            return (Criteria) this;
        }

        public Criteria andOImageFragmentGreaterThanOrEqualTo(String value) {
            addCriterion("o_image_fragment >=", value, "oImageFragment");
            return (Criteria) this;
        }

        public Criteria andOImageFragmentLessThan(String value) {
            addCriterion("o_image_fragment <", value, "oImageFragment");
            return (Criteria) this;
        }

        public Criteria andOImageFragmentLessThanOrEqualTo(String value) {
            addCriterion("o_image_fragment <=", value, "oImageFragment");
            return (Criteria) this;
        }

        public Criteria andOImageFragmentLike(String value) {
            addCriterion("o_image_fragment like", value, "oImageFragment");
            return (Criteria) this;
        }

        public Criteria andOImageFragmentNotLike(String value) {
            addCriterion("o_image_fragment not like", value, "oImageFragment");
            return (Criteria) this;
        }

        public Criteria andOImageFragmentIn(List<String> values) {
            addCriterion("o_image_fragment in", values, "oImageFragment");
            return (Criteria) this;
        }

        public Criteria andOImageFragmentNotIn(List<String> values) {
            addCriterion("o_image_fragment not in", values, "oImageFragment");
            return (Criteria) this;
        }

        public Criteria andOImageFragmentBetween(String value1, String value2) {
            addCriterion("o_image_fragment between", value1, value2, "oImageFragment");
            return (Criteria) this;
        }

        public Criteria andOImageFragmentNotBetween(String value1, String value2) {
            addCriterion("o_image_fragment not between", value1, value2, "oImageFragment");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andInOutIsNull() {
            addCriterion("in_out is null");
            return (Criteria) this;
        }

        public Criteria andInOutIsNotNull() {
            addCriterion("in_out is not null");
            return (Criteria) this;
        }

        public Criteria andInOutEqualTo(String value) {
            addCriterion("in_out =", value, "inOut");
            return (Criteria) this;
        }

        public Criteria andInOutNotEqualTo(String value) {
            addCriterion("in_out <>", value, "inOut");
            return (Criteria) this;
        }

        public Criteria andInOutGreaterThan(String value) {
            addCriterion("in_out >", value, "inOut");
            return (Criteria) this;
        }

        public Criteria andInOutGreaterThanOrEqualTo(String value) {
            addCriterion("in_out >=", value, "inOut");
            return (Criteria) this;
        }

        public Criteria andInOutLessThan(String value) {
            addCriterion("in_out <", value, "inOut");
            return (Criteria) this;
        }

        public Criteria andInOutLessThanOrEqualTo(String value) {
            addCriterion("in_out <=", value, "inOut");
            return (Criteria) this;
        }

        public Criteria andInOutLike(String value) {
            addCriterion("in_out like", value, "inOut");
            return (Criteria) this;
        }

        public Criteria andInOutNotLike(String value) {
            addCriterion("in_out not like", value, "inOut");
            return (Criteria) this;
        }

        public Criteria andInOutIn(List<String> values) {
            addCriterion("in_out in", values, "inOut");
            return (Criteria) this;
        }

        public Criteria andInOutNotIn(List<String> values) {
            addCriterion("in_out not in", values, "inOut");
            return (Criteria) this;
        }

        public Criteria andInOutBetween(String value1, String value2) {
            addCriterion("in_out between", value1, value2, "inOut");
            return (Criteria) this;
        }

        public Criteria andInOutNotBetween(String value1, String value2) {
            addCriterion("in_out not between", value1, value2, "inOut");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("`status` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("`status` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(String value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(String value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(String value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(String value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(String value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(String value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLike(String value) {
            addCriterion("is_del like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotLike(String value) {
            addCriterion("is_del not like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<String> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<String> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(String value1, String value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(String value1, String value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andBuildTimeIsNull() {
            addCriterion("build_time is null");
            return (Criteria) this;
        }

        public Criteria andBuildTimeIsNotNull() {
            addCriterion("build_time is not null");
            return (Criteria) this;
        }

        public Criteria andBuildTimeEqualTo(Date value) {
            addCriterion("build_time =", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeNotEqualTo(Date value) {
            addCriterion("build_time <>", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeGreaterThan(Date value) {
            addCriterion("build_time >", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("build_time >=", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeLessThan(Date value) {
            addCriterion("build_time <", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeLessThanOrEqualTo(Date value) {
            addCriterion("build_time <=", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeIn(List<Date> values) {
            addCriterion("build_time in", values, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeNotIn(List<Date> values) {
            addCriterion("build_time not in", values, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeBetween(Date value1, Date value2) {
            addCriterion("build_time between", value1, value2, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeNotBetween(Date value1, Date value2) {
            addCriterion("build_time not between", value1, value2, "buildTime");
            return (Criteria) this;
        }

        public Criteria andPayNoIsNull() {
            addCriterion("pay_no is null");
            return (Criteria) this;
        }

        public Criteria andPayNoIsNotNull() {
            addCriterion("pay_no is not null");
            return (Criteria) this;
        }

        public Criteria andPayNoEqualTo(String value) {
            addCriterion("pay_no =", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotEqualTo(String value) {
            addCriterion("pay_no <>", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoGreaterThan(String value) {
            addCriterion("pay_no >", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoGreaterThanOrEqualTo(String value) {
            addCriterion("pay_no >=", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLessThan(String value) {
            addCriterion("pay_no <", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLessThanOrEqualTo(String value) {
            addCriterion("pay_no <=", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLike(String value) {
            addCriterion("pay_no like", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotLike(String value) {
            addCriterion("pay_no not like", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoIn(List<String> values) {
            addCriterion("pay_no in", values, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotIn(List<String> values) {
            addCriterion("pay_no not in", values, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoBetween(String value1, String value2) {
            addCriterion("pay_no between", value1, value2, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotBetween(String value1, String value2) {
            addCriterion("pay_no not between", value1, value2, "payNo");
            return (Criteria) this;
        }

        public Criteria andHeIdIsNull() {
            addCriterion("he_id is null");
            return (Criteria) this;
        }

        public Criteria andHeIdIsNotNull() {
            addCriterion("he_id is not null");
            return (Criteria) this;
        }

        public Criteria andHeIdEqualTo(Integer value) {
            addCriterion("he_id =", value, "heId");
            return (Criteria) this;
        }

        public Criteria andHeIdNotEqualTo(Integer value) {
            addCriterion("he_id <>", value, "heId");
            return (Criteria) this;
        }

        public Criteria andHeIdGreaterThan(Integer value) {
            addCriterion("he_id >", value, "heId");
            return (Criteria) this;
        }

        public Criteria andHeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("he_id >=", value, "heId");
            return (Criteria) this;
        }

        public Criteria andHeIdLessThan(Integer value) {
            addCriterion("he_id <", value, "heId");
            return (Criteria) this;
        }

        public Criteria andHeIdLessThanOrEqualTo(Integer value) {
            addCriterion("he_id <=", value, "heId");
            return (Criteria) this;
        }

        public Criteria andHeIdIn(List<Integer> values) {
            addCriterion("he_id in", values, "heId");
            return (Criteria) this;
        }

        public Criteria andHeIdNotIn(List<Integer> values) {
            addCriterion("he_id not in", values, "heId");
            return (Criteria) this;
        }

        public Criteria andHeIdBetween(Integer value1, Integer value2) {
            addCriterion("he_id between", value1, value2, "heId");
            return (Criteria) this;
        }

        public Criteria andHeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("he_id not between", value1, value2, "heId");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}