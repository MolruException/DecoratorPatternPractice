package com.molruexception.decorator.starbuzz.coffee;

import com.molruexception.decorator.starbuzz.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "하우스 블렌드 커피";
    }

    public double cost() {
        return .89;
    }

}
