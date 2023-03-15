package com.molruexception.decorator.starbuzz.decorator.size;

import com.molruexception.decorator.starbuzz.Beverage;
import com.molruexception.decorator.starbuzz.CondimentDecorator;
import org.jetbrains.annotations.NotNull;

public class Grande extends CondimentDecorator {

    public Grande(@NotNull Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", 그랑데 사이즈";
    }

    public double cost() {
        return beverage.cost() * 3;
    }
    
}
