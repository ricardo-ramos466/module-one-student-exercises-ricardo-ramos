package com.techelevator;

public class Television {
    boolean isOn = false;
    int currentChannel = 3;
    int currentVolume = 2;

    public boolean isOn() {
        return isOn;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
        }
    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
        }
    }

    public void changeChannel(int newChannel) {
        if (isOn) {
            if (newChannel >= 3 && newChannel <= 18) {
                currentChannel = newChannel;
            }
        }
    }

    public void channelUp() {
        if (isOn) {
            if (currentChannel == 18) {
                currentChannel = 3;
            } else {
                currentChannel++;
            }
        }
    }

    public void channelDown() {
        if (isOn) {
            if (currentChannel == 3) {
                currentChannel = 18;
            } else {
                currentChannel--;
            }
        }
    }
    public void raiseVolume(){
        if (isOn){
            if (currentVolume <10){
                currentVolume++;
            }
        }
    }
    public void lowerVolume(){
        if (isOn){
            if (currentVolume >0){
                currentVolume--;
            }
        }
    }

}
