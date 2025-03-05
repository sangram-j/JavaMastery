package com.java8;

import java.util.*;

public class DataBase {

    public static List<Employee> getEmployee() {
        Project p1 = new Project("P1001", "ODU", "Jio", "Mukesh");
        Project p2 = new Project("P1005", "FTTX-JHV", "Jio", "Jack");
        Project p3 = new Project("P1056", "AIRFIBER", "JPL", "Tilak");
        Project p4 = new Project("P1055", "AIRFIBER-UBR", "Reliance", "Exicom");


        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(23, "Ram", "Telecom", Arrays.asList(p1), 50000, "Male"));
        employees.add(new Employee(25, "Sham", "Internet", Arrays.asList(p3), 10000, "Male"));
        employees.add(new Employee(24, "Deepika", "Customer Support", Arrays.asList(p4), 8000, "Female"));
        employees.add(new Employee(22, "Ravan", "Marketing", Arrays.asList(p1, p2, p3), 100000, "Male"));
        employees.add(new Employee(21, "Sangram", "Development", Arrays.asList(p1, p2, p3, p4), 300000, "Male"));
        employees.add(new Employee(20, "Vikas", "Development", Arrays.asList(p1, p2), 400000, "Male"));


        return employees;
    }

    public static Map<String, Integer> getMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("id", 123);
        map.put("acountNo", 95459);
        return map;
    }

    public static List<Students> getAllStudents() {
        List<Students> list = new ArrayList<>();
        list.add(new Students(10, "Sangram", "IT", 700000));
        list.add(new Students(11, "Nikhil", "CIVIL", 100000));
        list.add(new Students(12, "Prakash", "MECH", 500000));
        list.add(new Students(13, "Prakash2", "MECH2", 550000));

        return list;
    }
}
