package org.example.factorypattern.store;

import org.example.factorypattern.pizza.ChicagoStyleCheesePizza;
import org.example.factorypattern.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else return null;
    }
}
