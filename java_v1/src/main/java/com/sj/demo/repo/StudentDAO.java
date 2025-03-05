/*
package com.sj.demo.repo;

import com.sj.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface StudentDAO extends JpaRepository<Student, Integer> {

    default List<Student> getstudentList() {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Sangram", 4, "Latur"));
        studentList.add(new Student("Nik", 3, "pune"));
        studentList.add(new Student("Akash", 12, "UP"));
        studentList.add(new Student("Vikas", 1, "Jalna"));
        studentList.add(new Student("Sanket", 2, "Navi M"));
        return studentList;
    }
}
*/
