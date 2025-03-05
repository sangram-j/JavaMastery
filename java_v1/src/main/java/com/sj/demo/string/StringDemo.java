package com.sj.demo.string;


import java.util.Arrays;
import java.util.List;

public class StringDemo {

    public static void main(java.lang.String[] args) {



        String str = "sangram";
        String str1 = new String("sangram");
        String str2= "sangram";

        System.out.println(str1.hashCode() == str.hashCode());
        //System.out.println(str == str1);
        System.out.println(str2 == str);
        System.out.println(str.equals(str1));




    }


}
