package cz.spsmb.lesson8th;

import java.util.Scanner;

public class Application {
    public static Scanner sc = new Scanner(System.in);
    public static int userMoney = 1000;
    public static int userMoneyBet = 0;
    public static String userColorBet = "";

    public static void main(String[] args) {
        boolean gameIsRunning = true;

        while (gameIsRunning) {
            System.out.println("Enter your desired color and the amount you want to be, your current balance is: " + userMoney);
            userColorBet = sc.nextLine();
            userMoneyBet = Integer.parseInt(sc.nextLine());

            checkMoneyInput();
            checkColorInput();

            if (rollRoulette()){
                userMoney += userMoneyBet;
            } else {
                userMoney -= userMoneyBet;
            }

            if (userMoney == 0) {
                System.out.println("You've lost the game");
                gameIsRunning = false;
            }
        }
    }

    public static boolean chanceGen(double percentile){
        int num = (int) (Math.random() * 100);
        return num < percentile;
    }

    public static void checkMoneyInput() {
        if (userMoneyBet > userMoney || userMoneyBet <= 0){
            System.out.println("Enter a valid amount, your current balance is: " + userMoney);
            userMoneyBet = sc.nextInt();
            checkMoneyInput();
        }
    }

    public static void checkColorInput() {
        switch (userColorBet){
            case "red":
            case "black":
                break;
            default:
                System.out.println("Enter valid color");
                userColorBet = sc.nextLine();
                checkColorInput();
        }
    }

    public static String getColor(){
        if (chanceGen(47.4)){
            return "red";
        }
        return "black";
    }

    public static boolean rollRoulette(){
        String winningColor = getColor();

        if (chanceGen(5.2)){
            System.out.println("GREEN has fallen, Casino wins");
            return false;
        }

        System.out.println(winningColor + " is the winning color");
        if (winningColor.equals(userColorBet)){
            System.out.println("You've won the round");
            return true;
        }
        System.out.println("You've lost the round");
        return false;
    }
}