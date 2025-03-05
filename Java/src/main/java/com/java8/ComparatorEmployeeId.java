package com.java8;

import java.util.Comparator;

public class ComparatorEmployeeId implements Comparator<Students> {


    /*@Override
    public int compare(Students e1, Students e2) {
        if(e1.getId() == e2.getId())
            return 0;
        else if(e1.getId() < e2.getId())
            return -1;
        else
            return 1;
    }*/

    //sorting if both id are equal then sort based on name
    //comparing using multiple parameters
    @Override
    public int compare(Students e1, Students e2) {
        if (e1.getId() == e2.getId())
            return e1.getName().compareTo(e2.getName());
        else if (e1.getId() < e2.getId())
            return -1;
        else
            return 1;
    }
}
