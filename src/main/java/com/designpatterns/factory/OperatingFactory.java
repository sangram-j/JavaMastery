package com.designpatterns.factory;

public class OperatingFactory {
    public OS getInstance(String str){
        if(str.equals("Open"))
            return new Android();
        else if(str.equals("Secure"))
            return new IOS();
        else
            return new Windows();

    }
}
