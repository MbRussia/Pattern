package com.company.facade;

public class AsusPrime implements Motherboard {
    private String device1;
    private String device2;

    @Override
    public boolean connectionUSB1(String device) {
        this.device1 = device;
        if(this.device1 == null){
            System.out.println("Порт USB1 пустой");
            return false;
        }
        System.out.println("Порт подключен "+device1);
        return true;
    }

    @Override
    public boolean connectionUSB2(String device) {
        this.device2 = device;
        if(this.device2 == null){
            System.out.println("Порт USB2 пустой");
            return false;
        }
        System.out.println("Порт подключен "+device2);
        return true;
    }
}
