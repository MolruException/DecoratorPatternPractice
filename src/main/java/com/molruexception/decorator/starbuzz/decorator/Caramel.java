package com.molruexception.decorator.starbuzz.decorator;

import com.molruexception.decorator.starbuzz.Beverage;
import com.molruexception.decorator.starbuzz.CondimentDecorator;
import org.jetbrains.annotations.NotNull;

public class Caramel extends CondimentDecorator {

    public Caramel(@NotNull Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", 카라멜";
    }

    public double cost() {
        return 0.6 + beverage.cost();
    }

}
