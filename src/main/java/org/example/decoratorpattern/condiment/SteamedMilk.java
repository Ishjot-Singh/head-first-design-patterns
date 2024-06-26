package org.example.decoratorpattern.condiment;

import org.example.decoratorpattern.beverage.Beverage;

public class SteamedMilk extends CondimentDecorator{

    Beverage beverage;

    public SteamedMilk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }
}
