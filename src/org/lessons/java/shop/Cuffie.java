package org.lessons.java.shop;

import java.util.Random;

public class Cuffie extends Prodotto {
//    ATTRIBUTES
    private boolean[] isWireless = {true,false};

    private boolean wireless;

    private  String color;
    Random randomizer = new Random();
    int randomNumber = randomizer.nextInt( isWireless.length);
//    CONSTRUCTOR

    Cuffie(){
        wireless = isWireless[randomNumber];
    }
//SETTER AND GETTER

    public boolean getWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
