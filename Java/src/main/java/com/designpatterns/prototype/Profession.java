package com.designpatterns.prototype;

public abstract class Profession implements Cloneable {

    public int id;
    public String name;

    public abstract void print();

    public Object cloningMethod() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
