package com.demo.Service;


import com.demo.Repo.StudentDAO;
import com.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
@Service
public class StudentService {

    @Autowired(required = false)
    public StudentDAO studentDAO;

    public List<Student> getAllStudents() {
        List<Student> studentList = studentDAO.getstudentList();
        Collections.sort(studentList, new MyComparator());
        return studentList;

    }

    public Map<String, Integer> getStudentById(int rollNo) {
        List<Student> studentList = studentDAO.getstudentList();
        return studentList.stream()
                .filter(i -> i.getId() == rollNo)
                .collect(Collectors.toMap(Student::getName, Student::getRollNumber));

    }

    /*public static void main(String[] args) {
        //old way comparator use
        System.out.println("getAllStudents "+new StudentService().getAllStudents());

        //comparator using lambda expression
        List<Student>studentList= new StudentDAO().getstudentList();
        Collections.sort(studentList,(o1,o2) -> {
            return o1.getName().compareTo(o2.getName());
        });
        System.out.println("studentList using comparator in lambda expression "+studentList);
    }*/
}

class MyComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());//Asc order
    }
}
