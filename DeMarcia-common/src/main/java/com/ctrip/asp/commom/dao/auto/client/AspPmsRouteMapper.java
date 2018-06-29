package com.ctrip.asp.commom.dao.auto.client;

import com.ctrip.asp.commom.dao.auto.model.AspPmsRoute;
import com.ctrip.asp.commom.dao.auto.model.AspPmsRouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AspPmsRouteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_pms_route
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int countByExample(AspPmsRouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_pms_route
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int deleteByExample(AspPmsRouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_pms_route
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_pms_route
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insert(AspPmsRoute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_pms_route
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insertSelective(AspPmsRoute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_pms_route
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    List<AspPmsRoute> selectByExample(AspPmsRouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_pms_route
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    AspPmsRoute selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_pms_route
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") AspPmsRoute record, @Param("example") AspPmsRouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_pms_route
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExample(@Param("record") AspPmsRoute record, @Param("example") AspPmsRouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_pms_route
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByPrimaryKeySelective(AspPmsRoute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asp_pms_route
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByPrimaryKey(AspPmsRoute record);
}