package com.ff.javaapi.Day4;

import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar rightNow = Calendar.getInstance();//获取系统时间
        System.out.println(rightNow);

        Calendar rightNow1 = new GregorianCalendar();//第二种获取系统时间
        rightNow1.set(2022,5,23,10,10,10);//自己设定时间
        System.out.println(rightNow1.getTime());
        System.out.println(rightNow1.get(Calendar.YEAR));
        System.out.println(rightNow1.get(Calendar.MONTH));
        System.out.println(rightNow1.get(Calendar.DATE));
        System.out.println(rightNow1.get(Calendar.DAY_OF_MONTH));
        System.out.println(rightNow1.get(Calendar.WEEK_OF_YEAR));
        System.out.println(rightNow1.get(Calendar.DAY_OF_MONTH));


    }


}
