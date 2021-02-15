package com.ff.javaapi.Day3;

import java.util.Arrays;

public class ArraysDemo3 {
    public static void main(String[] args) {
        /*
        引用类型排序
         */
        Student stu =new Student("B",70,80);
        Student stu1 =new Student("A",80,90);
        Student stu2 =new Student("C",60,70);
        Student [] atu = new Student[3];
        atu [0]= stu;
        atu [1]= stu1;
        atu [2]= stu2;
        Arrays.sort(atu);//对学生数组排序
        System.out.println(Arrays.toString(atu));
    }
}
