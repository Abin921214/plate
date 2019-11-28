package com.jzhl.plate.utils;

import java.util.UUID;

public class UUIDUtils {

    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static String getUUIDUpperCase(){
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(getUUID());
    }
}
