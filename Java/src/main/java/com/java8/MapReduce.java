package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduce { //introduced in jdk17
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 5, 9, 10, 4, 2, 1);

        //sum of all no using stream
        int sum = numbers.stream().mapToInt(no -> no).sum();
        System.out.println("sum - > " + sum);

        //sum of all no using reduce
        Integer reduce = numbers.stream().reduce(0, (no1, no2) -> no1 + no2);
        System.out.println("reduce -> " + reduce);

        //sum of all no using reduce and method reference
        Optional<Integer> reduce1 = numbers.stream().reduce(Integer::sum);
        System.out.println("reduce1 -> " + reduce1.get());

        //multiplication
        Integer reduce2 = numbers.stream().reduce(1, (no1, no2) -> no1 * no2);
        System.out.println("reduce2 multiplication output -> " + reduce2);

        //largest no
        Integer reduce3 = numbers.stream().reduce(0, (no1, no2) -> no1 > no2 ? no1 : no2);
        System.out.println("reduce3 largest no in array -> " + reduce3);

        //largest no using method reference
        Optional<Integer> reduce4 = numbers.stream().reduce(Integer::max);
        System.out.println("reduce4 using method reference -> " + reduce4.get());


        List<String> list = Arrays.asList("spring", "corejava", "hibernate");


        //find largest string in list
        String s = list.stream()
                .reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2)
                .get();
        System.out.println("largest string in list -> " + s);

        //get employee whose dept is civil
        //get avg salary of all civil dept employees
        double avgSalary = DataBase.getEmployee()
                .stream().filter(emp -> emp.getDept().equalsIgnoreCase("CIVIL"))
                .mapToDouble(emp -> emp.getSalary())
                .average().getAsDouble();
        System.out.println("Civil employee avgSalary -> " + avgSalary);

        double sumSalary = DataBase.getEmployee()
                .stream().filter(emp -> emp.getDept().equalsIgnoreCase("CIVIL"))
                .mapToDouble(emp -> emp.getSalary())
                .sum();
        System.out.println("Civil employee salary sum -> " + sumSalary);
    }
}
