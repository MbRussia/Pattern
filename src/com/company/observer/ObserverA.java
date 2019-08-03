package com.company.observer;

public class ObserverA implements Observer {
    @Override
    public void update(String i) {
        System.out.println(i);
    }
}
