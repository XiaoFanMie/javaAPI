package com.ff.javaapi.Day01.Object;

public class ObjectDemo2 {
    public static void main(String[] args) {

        Person p = new Person("amdin",23);
             /*
               对象在输出的时候会默认调用toString（）；方法
               当类中没有定义toString()时,会默认调用父类(Object)中的toString()
                public String toString() {
                    return getClass().getName() + "@" + Integer.tioHexStrng(hashCode());
                }

                本地方法,java语言不实现,调用操作系统实现
                public native int hashCode()
                Object类中toString()方法会将对象所在地址转为16进制的字符串输出
                可以在类中重写Object类中的toString()
              */
        System.out.println(p+"aa");
    }
}
