package com.ff.javaapi.Day3;

import java.util.Arrays;

public class ArraysDemo2 {
    public static void main(String[] args) {
        /*
        对基本类型数组排序
         */
        int [] a =new int[]{1,5,3,4,7,8};
        Arrays.sort(a,0,3);
        System.out.println(Arrays.toString(a));
    }
}
