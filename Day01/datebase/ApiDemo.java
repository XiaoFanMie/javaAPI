package com.ff.javaapi.Day01.datebase;

/**
 * API:java语言中提供的众多接口和类
 * API文档 就是官方对提供的接口,类功能进行说明
 */
public class ApiDemo {
    public static void main(String[] args) {
        int num = 10;

        //构造方法
        Integer num1 = new Integer(10);//将int类型的值包装在Integ类的对象中
        Integer num2 = new Integer("10");//把字符串转为int类型
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.SIZE);

        //转换为二进制数
        System.out.println(Integer.toBinaryString(10));
        //转换十六进制字符串
        System.out.println(Integer.toHexString(12));
        //转换八进制字符串
        System.out.println(Integer.toOctalString(15));

        //比较大小
        System.out.println(num1.compareTo(num2));//返回值-1  0  1
        System.out.println(Integer.max(num1, num2));

        Integer num3 = new Integer(10);
        Integer num4 = new Integer(10);
        //包装类型间的相等判断应该用equals，而不是'=='
        System.out.println(num3.equals(num4));
        System.out.println(num3 == num4);//返回false，== 比较的是对象在内存中的地址

        //取出对象中包含的值
        int num5 = num4.intValue();

        //valueOf 将基本类型转换为引用类型
        Integer num6 = Integer.valueOf(10);

        //转换为字符串类型
        System.out.println(Integer.toString(17));//括号里的转换为字符串类型
        System.out.println(num1.toString());//num1转换为字符串类型

    }
}
