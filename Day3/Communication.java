package com.ff.javaapi.Day3;

import java.util.Arrays;

public class Communication {
    public static void main(String[] args) {
        String s =      "罗霄:上机成绩=90,笔试成绩=78;"
                + "刘苗苗:上机成绩=68,笔试成绩=98;"
                + "郝笑:上机成绩=48,笔试成绩=58;"
                + "李昊阳:上机成绩=55,笔试成绩=11;"
                + "雷鸣:上机成绩=44,笔试成绩=55;"
                + "李文龙:上机成绩=22,笔试成绩=55;"
                + "赵璧辉:上机成绩=44,笔试成绩=66;" ;
        //先将学生信息分隔开
        String [] s1=s.split(";");
        System.out.println(Arrays.toString(s1));
        Student [] stu = new Student[s1.length];
        for (int i = 0; i < s1.length; i++) {
            String str = s1[i];
            //提取每个学生的信息
           String name = str.substring(0,str.indexOf(":"));
           int computerResults = Integer.parseInt(str.substring(str.indexOf("=")+1,str.indexOf(",")));
           int writtenTestResults = Integer.parseInt(str.substring(str.lastIndexOf("=")+1));
           //创建学生类,将学生信息封装在学生对象中
           Student student = new Student(name,computerResults,writtenTestResults);
           //存入数组
           stu[i] = student;
            System.out.println(stu[i]);
        }
        Arrays.sort(stu);
        System.out.println(Arrays.toString(stu));

    }
}
