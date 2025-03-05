package com.sj.demo.designpatterns.creational.singleton;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BrokenSingletonDesignPattern {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {


        // 1. Get the original Singleton instance using the getSingletonInstance() method
        SingletonDemo originalSingletonInstance = SingletonDemo.getSingeltonInstance();
        System.out.println("hashcode for originalSingletonInstance :- " + originalSingletonInstance.hashCode());
        // This will print the hashcode of the Singleton instance created by the lazy initialization.

        // 2. Get another reference to the Singleton instance using getSingletonInstance()
        SingletonDemo duplicateSingletonInstance = SingletonDemo.getSingeltonInstance();
        System.out.println("hashcode for duplicateSingletonInstance :- " + duplicateSingletonInstance.hashCode());
        // This will print the same hashcode as originalSingletonInstance since it's the same instance.

        // 3. Use Reflection to break the Singleton design pattern
        // Obtain the Class object for the SingletonDemo class using its fully qualified name
        Class<?> singletonClass = Class.forName("com.sj.demo.designpatterns.creational.singleton.SingletonDemo");

        // Obtain the private constructor of the SingletonDemo class
        Constructor<SingletonDemo> declaredConstructor = (Constructor<SingletonDemo>) singletonClass.getDeclaredConstructor();

        // Bypass the private access modifier using setAccessible(true)
        declaredConstructor.setAccessible(true);

        // Create a new instance of SingletonDemo using the private constructor
        SingletonDemo brokenSingletonUsingReflection = declaredConstructor.newInstance();
        System.out.println("hashcode for brokenSingletonUsingReflection :- " + brokenSingletonUsingReflection.hashCode());
        // This will print a different hashcode, indicating a new instance has been created.


    }
}
