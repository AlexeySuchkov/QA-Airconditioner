package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    public void getIncreasedChannelVolumeOverLimits() {

        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(11);
        radio.increaseCurrentVolume(radio.getCurrentVolume());
        int expectedVolume = 10;

        radio.setMaxChannel(9);
        radio.setMinChannel(0);
        radio.setCurrentChannel(10);
        radio.nextChannel(radio.getCurrentChannel());
        int expectedChannel = 0;

        assertEquals(expectedChannel, radio.getCurrentChannel());
        assertEquals(expectedVolume, radio.getCurrentVolume());
    }


    @Test
    public void getIncreasedChannelVolume() {

        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(5);
        radio.increaseCurrentVolume(radio.getCurrentVolume());
        int expectedVolume = 6;

        radio.setMaxChannel(9);
        radio.setMinChannel(0);
        radio.setCurrentChannel(5);
        radio.nextChannel(radio.getCurrentChannel());
        int expectedChannel = 6;

        assertEquals(expectedChannel, radio.getCurrentChannel());
        assertEquals(expectedVolume, radio.getCurrentVolume());
    }

    @Test
    public void getDecreasedChannelVolumeUnderLimits() {

        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume(radio.getCurrentVolume());
        int expectedVolume = 0;

        radio.setMaxChannel(9);
        radio.setMinChannel(0);
        radio.setCurrentChannel(-1);
        radio.previousChannel(radio.getCurrentChannel());
        int expectedChannel = 9;

        assertEquals(expectedChannel, radio.getCurrentChannel());
        assertEquals(expectedVolume, radio.getCurrentVolume());
    }

    @Test
    public void getDecreasedChannelVolume() {

        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(5);
        radio.decreaseCurrentVolume(radio.getCurrentVolume());
        int expectedVolume = 4;

        radio.setMaxChannel(9);
        radio.setMinChannel(0);
        radio.setCurrentChannel(5);
        radio.previousChannel(radio.getCurrentChannel());
        int expectedChannel = 4;

        assertEquals(expectedChannel, radio.getCurrentChannel());
        assertEquals(expectedVolume, radio.getCurrentVolume());
    }
}
