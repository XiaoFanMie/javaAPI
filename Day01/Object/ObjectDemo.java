package com.ff.javaapi.Day01.Object;

public class ObjectDemo {
    public static void main(String[] args) {
        Person p = new Person("崔傻狗",23);
        System.out.println(p);

         /*
           Object类中的equals（）；比较的对象地址是否相等，与"=="功能相同
           public boolean equals(Object obj) {
                return (this == obj);
            }
         */
        Person p1 = new Person("崔傻狗",23);
        Person p2 = new Person("崔傻狗",23);
        System.out.println(p1.equals(p2));
        System.out.println(p1==p2);

        //其他类基本上都重写了equals()  比较的是内容是否相等
        Integer p3=128;
        Integer p4=128;
        System.out.println(p3.equals(p4));
        System.out.println(p3==p4);

        String p5 = "abc";
        String p6 = "abc";
        System.out.println(p5.equals(p6));
        System.out.println(p5==p6);
    }
}
