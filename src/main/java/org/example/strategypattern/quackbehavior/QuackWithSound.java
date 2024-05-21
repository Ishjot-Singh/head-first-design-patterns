package org.example.strategypattern.quackbehavior;

public class QuackWithSound implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack! Quack!");
    }
}
