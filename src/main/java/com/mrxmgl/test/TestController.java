package com.mrxmgl.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @date 2019/7/12 0012 10:28
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(value = "/demo")
    public String demo(){
        return "Hello Wolrd";
    }
}