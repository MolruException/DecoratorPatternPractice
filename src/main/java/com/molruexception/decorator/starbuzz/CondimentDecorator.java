package com.molruexception.decorator.starbuzz;

public abstract class CondimentDecorator {

    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

}
