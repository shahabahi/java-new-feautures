package com.api.designpattern.creationalpatterns.factoryandabstract;

public abstract class AbstractFactory {
    abstract Profession getProfession(String typeOfProfession);
}
