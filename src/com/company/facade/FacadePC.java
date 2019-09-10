package com.company.facade;

public interface FacadePC {
    String connectHDMI();
    String connectUSB1(String device);
    String connectUSB2(String device);
    String connectSound();
    boolean buttonPower();
    boolean buttonReset();

}
