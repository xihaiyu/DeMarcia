package com.ctrip.asp.commom.dao.auto.client;

import com.ctrip.asp.commom.dao.auto.model.MapHotelMapping;
import com.ctrip.asp.commom.dao.auto.model.MapHotelMappingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MapHotelMappingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_hotel_mapping
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int countByExample(MapHotelMappingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_hotel_mapping
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int deleteByExample(MapHotelMappingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_hotel_mapping
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_hotel_mapping
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insert(MapHotelMapping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_hotel_mapping
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insertSelective(MapHotelMapping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_hotel_mapping
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    List<MapHotelMapping> selectByExample(MapHotelMappingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_hotel_mapping
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    MapHotelMapping selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_hotel_mapping
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") MapHotelMapping record, @Param("example") MapHotelMappingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_hotel_mapping
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExample(@Param("record") MapHotelMapping record, @Param("example") MapHotelMappingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_hotel_mapping
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByPrimaryKeySelective(MapHotelMapping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_hotel_mapping
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByPrimaryKey(MapHotelMapping record);
}