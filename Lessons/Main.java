package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to loose all of your money yourself or let fake AI do it? (type either play or ai)");
        String chose = scan.nextLine();
        switch (chose) {
            case "play" -> setMoney();
            case "ai" -> aiMoney();
        }
    }

    public static int money;
    public static int moneyBet;

    public static void setMoney() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entry how much money do you have.");
        money = scan.nextInt();
        bet();
    }

    public static void aiMoney() {
        money = 5000;
        aiMoneyBet();
    }

    public static void aiMoneyBet() {
        moneyBet = 500;
        aiPlay();
    }

    public static void aiWon() {
        money = money + (moneyBet * 2);
        if (money > moneyBet) {
            aiPlay();
        } else {
            System.out.println("Ai run out of money.");
        }
    }

    public static void aiLost() {
        money = money - moneyBet;
        if (money > moneyBet) {
            aiPlay();
        } else {
            System.out.println("Ai run out of money.");
        }
    }

    public static int randomInt() {
        Random rand = new Random();
        int ran = rand.nextInt(35);
        return ran;
    }

    public static String randomString(int ran) {
        if (ran == 0) {
            return "green";
        } else if (ran != 0 && ran % 2 == 0) {
            return "black";
        } else if (ran != 0 && ran % 2 != 0) {
            return "red";
        }
        return "none";
    }

    public static void won() {
        money = money + (moneyBet * (2));
        endGame();
    }

    public static void lost() {
        money = money - moneyBet;
        endGame();
    }

    public static void endGame() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to play again?");
        String ans = scan.nextLine();
        ans.toLowerCase();
        ans.trim();
        switch (ans) {
            case "yes" -> bet();
            case "no" -> System.out.println("Good game, your balance is: " + money);
        }
    }

    public static int aiBet() {
        Random random = new Random();
        int ran = random.nextInt(100);
        return ran;
    }

    public static void aiPlay() {
        System.out.println("A randomizer will decide on what will AI bet.");
        int c = aiBet();
        if (c >= 50) {
            aiColourPlay();
        } else if (c < 50) {
            aiNumberPlay();
        }
    }

    public static String aiColourPicker() {
        Random rand = new Random();
        int ran = rand.nextInt(2);
        String anAi = new String();
        switch (ran) {
            case 0 -> anAi = "green";
            case 1 -> anAi = "red";
            case 2 -> anAi = "black";
        }
        return anAi;
    }

    public static int aiNumPicker() {
        Random rand = new Random();
        int ran = rand.nextInt(35);
        return ran;
    }

    public static void play() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to bet on a number or a colour?");
        String choose = scan.nextLine();
        choose.toLowerCase();
        choose.trim();
        switch (choose) {
            case "colour":
                colourPlay();
                break;
            case "number":
                numberPlay();
                break;
        }
    }

    public static void bet() {
        if (money == 0) {
            System.out.println("Sorry, you're outta quid mate. Wanna cuppa tea?");
        } else {
            Scanner scan = new Scanner(System.in);
            System.out.println("How much of your money would you like to bet? Your current state is " + money);
            moneyBet = scan.nextInt();
            if (moneyBet <= money) {
                play();
            } else {
                System.out.println("You dont have enough money m8.");
                bet();
            }
        }
    }

    public static void aiColourPlay() {
        String iRanS = randomString(randomInt());
        String anAi = aiColourPicker();
        System.out.println("The ai picked " + anAi);
        if (iRanS.equals(anAi)) {
            System.out.println("Good job, the AI won!");
            System.out.println("The correct one was " + iRanS);
            aiWon();
        } else {
            System.out.println("This Ai is dumb xd, it lost.");
            System.out.println("The correct one was " + iRanS);
            aiLost();
        }
    }

    public static void aiNumberPlay() {
        int aiNum = aiNumPicker();
        int ran = randomInt();
        System.out.println("The ai picked number " + aiNum + ". Lets see how it does.");
        if (ran == aiNum) {
            System.out.println("GJ ai!");
            System.out.println("The correct one was " + ran);
            aiWon();
        } else {
            System.out.println("LOL ai lost.");
            System.out.println("Sorry, lol, the correct one was " + ran);
            aiLost();
        }
    }

    public static void colourPlay() {
        String ranS = randomString(randomInt());
        Scanner scan = new Scanner(System.in);
        System.out.println("And now write on what colour are you betting.");
        String colour = scan.nextLine();
        if (ranS.equals(colour)) {
            System.out.println("You've won!");
            System.out.println("The correct one was " + ranS);
            won();
        } else {
            System.out.println("Bruh you looooose");
            System.out.println("Sorry, the correct one was " + ranS);
            lost();
        }

    }

    public static void numberPlay() {
        Scanner scan = new Scanner(System.in);
        System.out.println("And now write which number are you betting.");
        int number = scan.nextInt();
        int ran = randomInt();
        if (ran == number) {
            System.out.println("You've won!");
            System.out.println("The correct one was " + ran);
            won();
        } else {
            System.out.println("Bruh you looooose");
            System.out.println("Sorry, the correct one was " + ran);
            lost();
        }

    }
}
