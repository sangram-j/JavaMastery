package com.java8;

import java.util.Comparator;

public class ComparatorEmployeeName implements Comparator<Students> {


    @Override
    public int compare(Students e1, Students e2) {
        return e1.getName().compareTo(e2.getName());
    }
}
