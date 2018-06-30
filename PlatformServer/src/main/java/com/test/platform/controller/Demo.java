package com.test.platform.controller;

import com.alibaba.fastjson.JSONObject;

import com.test.platform.model.DemoBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@Log4j
@RestController
@Api(value = "/platform/", description = "测试平台demo接口")
@RequestMapping("/platform/")
public class Demo {

    @Autowired
    SqlSessionTemplate template;

    @ApiOperation(value = "post方法demo", httpMethod = "POST")
    @RequestMapping(value = "/postDemo", method = RequestMethod.POST)
    public JSONObject postDemo(@RequestBody DemoBean param) {
            JSONObject object = new JSONObject();
            object.put("status",200);
            object.put("first",param.getFirst());
            object.put("second",param.getSecond());
            return object;
    }


    @ApiOperation(value = "get方法demo", httpMethod = "GET")
    @RequestMapping(value = "/getDemo", method = RequestMethod.GET)
    public String getDemo(@RequestParam int first,@RequestParam String second) {
        String result = "first parameter is :" + first + ", second parameter is :" + second;
        log.info(result);
        return result;
    }
}
