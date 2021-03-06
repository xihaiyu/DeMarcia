package com.ctrip.asp.commom.dao.auto.client;

import com.ctrip.asp.commom.dao.auto.model.UcDevicecontrolRqLog;
import com.ctrip.asp.commom.dao.auto.model.UcDevicecontrolRqLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UcDevicecontrolRqLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uc_devicecontrol_rq_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int countByExample(UcDevicecontrolRqLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uc_devicecontrol_rq_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int deleteByExample(UcDevicecontrolRqLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uc_devicecontrol_rq_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insert(UcDevicecontrolRqLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uc_devicecontrol_rq_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insertSelective(UcDevicecontrolRqLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uc_devicecontrol_rq_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    List<UcDevicecontrolRqLog> selectByExampleWithBLOBs(UcDevicecontrolRqLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uc_devicecontrol_rq_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    List<UcDevicecontrolRqLog> selectByExample(UcDevicecontrolRqLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uc_devicecontrol_rq_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") UcDevicecontrolRqLog record, @Param("example") UcDevicecontrolRqLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uc_devicecontrol_rq_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") UcDevicecontrolRqLog record, @Param("example") UcDevicecontrolRqLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uc_devicecontrol_rq_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExample(@Param("record") UcDevicecontrolRqLog record, @Param("example") UcDevicecontrolRqLogExample example);
}