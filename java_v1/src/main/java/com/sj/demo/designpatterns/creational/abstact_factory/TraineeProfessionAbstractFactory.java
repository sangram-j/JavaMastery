package com.sj.demo.designpatterns.creational.abstact_factory;


import com.sj.demo.designpatterns.creational.abstact_factory.AbstractFactory;
import com.sj.demo.designpatterns.creational.abstact_factory.Profession;
import com.sj.demo.designpatterns.creational.abstact_factory.TraineeDoctor;
import com.sj.demo.designpatterns.creational.abstact_factory.TraineeEngineer;
import com.sj.demo.designpatterns.creational.abstact_factory.TraineeTeacher;

public class TraineeProfessionAbstractFactory extends AbstractFactory {

    @Override
    Profession getProfession(String typeOfProfession) {
        if (typeOfProfession == null)
            return null;
        else if (typeOfProfession.equals("Engineer"))
            return new TraineeEngineer();
        else if (typeOfProfession.equals("Doctor"))
            return new TraineeDoctor();
        else if (typeOfProfession.equals("Teacher"))
            return new TraineeTeacher();

        return null;
    }


}
