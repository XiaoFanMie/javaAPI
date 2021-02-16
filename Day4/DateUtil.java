package com.ff.javaapi.Day4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateUtil {
    //固定格式转换
    public static void StrDate(String str) throws ParseException {
        SimpleDateFormat s = new SimpleDateFormat("yyyyMMdd");
            Date d = s.parse(str);
            System.out.println(d);
    }
    //自定义转换
    public static void StrDate(String str,String p) throws ParseException {
        SimpleDateFormat s = new SimpleDateFormat(p);
            Date d = s.parse(str);
            System.out.println(d);
    }

    public static String DateStr(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E ", Locale.CHINA);
       String str = sdf.format(date);
       return str;
    }public static String DateStr(Date date,String p){
        SimpleDateFormat sdf = new SimpleDateFormat(p);
       String str = sdf.format(date);
       return str;
    }
}
