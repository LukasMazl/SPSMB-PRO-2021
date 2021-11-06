import java.util.Scanner;

public class Roulette {

    final static double CHANCE = 48.65;
    static Scanner scan = new Scanner(System.in);

    public static String generateColor(double perc) {
        double random = Math.random() * 100;

        if (random >= 0 && random <= perc) return "red";
        else if (random > perc && random <= perc * 2) return "black";
        else return "green";
    }

    public static int makeBet(int cash) {
        System.out.println("How much would you like to bet?");
        int bet = Integer.parseInt(scan.nextLine());
        if (bet > cash || bet <= 0) {
            System.out.println("You can't bet this amount of money!");
            return makeBet(cash);
        } else return bet;
    }

    public static String pickColor() {
        System.out.println("Would you like to bet on black or red?");
        String input = scan.nextLine();
        if (input.equals("red") || input.equals("black")) return input;
        else return pickColor();
    }

    public static boolean hasWon(String picked, String generated) {
        return picked.equals(generated);
    }

    private static void game(int cash) {
        int bet;
        String pickedColor, generatedColor;
        System.out.println("Current balance: " + cash);
        bet = makeBet(cash);
        pickedColor = pickColor();
        generatedColor = generateColor(CHANCE);

        System.out.println("Casinos color is " + generatedColor);

        if (hasWon(pickedColor, generatedColor)) {
            System.out.println("You won!");
            cash += bet;
        } else cash -= bet;

        System.out.println("Current balance: " + cash);

        if (cash <= 0) return;
        System.out.println("Do you wish to stop playing?");
        String input = scan.nextLine();
        if (input.equals("yes") || input.equals("y")) return;
        game(cash);
    }

    public static void game() {
        int cash = 10_000;
        game(cash);
    }

    public static void main(String[] args) {
        game();
    }
}