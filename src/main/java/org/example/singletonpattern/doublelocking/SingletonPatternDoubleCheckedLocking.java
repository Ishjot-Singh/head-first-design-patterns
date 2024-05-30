package org.example.singletonpattern.doublelocking;

public class SingletonPatternDoubleCheckedLocking {
    // volatile keyword ensures that multiple threads handle uniqueInstance correctly
    // when initializing the Singleton instance.
    private volatile static SingletonPatternDoubleCheckedLocking uniqueInstance;

    private SingletonPatternDoubleCheckedLocking(){}

    public static SingletonPatternDoubleCheckedLocking getInstance(){
        if(uniqueInstance == null){
            System.out.println("First null check - called first time");
            synchronized (SingletonPatternDoubleCheckedLocking.class){
                System.out.println("Before second null checl - after synchronized call.");
                if(uniqueInstance == null) {
                    System.out.println("Instance is now created");
                    uniqueInstance = new SingletonPatternDoubleCheckedLocking();
                }
            }
        }
        System.out.println("Instance is returned\n");
        return uniqueInstance;
    }
}
