package com.ctrip.asp.commom.dao.auto.client;

import com.ctrip.asp.commom.dao.auto.model.JobConfig;
import com.ctrip.asp.commom.dao.auto.model.JobConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_config
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int countByExample(JobConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_config
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int deleteByExample(JobConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_config
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int deleteByPrimaryKey(String jobName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_config
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insert(JobConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_config
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int insertSelective(JobConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_config
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    List<JobConfig> selectByExample(JobConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_config
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    JobConfig selectByPrimaryKey(String jobName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_config
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") JobConfig record, @Param("example") JobConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_config
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByExample(@Param("record") JobConfig record, @Param("example") JobConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_config
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByPrimaryKeySelective(JobConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_config
     *
     * @mbggenerated Tue Mar 13 16:31:51 CST 2018
     */
    int updateByPrimaryKey(JobConfig record);
}