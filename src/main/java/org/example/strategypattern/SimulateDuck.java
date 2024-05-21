package org.example.strategypattern;

import org.example.strategypattern.ducks.Duck;
import org.example.strategypattern.ducks.MallardDuck;
import org.example.strategypattern.ducks.ModelDuck;
import org.example.strategypattern.flybehavior.FlyNoWay;
import org.example.strategypattern.flybehavior.FlyWithRocket;
import org.example.strategypattern.flybehavior.FlyWithWings;
import org.example.strategypattern.quackbehavior.QuackWithSound;

public class SimulateDuck {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck(new FlyWithWings(), new QuackWithSound());
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck modelDuck = new ModelDuck(new FlyNoWay(), new QuackWithSound());
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyWithRocket());
        modelDuck.performFly();
    }
}
