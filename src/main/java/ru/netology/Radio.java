package ru.netology;


public class Radio {

    private int maxChannel = 9;
    private int minChannel = 0;
    private int currentChannel = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = 0;

    public Radio(int maxChannel, int minChannel, int currentChannel, int maxVolume, int minVolume, int currentVolume) {
        this.maxChannel = maxChannel;
        this.minChannel = minChannel;
        this.currentChannel = currentChannel;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;
    }

    public Radio() { }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }


    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel) {
            return;
        }
        if (currentChannel < minChannel) {
            this.currentChannel = maxChannel;
            return;
        }
        this.currentChannel = currentChannel;
    }

    public void increaseCurrentVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        this.currentVolume = currentVolume + 1;
    }

    public void decreaseCurrentVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        this.currentVolume = currentVolume - 1;
    }

    public void nextChannel() {
        if (currentChannel == maxChannel) {
            this.currentChannel = minChannel;
            return;
        }
        this.currentChannel ++;
    }

    public void previousChannel() {
        if (currentChannel == minChannel) {
            this.currentChannel = maxChannel;
            return;
        }
        this.currentChannel --;
    }
}
