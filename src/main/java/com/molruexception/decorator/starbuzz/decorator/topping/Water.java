package com.molruexception.decorator.starbuzz.decorator.topping;

import com.molruexception.decorator.starbuzz.Beverage;
import com.molruexception.decorator.starbuzz.CondimentDecorator;
import org.jetbrains.annotations.NotNull;

public class Water extends CondimentDecorator {

    public Water(@NotNull Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", 물";
    }

    public double cost() {
        return 0.01 + beverage.cost();
    }

}
