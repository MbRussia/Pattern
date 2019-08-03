package com.company.observer;

public class Demo {
    public static void main(String[] args) {
        Subject subject = new SubjectA();
        for (int i = 0; i < 10; i++) {
            subject.addObserver( new ObserverA());
        }
        subject.notifyObservers();
    }
}
