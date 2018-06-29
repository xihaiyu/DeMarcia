package com.ctrip.asp.commom.dao.auto.client;

import com.ctrip.asp.commom.dao.auto.model.SrHotelRoomRestriction;
import com.ctrip.asp.commom.dao.auto.model.SrHotelRoomRestrictionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SrHotelRoomRestrictionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_hotel_room_restriction
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int countByExample(SrHotelRoomRestrictionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_hotel_room_restriction
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int deleteByExample(SrHotelRoomRestrictionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_hotel_room_restriction
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_hotel_room_restriction
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insert(SrHotelRoomRestriction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_hotel_room_restriction
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insertSelective(SrHotelRoomRestriction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_hotel_room_restriction
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    List<SrHotelRoomRestriction> selectByExample(SrHotelRoomRestrictionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_hotel_room_restriction
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    SrHotelRoomRestriction selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_hotel_room_restriction
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") SrHotelRoomRestriction record, @Param("example") SrHotelRoomRestrictionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_hotel_room_restriction
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExample(@Param("record") SrHotelRoomRestriction record, @Param("example") SrHotelRoomRestrictionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_hotel_room_restriction
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByPrimaryKeySelective(SrHotelRoomRestriction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sr_hotel_room_restriction
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByPrimaryKey(SrHotelRoomRestriction record);
}