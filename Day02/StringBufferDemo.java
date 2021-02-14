package com.ff.javaapi.Day02;

public class StringBufferDemo {
    public static void main(String[] args) {
        /*
        无参的构造方法,即构建了一个长度为16的char型数组
         */
        StringBuffer s = new StringBuffer();//默认长度length = 16
        StringBuffer s1 = new StringBuffer(10);//length = 10
        StringBuffer s2 = new StringBuffer("crr");//length  = 16+s2.length

        /*
        拼接字符串,在处理大量的字符串拼接时,使用append最优,不会创建新的对象
         */
        s2.append("sg");
        System.out.println(s2);

        /*
        在哪个位置插入字符串
         */
        s2.insert(1, "中国");
        System.out.println(s2);

        /*
        删除数值范围内的字符串
         */
        s2.delete(2, 3);
        System.out.println(s2);

        /*
        反转字符串
         */
        s2.reverse();
        System.out.println(s2);

        /*
        截取数值范围内的字符串
         */
        String s3 = s2.substring(2, 4);
        System.out.println(s3);
    }
}
