package com.basic.Repo;

import com.basic.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    public List<Student> getstudentList(){
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Sangram","Latur"));
        studentList.add(new Student("Nik","pune"));
        studentList.add(new Student("vik","Mumbai"));
        return studentList;
    }
}
