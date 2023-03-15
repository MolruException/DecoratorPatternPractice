package com.molruexception.decorator.starbuzz.decorator.size;

import com.molruexception.decorator.starbuzz.Beverage;
import com.molruexception.decorator.starbuzz.CondimentDecorator;
import org.jetbrains.annotations.NotNull;

public class Venti extends CondimentDecorator {

    public Venti(@NotNull Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", 벤티 사이즈";
    }

    public double cost() {
        return beverage.cost() * 4;
    }

}
