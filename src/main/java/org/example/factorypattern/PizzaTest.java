package org.example.factorypattern;

import org.example.factorypattern.pizza.Pizza;
import org.example.factorypattern.pizza.PizzaReworked;
import org.example.factorypattern.store.ChicagoPizzaStore;
import org.example.factorypattern.store.NYPizzaStore;
import org.example.factorypattern.store.PizzaStore;

public class PizzaTest {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        PizzaStore nyStore1 = new NYPizzaStore();
        PizzaReworked pizzaReworked = nyStore1.orderPizzaReworked("cheese");
        System.out.println("Ethan ordered a " + pizzaReworked.getName() + "\n");

    }
}
