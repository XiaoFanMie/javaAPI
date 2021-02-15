package com.ff.javaapi.Day3;

import java.util.Arrays;

public class ArraysDemo4 {
    public static void main(String[] args) {

        int [] a = {5,5,6,8,1};
        int index = Arrays.binarySearch(a,1);
        System.out.println(Arrays.toString(a));
        System.out.println(index);//在数组a中找值为1的数值下标,返回值为-1,表明没找到
        /*
        二分查找法,必须数组中数值按顺序排列
         */
        Arrays.sort(a);//排序数组
        System.out.println(Arrays.toString(a));
        int index1 = Arrays.binarySearch(a,5);//对有序数组进行二分查找
        System.out.println(index1);
    }
}
