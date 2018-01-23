package com.lalala.controller;

import com.lalala.common.GeneralResult;
import com.lalala.dao.cluster.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by spsl on 2018/1/22.
 */
@RestController
public class CityController {

    @Autowired
    CityMapper cityMapper;

    @RequestMapping( value = "/city/list", method = RequestMethod.GET)
    private GeneralResult list() {
        return GeneralResult.ok(cityMapper.list());
    }

}
