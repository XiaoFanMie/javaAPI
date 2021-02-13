package com.ff.javaapi.Day01.datebase;

public class IntegerDemo {
    public static void main(String[] args) {
        /*
        自动装箱：基本类型转换为引用类型
        int num0 = 10;
        Integer num1=num0;
        自动拆箱：将引用类型转换为基本类型
        int num2=num1; 自动调用valueOf（）；
         */


        Integer num0 = new Integer(10);
        Integer num1 = new Integer(10);
        System.out.println(num0.equals(num1));//true
        /*
        使用new + 构造方法()  不管值是否在-128到127之间还是数值相同,都会创建新的对象,指向不同的地址
         */
        System.out.println(num0 == num1);//false


        Integer num2 = 127;
        Integer num3 = 127;
        System.out.println(num2.equals(num3));//true
        /*
        使用装箱时,在创建对象是,如果值在-128 -- +127 之间,且两个数值相同,那么两个变量会指向同一个地址
        因为在此区间内,有一个cache数组,会直接调用里面的数值,不会创建新的对象
         */
        System.out.println(num3 == num3);//true


        Integer num4 = 128;
        Integer num5 = 128;
        System.out.println(num4.equals(num5));//true
         /*
            超过数值范围后,会创建新的对象,指向不同的地址
         */
        System.out.println(num4 == num5);//false
    }
}
