package org.example.factorypattern.pizza;

public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza(){
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust";
        sauce = "Marinara";
        toppings.add("Grated Reggiano Cheese");
    }
}
