package  com.sj.demo.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8MethodCheatSheet {
    public static void main(String[] args) {

        List<Employee> employee = DataBase.getEmployee();

        //foreach
        employee.forEach(emp -> System.out.println(emp.getName() + " : " + emp.getSalary()));

        //foreach using method references
        //employee.stream().forEach(System.out::println);

        //System.out.println("--------------------------------------------------");

        //.filter
        //.collect
        Map<String, Double> devEmpList = employee.stream()
                .filter(e -> e.getDept().equalsIgnoreCase("development") && e.getSalary() > 50000)
                .collect(Collectors.toMap(Employee::getName, Employee::getSalary));
        //System.out.println("employee from development dept : " + devEmpList);

        //System.out.println("--------------------------------------------------");

        //map -- if we want to extract single attributes like name, dept, id
        //distinct -- to remove duplicates
        List<String> deptList = employee.stream()
                .map(e -> e.getDept())//can replace lambda with method references
                .collect(Collectors.toList());
        //System.out.println(deptList);//prints all dept including duplicates

        Set<String> deptSet = employee.stream()
                .map(Employee::getDept)//replaced lambda with method references
                .collect(Collectors.toSet());
        //System.out.println(deptSet);//prints dept not including duplicates as collected in set

        List<String> deptUniqueList = employee.stream()
                .map(Employee::getDept)
                .distinct()//duplicated removed by using distinct
                .collect(Collectors.toList());
        //System.out.println(deptList);

        //in case of nested class map wont work
        //get all project names
        List<Stream<String>> collect = employee.stream() //returning stream which is wrong- wont give actual result
                .map(e -> e.getProjects()
                        .stream()
                        .map(p -> p.getName()))
                .collect(Collectors.toList());
        //System.out.println(collect);

        //so counter this flatmap is used -- in nested classes flatmap used
        //flatmap
        List<String> deptUsingFlatMap = employee.stream()
                .flatMap(e -> e.getProjects()
                        .stream()
                        .map(p -> p.getName())).distinct()//duplicated removed by using distinct
                .collect(Collectors.toList());
        //System.out.println(deptUsingFlatMap);

        //sorted
        //asc
        List<Employee> ascSortedSalariedEmp = employee.stream()
                .sorted(Comparator.comparing(Employee::getSalary))             //e -> e.getSalary()
                .collect(Collectors.toList());
        //System.out.println("sortedSalariedEmp :- "+sortedSalariedEmp);
        //ascSortedSalariedEmp.forEach(e-> System.out.println(e.getName() + " "+ e.getSalary()));

        //desc
        List<Employee> descSortedSalariedEmp = employee.stream()
                .sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSalary)))             //e -> e.getSalary()
                .collect(Collectors.toList());
        //System.out.println("sortedSalariedEmp :- "+sortedSalariedEmp);
        //descSortedSalariedEmp.forEach(e-> System.out.println(e.getName() + " "+ e.getSalary()));


        //min & max
        Optional<Employee> maxPaidEmp = employee.stream()
                .max(Comparator.comparing(Employee::getSalary));
        //System.out.println(maxPaidEmp);

        //groupingBy
        Map<String, List<Employee>> employeeGroup = employee.stream()
                .collect(Collectors.groupingBy(Employee::getGender));
        //System.out.println(employeeGroup);


        //groupingBy :- when want ot group with particular type [Gender - Name]
        Map<String, List<String>> employeeGroupByGender = employee.stream()
                .collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.mapping(Employee::getName, Collectors.toList())));
        //System.out.println(employeeGroupByGender);

        //[Gender - Count]
        Map<String, Long> employeeCountByGroup = employee.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        //System.out.println(employeeCountByGroup);

        //findFirst
        Optional<Employee> development = employee.stream()
                .filter(e -> e.getDept().equals("Development"))
                .findFirst();
        //System.out.println(development.get());
        //development.ifPresent(System.out::println);

        //findAny
        /*employee.stream()
                .filter(e -> e.getDept().equals("xyz"))
                .findAny()
                .ifPresent(System.out::println);*/

        //anyMatch (Predicate) , allmatch (Predicate), noneMatch (Predicate)
        boolean isMatch = employee.stream()
                .anyMatch(e -> e.getDept().equals("Development"));
        //System.out.println("Development :- "+isMatch);//true

        boolean isSalaryMatch = employee.stream()
                .allMatch(e -> e.getSalary() < 1000000);
        //System.out.println("isSalaryMatch :- "+isSalaryMatch);//true

        boolean isNoEmpMatch = employee.stream()
                .noneMatch(e -> e.getName().equals("Nikhil"));
        //System.out.println(isNoEmpMatch);


        //limit
        //top 3 highest paid employee
        Map<String, Double> highestPaidEmp = employee.stream()
                .sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSalary)))
                .skip(0)
                .limit(3)
                .collect(Collectors.toMap(                 //Collectors.toMap does not guarantee the order of elements.
                        Employee::getName,
                        Employee::getSalary));
        System.out.println(highestPaidEmp);

        //used LinkedHashMap to preserve the order of elements
        Map<String, Double> highestPaidEmpSorted = employee.stream()
                .sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSalary)))
                .skip(0)
                .limit(3)
                .collect(Collectors.toMap( // Collect the stream into a Map.
                        Employee::getName, // Use the employee's name as the key for the map.
                        Employee::getSalary, // Use the employee's salary as the value for the map.

                        (oldValue, newValue) -> oldValue,
                        // Handle duplicate keys (employee names). If two employees have the same name,
                        // keep the first one encountered (oldValue) and discard the new one (newValue).

                        LinkedHashMap::new // Use a LinkedHashMap to preserve the insertion order.
                ));
        System.out.println(highestPaidEmpSorted);

        String str2 = "sangram jadhav";
        String reversedString = Stream.of(str2.split(" ")).collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
            Collections.reverse(list);
            return list.stream();
        })).collect(Collectors.joining(" "));
        System.out.println(reversedString);


    }
}
