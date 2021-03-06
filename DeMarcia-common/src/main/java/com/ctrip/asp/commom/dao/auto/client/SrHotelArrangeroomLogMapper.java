package com.ctrip.asp.commom.dao.auto.client;

import com.ctrip.asp.commom.dao.auto.model.SrHotelArrangeroomLog;
import com.ctrip.asp.commom.dao.auto.model.SrHotelArrangeroomLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SrHotelArrangeroomLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_hotel_arrangeroom_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int countByExample(SrHotelArrangeroomLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_hotel_arrangeroom_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int deleteByExample(SrHotelArrangeroomLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_hotel_arrangeroom_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_hotel_arrangeroom_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insert(SrHotelArrangeroomLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_hotel_arrangeroom_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insertSelective(SrHotelArrangeroomLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_hotel_arrangeroom_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    List<SrHotelArrangeroomLog> selectByExample(SrHotelArrangeroomLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_hotel_arrangeroom_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    SrHotelArrangeroomLog selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_hotel_arrangeroom_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") SrHotelArrangeroomLog record, @Param("example") SrHotelArrangeroomLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_hotel_arrangeroom_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExample(@Param("record") SrHotelArrangeroomLog record, @Param("example") SrHotelArrangeroomLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_hotel_arrangeroom_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByPrimaryKeySelective(SrHotelArrangeroomLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_hotel_arrangeroom_log
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByPrimaryKey(SrHotelArrangeroomLog record);
}