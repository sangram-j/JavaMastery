package com.java8;

import java.util.*;

public class SortMapDemo {
    public static void main(String[] args) {

        Map<String,Integer> map = DataBase.getMap();

        //convert map into list
        List<Map.Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());
        //sort using collections traditional way
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        System.out.println("Sorted using key > "+map);

        //sort using collections using lambda
        Collections.sort(entries, (o1,o2)-> o1.getKey().compareTo(o2.getKey()));
        for(Map.Entry<String,Integer> entry : entries){
            System.out.println("Key > "+entry.getKey()+" "+"Value > "+entry.getValue());
        }

        //sort map stream api
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        //sort custom object map using traditional way
        /*Map<Employee,Integer> empMap = new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)(o1.getSalary() - o2.getSalary());
            }
        });*/
        Map<Employee,Integer> empMap = new TreeMap<>(( o1, o2) -> (int)(o1.getSalary() - o2.getSalary()));
        empMap.put(new Employee(4,"Sangram", "civil",500000),3);
        empMap.put(new Employee(1,"Sangram1", "civil1",600000),4);
        empMap.put(new Employee(2,"Sangram2", "civil2",700000),1);
        empMap.put(new Employee(3,"Sangram3", "civil3",800000),2);

        //sort custom object map using lambda
        System.out.println("Employee map using lambda > "+empMap);

        //sort map using stream api if employee object in key
        empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee ::getSalary).reversed())).forEach(System.out::println);

        //sort map using stream api if Employee object is in value
        //empMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee ::getSalary).reversed())).forEach(System.out::println);

    }
}
