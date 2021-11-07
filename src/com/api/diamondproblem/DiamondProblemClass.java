package com.api.diamondproblem;

public class DiamondProblemClass implements DiamondProblemInterface1,DiamondProblemInterface2{
    @Override
    public void m1() {
        DiamondProblemInterface2.super.m1();
    }
    public static void main(String[] args) {
        DiamondProblemClass diamondProblemClass=new DiamondProblemClass();
        diamondProblemClass.m1();
    }
}
