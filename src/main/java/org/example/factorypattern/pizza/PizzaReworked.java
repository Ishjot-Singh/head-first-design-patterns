package org.example.factorypattern.pizza;

import org.example.factorypattern.ingredients.cheese.Cheese;
import org.example.factorypattern.ingredients.clam.Clams;
import org.example.factorypattern.ingredients.dough.Dough;
import org.example.factorypattern.ingredients.pepperoni.Pepperoni;
import org.example.factorypattern.ingredients.sauce.Sauce;
import org.example.factorypattern.ingredients.veggies.Veggies;

public abstract class PizzaReworked {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    abstract public void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String newYorkStyleCheesePizza) {
        this.name = newYorkStyleCheesePizza;
    }
}
