package com.company.bridge;

public interface Device {
    boolean isEnabled();
    void enable();
    void disable();
    String witchDevice();
    void channelDown();
    void channelUp();
}
