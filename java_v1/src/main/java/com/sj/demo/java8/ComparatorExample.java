package  com.sj.demo.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {


    public static void main(String[] args) {
        List<Students> empList = new ArrayList<>();

        Students emp1 = new Students(25, "John");
        Students emp2 = new Students(30, "Alice");
        Students emp3 = new Students(30, "Tatya");
        Students emp4 = new Students(27, "Bob");

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);

        // Sorting list by id using Comparable EmployeeId
        //here actual class Students is  modified
        //Collections.sort(empList);
        System.out.println(empList);

        // Sorting list by id using Comparator EmployeeId
        // here actual class Students is not modified
        Collections.sort(empList, new ComparatorEmployeeId());
        System.out.println("Sorting list by id :- " + empList);

        // Sorting list by name using Comparator EmployeeName
        //Collections.sort(empList, new ComparatorEmployeeName());
        System.out.println("Sorting list by name using :- " + empList);

        // Sorting list by name when id is same
        //Collections.sort(empList, new ComparatorEmployeeId());
        System.out.println("Sorting list by name when id is same :- " + empList);

        //sorting list by using comparator in lambda function
        //Collections.sort(empList, (o1,o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println("Sorting list by name using lambda expression :- " + empList);

        //sorting list by using comparator.comparing in lambda function
        Collections.sort(empList, Comparator.comparing(Students::getId));
        System.out.println("Sorting list by id using Comparator.comparing in lambda expression :- " + empList);


    }
}
