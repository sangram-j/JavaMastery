package com.sj.demo.designpatterns.creational.abstact_factory;


public class ProfessionAbstractFactory extends AbstractFactory {

    @Override
    Profession getProfession(String typeOfProfession) {
        if (typeOfProfession == null)
            return null;
        else if (typeOfProfession.equals("Engineer"))
            return new Engineer();
        else if (typeOfProfession.equals("Doctor"))
            return new Doctor();
        else if (typeOfProfession.equals("Teacher"))
            return new Teacher();

        return null;
    }


}
