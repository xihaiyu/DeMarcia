package com.ctrip.asp.commom.dao.auto.model;

import java.util.ArrayList;
import java.util.List;

public class SrSelectorderRsLogExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sr_selectorder_rs_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sr_selectorder_rs_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sr_selectorder_rs_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_selectorder_rs_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    public SrSelectorderRsLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_selectorder_rs_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_selectorder_rs_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_selectorder_rs_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_selectorder_rs_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_selectorder_rs_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_selectorder_rs_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_selectorder_rs_log
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
     * This method corresponds to the database table sr_selectorder_rs_log
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
     * This method corresponds to the database table sr_selectorder_rs_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_selectorder_rs_log
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
     * This class corresponds to the database table sr_selectorder_rs_log
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

        public Criteria andUniqueidIsNull() {
            addCriterion("UniqueID is null");
            return (Criteria) this;
        }

        public Criteria andUniqueidIsNotNull() {
            addCriterion("UniqueID is not null");
            return (Criteria) this;
        }

        public Criteria andUniqueidEqualTo(String value) {
            addCriterion("UniqueID =", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidNotEqualTo(String value) {
            addCriterion("UniqueID <>", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidGreaterThan(String value) {
            addCriterion("UniqueID >", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidGreaterThanOrEqualTo(String value) {
            addCriterion("UniqueID >=", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidLessThan(String value) {
            addCriterion("UniqueID <", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidLessThanOrEqualTo(String value) {
            addCriterion("UniqueID <=", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidLike(String value) {
            addCriterion("UniqueID like", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidNotLike(String value) {
            addCriterion("UniqueID not like", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidIn(List<String> values) {
            addCriterion("UniqueID in", values, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidNotIn(List<String> values) {
            addCriterion("UniqueID not in", values, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidBetween(String value1, String value2) {
            addCriterion("UniqueID between", value1, value2, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidNotBetween(String value1, String value2) {
            addCriterion("UniqueID not between", value1, value2, "uniqueid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sr_selectorder_rs_log
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
     * This class corresponds to the database table sr_selectorder_rs_log
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