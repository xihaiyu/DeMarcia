package com.ctrip.asp.commom.dao.auto.client;

import com.ctrip.asp.commom.dao.auto.model.UcDevicestatusRsLog;
import com.ctrip.asp.commom.dao.auto.model.UcDevicestatusRsLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UcDevicestatusRsLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uc_deviceStatus_rs_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int countByExample(UcDevicestatusRsLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uc_deviceStatus_rs_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int deleteByExample(UcDevicestatusRsLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uc_deviceStatus_rs_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insert(UcDevicestatusRsLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uc_deviceStatus_rs_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insertSelective(UcDevicestatusRsLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uc_deviceStatus_rs_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    List<UcDevicestatusRsLog> selectByExampleWithBLOBs(UcDevicestatusRsLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uc_deviceStatus_rs_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    List<UcDevicestatusRsLog> selectByExample(UcDevicestatusRsLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uc_deviceStatus_rs_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") UcDevicestatusRsLog record, @Param("example") UcDevicestatusRsLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uc_deviceStatus_rs_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") UcDevicestatusRsLog record, @Param("example") UcDevicestatusRsLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uc_deviceStatus_rs_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExample(@Param("record") UcDevicestatusRsLog record, @Param("example") UcDevicestatusRsLogExample example);
}