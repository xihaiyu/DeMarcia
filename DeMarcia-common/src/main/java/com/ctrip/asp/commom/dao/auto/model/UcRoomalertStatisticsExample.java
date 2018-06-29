package com.ctrip.asp.commom.dao.auto.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UcRoomalertStatisticsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table uc_roomalert_statistics
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table uc_roomalert_statistics
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table uc_roomalert_statistics
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uc_roomalert_statistics
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    public UcRoomalertStatisticsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uc_roomalert_statistics
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uc_roomalert_statistics
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uc_roomalert_statistics
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uc_roomalert_statistics
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uc_roomalert_statistics
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uc_roomalert_statistics
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uc_roomalert_statistics
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
     * This method corresponds to the database table uc_roomalert_statistics
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
     * This method corresponds to the database table uc_roomalert_statistics
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uc_roomalert_statistics
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
     * This class corresponds to the database table uc_roomalert_statistics
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("StartDate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("StartDate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterionForJDBCDate("StartDate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("StartDate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("StartDate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("StartDate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterionForJDBCDate("StartDate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("StartDate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterionForJDBCDate("StartDate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("StartDate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("StartDate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("StartDate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("EndDate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("EndDate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterionForJDBCDate("EndDate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("EndDate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterionForJDBCDate("EndDate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EndDate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterionForJDBCDate("EndDate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EndDate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterionForJDBCDate("EndDate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("EndDate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EndDate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EndDate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andPmscodeIsNull() {
            addCriterion("PmsCode is null");
            return (Criteria) this;
        }

        public Criteria andPmscodeIsNotNull() {
            addCriterion("PmsCode is not null");
            return (Criteria) this;
        }

        public Criteria andPmscodeEqualTo(String value) {
            addCriterion("PmsCode =", value, "pmscode");
            return (Criteria) this;
        }

        public Criteria andPmscodeNotEqualTo(String value) {
            addCriterion("PmsCode <>", value, "pmscode");
            return (Criteria) this;
        }

        public Criteria andPmscodeGreaterThan(String value) {
            addCriterion("PmsCode >", value, "pmscode");
            return (Criteria) this;
        }

        public Criteria andPmscodeGreaterThanOrEqualTo(String value) {
            addCriterion("PmsCode >=", value, "pmscode");
            return (Criteria) this;
        }

        public Criteria andPmscodeLessThan(String value) {
            addCriterion("PmsCode <", value, "pmscode");
            return (Criteria) this;
        }

        public Criteria andPmscodeLessThanOrEqualTo(String value) {
            addCriterion("PmsCode <=", value, "pmscode");
            return (Criteria) this;
        }

        public Criteria andPmscodeLike(String value) {
            addCriterion("PmsCode like", value, "pmscode");
            return (Criteria) this;
        }

        public Criteria andPmscodeNotLike(String value) {
            addCriterion("PmsCode not like", value, "pmscode");
            return (Criteria) this;
        }

        public Criteria andPmscodeIn(List<String> values) {
            addCriterion("PmsCode in", values, "pmscode");
            return (Criteria) this;
        }

        public Criteria andPmscodeNotIn(List<String> values) {
            addCriterion("PmsCode not in", values, "pmscode");
            return (Criteria) this;
        }

        public Criteria andPmscodeBetween(String value1, String value2) {
            addCriterion("PmsCode between", value1, value2, "pmscode");
            return (Criteria) this;
        }

        public Criteria andPmscodeNotBetween(String value1, String value2) {
            addCriterion("PmsCode not between", value1, value2, "pmscode");
            return (Criteria) this;
        }

        public Criteria andHotelcodeIsNull() {
            addCriterion("HotelCode is null");
            return (Criteria) this;
        }

        public Criteria andHotelcodeIsNotNull() {
            addCriterion("HotelCode is not null");
            return (Criteria) this;
        }

        public Criteria andHotelcodeEqualTo(String value) {
            addCriterion("HotelCode =", value, "hotelcode");
            return (Criteria) this;
        }

        public Criteria andHotelcodeNotEqualTo(String value) {
            addCriterion("HotelCode <>", value, "hotelcode");
            return (Criteria) this;
        }

        public Criteria andHotelcodeGreaterThan(String value) {
            addCriterion("HotelCode >", value, "hotelcode");
            return (Criteria) this;
        }

        public Criteria andHotelcodeGreaterThanOrEqualTo(String value) {
            addCriterion("HotelCode >=", value, "hotelcode");
            return (Criteria) this;
        }

        public Criteria andHotelcodeLessThan(String value) {
            addCriterion("HotelCode <", value, "hotelcode");
            return (Criteria) this;
        }

        public Criteria andHotelcodeLessThanOrEqualTo(String value) {
            addCriterion("HotelCode <=", value, "hotelcode");
            return (Criteria) this;
        }

        public Criteria andHotelcodeLike(String value) {
            addCriterion("HotelCode like", value, "hotelcode");
            return (Criteria) this;
        }

        public Criteria andHotelcodeNotLike(String value) {
            addCriterion("HotelCode not like", value, "hotelcode");
            return (Criteria) this;
        }

        public Criteria andHotelcodeIn(List<String> values) {
            addCriterion("HotelCode in", values, "hotelcode");
            return (Criteria) this;
        }

        public Criteria andHotelcodeNotIn(List<String> values) {
            addCriterion("HotelCode not in", values, "hotelcode");
            return (Criteria) this;
        }

        public Criteria andHotelcodeBetween(String value1, String value2) {
            addCriterion("HotelCode between", value1, value2, "hotelcode");
            return (Criteria) this;
        }

        public Criteria andHotelcodeNotBetween(String value1, String value2) {
            addCriterion("HotelCode not between", value1, value2, "hotelcode");
            return (Criteria) this;
        }

        public Criteria andRoomnoIsNull() {
            addCriterion("RoomNo is null");
            return (Criteria) this;
        }

        public Criteria andRoomnoIsNotNull() {
            addCriterion("RoomNo is not null");
            return (Criteria) this;
        }

        public Criteria andRoomnoEqualTo(String value) {
            addCriterion("RoomNo =", value, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoNotEqualTo(String value) {
            addCriterion("RoomNo <>", value, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoGreaterThan(String value) {
            addCriterion("RoomNo >", value, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoGreaterThanOrEqualTo(String value) {
            addCriterion("RoomNo >=", value, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoLessThan(String value) {
            addCriterion("RoomNo <", value, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoLessThanOrEqualTo(String value) {
            addCriterion("RoomNo <=", value, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoLike(String value) {
            addCriterion("RoomNo like", value, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoNotLike(String value) {
            addCriterion("RoomNo not like", value, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoIn(List<String> values) {
            addCriterion("RoomNo in", values, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoNotIn(List<String> values) {
            addCriterion("RoomNo not in", values, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoBetween(String value1, String value2) {
            addCriterion("RoomNo between", value1, value2, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoNotBetween(String value1, String value2) {
            addCriterion("RoomNo not between", value1, value2, "roomno");
            return (Criteria) this;
        }

        public Criteria andCheckinDaysIsNull() {
            addCriterion("CheckIn_Days is null");
            return (Criteria) this;
        }

        public Criteria andCheckinDaysIsNotNull() {
            addCriterion("CheckIn_Days is not null");
            return (Criteria) this;
        }

        public Criteria andCheckinDaysEqualTo(Byte value) {
            addCriterion("CheckIn_Days =", value, "checkinDays");
            return (Criteria) this;
        }

        public Criteria andCheckinDaysNotEqualTo(Byte value) {
            addCriterion("CheckIn_Days <>", value, "checkinDays");
            return (Criteria) this;
        }

        public Criteria andCheckinDaysGreaterThan(Byte value) {
            addCriterion("CheckIn_Days >", value, "checkinDays");
            return (Criteria) this;
        }

        public Criteria andCheckinDaysGreaterThanOrEqualTo(Byte value) {
            addCriterion("CheckIn_Days >=", value, "checkinDays");
            return (Criteria) this;
        }

        public Criteria andCheckinDaysLessThan(Byte value) {
            addCriterion("CheckIn_Days <", value, "checkinDays");
            return (Criteria) this;
        }

        public Criteria andCheckinDaysLessThanOrEqualTo(Byte value) {
            addCriterion("CheckIn_Days <=", value, "checkinDays");
            return (Criteria) this;
        }

        public Criteria andCheckinDaysIn(List<Byte> values) {
            addCriterion("CheckIn_Days in", values, "checkinDays");
            return (Criteria) this;
        }

        public Criteria andCheckinDaysNotIn(List<Byte> values) {
            addCriterion("CheckIn_Days not in", values, "checkinDays");
            return (Criteria) this;
        }

        public Criteria andCheckinDaysBetween(Byte value1, Byte value2) {
            addCriterion("CheckIn_Days between", value1, value2, "checkinDays");
            return (Criteria) this;
        }

        public Criteria andCheckinDaysNotBetween(Byte value1, Byte value2) {
            addCriterion("CheckIn_Days not between", value1, value2, "checkinDays");
            return (Criteria) this;
        }

        public Criteria andRoompowerIsNull() {
            addCriterion("RoomPower is null");
            return (Criteria) this;
        }

        public Criteria andRoompowerIsNotNull() {
            addCriterion("RoomPower is not null");
            return (Criteria) this;
        }

        public Criteria andRoompowerEqualTo(Long value) {
            addCriterion("RoomPower =", value, "roompower");
            return (Criteria) this;
        }

        public Criteria andRoompowerNotEqualTo(Long value) {
            addCriterion("RoomPower <>", value, "roompower");
            return (Criteria) this;
        }

        public Criteria andRoompowerGreaterThan(Long value) {
            addCriterion("RoomPower >", value, "roompower");
            return (Criteria) this;
        }

        public Criteria andRoompowerGreaterThanOrEqualTo(Long value) {
            addCriterion("RoomPower >=", value, "roompower");
            return (Criteria) this;
        }

        public Criteria andRoompowerLessThan(Long value) {
            addCriterion("RoomPower <", value, "roompower");
            return (Criteria) this;
        }

        public Criteria andRoompowerLessThanOrEqualTo(Long value) {
            addCriterion("RoomPower <=", value, "roompower");
            return (Criteria) this;
        }

        public Criteria andRoompowerIn(List<Long> values) {
            addCriterion("RoomPower in", values, "roompower");
            return (Criteria) this;
        }

        public Criteria andRoompowerNotIn(List<Long> values) {
            addCriterion("RoomPower not in", values, "roompower");
            return (Criteria) this;
        }

        public Criteria andRoompowerBetween(Long value1, Long value2) {
            addCriterion("RoomPower between", value1, value2, "roompower");
            return (Criteria) this;
        }

        public Criteria andRoompowerNotBetween(Long value1, Long value2) {
            addCriterion("RoomPower not between", value1, value2, "roompower");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table uc_roomalert_statistics
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
     * This class corresponds to the database table uc_roomalert_statistics
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