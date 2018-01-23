package com.lalala.controller;

import com.lalala.common.GeneralResult;
import com.lalala.dao.master.UserMapper;
import com.lalala.entity.User;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by lwxzbh on 2017/7/20.
 */
@RestController
public class UserController {
//    private Logger logger = LoggerFactory.getLogger(UserController.class);
    private static final Logger log = LogManager.getLogger(UserController.class);
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/cs")
    public GeneralResult cs(){
        List<User> user = userMapper.selectUserByName("sunsai");
        log.debug("debug helloworld");
        log.info("info helloworld");
        log.error("error helloworld");
        return GeneralResult.ok(user);
    }
}
