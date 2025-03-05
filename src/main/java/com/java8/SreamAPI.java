package com.java8;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SreamAPI {
    public static void main(String[] args) {

        List<Employee> list = DataBase.getEmployee();

        //traditional approach
        /*Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary()-o2.getSalary());
            }
        });*/

        //sorting using collection
        Collections.sort(list, (o1,o2) ->(int) (o1.getSalary() - o2.getSalary()));
        System.out.println("Emp List sorting using collection > "+list);

        //sorting using stream api
        System.out.println("Emp list sorting using stream api > ");
        list.stream().sorted((o1,o2)->(int)(o1.getId()-o2.getId())).forEach(System.out::println);

        //sorting using stream api method reference
        System.out.println("Emp list sorting using stream api method reference > ");
        list.stream().sorted(Comparator.comparing(Employee :: getName)).forEach(System.out::println);
    }

}
