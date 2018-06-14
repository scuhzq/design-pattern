package com.hzq.desginpatterns;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hzq on 2018/6/14.
 */
public class TestObjParam {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println("before:" + sdf.format(date));
        setObj(date);
        System.out.println("after:" + sdf.format(date));
    }

    public static void setObj(Date date) throws ParseException {
        date = sdf.parse("2018-09-10 00:00:00");
        System.out.println("参数重新赋值：" + sdf.format(date));
    }
}
