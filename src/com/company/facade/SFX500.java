package com.company.facade;

public class SFX500 implements PowerBox {
    private boolean power = false;

    @Override
    public boolean powerBox() {
        printState();
        return power;
    }

    @Override
    public boolean resetBox() {
        if (power) {
            printState();
            printState();
        }
        return power;
    }

    private void printState() {
        this.power = !power;
        System.out.println(power ? "компутер включен" : "компутер выключен");
    }
}
