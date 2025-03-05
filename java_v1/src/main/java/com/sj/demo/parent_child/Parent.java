package com.sj.demo.parent_child;

public class Parent {
    Parent (){
        this("Constructor");
        System.out.println("Parent Class Default Constructor");
    }

    Parent (String s){
        System.out.println("Parent Class Param  "+s);
    }
}
