package org.example.factorypattern.store;

import org.example.factorypattern.pizza.NYStyleCheesePizza;
import org.example.factorypattern.pizza.Pizza;

public class NYPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        else return null;
    }
}
