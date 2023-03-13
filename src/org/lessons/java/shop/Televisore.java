package org.lessons.java.shop;

import java.text.DecimalFormat;
import java.util.Random;

public class Televisore extends Prodotto{
//    ATTRIBUTES
    private boolean[] isSmart = {true,false};

    private boolean smart;
    private double size;

    Random randomizer = new Random();
    int randomNumber = randomizer.nextInt( isSmart.length);
    Televisore(){
        smart = isSmart[randomNumber];
        size = 6.01;
    }

    public boolean getSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

//    METHODS
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
        if (smart) {
            return 0.10;
        }else {
            return 0.02;
        }
    }

    @Override
    public String toString() {
        return "Televisore = " +
                "price = " + GetPriceWithVAT() + "$"+
                ", smart = " + smart +
                ", size = " + size;
    }
}
