package org.example.strategypattern.quackbehavior;

public class QuackNoSound implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("No sound!!!");
    }
}
