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

    public static boolean endGame () {
        System.out.println("Do you wish to stop playing?");
        String input = scan.nextLine();
        if (input.equals("yes") || input.equals("y")) return true;
        return false;
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

        if (cash <= 0 || endGame()) return;

        game(cash);
    }

    public static void game() {
        game(10_000);
    }

    private static void autoGame (int cash, int round) {
        int bet = cash < 2 ? 1 : cash / 2;
        round++;
        System.out.println("Round " + round);
        System.out.println("Current balance: " + cash);
        String casinoColor = generateColor(CHANCE);
        String AICOlor = generateColor(50);

        System.out.println("Your color is " + AICOlor);
        System.out.println("Casinos color is " + casinoColor);

        if (casinoColor.equals(AICOlor)) {
            System.out.println("You won");
            cash += bet;
        }
        else {
            System.out.println("You lost");
            cash -= bet;
        }

        if (cash <= 0) return;
        autoGame(cash, round);
    }

    public static void autoGame () {
        autoGame(10_000, 0);
    }

    public static void main(String[] args) {
        System.out.println("1 - AI");
        System.out.println("2 - YOU");
        int input = Integer.parseInt(scan.nextLine());
        if (input == 1) {
            autoGame();
            System.exit(1);
        } else if (input == 2) {
            game();
            System.exit(1);
        } else {
            main(null);
        }

        game();
    }
}