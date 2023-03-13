package org.lessons.java.shop;

import java.util.Random;

public class Smartphone extends Prodotto {
//    ATTRIBUTES
//    15 cifre
    private String imei;
    private int memory;

    Random randomizer = new Random();
    int randomNumber = randomizer.nextInt(1,1000000000);

//    CONSTRUCTOR


    public Smartphone() {
        imei = padLeft(randomNumber);
        memory= 128;
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
}
