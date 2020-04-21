package ru.netology;

public class Radio {

    private int maxChannel;
    private int minChannel;
    private int currentChannel;
    private int maxVolume;
    private int minVolume;
    private int currentVolume;


    public int getMaxVolume() {
        return maxVolume;
    }

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
        }
        if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
        }
        if (currentVolume < maxVolume)
            if (currentVolume > minVolume)
                // здесь уверены, что все проверки прошли
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
        }
        if (currentChannel < minChannel) {
            this.currentChannel = getMaxChannel();
        }
                // здесь уверены, что все проверки прошли
        this.currentChannel = currentChannel;
    }

    public void increaseCurrentVolume(int currentVolume) {

        if (currentVolume >= maxVolume) {
            this.currentVolume = getMaxVolume();
        }
        if (currentVolume < maxVolume) {
            this.currentVolume = currentVolume += 1;
        }
    }

    public void decreaseCurrentVolume(int currentVolume) {

        if (currentVolume <= minVolume) {
            return;
        }
        this.currentVolume = currentVolume -= 1;

    }

    public void nextChannel(int currentChannel) {


        if (currentChannel > minChannel) {
            this.currentChannel = currentChannel += 1;
        }
        if (currentChannel >= maxChannel) {
            this.currentChannel = getMinChannel();
        }

    }

    public void previousChannel(int currentChannel) {

        if (currentChannel > minChannel) {
            this.currentChannel = currentChannel -= 1;
        }
        if (currentChannel <= minChannel) {
            this.currentChannel = getMaxChannel();
        }

    }

//    public void setCurrentTemperature(int currentTemperature) {
//        if (currentTemperature <= maxTemperature) {
//            if (currentTemperature >= minTemperature) {
//                this.currentTemperature = currentTemperature;
//            }
//        }
//    }


}