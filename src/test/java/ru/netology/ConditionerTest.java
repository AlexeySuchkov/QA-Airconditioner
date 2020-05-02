package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    public void getIncreasedTemperature() {

        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(17);
        conditioner.setCurrentTemperature(25);
        conditioner.increaseCurrentTemperature();
        int expected = 26;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void getIncreasedTemperatureAboveMax() {

        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(17);
        conditioner.setCurrentTemperature(36);
        conditioner.increaseCurrentTemperature();
        int expected = 35;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }



    @Test
    public void getIncreasedTemperatureUnderMin() {

        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(17);
        conditioner.setCurrentTemperature(12);
        conditioner.increaseCurrentTemperature();
        int expected = 18;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(17);
        conditioner.setCurrentTemperature(25);
        conditioner.decreaseCurrentTemperature();
        int expected = 24;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureAboveMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(17);
        conditioner.setCurrentTemperature(36);
        conditioner.decreaseCurrentTemperature();
        int expected = 34;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureUnderMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(17);
        conditioner.setCurrentTemperature(17);
        conditioner.decreaseCurrentTemperature();
        int expected = 17;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }
}