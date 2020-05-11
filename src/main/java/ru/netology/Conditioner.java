package ru.netology;

public class Conditioner {

    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature >= maxTemperature) {
            this.currentTemperature = maxTemperature;
            return;
        }
        if (currentTemperature <= minTemperature) {
            this.currentTemperature = minTemperature;
            return;
        }
        // здесь уверены, что все проверки прошли
        this.currentTemperature = currentTemperature;
    }

    public void increaseCurrentTemperature() {
        if (currentTemperature >= maxTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature + 1;;
    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature <= minTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature - 1;
    }
}
