package com.ctrip.web.controller.tests;

import com.ctrip.TestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author haiyu.xi
 * @create 2018-03-12 17:17
 **/
@Controller
@RequestMapping("/test")
public class TestContorller {

    @Autowired
    private TestsService testsService;

    @ResponseBody
    @RequestMapping(value = "/queryRoomTypes", method = RequestMethod.GET)
    public Object tests() {
        return testsService.query();
    }
}
