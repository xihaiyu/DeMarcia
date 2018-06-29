package com.ctrip.asp.commom.dao.auto.client;

import com.ctrip.asp.commom.dao.auto.model.SrRoomstatusLog;
import com.ctrip.asp.commom.dao.auto.model.SrRoomstatusLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SrRoomstatusLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_roomstatus_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int countByExample(SrRoomstatusLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_roomstatus_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int deleteByExample(SrRoomstatusLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_roomstatus_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_roomstatus_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insert(SrRoomstatusLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_roomstatus_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insertSelective(SrRoomstatusLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_roomstatus_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    List<SrRoomstatusLog> selectByExample(SrRoomstatusLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_roomstatus_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    SrRoomstatusLog selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_roomstatus_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") SrRoomstatusLog record, @Param("example") SrRoomstatusLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_roomstatus_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExample(@Param("record") SrRoomstatusLog record, @Param("example") SrRoomstatusLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_roomstatus_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByPrimaryKeySelective(SrRoomstatusLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_roomstatus_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByPrimaryKey(SrRoomstatusLog record);
}