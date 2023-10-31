package ru.netology;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int maxStation;


    public Radio() {
        this.maxStation = 20;
    }

    public Radio(int stationsCount) {
        this.maxStation = stationsCount - 1;
    }


    public void next() {
        if (maxStation != currentStation) {
            currentStation++;
            return;
        }
        currentStation = 20;
    }

    public void perv() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = 20;
        }
    }


    public int getCurrentStation() {
        return currentStation;

    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }

        if (currentStation > 20) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 0) {
            return;
        }
        if (currentVolume < 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}

