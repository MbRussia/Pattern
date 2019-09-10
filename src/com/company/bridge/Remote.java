package com.company.bridge;

public class Remote {
    private Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void power() {
        System.out.println("Пульт - нажата кнопка включения");
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
        System.out.println("Пульт передал " + device.isEnabled());
    }

    public void channelDown() {
        this.device.channelDown();
    }

    public void channelUp() {
        this.device.channelUp();
    }

    public void returnDeviceInfo() {
        System.out.println(device.witchDevice());
    }

    public void setDevice(Device device) {
        this.device = device;
    }
}
