package com.java8;

import java.util.List;

public class Students implements Comparable<Students> {

    private int id;
    private String name;
    private String dept;
    private long salary;

    private List<String> phoneNumbers;


    public Students(int id, String name, String dept, long salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public int compareTo(Students o) {
        if (id > o.getId())
            return 1;
        else if (id < o.getId())
            return -1;
        else
            return 0;

    }

    public Students() {

    }

    public Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }

    public Students(int id, String name, String dept, long salary, List<String> phoneNumbers) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.phoneNumbers = phoneNumbers;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
