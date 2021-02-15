package com.ff.javaapi.Day3;

import java.util.Arrays;

public class ArraysCopyOfDemo {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        System.out.println(Arrays.toString(a));

        /*
        数组复制,当当前数组长度不够用时,将原来的内容复制到新数组中,并指定数组长度
         */
        int [] b = Arrays.copyOf(a,15);
        System.out.println(Arrays.toString(b));
    }
}
