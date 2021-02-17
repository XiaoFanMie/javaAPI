package com.ff.javaapi.Day5;

import java.math.BigInteger;

public class BigIntegerDemp {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("21111111111111111111111111111111111111111111111111111111111111");
        BigInteger b2 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
        System.out.println(b1.add(b2));
        System.out.println(b1.divide(b2));
        System.out.println(b1.multiply(b2));
        System.out.println(b1.subtract(b2));
    }
}
