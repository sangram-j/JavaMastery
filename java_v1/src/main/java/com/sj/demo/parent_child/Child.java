package com.sj.demo.parent_child;


public class Child extends Parent{
    Child (){
        this("Constructor");
        System.out.println("Child Class Default Constructor");
    }

    Child (String s){
        System.out.println("Child Class Param Constructor "+s);
    }

    public static void main(String[] args) {
        Child obj = new Child();


        /*
        this(...) calls another constructor within the same class.
        super() is implicitly called if not provided, invoking the parent class's default constructor.
        Execution follows a bottom-up approach (Child → Parent), but constructors execute top-down (Parent → Child).
        Since Child() calls this("Constructor"), it first executes Child(String s), which eventually leads to Parent() being called.
        */
    }

}
