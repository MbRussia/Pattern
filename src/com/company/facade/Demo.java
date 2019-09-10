package com.company.facade;

public class Demo {
    public static void main(String[] args) {
        FacadePC pc = new PC(new Amlogic80(), new SFX500(), new AsusPrime(), new RTX2060());
        pc.buttonPower();
        pc.connectHDMI();
        pc.connectSound();
        pc.connectUSB1("Mouse");
        pc.connectUSB2("KeyBoard");
        pc.buttonReset();
    }
}
