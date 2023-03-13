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

    Cuffie(String color){
        this.color = color;
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
    //    OVERRIDE

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public String getPrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        return "Cuffie{" +
                "price = " + getPrice() +
                " wireless = " + wireless +
                ", color = " + color  +
                '}';
    }
}
