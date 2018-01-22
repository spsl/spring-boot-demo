package com.jackie.controller;

import com.jackie.common.GeneralResult;
import com.jackie.dao.UserMapper;
import com.jackie.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by lwxzbh on 2017/7/20.
 */
@RestController
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/cs")
    public GeneralResult cs(){
        List<User> user = userMapper.selectUserByName("sunsai");
        return GeneralResult.ok(user);
    }
}
