package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    public void getIncreasedChannelOverLimits() {
        Radio radio = new Radio();

        radio.setMaxChannel(9);
        radio.setMinChannel(0);
        radio.setCurrentChannel(10);
        radio.nextChannel();
        int expectedChannel = 0;

        assertEquals(expectedChannel, radio.getCurrentChannel());
    }

    @Test
    public void getIncreasedVolumeOverLimits() {
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(11);
        radio.increaseCurrentVolume();
        int expectedVolume = 10;

        assertEquals(expectedVolume, radio.getCurrentVolume());
    }

    @Test
    public void getIncreasedChannelUnderLimits() {
        Radio radio = new Radio();

        radio.setMaxChannel(9);
        radio.setMinChannel(0);
        radio.setCurrentChannel(-1);
        radio.nextChannel();
        int expectedChannel = 0;

        assertEquals(expectedChannel, radio.getCurrentChannel());
    }

    @Test
    public void getIncreasedVolumeUnderLimits() {
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(-1);
        radio.increaseCurrentVolume();
        int expectedVolume = 1;

        assertEquals(expectedVolume, radio.getCurrentVolume());
    }

    @Test
    public void getIncreasedChannel() {
        Radio radio = new Radio();

        radio.setMaxChannel(9);
        radio.setMinChannel(0);
        radio.setCurrentChannel(5);
        radio.nextChannel();
        int expectedChannel = 6;

        assertEquals(expectedChannel, radio.getCurrentChannel());
    }

    @Test
    public void getIncreasedVolume() {
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(5);
        radio.increaseCurrentVolume();
        int expectedVolume = 6;

        assertEquals(expectedVolume, radio.getCurrentVolume());
    }

    @Test
    public void getDecreasedChannelUnderLimits() {
        Radio radio = new Radio();

        radio.setMaxChannel(9);
        radio.setMinChannel(0);
        radio.setCurrentChannel(-1);
        radio.previousChannel();
        int expectedChannel = 9;

        assertEquals(expectedChannel, radio.getCurrentChannel());
    }

    @Test
    public void getDecreasedVolumeUnderLimits() {
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        int expectedVolume = 0;

        assertEquals(expectedVolume, radio.getCurrentVolume());
    }

    @Test
    public void getDecreasedChannelOverLimits() {
        Radio radio = new Radio();

        radio.setMaxChannel(9);
        radio.setMinChannel(0);
        radio.setCurrentChannel(11);
        radio.previousChannel();
        int expectedChannel = 9;

        assertEquals(expectedChannel, radio.getCurrentChannel());
    }

    @Test
    public void getDecreasedVolumeOverLimits() {
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(12);
        radio.decreaseCurrentVolume();
        int expectedVolume = 9;

        assertEquals(expectedVolume, radio.getCurrentVolume());
    }

    @Test
    public void getDecreasedChannel() {
        Radio radio = new Radio();

        radio.setMaxChannel(9);
        radio.setMinChannel(0);
        radio.setCurrentChannel(5);
        radio.previousChannel();
        int expectedChannel = 4;

        assertEquals(expectedChannel, radio.getCurrentChannel());
    }

    @Test
    public void getDecreasedVolume() {
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(5);
        radio.decreaseCurrentVolume();
        int expectedVolume = 4;

        assertEquals(expectedVolume, radio.getCurrentVolume());
    }
}
