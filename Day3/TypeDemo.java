package com.ff.javaapi.Day3;

/*
泛型:参数化类型  类型参数化
    类型不确定,可以将类型作为参数传入,只能传入引用类型,如果不传,默认是object
 */
public class TypeDemo <T,M> {

        T x;
        M y;

        public T main(){
            return null;
        }

    public static void main(String[] args) {
        TypeDemo<Integer,String>  c= new TypeDemo<Integer, String>();
        //c.x;//Integer类型
        //c.y;String类型
    }

}
