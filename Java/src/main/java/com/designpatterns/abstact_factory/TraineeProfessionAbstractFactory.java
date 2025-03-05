package com.sj.demo.designpatterns.abstact_factory;


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
