package com.company.bridge;

public class Tv implements Device {
    private boolean enable = false;
    private  int channel = 1;

    @Override
    public boolean isEnabled() {
        return enable;
    }

    @Override
    public void enable() {
        enable = true;
    }

    @Override
    public void disable() {
        enable=false;
    }

    @Override
    public String witchDevice() {
        return "its TV";
    }

    @Override
    public void channelDown() {
        this.channel++;
    }

    @Override
    public void channelUp() {
        this.channel--;
    }
}
