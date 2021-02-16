package com.ff.javaapi.Day4;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class DateUtilTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long L = input.nextLong();
        Date date = new Date();
        date.setTime(L);
        System.out.println(DateUtil.DateStr(date));
        System.out.println(DateUtil.DateStr(date,"yyyy-MM-dd HH:mm:ss E"));

        String str = input.next();
        String p= input.next();
       /* try {
            DateUtil.StrDate(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }*/
        try {
            DateUtil.StrDate(str,p);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
