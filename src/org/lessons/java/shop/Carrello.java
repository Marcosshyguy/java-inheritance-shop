package org.lessons.java.shop;

import java.util.Arrays;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
//        Televisore ne = new Televisore();
//        ne.setPrice(100.00);
//        System.out.println(ne.toString());
//        System.out.println(ne.addDiscount());

        Prodotto[] cart = new Prodotto[2];
        double price;
        int counter = 0;
        boolean premium = false;
        Scanner userImput = new Scanner(System.in);
        Scanner askDetails = new Scanner(System.in);

        System.out.println("Buongiorno possiede un'abbonamento premium? si o no");
        String answer = userImput.nextLine();

        boolean flag = false;
        while(!flag){
            if (answer.equals("si")){
                flag = true;
                premium = true;
                System.out.println("Benissimo ti aspettano fantastici sconti su tutti i prodotti");
            } else if (answer.equals("no")) {
                flag = true;
                System.out.println("Bene ma ricorda che non avrai sconti");
            }else{
                System.out.println("Risposta non valida. Ritenta con si/no");
            }
        }


        while(counter < cart.length){
        System.out.println("Premi 1 per uno smartphone, 2 per un paio di cuffie, 3 per un televisore");

        String userChoice = userImput.nextLine();
            switch (userChoice){

                case "1":
                    Smartphone smartphone = new Smartphone();
                    System.out.print("Stabilisci un prezzo: ");
                    price = askDetails.nextDouble();
//                     add a discount if the user has a premium account
                    smartphone.setPrice(price);
                    if(premium){

                        smartphone.setPrice(smartphone.addDiscount());
                    }

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
//                     add a discount if the user has a premium account

                    cuffie.setPrice(price);
                    if(premium){
                        cuffie.setPrice(cuffie.addDiscount());
                    }


                    System.out.println(cuffie.toString());
                    //                    push the object inside cart
                    cart[counter] = cuffie;
                    counter++;
                    break;
                case "3":
                    Televisore televisore = new Televisore();
                    System.out.print("Stabilisci un prezzo: ");
                    price = askDetails.nextDouble();
//                     add a discount if the user has a premium account
                    televisore.setPrice(price);
                    if(premium){
                        televisore.setPrice(televisore.addDiscount());
                    }

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
