package org.lessons.java.shop;

import java.text.DecimalFormat;
import java.util.Random;

public class Smartphone extends Prodotto {
//    ATTRIBUTES
//    15 cifre
    private String imei;
    private int memory;

    Random randomizer = new Random();

//    CONSTRUCTOR


    public Smartphone() {
        imei = padLeft(randomizer.nextInt(1,1000000000));
        memory= randomizer.nextInt(8,280);
    }

    //    GETTER AND SETTER
    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

//    OVERRIDE
    @Override
    protected String padLeft(int code) {
        String codeString = Integer.toString(code);
        int numZeros = 15 - codeString.length();
        if (numZeros > 0) {
            String zeros = "0".repeat(numZeros);
            return zeros + codeString;
        } else {
            return codeString;
        }
    }

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
        if (memory <= 36) {
            return 0.05;
        }else {
            return 0.02;
        }
    }

    @Override
    public String toString() {
        return "Smartphone = " +
                "price = " + GetPriceWithVAT() + "$"+
                ", imei=" + imei +
                ", memory=" + memory
                ;
    }
}
