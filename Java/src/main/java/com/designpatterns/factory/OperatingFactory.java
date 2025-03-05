package com.designpatterns.factory;

public class OperatingFactory {
    public Profession getProfession(String profession) {
        if (profession == null)
            return null;
        else if (profession.equals("Doctor"))
            return new Doctor();
        else if (profession.equals("Engineer"))
            return new Engineer();
        else
            return new Teacher();

    }
}
