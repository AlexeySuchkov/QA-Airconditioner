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
        }
        if (currentTemperature <= minTemperature) {
            this.currentTemperature = minTemperature;
        }
        if (currentTemperature < maxTemperature)
            if (currentTemperature > minTemperature)
        // здесь уверены, что все проверки прошли
            this.currentTemperature = currentTemperature;
    }

    public void increaseCurrentTemperature(int currentTemperature) {
        if (currentTemperature >= maxTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature += 1;;
    }

    public void decreaseCurrentTemperature(int currentTemperature) {
        if (currentTemperature <= minTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature -= 1;
    }

//    public void setCurrentTemperature(int currentTemperature) {
//        if (currentTemperature <= maxTemperature) {
//            if (currentTemperature >= minTemperature) {
//                this.currentTemperature = currentTemperature;
//            }
//        }
//    }


}
