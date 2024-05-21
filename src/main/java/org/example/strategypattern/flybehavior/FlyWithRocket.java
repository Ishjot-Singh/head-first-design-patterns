package org.example.strategypattern.flybehavior;

public class FlyWithRocket implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I fly with rockets!");
    }
}
