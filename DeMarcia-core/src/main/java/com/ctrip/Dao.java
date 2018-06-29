package com.ctrip;

import com.ctrip.asp.commom.dao.auto.client.AspCtripMappingMapper;
import com.ctrip.asp.commom.dao.auto.model.AspCtripMapping;
import com.ctrip.asp.commom.dao.auto.model.AspCtripMappingExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author haiyu.xi
 * @create 2018-03-12 19:06
 **/
@Component
public class Dao {

    @Autowired
    private AspCtripMappingMapper aspCtripMappingMapper;

    public List<AspCtripMapping> query(){
        AspCtripMappingExample example = new AspCtripMappingExample();
        AspCtripMappingExample.Criteria criteria = example.createCriteria();
        return aspCtripMappingMapper.selectByExample(example);
    }
}
