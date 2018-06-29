package com.ctrip.asp.commom.dao.auto.client;

import com.ctrip.asp.commom.dao.auto.model.AspHotel;
import com.ctrip.asp.commom.dao.auto.model.AspHotelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AspHotelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_hotel
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int countByExample(AspHotelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_hotel
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int deleteByExample(AspHotelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_hotel
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_hotel
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insert(AspHotel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_hotel
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insertSelective(AspHotel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_hotel
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    List<AspHotel> selectByExample(AspHotelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_hotel
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    AspHotel selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_hotel
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") AspHotel record, @Param("example") AspHotelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_hotel
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExample(@Param("record") AspHotel record, @Param("example") AspHotelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_hotel
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByPrimaryKeySelective(AspHotel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_hotel
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByPrimaryKey(AspHotel record);
}