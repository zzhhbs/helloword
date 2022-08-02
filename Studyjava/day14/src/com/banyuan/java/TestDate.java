package com.banyuan.java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) {

        Date date = new Date();
       // System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        String format = sdf.format(date);
        System.out.println(format);

    }
}
