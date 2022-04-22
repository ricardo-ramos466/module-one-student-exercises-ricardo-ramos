package com.techelevator;

public class Tutorial {

    public static void main(String[] args) {
        int[] forecastTemperatures = new int [5];
        forecastTemperatures[0] = 72;
        forecastTemperatures[1] = 78;
        forecastTemperatures[2] = 58;
        forecastTemperatures[3] = 79;
        forecastTemperatures[4] = 74;

        int highestTemperatureValue = forecastTemperatures[0];
        int highestTemperatureIndex = 0;
        // write your code here
        int i;
        for (i=0; i<forecastTemperatures.length; i++) {
            System.out.println(forecastTemperatures[i]);
        }
        for (int j = 1; j < forecastTemperatures.length; j++){
            if (forecastTemperatures[j] > highestTemperatureValue){
                highestTemperatureValue = forecastTemperatures[j];
                highestTemperatureIndex = j;

            }

        }
        System.out.println("The highest temperature is " + highestTemperatureValue);
        System.out.println("The highest temperature is in " +(highestTemperatureIndex + 1) + " days");





    }
}
