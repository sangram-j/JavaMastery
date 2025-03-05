package com.java8;


public class LambdaExpression {

    public static void main(String[] args) {
        /*StudentService studentService = new StudentService();
        List<Student> studentsList = studentService.getAllStudents();

        *//*Collections.sort(studentsList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return  o1.getName().compareTo(o2.getName());
            }
        });*//*
        //Converted above comparator into lambda expression as below
        Collections.sort(studentsList, (o1, o2) -> o2.getName().compareTo(o1.getName()));
        System.out.println(studentsList);*/


    }
}
