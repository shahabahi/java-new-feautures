package com.api.designpattern.creationalpatterns.factoryandabstract;

public class FactoryPatternMainClass {

    public static void main(String[] args) {
        AbstractFactory abstractFactory= AbstractFactoryProducer.getProfession(false);
        Profession profession=abstractFactory.getProfession("Engineer");
        profession.print();

    }

}
