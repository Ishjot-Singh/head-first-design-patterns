package org.example.factorypattern.store;

import org.example.factorypattern.pizza.Pizza;
import org.example.factorypattern.pizza.PizzaReworked;

public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    public PizzaReworked orderPizzaReworked(String type){
        PizzaReworked pizza = createPizzaReworked(type);
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    protected abstract Pizza createPizza(String type);
    protected abstract PizzaReworked createPizzaReworked(String type);
}
