package com.sj.demo.designpatterns.creational.builder;



public class MainClass {
    public static void main(String[] args) {

        /*Builder Pattern refers to an approach that focuses on constructing a complex object from simple objects using a step-by-step approach.

        Major roles used in this design pattern are:

        Complex Object / Final Product – e.g., house – complex object which we will generate with builder design pattern.
        Builder – Abstract class/interface that defines all ways to create the product. It also has getFinalProduct method that will finally return the complex object.
        ConcreteBuilder – Multiple Builder Implementations that will give different final objects which are complex to design.
        Director – Controls complex object creation. It has 2 main goals:
        To call the appropriate concrete builder class to create the correct complex object.
        To return that complex object.*/

        //create object of required homebuilder
        EarthquakeResistantBuilder earthquakeResistantBuilder = new EarthquakeResistantBuilder();

        //create object of director that will keep an eye on your builder
        Director director = new Director(earthquakeResistantBuilder);

        director.manageRequiredHomeConstruction();

        Home homeConstructedAtTheEnd = director.getComplexObjectOfHome();

        System.out.println(homeConstructedAtTheEnd);
        System.out.println(homeConstructedAtTheEnd.floor);
    }
}
