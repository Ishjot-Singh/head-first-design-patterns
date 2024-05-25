package org.example.decoratorpattern.beverage;

public class Decaf extends Beverage{

    public Decaf(){
        this.description = "Decaf";
    }

    public Decaf(String size){
        this.size = size;
        this.description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05 + getCostOfSize(getSize());
    }
}
