package com.molruexception.decorator.starbuzz.coffee;

import com.molruexception.decorator.starbuzz.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "디카페인 커피";
    }

    public double cost() {
        return 1.05;
    }

}
