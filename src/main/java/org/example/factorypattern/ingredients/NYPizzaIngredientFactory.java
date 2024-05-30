package org.example.factorypattern.ingredients;

import org.example.factorypattern.ingredients.cheese.Cheese;
import org.example.factorypattern.ingredients.cheese.ReggianoCheese;
import org.example.factorypattern.ingredients.clam.Clams;
import org.example.factorypattern.ingredients.clam.FreshClams;
import org.example.factorypattern.ingredients.dough.Dough;
import org.example.factorypattern.ingredients.dough.ThinCrustDough;
import org.example.factorypattern.ingredients.pepperoni.Pepperoni;
import org.example.factorypattern.ingredients.pepperoni.SlicedPepperoni;
import org.example.factorypattern.ingredients.sauce.MarinaraSauce;
import org.example.factorypattern.ingredients.sauce.Sauce;
import org.example.factorypattern.ingredients.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Mushroom(), new Onion(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
