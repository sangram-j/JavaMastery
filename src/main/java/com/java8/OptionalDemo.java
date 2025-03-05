package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) throws Exception {
        Employee emp = new Employee(6, "Sangram", null, 500000, Arrays.asList("9545956079", "0008991989"));

        //3 ways to use optional method1
        //empty method
        Optional<Object> empty = Optional.empty();
        System.out.println("Empty > "+empty);

        //of
        //Optional<String> dept = Optional.of(emp.getDept());
        //System.out.println(dept);// throw nullpointer exception

        //ofNullable
        Optional<String> dept = Optional.ofNullable(emp.getDept());
        if(dept.isPresent()){
            System.out.println(dept);
        }
        //System.out.println(dept.orElse("default"));
        //System.out.println(dept.orElseThrow(()-> new IllegalArgumentException("No data")));

        String s = dept.map(String::toUpperCase).orElseGet(() -> "default");
        System.out.println(s);

        //find employee by name
        findEmpByName("SJ");

    }

    public static Employee findEmpByName(String name) throws Exception {
        List<Employee> emp = DataBase.getEmployee();
        return emp.stream()
                .filter(employee -> employee.getName().equals(name))
                .findAny().orElseThrow(()->new Exception("No employee found"));
    }
}
