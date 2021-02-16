package com.ff.javaapi.Day4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        /*
        1.日期转为指定格式的字符串
         */
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss  E", Locale.CHINA);//设置格式和地区
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss  E", Locale.JAPAN);
        String s = sdf.format(date);
        String s1 = sdf1.format(date);
        System.out.println(s);
        System.out.println(s1);
        /*
        1.字符串转日期
         */
        String str = "2020-11-17 12.23.45";
        SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");//此处格式必须要与字符串中的日期格式相同
        try {
            Date d1=d.parse(str);
            System.out.println(d1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
