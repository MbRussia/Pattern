package com.company.facade;

public class PC implements FacadePC {
    private AudioAdapter audioAdapter;
    private PowerBox powerBox;
    private Motherboard motherboard;
    private VideoAdapter videoAdapter;

    public PC(AudioAdapter audioAdapter, PowerBox powerBox, Motherboard motherboard, VideoAdapter videoAdapter) {
        this.audioAdapter = audioAdapter;
        this.powerBox = powerBox;
        this.motherboard = motherboard;
        this.videoAdapter = videoAdapter;
    }

    @Override
    public String connectHDMI() {
        videoAdapter.printPicture();
        return "ConnectHDMI";
    }

    @Override
    public String connectUSB1(String device) {
        motherboard.connectionUSB1(device);
        return "ConnectDeviceUSB1";
    }

    @Override
    public String connectUSB2(String device) {
        motherboard.connectionUSB2(device);
        return "ConnectionDeviceUSB2";
    }

    @Override
    public String connectSound() {
        audioAdapter.soundMusic();
        return "ConnectSound";
    }

    @Override
    public boolean buttonPower() {
        return powerBox.powerBox();
    }

    @Override
    public boolean buttonReset() {
        return powerBox.resetBox();
    }
}
