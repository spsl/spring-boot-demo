package com.lalala;

import java.util.UUID;

/**
 * Created by spsl on 2018/1/22.
 */
public class Test {

    public static String uuid() {
        return System.currentTimeMillis() + "-" + UUID.randomUUID().toString();
    }

    public static void main(String[] args) {


        for (int i = 0; i < 100; i++) {
            System.out.println(uuid());
        }

    }
}
