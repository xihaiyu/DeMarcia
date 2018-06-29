package com.ctrip.asp.commom.dao.auto.client;

import com.ctrip.asp.commom.dao.auto.model.InInvoicetranssearchLog;
import com.ctrip.asp.commom.dao.auto.model.InInvoicetranssearchLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InInvoicetranssearchLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicetranssearch_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int countByExample(InInvoicetranssearchLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicetranssearch_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int deleteByExample(InInvoicetranssearchLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicetranssearch_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicetranssearch_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insert(InInvoicetranssearchLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicetranssearch_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insertSelective(InInvoicetranssearchLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicetranssearch_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    List<InInvoicetranssearchLog> selectByExample(InInvoicetranssearchLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicetranssearch_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    InInvoicetranssearchLog selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicetranssearch_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") InInvoicetranssearchLog record, @Param("example") InInvoicetranssearchLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicetranssearch_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExample(@Param("record") InInvoicetranssearchLog record, @Param("example") InInvoicetranssearchLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicetranssearch_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByPrimaryKeySelective(InInvoicetranssearchLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicetranssearch_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByPrimaryKey(InInvoicetranssearchLog record);
}