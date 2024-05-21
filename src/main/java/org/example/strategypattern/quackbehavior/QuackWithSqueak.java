package org.example.strategypattern.quackbehavior;

public class QuackWithSqueak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeaking");
    }
}
