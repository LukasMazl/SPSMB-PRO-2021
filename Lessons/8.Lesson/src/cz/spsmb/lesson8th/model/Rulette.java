package cz.spsmb.lesson8th.model;

import java.util.Scanner;

import static current.cz.spsmb.utils.MathUtils.randomNumber;

public class Rulette {
    public static int cash = 1000;
    public static double chanceRnB = 47.37;
    public static double chanceG = 5.26;
    public static Scanner sc = new Scanner(System.in);

    public static void play() {
        System.out.println("Zadej barvu(red/black) a kolik chces vsadit");
        String Color = sc.next();
        int Bet = sc.nextInt();
        checkInvalid(Color, Bet);
        checkWin(Color, ranGen(chanceRnB, chanceG), Bet);
        checkCash();
        end();
    }

    public static void end() {
        System.out.println("Chces stale hrat?(ano/ne)");
        String Answer = sc.next();
        switch (Answer) {
            case "ano":
                play();
                break;
            case "ne":
                System.out.println("Odchazis z kasina s " + cash);
                System.exit(0);
            default:
                System.out.println("Invalid");
                end();
        }
    }

    public static void checkCash() {
        if (cash <= 0) {
            System.out.println("Konec hry!");
            System.exit(0);
        }
    }

    public static void checkInvalid(String Color, int Bet) {
        if (!Color.equals("red") && !Color.equals("black")) {
            System.out.println("Zadej red/black trumpeto! ;) ");
            play();
        }
        if (Bet > cash) {
            System.out.println("Invalid input");
            play();
        }
    }

    public static void checkWin(String Color, String ranGen, int Bet) {
        System.out.println("Na rulete padlo: " + ranGen);
        if (Color.equals(ranGen)) {
            cash += Bet;
            System.out.println("Vyhrals!");
        } else {
            cash -= Bet;
            System.out.println("Prohrals!");
        }
        System.out.println("Mas " + cash + " Kreditu");
    }

    public static String ranGen(double RnB, double G) {
        int Random = randomNumber(0, 100);
        if (Random < G) {
            return "green";
        }
        if (Random < RnB) {
            return "red";
        } else {
            return "black";
        }
    }
}
