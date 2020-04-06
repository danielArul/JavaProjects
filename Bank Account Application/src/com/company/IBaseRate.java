package com.company;

public interface IBaseRate {

    default double getBaseRate(){
        return 2.5;
    }
    //Write a method that returns the base rate
}
