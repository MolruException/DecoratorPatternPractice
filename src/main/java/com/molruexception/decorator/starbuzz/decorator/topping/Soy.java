package com.molruexception.decorator.starbuzz.decorator.topping;

import com.molruexception.decorator.starbuzz.Beverage;
import com.molruexception.decorator.starbuzz.CondimentDecorator;
import org.jetbrains.annotations.NotNull;

public class Soy extends CondimentDecorator {

    public Soy(@NotNull Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }

    public double cost() {
        return .15 + beverage.cost();
    }

}
