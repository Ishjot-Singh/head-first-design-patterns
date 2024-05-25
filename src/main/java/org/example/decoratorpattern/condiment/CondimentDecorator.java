package org.example.decoratorpattern.condiment;

import org.example.decoratorpattern.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
