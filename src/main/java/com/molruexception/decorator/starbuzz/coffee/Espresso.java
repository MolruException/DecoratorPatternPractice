package com.molruexception.decorator.starbuzz.coffee;

import com.molruexception.decorator.starbuzz.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "에스프레소";
    }

    public double cost() {
        return 1.99;
    }

}
