package com.molruexception.decorator.starbuzz.decorator.topping;

import com.molruexception.decorator.starbuzz.Beverage;
import com.molruexception.decorator.starbuzz.CondimentDecorator;
import org.jetbrains.annotations.NotNull;

public class Mocha extends CondimentDecorator {

    public Mocha(@NotNull Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    public double cost() {
        return .20 + beverage.cost();
    }

}
