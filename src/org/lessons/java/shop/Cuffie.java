package org.lessons.java.shop;

import java.text.DecimalFormat;
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
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String GetPriceWithVAT() {
        DecimalFormat toDecimal = new DecimalFormat("0.00");
        double price = getPrice();
        double vatPrice = price * 0.22;
        vatPrice += price;
        String formattedPriceVAT = toDecimal.format(vatPrice);
        return  formattedPriceVAT;
    }

    @Override
    public double addDiscount() {
        return getPrice()- getPrice() * getDiscount();
    }

    @Override
    public double getDiscount() {
        if (wireless) {
            return 0.07;
        }else {
            return 0.02;
        }
    }

    @Override
    public String toString() {
        return "Cuffie = " +
                "price = " + GetPriceWithVAT() + "$"+
                ", wireless = " + wireless +
                ", color = " + color;
    }
}
