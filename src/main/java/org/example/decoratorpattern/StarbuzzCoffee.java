package org.example.decoratorpattern;

import org.example.decoratorpattern.beverage.Beverage;
import org.example.decoratorpattern.beverage.DarkRoast;
import org.example.decoratorpattern.beverage.Espresso;
import org.example.decoratorpattern.beverage.HouseBlend;
import org.example.decoratorpattern.condiment.Mocha;
import org.example.decoratorpattern.condiment.Soy;
import org.example.decoratorpattern.condiment.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast(Beverage.VENTI);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getSize());
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());


        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    }
}
