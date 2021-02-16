package com.ff.javaapi.Day4;

public class SystemSpelling {
    public static void main(String[] args) {

        String s = "abc";

        /*
        符串拼接  +  16644ms
         */
       long t1=System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            s+="123";
        }
        System.out.println(System.currentTimeMillis()-t1);

        /*
         str.concat(""); 5433ms
         */
        long t2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            s = s.concat("123");
        }
        System.out.println(System.currentTimeMillis() - t2);

        /*
         StringBuffer 中的append() 8ms
         */
        StringBuffer stringBuffer =new StringBuffer("abc");
        long t3=System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            stringBuffer.append("123");
        }
        System.out.println(System.currentTimeMillis()-t3);
    }
}

