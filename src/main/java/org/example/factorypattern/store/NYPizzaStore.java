package org.example.factorypattern.store;

import org.example.factorypattern.ingredients.NYPizzaIngredientFactory;
import org.example.factorypattern.ingredients.PizzaIngredientFactory;
import org.example.factorypattern.pizza.CheesePizza;
import org.example.factorypattern.pizza.NYStyleCheesePizza;
import org.example.factorypattern.pizza.Pizza;
import org.example.factorypattern.pizza.PizzaReworked;

public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        else return null;
    }

    @Override
    protected PizzaReworked createPizzaReworked(String type) {
        PizzaReworked pizzaReworked = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        if(type.equals("cheese")){
            pizzaReworked = new CheesePizza(pizzaIngredientFactory);
            pizzaReworked.setName("New York Style Cheese Pizza");
        }
        pizzaReworked.prepare();
        return pizzaReworked;
    }
}
