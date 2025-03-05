package com.sj.demo.designpatterns.abstact_factory;

public class AbstractFactoryProducer {

    public static AbstractFactory getAbstractFactory(boolean isTrainee) {

        if (isTrainee) {
            return new TraineeProfessionAbstractFactory();
        } else
            return new ProfessionAbstractFactory();
    }

}
