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
        Scanner askDetails = new Scanner(System.in);

        while(counter < cart.length){
        System.out.println("Buongiorno scegli il prodotto che vuoi aggiungere");
        System.out.println("Premi 1 per uno smartphone, 2 per un paio di cuffie, 3 per un televisore");

        String userChoice = userImput.nextLine();
            switch (userChoice){

                case "1":
                    Smartphone smartphone = new Smartphone();
                    System.out.print("Stabilisci un prezzo: ");
                    price = askDetails.nextDouble();
                    smartphone.setPrice(price);
                    System.out.println(smartphone.toString());
                    //                    push the object inside cart
                    cart[counter] = smartphone;
                    counter++;
                    break;
                case "2":
                    System.out.print("di che colore lo vuoi? ");
                    String color = askDetails.nextLine();
                    Cuffie cuffie = new Cuffie(color);
                    System.out.print("Stabilisci un prezzo: ");
                    price = askDetails.nextDouble();
                    cuffie.setPrice(price);
                    System.out.println(cuffie.toString());
                    //                    push the object inside cart
                    cart[counter] = cuffie;
                    counter++;
                    break;
                case "3":
                    Televisore televisore = new Televisore();
                    System.out.print("Stabilisci un prezzo: ");
                    price = askDetails.nextDouble();
                    televisore.setPrice(price);
                    System.out.println(televisore.toString());
                    //                    push the object inside cart
                    cart[counter] = televisore;
                    counter++;
                    break;
                default:
                    System.out.println("Scelta sbagliata");
                    break;
            }
        }
        userImput.close();
        askDetails.close();

        System.out.println(Arrays.toString(cart));
    }
}
