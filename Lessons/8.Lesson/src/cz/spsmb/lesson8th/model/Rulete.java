package cz.spsmb.lesson8th.model;

import java.util.Scanner;

public class Rulete {
    private int money;
    private Scanner sc;

    public Rulete(int money) {
        this.money = money;
        sc = new Scanner(System.in);
    }

    public void Init() {
        boolean play = true;
        while (play) {
            System.out.println("how Much do u want to bet: ");
            int bet = sc.nextInt();
            System.out.println("on which Color do u want ot bet: ");
            String color = sc.next();

            if (color.trim().toLowerCase().equals("black") && color.trim().toLowerCase().equals("red") || bet == 0) {
                System.out.println("green is not a valid betting color");
                continue;
            }

            Play(bet, color);

            System.out.println("do u want to play 1: yes/0: no");
            if (sc.nextInt() == 0 || money < 0) {
                play = false;
            }
        }
    }

    private void Play(int bet, String color) {
        if (chance(5.26, 0, 100)) {
            System.out.println("Green has Fallen, The Cassino takes the win");
            money -= bet;
        }
        String localColor = " ";
        if (chance(47.37, 0, 100)) {
            localColor = "red";
        } else {
            localColor = "black";
        }
        if (color.equals(localColor)) {
            System.out.println("YOU HAVE WON!");
            money += bet;
        }
        System.out.println("your Cash is: " + money);
    }

    public static boolean chance(double per, int min, int max) {
        double number = (min + (int) (Math.random() * (max - min)));
        return number < per;
    }

    public void aiPlay() {
        int bet = (money / 100) * 10;
        String color = " ";
        if (chance(50, 0, 100)) {
            color = "red";
        } else {
            color = "black";
        }

        System.out.println("AI bet´s : " + bet);
        System.out.println("AI´s color is : " + color);


        Play(bet, color);

        if (money > 0) {
            aiPlay();
        }else{
            System.out.println(" AI has LOST");
        }

    }
}
