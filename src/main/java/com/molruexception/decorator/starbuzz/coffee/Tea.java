package com.molruexception.decorator.starbuzz.coffee;

import com.molruexception.decorator.starbuzz.Beverage;

public class Tea extends Beverage {

    public Tea() {
        description = "차";
    }

    public double cost() {
        return 1.5;
    }

}
