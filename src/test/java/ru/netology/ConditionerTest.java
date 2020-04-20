package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    public void getIncreasedTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(17);
        conditioner.setCurrentTemperature(32);
        conditioner.increaseCurrentTemperature(conditioner.getCurrentTemperature());
        int expected = 33;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }



    @Test
    public void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(17);
        conditioner.setCurrentTemperature(20);
        conditioner.decreaseCurrentTemperature(conditioner.getCurrentTemperature());
        int expected = 19;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }
}