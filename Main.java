package com.company;

import java.util.Random;
import java.util.Scanner;

class RouletteGame {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random generator = new Random();
        double total = 500;
        double amount;
        int choice, win = 0, lose = 0, spin = 0;
        int number;
        int rouletteNum;
        int result;
        char response = 'y';
        int resultArr[] = new int[36];

        while (response == 'y' || response == 'Y' && total <= 0) {
            System.out.print("Obnos sázky: ");
            amount = keyboard.nextDouble();
            System.out.println("0 - černáa");
            System.out.println("1 - červená");
            System.out.println("2 - číslo");
            choice = -1;
            while (choice < 0 || choice > 2) {
                System.out.print("Sázka na: ");
                choice = keyboard.nextInt();
            }
            number = 0;
            if (choice == 2) {
                while (number < 1 || number > 36) {
                    System.out.print("Sázka na čislo mezi(1-36): ");
                    number = keyboard.nextInt();
                }
            }
            rouletteNum = generator.nextInt(37);
            spin++;
            System.out.println("Výherní číslo: " + rouletteNum);

            if (choice == 2) {
                if (rouletteNum == number)
                    result = 35;
                else
                    result = 0;
            }
            else {
                if (rouletteNum == 0 || rouletteNum % 2 != choice)
                    result = 0;
                else
                    result = 1;
            }

            if (result > 0) {
                System.out.println("Gratuluju, vyhrál jsi!!!");
                System.out.printf("Vyhrál jsi $%.2f \n", result * amount);
                System.out.printf("Zde jsou tvé peníze: $%.2f \n",
                        (result + 1) * amount);
                total = (result + 1) * amount + total;
                win++;
                resultArr[rouletteNum]++;

            }
            else {
                System.out.println("Prohrál jsi");
                System.out.printf("Prohrál jsi obnos $%.2f \n",
                        (result + 1) * amount);
                total = total - (result + 1) * (amount);
                lose++;
                resultArr[rouletteNum]++;

                if (total <= 0) {
                    break;
                }

            }

            System.out.println("Máš $" + total + " penež.");
            System.out.println("Vyhrál jsi " + win + " her.");
            System.out.println("Hrohrál jsi " + lose + " her.");
            System.out.println("hrál jsi " + spin + " * krát.");
            System.out.print("\nChceš htát znovu? (y/n) ");
            response = keyboard.next().charAt(0);


        }

    }
}
