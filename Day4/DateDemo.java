package com.ff.javaapi.Day4;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();//获取系统时间
        System.out.println(date);

        //date.setTime(1646246462564L);//设置时间
        Date date1 = new Date(1646246462564L);//毫秒转年月日
        System.out.println(date1);

        System.out.println(date.getYear()+1900);
        System.out.println(date.getMonth()+1);
        System.out.println(date.getDate());
        System.out.println(date.getDay());
        System.out.println(date.getHours());
        System.out.println(date.getMinutes());
        System.out.println(date.getTime());//==System.currentTimeMillis();
    }
}
