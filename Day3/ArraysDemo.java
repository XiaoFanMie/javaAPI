package com.ff.javaapi.Day3;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int [] a= {1,2,3,4,5};
        int [] b = {1,2,3,4,5};
        //比较数组中的内容是否一致
        System.out.println(Arrays.equals(a,b));

        int [] a1= {1,2,3,4,5};
        int [] b1 = {1,2,3,4};
        System.out.println(Arrays.equals(a1,b1));

    }
}
