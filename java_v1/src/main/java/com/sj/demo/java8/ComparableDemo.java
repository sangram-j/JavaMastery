package  com.sj.demo.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

    public static void main(String[] args) {
        List<Students> empList = new ArrayList<>();

        Students emp1 = new Students(25, "John");
        Students emp2 = new Students(30, "Alice");
        Students emp3 = new Students(27, "Bob");

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);

        Collections.sort(empList);
        //here actual class Students is modified
        /*@Override in Students class
        public int compareTo(Students o) {
            if(id > o.getId())
                return 1;
            else if(id < o.getId())
                return -1;
            else
                return 0;

        }*/
        empList.stream().forEach(employee -> System.out.println(employee.getId()));
        System.out.println(empList);


    }

}
