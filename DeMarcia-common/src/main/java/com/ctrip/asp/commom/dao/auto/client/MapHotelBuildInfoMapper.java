package com.ctrip.asp.commom.dao.auto.client;

import com.ctrip.asp.commom.dao.auto.model.MapHotelBuildInfo;
import com.ctrip.asp.commom.dao.auto.model.MapHotelBuildInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MapHotelBuildInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_hotel_build_info
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int countByExample(MapHotelBuildInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_hotel_build_info
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int deleteByExample(MapHotelBuildInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_hotel_build_info
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_hotel_build_info
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insert(MapHotelBuildInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_hotel_build_info
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insertSelective(MapHotelBuildInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_hotel_build_info
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    List<MapHotelBuildInfo> selectByExample(MapHotelBuildInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_hotel_build_info
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    MapHotelBuildInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_hotel_build_info
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") MapHotelBuildInfo record, @Param("example") MapHotelBuildInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_hotel_build_info
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExample(@Param("record") MapHotelBuildInfo record, @Param("example") MapHotelBuildInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_hotel_build_info
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByPrimaryKeySelective(MapHotelBuildInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_hotel_build_info
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByPrimaryKey(MapHotelBuildInfo record);
}