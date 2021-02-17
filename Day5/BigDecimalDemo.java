package com.ff.javaapi.Day5;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {

        System.out.println(12.0-11.9);
        BigDecimal b1 = new BigDecimal("12.0");
        BigDecimal b2 = new BigDecimal("11.9");
        System.out.println(b1.subtract(b2));

        BigDecimal b3 = new BigDecimal("12");
        BigDecimal b4 = new BigDecimal("7");
        //System.out.println(b3.divide(b4));
        System.out.println(b3.divide(b4,8,BigDecimal.ROUND_FLOOR));
        System.out.println(b3.divide(b4,6,BigDecimal.ROUND_CEILING));
    }
}
