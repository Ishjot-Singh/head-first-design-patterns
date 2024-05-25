package org.example.decoratorpattern.beverage;

public abstract class Beverage {
    String description = "Unknown Beverage";

    public static final String TALL = "Tall";
    public static final String GRANDE = "Grande";
    public static final String VENTI = "Venti";
    String size = Beverage.TALL;
    public String getDescription() {
        return description;
    }
    public abstract double cost();

    public String getSize(){
        return size;
    }

    public double getCostOfSize(String size){
        if(size.equals(Beverage.TALL)) return 0.10;
        else if(size.equals(Beverage.GRANDE)) return 0.15;
        else if(size.equals(Beverage.VENTI)) return 0.20;
        else return 0;
    }
}
