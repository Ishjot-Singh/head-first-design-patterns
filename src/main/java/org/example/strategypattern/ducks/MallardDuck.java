package org.example.strategypattern.ducks;

import org.example.strategypattern.flybehavior.FlyBehavior;
import org.example.strategypattern.quackbehavior.QuackBehavior;

public class MallardDuck extends Duck{

    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    @Override
    public void display() {
        System.out.println("I am a real Mallard Duck");
    }
}
