package com.ctrip.asp.commom.dao.auto.client;

import com.ctrip.asp.commom.dao.auto.model.MapRoomMapping;
import com.ctrip.asp.commom.dao.auto.model.MapRoomMappingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MapRoomMappingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_room_mapping
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int countByExample(MapRoomMappingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_room_mapping
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int deleteByExample(MapRoomMappingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_room_mapping
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_room_mapping
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insert(MapRoomMapping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_room_mapping
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insertSelective(MapRoomMapping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_room_mapping
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    List<MapRoomMapping> selectByExample(MapRoomMappingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_room_mapping
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    MapRoomMapping selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_room_mapping
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") MapRoomMapping record, @Param("example") MapRoomMappingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_room_mapping
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExample(@Param("record") MapRoomMapping record, @Param("example") MapRoomMappingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_room_mapping
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByPrimaryKeySelective(MapRoomMapping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map_room_mapping
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByPrimaryKey(MapRoomMapping record);
}