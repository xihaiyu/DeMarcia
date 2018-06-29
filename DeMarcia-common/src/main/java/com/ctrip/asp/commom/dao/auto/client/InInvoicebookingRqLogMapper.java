package com.ctrip.asp.commom.dao.auto.client;

import com.ctrip.asp.commom.dao.auto.model.InInvoicebookingRqLog;
import com.ctrip.asp.commom.dao.auto.model.InInvoicebookingRqLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InInvoicebookingRqLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicebooking_rq_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int countByExample(InInvoicebookingRqLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicebooking_rq_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int deleteByExample(InInvoicebookingRqLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicebooking_rq_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insert(InInvoicebookingRqLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicebooking_rq_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insertSelective(InInvoicebookingRqLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicebooking_rq_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    List<InInvoicebookingRqLog> selectByExampleWithBLOBs(InInvoicebookingRqLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicebooking_rq_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    List<InInvoicebookingRqLog> selectByExample(InInvoicebookingRqLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicebooking_rq_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") InInvoicebookingRqLog record, @Param("example") InInvoicebookingRqLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicebooking_rq_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") InInvoicebookingRqLog record, @Param("example") InInvoicebookingRqLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicebooking_rq_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExample(@Param("record") InInvoicebookingRqLog record, @Param("example") InInvoicebookingRqLogExample example);
}