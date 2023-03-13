package org.lessons.java.shop;

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
}
