package com.springcloud.ufire.core.model;

import com.springcloud.ufire.core.model.UserExample.C;
import com.springcloud.ufire.core.model.UserExample.Criteria;
import java.io.Serializable;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import mboog.support.example.AbstractExample;
import mboog.support.example.AbstractGeneratedCriteria;
import mboog.support.example.CInterface;
import mboog.support.example.CItem;
import mboog.support.example.ColumnListAble;
import mboog.support.example.PaginationAble;

@SuppressWarnings("unused")
public class UserExample extends AbstractExample<UserExample, Criteria, C> implements ColumnListAble<UserExample, C, C>, Serializable, PaginationAble<UserExample> {
    
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    public UserExample() {
        supplier = Criteria::new;
        initColumnList(C.class);
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria extends AbstractGeneratedCriteria<Criteria> {

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

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String pattern, String value) {
            addCriterionPattern("`name` like", pattern, value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String pattern, String value) {
            addCriterionPattern("`name` not like", pattern, value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNull() {
            addCriterion("message_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNotNull() {
            addCriterion("message_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIdEqualTo(String value) {
            addCriterion("message_id =", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotEqualTo(String value) {
            addCriterion("message_id <>", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThan(String value) {
            addCriterion("message_id >", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThanOrEqualTo(String value) {
            addCriterion("message_id >=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThan(String value) {
            addCriterion("message_id <", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThanOrEqualTo(String value) {
            addCriterion("message_id <=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLike(String pattern, String value) {
            addCriterionPattern("message_id like", pattern, value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotLike(String pattern, String value) {
            addCriterionPattern("message_id not like", pattern, value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdIn(List<String> values) {
            addCriterion("message_id in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotIn(List<String> values) {
            addCriterion("message_id not in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdBetween(String value1, String value2) {
            addCriterion("message_id between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotBetween(String value1, String value2) {
            addCriterion("message_id not between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String pattern, String value) {
            addCriterionPattern("user_id like", pattern, value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String pattern, String value) {
            addCriterionPattern("user_id not like", pattern, value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andReconnectIsNull() {
            addCriterion("reconnect is null");
            return (Criteria) this;
        }

        public Criteria andReconnectIsNotNull() {
            addCriterion("reconnect is not null");
            return (Criteria) this;
        }

        public Criteria andReconnectEqualTo(String value) {
            addCriterion("reconnect =", value, "reconnect");
            return (Criteria) this;
        }

        public Criteria andReconnectNotEqualTo(String value) {
            addCriterion("reconnect <>", value, "reconnect");
            return (Criteria) this;
        }

        public Criteria andReconnectGreaterThan(String value) {
            addCriterion("reconnect >", value, "reconnect");
            return (Criteria) this;
        }

        public Criteria andReconnectGreaterThanOrEqualTo(String value) {
            addCriterion("reconnect >=", value, "reconnect");
            return (Criteria) this;
        }

        public Criteria andReconnectLessThan(String value) {
            addCriterion("reconnect <", value, "reconnect");
            return (Criteria) this;
        }

        public Criteria andReconnectLessThanOrEqualTo(String value) {
            addCriterion("reconnect <=", value, "reconnect");
            return (Criteria) this;
        }

        public Criteria andReconnectLike(String pattern, String value) {
            addCriterionPattern("reconnect like", pattern, value, "reconnect");
            return (Criteria) this;
        }

        public Criteria andReconnectNotLike(String pattern, String value) {
            addCriterionPattern("reconnect not like", pattern, value, "reconnect");
            return (Criteria) this;
        }

        public Criteria andReconnectIn(List<String> values) {
            addCriterion("reconnect in", values, "reconnect");
            return (Criteria) this;
        }

        public Criteria andReconnectNotIn(List<String> values) {
            addCriterion("reconnect not in", values, "reconnect");
            return (Criteria) this;
        }

        public Criteria andReconnectBetween(String value1, String value2) {
            addCriterion("reconnect between", value1, value2, "reconnect");
            return (Criteria) this;
        }

        public Criteria andReconnectNotBetween(String value1, String value2) {
            addCriterion("reconnect not between", value1, value2, "reconnect");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria implements Serializable {
        
        private static final long serialVersionUID = 1L;

        protected Criteria() {
            super();
        }
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table user
     *
     * @mbg.generated
     */
    public enum C implements CInterface {
        //--------------------------------------------------
		//[TABLE]
		//--------------------------------------------------					
						ID(1, Types.INTEGER, false, "id"),					
						NAME(2, Types.VARCHAR, true, "name"),					
						MESSAGE_ID(2, Types.VARCHAR, false, "message_id"),					
						USER_ID(2, Types.VARCHAR, false, "user_id"),					
						RECONNECT(2, Types.VARCHAR, false, "reconnect");

        C(int types, int jdbcType, boolean delimited, String columnName) {
            init(new CItem(types, jdbcType, delimited, columnName, null , "`", "`"));
        }
    }
}