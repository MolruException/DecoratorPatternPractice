package com.molruexception.decorator;

import com.google.common.collect.Lists;
import com.molruexception.decorator.starbuzz.Beverage;
import com.molruexception.decorator.starbuzz.coffee.DarkRoast;
import com.molruexception.decorator.starbuzz.coffee.Espresso;
import com.molruexception.decorator.starbuzz.decorator.size.Tall;
import com.molruexception.decorator.starbuzz.decorator.size.Venti;
import com.molruexception.decorator.starbuzz.decorator.topping.Mocha;
import com.molruexception.decorator.starbuzz.decorator.topping.Water;
import com.molruexception.decorator.starbuzz.decorator.topping.Whip;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso = new Tall(espresso);
        espresso = new Water(espresso);

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Venti(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);

        final List<Beverage> beverages = Lists.newArrayList(espresso, darkRoast);
        beverages.forEach(beverage ->
                System.out.printf("Description: %s, Cost: %f%n", beverage.getDescription(), beverage.cost()));
    }

}
