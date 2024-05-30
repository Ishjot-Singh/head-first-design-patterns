package org.example.singletonpattern.eagerinitialization;

public class SingletonPatternEager {
    private static SingletonPatternEager uniqueInstance = new SingletonPatternEager();

    private SingletonPatternEager(){}

    public static SingletonPatternEager getInstance(){
        System.out.println("SingletonEager is returned! It was initialized when the class loaded\n");
        return uniqueInstance;
    }
}
