package com.api.designpattern.creationalpatterns.builder;

interface Builder {

    public void buildFloor();

    public void buildWalls();

    public void bulidTerrace();


    public Home getComplexHomeObject();

}
