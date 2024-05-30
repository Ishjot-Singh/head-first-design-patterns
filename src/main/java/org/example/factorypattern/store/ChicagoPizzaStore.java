package org.example.factorypattern.store;

import org.example.factorypattern.pizza.ChicagoStyleCheesePizza;
import org.example.factorypattern.pizza.Pizza;
import org.example.factorypattern.pizza.PizzaReworked;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else return null;
    }

    @Override
    protected PizzaReworked createPizzaReworked(String type) {
        return null;
    }
}
