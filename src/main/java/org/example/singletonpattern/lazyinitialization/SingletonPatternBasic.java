package org.example.singletonpattern.lazyinitialization;

public class SingletonPatternBasic {
    private static SingletonPatternBasic uniqueInstance;

    private SingletonPatternBasic(){}

    public static SingletonPatternBasic getInstance(){
        if(uniqueInstance == null){
            System.out.println("SingletonBasic created!");
            uniqueInstance = new SingletonPatternBasic();
        }
        System.out.println("SingletonBasic returned\n");
        return uniqueInstance;
    }
}
