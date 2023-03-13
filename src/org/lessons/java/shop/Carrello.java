package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {

        boolean flag = false;
        Scanner userImput = new Scanner(System.in);
        while(!flag){
        System.out.println("Buongiorno scegli il prodotto che vuoi aggiungere");
        System.out.println("Premi 1 per uno smartphone, 2 per un paio di cuffie, 3 per un televisore," +
                " 4 per uscire");

        String userChoice = userImput.nextLine();

            switch (userChoice){
                case "1":
                    System.out.println("1");
                    break;
                case "2":
                    System.out.println("2");
                    break;
                case "3":
                    System.out.println("3");
                    break;
                case "4":
                    flag = true;
                    System.out.println("Grazie per l'acquisto");
                    break;
                default:
                    System.out.println("Scelta sbagliata");
            }
        }
        userImput.close();
    }
}
