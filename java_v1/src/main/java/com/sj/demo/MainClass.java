package com.sj.demo;

import com.sj.demo.java8.DataBase;
import com.sj.demo.java8.Students;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {
    public static void main(String[] args) throws Exception {

        List<Students> allStudents = DataBase.getAllStudents();
        allStudents.stream()
                .sorted(Comparator.comparing(Students::getName)
                        .thenComparing(Students::getSalary))
                .collect(Collectors.toList())
                .forEach(st-> System.out.println(st.getName() + " " +st.getSalary()));
        //System.out.println(collect);

    }

}
