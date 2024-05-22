package org.example.observerpattern.subject;

import org.example.observerpattern.observer.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
