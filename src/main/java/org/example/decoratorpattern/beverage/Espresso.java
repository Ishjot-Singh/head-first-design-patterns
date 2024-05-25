package org.example.decoratorpattern.beverage;

public class Espresso extends Beverage{
    public Espresso(){
        this.description = "Espresso";
    }

    public Espresso(String size){
        this.description = "Espresso";
        this.size = size;
    }

    @Override
    public double cost() {
        return 1.99 + getCostOfSize(this.getSize());
    }
}
