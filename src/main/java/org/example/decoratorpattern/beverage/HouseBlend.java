package org.example.decoratorpattern.beverage;

public class HouseBlend extends Beverage{

    public HouseBlend(){
        description = "House Blend";
    }

    public HouseBlend(String size){
        this.size = size;
        this.description = "House Blend";
    }

    @Override
    public double cost() {
        return 0.89 + getCostOfSize(this.getSize());
    }
}
