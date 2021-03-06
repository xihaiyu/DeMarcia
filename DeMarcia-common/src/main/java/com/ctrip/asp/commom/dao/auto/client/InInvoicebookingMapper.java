package com.ctrip.asp.commom.dao.auto.client;

import com.ctrip.asp.commom.dao.auto.model.InInvoicebooking;
import com.ctrip.asp.commom.dao.auto.model.InInvoicebookingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InInvoicebookingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicebooking
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int countByExample(InInvoicebookingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicebooking
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int deleteByExample(InInvoicebookingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicebooking
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicebooking
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insert(InInvoicebooking record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicebooking
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insertSelective(InInvoicebooking record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicebooking
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    List<InInvoicebooking> selectByExample(InInvoicebookingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicebooking
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    InInvoicebooking selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicebooking
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") InInvoicebooking record, @Param("example") InInvoicebookingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicebooking
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExample(@Param("record") InInvoicebooking record, @Param("example") InInvoicebookingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicebooking
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByPrimaryKeySelective(InInvoicebooking record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicebooking
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByPrimaryKey(InInvoicebooking record);
}