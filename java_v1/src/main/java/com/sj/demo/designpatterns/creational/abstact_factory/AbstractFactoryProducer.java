package com.sj.demo.designpatterns.creational.abstact_factory;

import com.sj.demo.designpatterns.creational.abstact_factory.AbstractFactory;
import com.sj.demo.designpatterns.creational.abstact_factory.ProfessionAbstractFactory;
import com.sj.demo.designpatterns.creational.abstact_factory.TraineeProfessionAbstractFactory;

public class AbstractFactoryProducer {

    public static AbstractFactory getAbstractFactory(boolean isTrainee) {

        if (isTrainee) {
            return new TraineeProfessionAbstractFactory();
        } else
            return new ProfessionAbstractFactory();
    }

}
