package org.example.decoratorpattern.beverage;

public class DarkRoast extends Beverage{

    public DarkRoast(){
        this.description = "Dark Roast";
    }

    public DarkRoast(String size){
        this.description = "Dark Roast";
        this.size = size;
    }

    @Override
    public double cost() {
        return 0.99 + getCostOfSize(this.getSize());
    }
}
