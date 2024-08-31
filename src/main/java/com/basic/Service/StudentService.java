package com.basic.Service;

import com.basic.Repo.StudentDAO;
import com.basic.model.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentService {

    public List<Student> getAllStudents(){
        List<Student> studentList= new StudentDAO().getstudentList();
        Collections.sort(studentList,new MyComparator());
        return studentList;

    }

    public static void main(String[] args) {
        //old way comparator use
        System.out.println("getAllStudents "+new StudentService().getAllStudents());

        //comparator using lambda expression
        List<Student>studentList= new StudentDAO().getstudentList();
        Collections.sort(studentList,(o1,o2) -> {
            return o1.getName().compareTo(o2.getName());
        });
        System.out.println("studentList using comparator in lambda expression "+studentList);
    }
}
class MyComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());//Asc order
    }
}
