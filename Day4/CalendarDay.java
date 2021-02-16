package com.ff.javaapi.Day4;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDay {
    public static void main(String[] args) {
        Calendar s = new GregorianCalendar();
        s.set(2012,3,17);
        Calendar s1 = new GregorianCalendar();
        s1.set(2013,4,6);
        System.out.println((s1.getTimeInMillis()-s.getTimeInMillis())/1000/60/60/24);
    }
}
