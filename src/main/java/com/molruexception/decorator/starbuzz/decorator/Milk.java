package com.molruexception.decorator.starbuzz.decorator;

import com.molruexception.decorator.starbuzz.Beverage;
import com.molruexception.decorator.starbuzz.CondimentDecorator;
import org.jetbrains.annotations.NotNull;

public class Milk extends CondimentDecorator {

    public Milk(@NotNull Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", 밀크";
    }

    public double cost() {
        return .10 + beverage.cost();
    }

}
