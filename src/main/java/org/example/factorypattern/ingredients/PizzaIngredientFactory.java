package org.example.factorypattern.ingredients;

import org.example.factorypattern.ingredients.cheese.Cheese;
import org.example.factorypattern.ingredients.clam.Clams;
import org.example.factorypattern.ingredients.dough.Dough;
import org.example.factorypattern.ingredients.pepperoni.Pepperoni;
import org.example.factorypattern.ingredients.sauce.Sauce;
import org.example.factorypattern.ingredients.veggies.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
