package com.sj.demo.designpatterns.creational.abstact_factory;

import com.sj.demo.designpatterns.creational.abstact_factory.AbstractFactory;
import com.sj.demo.designpatterns.creational.abstact_factory.AbstractFactoryProducer;
import com.sj.demo.designpatterns.creational.abstact_factory.Profession;

public class FactoryMain {
    public static void main(String[] args) {

        //this is double layer abstraction
        AbstractFactory factory = AbstractFactoryProducer.getAbstractFactory(false);
        Profession os = factory.getProfession("Engineer");
        os.print();

        /*The Abstract Factory Design Pattern is a creational design pattern that provides an interface to create
        families of related or dependent objects without specifying their concrete classes. It is essentially a factory
        of factories, meaning it allows the creation of a group of related objects through multiple factory classes.
        */


        /*                                      Main Class
                                                    |
                                            AbstractFactoryProducer
                                                    |
                                               AbstractFactory
                                                    |
                                             --------------------
                                             |                  |
                                PermanentProfessionFactory   TemporaryProfessionFactory
                                             |                          |
                                 ------------------          -------------------
                                 |                |          |                 |
                              Engineer          Doctor   ContractEngineer  ContractDoctor
                                             |
                                        FactoryMain (Client)
         */
    }
}
