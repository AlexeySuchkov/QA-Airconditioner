package ru.netology;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;

@NoArgsConstructor
@AllArgsConstructor
@Getter

public class Radio {

    private int maxChannel = 9;
    private int minChannel = 0;
    private int currentChannel = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = 0;


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
