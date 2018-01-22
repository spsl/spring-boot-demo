package com.jackie.common;

import com.alibaba.fastjson.JSON;
import com.jackie.entity.User;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by spsl on 2018/1/22.
 */
public class GeneralResult<T> {


    private int code = 0;
    private String message = "ok";
    private T result;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getResult() {
        return result;
    }

    GeneralResult(int code, String msg, T result) {
        this.code = code;
        this.message = msg;
        this.result = result;
    }

    public static <T> GeneralResult<T> ok(T result) {
        return new GeneralResult(0, "ok", result);
    }

    public static <T> GeneralResult<T> error(int code, String msg, T result) {
        return new GeneralResult(code, msg, result);
    }

    public static void main(String[] args) {

        List<User> resu = new ArrayList<>();

        User user = new User();
        user.setAge(12);
        user.setUsername("sunsai");
        user.setCustomerId(123444);
        resu.add(user);
        String res = JSON.toJSONString(GeneralResult.ok(resu));

        System.out.println(res);
    }

}
