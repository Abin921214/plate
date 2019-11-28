package com.jzhl.plate.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlateDeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PlateDeviceExample() {
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

        public Criteria andDevDistrictIdIsNull() {
            addCriterion("dev_district_id is null");
            return (Criteria) this;
        }

        public Criteria andDevDistrictIdIsNotNull() {
            addCriterion("dev_district_id is not null");
            return (Criteria) this;
        }

        public Criteria andDevDistrictIdEqualTo(Integer value) {
            addCriterion("dev_district_id =", value, "devDistrictId");
            return (Criteria) this;
        }

        public Criteria andDevDistrictIdNotEqualTo(Integer value) {
            addCriterion("dev_district_id <>", value, "devDistrictId");
            return (Criteria) this;
        }

        public Criteria andDevDistrictIdGreaterThan(Integer value) {
            addCriterion("dev_district_id >", value, "devDistrictId");
            return (Criteria) this;
        }

        public Criteria andDevDistrictIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dev_district_id >=", value, "devDistrictId");
            return (Criteria) this;
        }

        public Criteria andDevDistrictIdLessThan(Integer value) {
            addCriterion("dev_district_id <", value, "devDistrictId");
            return (Criteria) this;
        }

        public Criteria andDevDistrictIdLessThanOrEqualTo(Integer value) {
            addCriterion("dev_district_id <=", value, "devDistrictId");
            return (Criteria) this;
        }

        public Criteria andDevDistrictIdIn(List<Integer> values) {
            addCriterion("dev_district_id in", values, "devDistrictId");
            return (Criteria) this;
        }

        public Criteria andDevDistrictIdNotIn(List<Integer> values) {
            addCriterion("dev_district_id not in", values, "devDistrictId");
            return (Criteria) this;
        }

        public Criteria andDevDistrictIdBetween(Integer value1, Integer value2) {
            addCriterion("dev_district_id between", value1, value2, "devDistrictId");
            return (Criteria) this;
        }

        public Criteria andDevDistrictIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dev_district_id not between", value1, value2, "devDistrictId");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNull() {
            addCriterion("device_name is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNotNull() {
            addCriterion("device_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameEqualTo(String value) {
            addCriterion("device_name =", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotEqualTo(String value) {
            addCriterion("device_name <>", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThan(String value) {
            addCriterion("device_name >", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThanOrEqualTo(String value) {
            addCriterion("device_name >=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThan(String value) {
            addCriterion("device_name <", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThanOrEqualTo(String value) {
            addCriterion("device_name <=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLike(String value) {
            addCriterion("device_name like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotLike(String value) {
            addCriterion("device_name not like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIn(List<String> values) {
            addCriterion("device_name in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotIn(List<String> values) {
            addCriterion("device_name not in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameBetween(String value1, String value2) {
            addCriterion("device_name between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotBetween(String value1, String value2) {
            addCriterion("device_name not between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceDescIsNull() {
            addCriterion("device_desc is null");
            return (Criteria) this;
        }

        public Criteria andDeviceDescIsNotNull() {
            addCriterion("device_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceDescEqualTo(String value) {
            addCriterion("device_desc =", value, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescNotEqualTo(String value) {
            addCriterion("device_desc <>", value, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescGreaterThan(String value) {
            addCriterion("device_desc >", value, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescGreaterThanOrEqualTo(String value) {
            addCriterion("device_desc >=", value, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescLessThan(String value) {
            addCriterion("device_desc <", value, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescLessThanOrEqualTo(String value) {
            addCriterion("device_desc <=", value, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescLike(String value) {
            addCriterion("device_desc like", value, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescNotLike(String value) {
            addCriterion("device_desc not like", value, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescIn(List<String> values) {
            addCriterion("device_desc in", values, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescNotIn(List<String> values) {
            addCriterion("device_desc not in", values, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescBetween(String value1, String value2) {
            addCriterion("device_desc between", value1, value2, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescNotBetween(String value1, String value2) {
            addCriterion("device_desc not between", value1, value2, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialIsNull() {
            addCriterion("device_serial is null");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialIsNotNull() {
            addCriterion("device_serial is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialEqualTo(String value) {
            addCriterion("device_serial =", value, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialNotEqualTo(String value) {
            addCriterion("device_serial <>", value, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialGreaterThan(String value) {
            addCriterion("device_serial >", value, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialGreaterThanOrEqualTo(String value) {
            addCriterion("device_serial >=", value, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialLessThan(String value) {
            addCriterion("device_serial <", value, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialLessThanOrEqualTo(String value) {
            addCriterion("device_serial <=", value, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialLike(String value) {
            addCriterion("device_serial like", value, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialNotLike(String value) {
            addCriterion("device_serial not like", value, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialIn(List<String> values) {
            addCriterion("device_serial in", values, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialNotIn(List<String> values) {
            addCriterion("device_serial not in", values, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialBetween(String value1, String value2) {
            addCriterion("device_serial between", value1, value2, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialNotBetween(String value1, String value2) {
            addCriterion("device_serial not between", value1, value2, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("port is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("port is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(Integer value) {
            addCriterion("port =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(Integer value) {
            addCriterion("port <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(Integer value) {
            addCriterion("port >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("port >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(Integer value) {
            addCriterion("port <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(Integer value) {
            addCriterion("port <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<Integer> values) {
            addCriterion("port in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<Integer> values) {
            addCriterion("port not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(Integer value1, Integer value2) {
            addCriterion("port between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(Integer value1, Integer value2) {
            addCriterion("port not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andSerialnoIsNull() {
            addCriterion("serialno is null");
            return (Criteria) this;
        }

        public Criteria andSerialnoIsNotNull() {
            addCriterion("serialno is not null");
            return (Criteria) this;
        }

        public Criteria andSerialnoEqualTo(String value) {
            addCriterion("serialno =", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotEqualTo(String value) {
            addCriterion("serialno <>", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoGreaterThan(String value) {
            addCriterion("serialno >", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoGreaterThanOrEqualTo(String value) {
            addCriterion("serialno >=", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLessThan(String value) {
            addCriterion("serialno <", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLessThanOrEqualTo(String value) {
            addCriterion("serialno <=", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLike(String value) {
            addCriterion("serialno like", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotLike(String value) {
            addCriterion("serialno not like", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoIn(List<String> values) {
            addCriterion("serialno in", values, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotIn(List<String> values) {
            addCriterion("serialno not in", values, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoBetween(String value1, String value2) {
            addCriterion("serialno between", value1, value2, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotBetween(String value1, String value2) {
            addCriterion("serialno not between", value1, value2, "serialno");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPassWdIsNull() {
            addCriterion("pass_wd is null");
            return (Criteria) this;
        }

        public Criteria andPassWdIsNotNull() {
            addCriterion("pass_wd is not null");
            return (Criteria) this;
        }

        public Criteria andPassWdEqualTo(String value) {
            addCriterion("pass_wd =", value, "passWd");
            return (Criteria) this;
        }

        public Criteria andPassWdNotEqualTo(String value) {
            addCriterion("pass_wd <>", value, "passWd");
            return (Criteria) this;
        }

        public Criteria andPassWdGreaterThan(String value) {
            addCriterion("pass_wd >", value, "passWd");
            return (Criteria) this;
        }

        public Criteria andPassWdGreaterThanOrEqualTo(String value) {
            addCriterion("pass_wd >=", value, "passWd");
            return (Criteria) this;
        }

        public Criteria andPassWdLessThan(String value) {
            addCriterion("pass_wd <", value, "passWd");
            return (Criteria) this;
        }

        public Criteria andPassWdLessThanOrEqualTo(String value) {
            addCriterion("pass_wd <=", value, "passWd");
            return (Criteria) this;
        }

        public Criteria andPassWdLike(String value) {
            addCriterion("pass_wd like", value, "passWd");
            return (Criteria) this;
        }

        public Criteria andPassWdNotLike(String value) {
            addCriterion("pass_wd not like", value, "passWd");
            return (Criteria) this;
        }

        public Criteria andPassWdIn(List<String> values) {
            addCriterion("pass_wd in", values, "passWd");
            return (Criteria) this;
        }

        public Criteria andPassWdNotIn(List<String> values) {
            addCriterion("pass_wd not in", values, "passWd");
            return (Criteria) this;
        }

        public Criteria andPassWdBetween(String value1, String value2) {
            addCriterion("pass_wd between", value1, value2, "passWd");
            return (Criteria) this;
        }

        public Criteria andPassWdNotBetween(String value1, String value2) {
            addCriterion("pass_wd not between", value1, value2, "passWd");
            return (Criteria) this;
        }

        public Criteria andChannelNumIsNull() {
            addCriterion("channel_num is null");
            return (Criteria) this;
        }

        public Criteria andChannelNumIsNotNull() {
            addCriterion("channel_num is not null");
            return (Criteria) this;
        }

        public Criteria andChannelNumEqualTo(Integer value) {
            addCriterion("channel_num =", value, "channelNum");
            return (Criteria) this;
        }

        public Criteria andChannelNumNotEqualTo(Integer value) {
            addCriterion("channel_num <>", value, "channelNum");
            return (Criteria) this;
        }

        public Criteria andChannelNumGreaterThan(Integer value) {
            addCriterion("channel_num >", value, "channelNum");
            return (Criteria) this;
        }

        public Criteria andChannelNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel_num >=", value, "channelNum");
            return (Criteria) this;
        }

        public Criteria andChannelNumLessThan(Integer value) {
            addCriterion("channel_num <", value, "channelNum");
            return (Criteria) this;
        }

        public Criteria andChannelNumLessThanOrEqualTo(Integer value) {
            addCriterion("channel_num <=", value, "channelNum");
            return (Criteria) this;
        }

        public Criteria andChannelNumIn(List<Integer> values) {
            addCriterion("channel_num in", values, "channelNum");
            return (Criteria) this;
        }

        public Criteria andChannelNumNotIn(List<Integer> values) {
            addCriterion("channel_num not in", values, "channelNum");
            return (Criteria) this;
        }

        public Criteria andChannelNumBetween(Integer value1, Integer value2) {
            addCriterion("channel_num between", value1, value2, "channelNum");
            return (Criteria) this;
        }

        public Criteria andChannelNumNotBetween(Integer value1, Integer value2) {
            addCriterion("channel_num not between", value1, value2, "channelNum");
            return (Criteria) this;
        }

        public Criteria andHeartTimeIsNull() {
            addCriterion("heart_time is null");
            return (Criteria) this;
        }

        public Criteria andHeartTimeIsNotNull() {
            addCriterion("heart_time is not null");
            return (Criteria) this;
        }

        public Criteria andHeartTimeEqualTo(Date value) {
            addCriterion("heart_time =", value, "heartTime");
            return (Criteria) this;
        }

        public Criteria andHeartTimeNotEqualTo(Date value) {
            addCriterion("heart_time <>", value, "heartTime");
            return (Criteria) this;
        }

        public Criteria andHeartTimeGreaterThan(Date value) {
            addCriterion("heart_time >", value, "heartTime");
            return (Criteria) this;
        }

        public Criteria andHeartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("heart_time >=", value, "heartTime");
            return (Criteria) this;
        }

        public Criteria andHeartTimeLessThan(Date value) {
            addCriterion("heart_time <", value, "heartTime");
            return (Criteria) this;
        }

        public Criteria andHeartTimeLessThanOrEqualTo(Date value) {
            addCriterion("heart_time <=", value, "heartTime");
            return (Criteria) this;
        }

        public Criteria andHeartTimeIn(List<Date> values) {
            addCriterion("heart_time in", values, "heartTime");
            return (Criteria) this;
        }

        public Criteria andHeartTimeNotIn(List<Date> values) {
            addCriterion("heart_time not in", values, "heartTime");
            return (Criteria) this;
        }

        public Criteria andHeartTimeBetween(Date value1, Date value2) {
            addCriterion("heart_time between", value1, value2, "heartTime");
            return (Criteria) this;
        }

        public Criteria andHeartTimeNotBetween(Date value1, Date value2) {
            addCriterion("heart_time not between", value1, value2, "heartTime");
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

        public Criteria andInOutEqualTo(Integer value) {
            addCriterion("in_out =", value, "inOut");
            return (Criteria) this;
        }

        public Criteria andInOutNotEqualTo(Integer value) {
            addCriterion("in_out <>", value, "inOut");
            return (Criteria) this;
        }

        public Criteria andInOutGreaterThan(Integer value) {
            addCriterion("in_out >", value, "inOut");
            return (Criteria) this;
        }

        public Criteria andInOutGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_out >=", value, "inOut");
            return (Criteria) this;
        }

        public Criteria andInOutLessThan(Integer value) {
            addCriterion("in_out <", value, "inOut");
            return (Criteria) this;
        }

        public Criteria andInOutLessThanOrEqualTo(Integer value) {
            addCriterion("in_out <=", value, "inOut");
            return (Criteria) this;
        }

        public Criteria andInOutIn(List<Integer> values) {
            addCriterion("in_out in", values, "inOut");
            return (Criteria) this;
        }

        public Criteria andInOutNotIn(List<Integer> values) {
            addCriterion("in_out not in", values, "inOut");
            return (Criteria) this;
        }

        public Criteria andInOutBetween(Integer value1, Integer value2) {
            addCriterion("in_out between", value1, value2, "inOut");
            return (Criteria) this;
        }

        public Criteria andInOutNotBetween(Integer value1, Integer value2) {
            addCriterion("in_out not between", value1, value2, "inOut");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(BigDecimal value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(BigDecimal value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(BigDecimal value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<BigDecimal> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(BigDecimal value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(BigDecimal value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(BigDecimal value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<BigDecimal> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andOnlineIsNull() {
            addCriterion("`online` is null");
            return (Criteria) this;
        }

        public Criteria andOnlineIsNotNull() {
            addCriterion("`online` is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineEqualTo(String value) {
            addCriterion("`online` =", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotEqualTo(String value) {
            addCriterion("`online` <>", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThan(String value) {
            addCriterion("`online` >", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThanOrEqualTo(String value) {
            addCriterion("`online` >=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThan(String value) {
            addCriterion("`online` <", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThanOrEqualTo(String value) {
            addCriterion("`online` <=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLike(String value) {
            addCriterion("`online` like", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotLike(String value) {
            addCriterion("`online` not like", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineIn(List<String> values) {
            addCriterion("`online` in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotIn(List<String> values) {
            addCriterion("`online` not in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineBetween(String value1, String value2) {
            addCriterion("`online` between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotBetween(String value1, String value2) {
            addCriterion("`online` not between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andReserveOneIsNull() {
            addCriterion("reserve_one is null");
            return (Criteria) this;
        }

        public Criteria andReserveOneIsNotNull() {
            addCriterion("reserve_one is not null");
            return (Criteria) this;
        }

        public Criteria andReserveOneEqualTo(String value) {
            addCriterion("reserve_one =", value, "reserveOne");
            return (Criteria) this;
        }

        public Criteria andReserveOneNotEqualTo(String value) {
            addCriterion("reserve_one <>", value, "reserveOne");
            return (Criteria) this;
        }

        public Criteria andReserveOneGreaterThan(String value) {
            addCriterion("reserve_one >", value, "reserveOne");
            return (Criteria) this;
        }

        public Criteria andReserveOneGreaterThanOrEqualTo(String value) {
            addCriterion("reserve_one >=", value, "reserveOne");
            return (Criteria) this;
        }

        public Criteria andReserveOneLessThan(String value) {
            addCriterion("reserve_one <", value, "reserveOne");
            return (Criteria) this;
        }

        public Criteria andReserveOneLessThanOrEqualTo(String value) {
            addCriterion("reserve_one <=", value, "reserveOne");
            return (Criteria) this;
        }

        public Criteria andReserveOneLike(String value) {
            addCriterion("reserve_one like", value, "reserveOne");
            return (Criteria) this;
        }

        public Criteria andReserveOneNotLike(String value) {
            addCriterion("reserve_one not like", value, "reserveOne");
            return (Criteria) this;
        }

        public Criteria andReserveOneIn(List<String> values) {
            addCriterion("reserve_one in", values, "reserveOne");
            return (Criteria) this;
        }

        public Criteria andReserveOneNotIn(List<String> values) {
            addCriterion("reserve_one not in", values, "reserveOne");
            return (Criteria) this;
        }

        public Criteria andReserveOneBetween(String value1, String value2) {
            addCriterion("reserve_one between", value1, value2, "reserveOne");
            return (Criteria) this;
        }

        public Criteria andReserveOneNotBetween(String value1, String value2) {
            addCriterion("reserve_one not between", value1, value2, "reserveOne");
            return (Criteria) this;
        }

        public Criteria andReserveTwoIsNull() {
            addCriterion("reserve_two is null");
            return (Criteria) this;
        }

        public Criteria andReserveTwoIsNotNull() {
            addCriterion("reserve_two is not null");
            return (Criteria) this;
        }

        public Criteria andReserveTwoEqualTo(String value) {
            addCriterion("reserve_two =", value, "reserveTwo");
            return (Criteria) this;
        }

        public Criteria andReserveTwoNotEqualTo(String value) {
            addCriterion("reserve_two <>", value, "reserveTwo");
            return (Criteria) this;
        }

        public Criteria andReserveTwoGreaterThan(String value) {
            addCriterion("reserve_two >", value, "reserveTwo");
            return (Criteria) this;
        }

        public Criteria andReserveTwoGreaterThanOrEqualTo(String value) {
            addCriterion("reserve_two >=", value, "reserveTwo");
            return (Criteria) this;
        }

        public Criteria andReserveTwoLessThan(String value) {
            addCriterion("reserve_two <", value, "reserveTwo");
            return (Criteria) this;
        }

        public Criteria andReserveTwoLessThanOrEqualTo(String value) {
            addCriterion("reserve_two <=", value, "reserveTwo");
            return (Criteria) this;
        }

        public Criteria andReserveTwoLike(String value) {
            addCriterion("reserve_two like", value, "reserveTwo");
            return (Criteria) this;
        }

        public Criteria andReserveTwoNotLike(String value) {
            addCriterion("reserve_two not like", value, "reserveTwo");
            return (Criteria) this;
        }

        public Criteria andReserveTwoIn(List<String> values) {
            addCriterion("reserve_two in", values, "reserveTwo");
            return (Criteria) this;
        }

        public Criteria andReserveTwoNotIn(List<String> values) {
            addCriterion("reserve_two not in", values, "reserveTwo");
            return (Criteria) this;
        }

        public Criteria andReserveTwoBetween(String value1, String value2) {
            addCriterion("reserve_two between", value1, value2, "reserveTwo");
            return (Criteria) this;
        }

        public Criteria andReserveTwoNotBetween(String value1, String value2) {
            addCriterion("reserve_two not between", value1, value2, "reserveTwo");
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

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("del_flag like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("del_flag not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andBuildUseridIsNull() {
            addCriterion("build_userid is null");
            return (Criteria) this;
        }

        public Criteria andBuildUseridIsNotNull() {
            addCriterion("build_userid is not null");
            return (Criteria) this;
        }

        public Criteria andBuildUseridEqualTo(Integer value) {
            addCriterion("build_userid =", value, "buildUserid");
            return (Criteria) this;
        }

        public Criteria andBuildUseridNotEqualTo(Integer value) {
            addCriterion("build_userid <>", value, "buildUserid");
            return (Criteria) this;
        }

        public Criteria andBuildUseridGreaterThan(Integer value) {
            addCriterion("build_userid >", value, "buildUserid");
            return (Criteria) this;
        }

        public Criteria andBuildUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("build_userid >=", value, "buildUserid");
            return (Criteria) this;
        }

        public Criteria andBuildUseridLessThan(Integer value) {
            addCriterion("build_userid <", value, "buildUserid");
            return (Criteria) this;
        }

        public Criteria andBuildUseridLessThanOrEqualTo(Integer value) {
            addCriterion("build_userid <=", value, "buildUserid");
            return (Criteria) this;
        }

        public Criteria andBuildUseridIn(List<Integer> values) {
            addCriterion("build_userid in", values, "buildUserid");
            return (Criteria) this;
        }

        public Criteria andBuildUseridNotIn(List<Integer> values) {
            addCriterion("build_userid not in", values, "buildUserid");
            return (Criteria) this;
        }

        public Criteria andBuildUseridBetween(Integer value1, Integer value2) {
            addCriterion("build_userid between", value1, value2, "buildUserid");
            return (Criteria) this;
        }

        public Criteria andBuildUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("build_userid not between", value1, value2, "buildUserid");
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

        public Criteria andUpdateUseridIsNull() {
            addCriterion("update_userid is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridIsNotNull() {
            addCriterion("update_userid is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridEqualTo(Integer value) {
            addCriterion("update_userid =", value, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridNotEqualTo(Integer value) {
            addCriterion("update_userid <>", value, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridGreaterThan(Integer value) {
            addCriterion("update_userid >", value, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_userid >=", value, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridLessThan(Integer value) {
            addCriterion("update_userid <", value, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridLessThanOrEqualTo(Integer value) {
            addCriterion("update_userid <=", value, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridIn(List<Integer> values) {
            addCriterion("update_userid in", values, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridNotIn(List<Integer> values) {
            addCriterion("update_userid not in", values, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridBetween(Integer value1, Integer value2) {
            addCriterion("update_userid between", value1, value2, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("update_userid not between", value1, value2, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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