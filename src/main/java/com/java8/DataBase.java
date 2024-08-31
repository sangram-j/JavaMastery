package com.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBase {

    public static List<Employee> getEmployee(){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(10,"Sangram", "IT",700000));
        list.add(new Employee(11,"Nikhil","CIVIL",100000));
        list.add(new Employee(12,"Prakash","MECH",500000));
        list.add(new Employee(13,"Prakash2","MECH2",550000));

        return list;
    }

    public static Map<String,Integer> getMap(){
        Map<String,Integer> map = new HashMap<>();
        map.put("id",123);
        map.put("acountNo",95459);
        return map;
    }
}
