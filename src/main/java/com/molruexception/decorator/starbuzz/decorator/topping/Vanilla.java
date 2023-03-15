package com.molruexception.decorator.starbuzz.decorator.topping;

import com.molruexception.decorator.starbuzz.Beverage;
import com.molruexception.decorator.starbuzz.CondimentDecorator;
import org.jetbrains.annotations.NotNull;

public class Vanilla extends CondimentDecorator {

    public Vanilla(@NotNull Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", 바닐라";
    }

    public double cost() {
        return 0.5 + beverage.cost();
    }

}
