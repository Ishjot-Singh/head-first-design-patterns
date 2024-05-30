package org.example.singletonpattern;

import org.example.singletonpattern.doublelocking.SingletonPatternDoubleCheckedLocking;
import org.example.singletonpattern.eagerinitialization.SingletonPatternEager;
import org.example.singletonpattern.lazyinitialization.SingletonPatternBasic;

public class SingletonTest {
    public static void main(String[] args) {
        // Calling SingletonPatternBasic twice...
        SingletonPatternBasic singletonPatternBasic = SingletonPatternBasic.getInstance();
        SingletonPatternBasic singletonPatternBasic1 = SingletonPatternBasic.getInstance();

        // Calling SingletonPatternEager twice...
        SingletonPatternEager singletonPatternEager = SingletonPatternEager.getInstance();
        SingletonPatternEager singletonPatternEager1 = SingletonPatternEager.getInstance();

        // Calling SingletonPatternDoubleCheckedLocking twice...
        SingletonPatternDoubleCheckedLocking singletonPatternDoubleCheckedLocking = SingletonPatternDoubleCheckedLocking.getInstance();
        SingletonPatternDoubleCheckedLocking singletonPatternDoubleCheckedLocking1 = SingletonPatternDoubleCheckedLocking.getInstance();
    }

}
