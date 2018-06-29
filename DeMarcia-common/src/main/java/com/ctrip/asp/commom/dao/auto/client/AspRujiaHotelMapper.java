package com.ctrip.asp.commom.dao.auto.client;

import com.ctrip.asp.commom.dao.auto.model.AspRujiaHotel;
import com.ctrip.asp.commom.dao.auto.model.AspRujiaHotelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AspRujiaHotelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_rujia_hotel
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int countByExample(AspRujiaHotelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_rujia_hotel
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int deleteByExample(AspRujiaHotelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_rujia_hotel
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_rujia_hotel
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insert(AspRujiaHotel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_rujia_hotel
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insertSelective(AspRujiaHotel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_rujia_hotel
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    List<AspRujiaHotel> selectByExample(AspRujiaHotelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_rujia_hotel
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    AspRujiaHotel selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_rujia_hotel
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") AspRujiaHotel record, @Param("example") AspRujiaHotelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_rujia_hotel
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExample(@Param("record") AspRujiaHotel record, @Param("example") AspRujiaHotelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_rujia_hotel
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByPrimaryKeySelective(AspRujiaHotel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_rujia_hotel
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByPrimaryKey(AspRujiaHotel record);
}