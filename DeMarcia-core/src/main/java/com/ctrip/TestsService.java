package com.ctrip;

import com.ctrip.asp.commom.dao.auto.client.AspCtripMappingMapper;
import com.ctrip.asp.commom.dao.auto.model.AspCtripMapping;
import com.ctrip.asp.commom.dao.auto.model.AspCtripMappingExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author haiyu.xi
 * @create 2018-03-12 17:21
 **/
@Service
public class TestsService {

    @Autowired
    private Dao aspCtripMappingMapper;

    public List<AspCtripMapping> query(){
        return aspCtripMappingMapper.query();
    }
}
