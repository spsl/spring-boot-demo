package com.lalala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lwxzbh on 2017/7/20.
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/lalala")
    @ResponseBody
    private String sayHello(){
        return "Hello HelloWorld222234";
    }

}
