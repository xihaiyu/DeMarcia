package com.ctrip.asp.commom.dao.auto.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MapRoomBuildConExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table map_room_build_con
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table map_room_build_con
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table map_room_build_con
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_room_build_con
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    public MapRoomBuildConExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_room_build_con
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_room_build_con
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_room_build_con
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_room_build_con
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_room_build_con
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_room_build_con
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_room_build_con
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_room_build_con
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_room_build_con
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_room_build_con
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table map_room_build_con
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMapidIsNull() {
            addCriterion("MapID is null");
            return (Criteria) this;
        }

        public Criteria andMapidIsNotNull() {
            addCriterion("MapID is not null");
            return (Criteria) this;
        }

        public Criteria andMapidEqualTo(String value) {
            addCriterion("MapID =", value, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidNotEqualTo(String value) {
            addCriterion("MapID <>", value, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidGreaterThan(String value) {
            addCriterion("MapID >", value, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidGreaterThanOrEqualTo(String value) {
            addCriterion("MapID >=", value, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidLessThan(String value) {
            addCriterion("MapID <", value, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidLessThanOrEqualTo(String value) {
            addCriterion("MapID <=", value, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidLike(String value) {
            addCriterion("MapID like", value, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidNotLike(String value) {
            addCriterion("MapID not like", value, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidIn(List<String> values) {
            addCriterion("MapID in", values, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidNotIn(List<String> values) {
            addCriterion("MapID not in", values, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidBetween(String value1, String value2) {
            addCriterion("MapID between", value1, value2, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidNotBetween(String value1, String value2) {
            addCriterion("MapID not between", value1, value2, "mapid");
            return (Criteria) this;
        }

        public Criteria andFloorBdIdIsNull() {
            addCriterion("FLOOR_BD_ID is null");
            return (Criteria) this;
        }

        public Criteria andFloorBdIdIsNotNull() {
            addCriterion("FLOOR_BD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFloorBdIdEqualTo(String value) {
            addCriterion("FLOOR_BD_ID =", value, "floorBdId");
            return (Criteria) this;
        }

        public Criteria andFloorBdIdNotEqualTo(String value) {
            addCriterion("FLOOR_BD_ID <>", value, "floorBdId");
            return (Criteria) this;
        }

        public Criteria andFloorBdIdGreaterThan(String value) {
            addCriterion("FLOOR_BD_ID >", value, "floorBdId");
            return (Criteria) this;
        }

        public Criteria andFloorBdIdGreaterThanOrEqualTo(String value) {
            addCriterion("FLOOR_BD_ID >=", value, "floorBdId");
            return (Criteria) this;
        }

        public Criteria andFloorBdIdLessThan(String value) {
            addCriterion("FLOOR_BD_ID <", value, "floorBdId");
            return (Criteria) this;
        }

        public Criteria andFloorBdIdLessThanOrEqualTo(String value) {
            addCriterion("FLOOR_BD_ID <=", value, "floorBdId");
            return (Criteria) this;
        }

        public Criteria andFloorBdIdLike(String value) {
            addCriterion("FLOOR_BD_ID like", value, "floorBdId");
            return (Criteria) this;
        }

        public Criteria andFloorBdIdNotLike(String value) {
            addCriterion("FLOOR_BD_ID not like", value, "floorBdId");
            return (Criteria) this;
        }

        public Criteria andFloorBdIdIn(List<String> values) {
            addCriterion("FLOOR_BD_ID in", values, "floorBdId");
            return (Criteria) this;
        }

        public Criteria andFloorBdIdNotIn(List<String> values) {
            addCriterion("FLOOR_BD_ID not in", values, "floorBdId");
            return (Criteria) this;
        }

        public Criteria andFloorBdIdBetween(String value1, String value2) {
            addCriterion("FLOOR_BD_ID between", value1, value2, "floorBdId");
            return (Criteria) this;
        }

        public Criteria andFloorBdIdNotBetween(String value1, String value2) {
            addCriterion("FLOOR_BD_ID not between", value1, value2, "floorBdId");
            return (Criteria) this;
        }

        public Criteria andConstrIsNull() {
            addCriterion("ConStr is null");
            return (Criteria) this;
        }

        public Criteria andConstrIsNotNull() {
            addCriterion("ConStr is not null");
            return (Criteria) this;
        }

        public Criteria andConstrEqualTo(String value) {
            addCriterion("ConStr =", value, "constr");
            return (Criteria) this;
        }

        public Criteria andConstrNotEqualTo(String value) {
            addCriterion("ConStr <>", value, "constr");
            return (Criteria) this;
        }

        public Criteria andConstrGreaterThan(String value) {
            addCriterion("ConStr >", value, "constr");
            return (Criteria) this;
        }

        public Criteria andConstrGreaterThanOrEqualTo(String value) {
            addCriterion("ConStr >=", value, "constr");
            return (Criteria) this;
        }

        public Criteria andConstrLessThan(String value) {
            addCriterion("ConStr <", value, "constr");
            return (Criteria) this;
        }

        public Criteria andConstrLessThanOrEqualTo(String value) {
            addCriterion("ConStr <=", value, "constr");
            return (Criteria) this;
        }

        public Criteria andConstrLike(String value) {
            addCriterion("ConStr like", value, "constr");
            return (Criteria) this;
        }

        public Criteria andConstrNotLike(String value) {
            addCriterion("ConStr not like", value, "constr");
            return (Criteria) this;
        }

        public Criteria andConstrIn(List<String> values) {
            addCriterion("ConStr in", values, "constr");
            return (Criteria) this;
        }

        public Criteria andConstrNotIn(List<String> values) {
            addCriterion("ConStr not in", values, "constr");
            return (Criteria) this;
        }

        public Criteria andConstrBetween(String value1, String value2) {
            addCriterion("ConStr between", value1, value2, "constr");
            return (Criteria) this;
        }

        public Criteria andConstrNotBetween(String value1, String value2) {
            addCriterion("ConStr not between", value1, value2, "constr");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNull() {
            addCriterion("Create_DateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNotNull() {
            addCriterion("Create_DateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeEqualTo(Date value) {
            addCriterion("Create_DateTime =", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotEqualTo(Date value) {
            addCriterion("Create_DateTime <>", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThan(Date value) {
            addCriterion("Create_DateTime >", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Create_DateTime >=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThan(Date value) {
            addCriterion("Create_DateTime <", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("Create_DateTime <=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIn(List<Date> values) {
            addCriterion("Create_DateTime in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotIn(List<Date> values) {
            addCriterion("Create_DateTime not in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeBetween(Date value1, Date value2) {
            addCriterion("Create_DateTime between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("Create_DateTime not between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNull() {
            addCriterion("Update_DateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNotNull() {
            addCriterion("Update_DateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeEqualTo(Date value) {
            addCriterion("Update_DateTime =", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotEqualTo(Date value) {
            addCriterion("Update_DateTime <>", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThan(Date value) {
            addCriterion("Update_DateTime >", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Update_DateTime >=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThan(Date value) {
            addCriterion("Update_DateTime <", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("Update_DateTime <=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIn(List<Date> values) {
            addCriterion("Update_DateTime in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotIn(List<Date> values) {
            addCriterion("Update_DateTime not in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeBetween(Date value1, Date value2) {
            addCriterion("Update_DateTime between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("Update_DateTime not between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andRecordStatusIsNull() {
            addCriterion("Record_Status is null");
            return (Criteria) this;
        }

        public Criteria andRecordStatusIsNotNull() {
            addCriterion("Record_Status is not null");
            return (Criteria) this;
        }

        public Criteria andRecordStatusEqualTo(Integer value) {
            addCriterion("Record_Status =", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotEqualTo(Integer value) {
            addCriterion("Record_Status <>", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusGreaterThan(Integer value) {
            addCriterion("Record_Status >", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Record_Status >=", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusLessThan(Integer value) {
            addCriterion("Record_Status <", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Record_Status <=", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusIn(List<Integer> values) {
            addCriterion("Record_Status in", values, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotIn(List<Integer> values) {
            addCriterion("Record_Status not in", values, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusBetween(Integer value1, Integer value2) {
            addCriterion("Record_Status between", value1, value2, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Record_Status not between", value1, value2, "recordStatus");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table map_room_build_con
     *
     * @mbggenerated do_not_delete_during_merge Tue Mar 13 16:31:51 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table map_room_build_con
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
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