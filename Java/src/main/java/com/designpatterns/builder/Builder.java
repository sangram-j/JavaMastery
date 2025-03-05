package com.sj.demo.designpatterns.builder;

interface Builder {
    public void buildFloor();

    public void buildWalls();

    public void bulidTerrace();


    public Home getComplexHomeObject();
}
