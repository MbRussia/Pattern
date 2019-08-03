package com.company.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectA implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
      observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
    observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i <observers.size() ; i++) {
          observers.get(i).update("update");
        }
    }
}
