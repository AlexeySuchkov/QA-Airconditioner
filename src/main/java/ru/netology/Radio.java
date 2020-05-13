package ru.netology;

public class Radio {

    private int maxChannel = 9;
    private int minChannel = 0;
    private int currentChannel;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;


    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

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

    public int getMaxChannel() {
        return maxChannel;
    }

    public void setMaxChannel(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    public int getMinChannel() {
        return minChannel;
    }

    public void setMinChannel(int minChannel) {
        this.minChannel = minChannel;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel) {
            this.currentChannel = getMinChannel();
            return;
        }
        if (currentChannel < minChannel) {
            this.currentChannel = getMaxChannel();
            return;
        }
        this.currentChannel = currentChannel;
    }

    public void increaseCurrentVolume() {
        if (currentVolume >= maxVolume) {
            return;
        }
        this.currentVolume = currentVolume + 1;
    }

    public void decreaseCurrentVolume() {
        if (currentVolume <= minVolume) {
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
