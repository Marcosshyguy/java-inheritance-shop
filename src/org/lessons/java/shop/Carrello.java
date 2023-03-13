package org.lessons.java.shop;

import java.util.Arrays;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Prodotto[] cart = new Prodotto[2];
        double price;
        boolean flag = false;
        int counter = 0;
        Scanner userImput = new Scanner(System.in);

        while(counter < cart.length){
        System.out.println("Buongiorno scegli il prodotto che vuoi aggiungere");
        System.out.println("Premi 1 per uno smartphone, 2 per un paio di cuffie, 3 per un televisore");

        String userChoice = userImput.nextLine();

            switch (userChoice){

                case "1":
                    Smartphone smartphone = new Smartphone();
                    System.out.print("Stabilisci un prezzo: ");
                    price = userImput.nextDouble();
                    smartphone.setPrice(price);
                    System.out.println(smartphone.toString());
                    cart[counter] = smartphone;
                    counter++;
                    break;
                case "2":

                    System.out.print("di che colore lo vuoi? ");
                    String color = userImput.nextLine();
                    Cuffie cuffie = new Cuffie(color);
                    System.out.print("Stabilisci un prezzo: ");
                    price = userImput.nextDouble();
                    cuffie.setPrice(price);
                    System.out.println(cuffie.toString());
                    cart[counter] = cuffie;
                    counter++;
                    break;
                case "3":
                    Televisore televisore = new Televisore();
                    System.out.print("Stabilisci un prezzo: ");
                    price = userImput.nextDouble();
                    televisore.setPrice(price);
                    System.out.println(televisore.toString());
                    cart[counter] = televisore;
                    counter++;
                    break;
                default:
                    System.out.println("Scelta sbagliata");
            }
        }
        userImput.close();

        System.out.println(Arrays.toString(cart));
    }
}
