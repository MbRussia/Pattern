package com.company.bridge;

public class Demo {
    public static void main(String[] args) {
        Device radio = new Radio();
        Device tv = new Tv();
        Remote remote = new Remote(radio);
        remote.power();
        remote.channelDown();
        remote.channelUp();
        remote.returnDeviceInfo();
        remote.power();
        remote.setDevice(tv);
        remote.power();
        remote.channelUp();
        remote.channelDown();
        remote.returnDeviceInfo();
        remote.power();

    }
}
