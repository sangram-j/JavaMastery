package com.sj.demo.basic_programs;

public class CountObject {

    static int i;

    CountObject() {
        i++;
    }

    public static void main(String args[]) {
        CountObject countObject = new CountObject();
        CountObject countObject2 = new CountObject();
        CountObject countObject3 = new CountObject();

        System.out.println("No of Object are " + countObject3.i);
    }
}
