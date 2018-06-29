package com.ctrip.asp.commom.dao.auto.client;

import com.ctrip.asp.commom.dao.auto.model.InInvoicenotifyRqLog;
import com.ctrip.asp.commom.dao.auto.model.InInvoicenotifyRqLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InInvoicenotifyRqLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicenotify_rq_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int countByExample(InInvoicenotifyRqLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicenotify_rq_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int deleteByExample(InInvoicenotifyRqLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicenotify_rq_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insert(InInvoicenotifyRqLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicenotify_rq_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insertSelective(InInvoicenotifyRqLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicenotify_rq_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    List<InInvoicenotifyRqLog> selectByExampleWithBLOBs(InInvoicenotifyRqLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicenotify_rq_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    List<InInvoicenotifyRqLog> selectByExample(InInvoicenotifyRqLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicenotify_rq_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") InInvoicenotifyRqLog record, @Param("example") InInvoicenotifyRqLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicenotify_rq_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") InInvoicenotifyRqLog record, @Param("example") InInvoicenotifyRqLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_invoicenotify_rq_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExample(@Param("record") InInvoicenotifyRqLog record, @Param("example") InInvoicenotifyRqLogExample example);
}