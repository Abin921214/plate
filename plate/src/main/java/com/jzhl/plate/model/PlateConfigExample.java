package com.jzhl.plate.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlateConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PlateConfigExample() {
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

        public Criteria andDevDistrictModelIsNull() {
            addCriterion("dev_district_model is null");
            return (Criteria) this;
        }

        public Criteria andDevDistrictModelIsNotNull() {
            addCriterion("dev_district_model is not null");
            return (Criteria) this;
        }

        public Criteria andDevDistrictModelEqualTo(String value) {
            addCriterion("dev_district_model =", value, "devDistrictModel");
            return (Criteria) this;
        }

        public Criteria andDevDistrictModelNotEqualTo(String value) {
            addCriterion("dev_district_model <>", value, "devDistrictModel");
            return (Criteria) this;
        }

        public Criteria andDevDistrictModelGreaterThan(String value) {
            addCriterion("dev_district_model >", value, "devDistrictModel");
            return (Criteria) this;
        }

        public Criteria andDevDistrictModelGreaterThanOrEqualTo(String value) {
            addCriterion("dev_district_model >=", value, "devDistrictModel");
            return (Criteria) this;
        }

        public Criteria andDevDistrictModelLessThan(String value) {
            addCriterion("dev_district_model <", value, "devDistrictModel");
            return (Criteria) this;
        }

        public Criteria andDevDistrictModelLessThanOrEqualTo(String value) {
            addCriterion("dev_district_model <=", value, "devDistrictModel");
            return (Criteria) this;
        }

        public Criteria andDevDistrictModelLike(String value) {
            addCriterion("dev_district_model like", value, "devDistrictModel");
            return (Criteria) this;
        }

        public Criteria andDevDistrictModelNotLike(String value) {
            addCriterion("dev_district_model not like", value, "devDistrictModel");
            return (Criteria) this;
        }

        public Criteria andDevDistrictModelIn(List<String> values) {
            addCriterion("dev_district_model in", values, "devDistrictModel");
            return (Criteria) this;
        }

        public Criteria andDevDistrictModelNotIn(List<String> values) {
            addCriterion("dev_district_model not in", values, "devDistrictModel");
            return (Criteria) this;
        }

        public Criteria andDevDistrictModelBetween(String value1, String value2) {
            addCriterion("dev_district_model between", value1, value2, "devDistrictModel");
            return (Criteria) this;
        }

        public Criteria andDevDistrictModelNotBetween(String value1, String value2) {
            addCriterion("dev_district_model not between", value1, value2, "devDistrictModel");
            return (Criteria) this;
        }

        public Criteria andCarNumberIsNull() {
            addCriterion("car_number is null");
            return (Criteria) this;
        }

        public Criteria andCarNumberIsNotNull() {
            addCriterion("car_number is not null");
            return (Criteria) this;
        }

        public Criteria andCarNumberEqualTo(Integer value) {
            addCriterion("car_number =", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotEqualTo(Integer value) {
            addCriterion("car_number <>", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberGreaterThan(Integer value) {
            addCriterion("car_number >", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_number >=", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLessThan(Integer value) {
            addCriterion("car_number <", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLessThanOrEqualTo(Integer value) {
            addCriterion("car_number <=", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberIn(List<Integer> values) {
            addCriterion("car_number in", values, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotIn(List<Integer> values) {
            addCriterion("car_number not in", values, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberBetween(Integer value1, Integer value2) {
            addCriterion("car_number between", value1, value2, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("car_number not between", value1, value2, "carNumber");
            return (Criteria) this;
        }

        public Criteria andForeignControlIsNull() {
            addCriterion("foreign_control is null");
            return (Criteria) this;
        }

        public Criteria andForeignControlIsNotNull() {
            addCriterion("foreign_control is not null");
            return (Criteria) this;
        }

        public Criteria andForeignControlEqualTo(String value) {
            addCriterion("foreign_control =", value, "foreignControl");
            return (Criteria) this;
        }

        public Criteria andForeignControlNotEqualTo(String value) {
            addCriterion("foreign_control <>", value, "foreignControl");
            return (Criteria) this;
        }

        public Criteria andForeignControlGreaterThan(String value) {
            addCriterion("foreign_control >", value, "foreignControl");
            return (Criteria) this;
        }

        public Criteria andForeignControlGreaterThanOrEqualTo(String value) {
            addCriterion("foreign_control >=", value, "foreignControl");
            return (Criteria) this;
        }

        public Criteria andForeignControlLessThan(String value) {
            addCriterion("foreign_control <", value, "foreignControl");
            return (Criteria) this;
        }

        public Criteria andForeignControlLessThanOrEqualTo(String value) {
            addCriterion("foreign_control <=", value, "foreignControl");
            return (Criteria) this;
        }

        public Criteria andForeignControlLike(String value) {
            addCriterion("foreign_control like", value, "foreignControl");
            return (Criteria) this;
        }

        public Criteria andForeignControlNotLike(String value) {
            addCriterion("foreign_control not like", value, "foreignControl");
            return (Criteria) this;
        }

        public Criteria andForeignControlIn(List<String> values) {
            addCriterion("foreign_control in", values, "foreignControl");
            return (Criteria) this;
        }

        public Criteria andForeignControlNotIn(List<String> values) {
            addCriterion("foreign_control not in", values, "foreignControl");
            return (Criteria) this;
        }

        public Criteria andForeignControlBetween(String value1, String value2) {
            addCriterion("foreign_control between", value1, value2, "foreignControl");
            return (Criteria) this;
        }

        public Criteria andForeignControlNotBetween(String value1, String value2) {
            addCriterion("foreign_control not between", value1, value2, "foreignControl");
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