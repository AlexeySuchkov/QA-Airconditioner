package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    public void getIncreasedChannelOverLimits() {
        Radio radio = new Radio();
        radio.setCurrentChannel(10);
        radio.nextChannel();
        int expectedChannel = 1;

        assertEquals(expectedChannel, radio.getCurrentChannel());
    }

    @Test
    public void getIncreasedIfMaxChannelSet() {
        Radio radio = new Radio(5,0, 5, 100, 0, 10);
        radio.setCurrentChannel(5);
        radio.nextChannel();
        int expectedChannel = 0;

        assertEquals(expectedChannel, radio.getCurrentChannel());
    }

    @Test
    public void getIncreasedVolumeOverLimits() {
        Radio radio = new Radio();
        radio.setCurrentVolume(111);
        radio.increaseCurrentVolume();
        int expectedVolume = 100;

        assertEquals(expectedVolume, radio.getCurrentVolume());
    }

    @Test
    public void getIncreasedChannelUnderLimits() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-1);
        radio.nextChannel();
        int expectedChannel = 0;

        assertEquals(expectedChannel, radio.getCurrentChannel());
    }

    @Test
    public void getIncreasedVolumeUnderLimits() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.increaseCurrentVolume();
        int expectedVolume = 1;

        assertEquals(expectedVolume, radio.getCurrentVolume());
    }

    @Test
    public void getIncreasedChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(5);
        radio.nextChannel();
        int expectedChannel = 6;

        assertEquals(expectedChannel, radio.getCurrentChannel());
    }

    @Test
    public void getIncreasedVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseCurrentVolume();
        int expectedVolume = 6;

        assertEquals(expectedVolume, radio.getCurrentVolume());
    }

    @Test
    public void getDecreasedChannelUnderLimits() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-1);
        radio.previousChannel();
        int expectedChannel = 8;

        assertEquals(expectedChannel, radio.getCurrentChannel());
    }

    @Test
    public void getDecreasedVolumeUnderLimits() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        int expectedVolume = 0;

        assertEquals(expectedVolume, radio.getCurrentVolume());
    }

    @Test
    public void getDecreasedChannelOverLimits() {
        Radio radio = new Radio();
        radio.setCurrentChannel(11);
        radio.previousChannel();
        int expectedChannel = 9;

        assertEquals(expectedChannel, radio.getCurrentChannel());
    }

    @Test
    public void getDecreasedVolumeOverLimits() {
        Radio radio = new Radio();
        radio.setCurrentVolume(111);
        radio.decreaseCurrentVolume();
        int expectedVolume = 99;

        assertEquals(expectedVolume, radio.getCurrentVolume());
    }

    @Test
    public void getDecreasedWhenMaxChannelSet () {
        Radio radio = new Radio(5, 0, 0, 100, 0, 10);
        radio.previousChannel();
        int expectedChannel = 5;

        assertEquals(expectedChannel, radio.getCurrentChannel());
    }

    @Test
    public void getDecreasedChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(5);
        radio.previousChannel();
        int expectedChannel = 4;

        assertEquals(expectedChannel, radio.getCurrentChannel());
    }

    @Test
    public void getDecreasedVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseCurrentVolume();
        int expectedVolume = 4;

        assertEquals(expectedVolume, radio.getCurrentVolume());
    }
}
