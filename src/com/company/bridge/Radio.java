package com.company.bridge;

public class Radio implements Device {
    private boolean enable = false;
    private  int channel = 101;


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
        return "its Radio";
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
