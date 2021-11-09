package cz.spsmb.homework;

import java.util.Scanner;

public class RouletteApp {

    public static Scanner scan = new Scanner(System.in);
    public static int counter = 0;
    public static int balance = 5000;
    public static int[] board = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
            20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
            30, 31, 32, 33, 34, 35, 36};
    public static int[] redBoard = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};
    public static int[] blackBoard = {2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35};
    public static int option;
    public static int bet;
    public static boolean isValid = false;
    public static int betPosition;
    public static int arrayLength;
    public static int[] arrayBetPosition = new int[board.length];
    public static int randomNum;
    public static int[] randomNumArr;
    public static String con;
    public static boolean group;
    public static int color;

    public static void introduction() {
        if (balance <= 0) {
            System.out.println("You lost all your money, you're owning " + balance + " to a casino. :-D");
            System.exit(-1);
        }
        System.out.println("Welcome to roulette!");
        System.out.println("You are able to bet on");
        System.out.println("0 a single number,");
        System.out.println("1 a group of numbers,");
        System.out.println("2 a color red or black,");
        System.out.println("3 whether the number is odd or even");
        System.out.println("4 or if the numbers are high (19 - 36) or low (1 - 18)");
        printBalance();
        printBoard();
    }

    public static void printBalance() {
        System.out.println("Your current balance: " + balance);
    }

    public static void printBoard() {
        for (int boardNum : board) {
            System.out.print(boardNum + " ");
        }
        System.out.println();
    }

    public static void genRandom() {
        if (option == 1) {
            for (int i = 0; i < arrayBetPosition.length; i++) {
                randomNumArr[i] = (int) Math.floor(Math.random() * board.length);
            }
        } else {
            randomNum = (int) Math.floor(Math.random() * board.length);
        }
    }

    public static void choice() {
        option = scan.nextInt();
        switch (option) {
            case 0 -> singleNumBet();
            case 1 -> numGroupBet();
            case 2 -> colorBet();
            case 3 -> oddEvenBet();
            case 4 -> highLowBet();
            default -> {
                System.out.println("invalid input");
                choice();
            }
        }
    }

    public static boolean checkValidity() {
        for (int boardNum : board) {
            if (betPosition == boardNum) return isValid = true;
        }
        return isValid = false;
    }

    public static boolean groupValidity() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < arrayBetPosition.length; j++) {
                if (board[i] == arrayBetPosition[j]) return isValid = true;
            }
        }
        return isValid = false;
    }

    public static void bettingSystem() {
        System.out.print("You bet ");
        bet = scan.nextInt();
        if (option == 1) {
            System.out.println("Enter how many number you'd like to enter");
            arrayLength = scan.nextInt();
        }
        System.out.print("on ");
        switch (option) {
            case 0 -> {
                do {
                    betPosition = scan.nextInt();
                    checkValidity();
                    if (!isValid) System.out.println("Choose a number from the board!");
                } while (!isValid);
            }
            case 1 -> {
                do {
                    for (int i = 0; i < arrayLength; i++) {
                        arrayBetPosition[i] = scan.nextInt();
                        groupValidity();
                    }
                } while (!isValid);
            }
            case 2 -> {
                System.out.println("Choose a bet color; red = 0, black = 1");
                do {
                    color = scan.nextInt();
                } while (color != 0 && color != 1);
            }
            case 3 -> {
                System.out.println("Choose a number type; even = 0, odd = 1");
                do {
                    betPosition = scan.nextInt();
                    checkValidity();
                    if (!isValid) System.out.println("Choose a number from the board!");
                } while (!isValid);
            }
            case 4 -> {
                System.out.println("Choose a bet type; high = 0, low = 1");
                do {
                    betPosition = scan.nextInt();
                    checkValidity();
                    if (!isValid) System.out.println("Choose a number from the board!");
                } while (!isValid);
            }
            default -> {
                System.out.println("invalid input");
            }
        }
    }

    public static void checkWin() {
        switch (option) {
            case 0 -> {
                if (betPosition == randomNum) {
                    balance += bet * 2;
                } else {
                    balance -= bet;
                }
            }
            case 1 -> {
                if (group == true) {
                    for (int i = 0; i < counter; i++) {
                        balance += bet * 2;
                    }
                }
            }
            case 2 -> {
                int randomColor = (int) Math.round(Math.random());
                if (color == 0) {
                    if (randomColor == color) {
                        balance += bet * 2;
                    } else balance -= bet;
                } else {
                    if (randomColor == color) {
                        balance += bet * 2;
                    } else balance -= bet;
                }
            }
            case 3 -> {
                int number = (int) Math.round(Math.random());
                if (betPosition % 2 == number) {
                    balance += bet * 2;
                } else {
                    balance -= bet;
                }
            }
            case 4 -> {
                int number = (int) Math.round(Math.random());
                if (betPosition == 0) {
                    if (number == 0) {
                        balance += bet * 2;
                    } else {
                        balance -= bet;
                    }
                } else {
                    if (number == 1) {
                        balance += bet * 2;
                    } else {
                        balance -= bet;
                    }
                }
            }
        }
    }

    public static void groupCheck() {
        for (int i = 0; i < arrayBetPosition.length; i++) {
            for (int j = 0; j < randomNumArr.length; j++) {
                if (arrayBetPosition[i] == randomNumArr[j]) {
                    group = true;
                    counter++;
                } else {
                    group = false;
                }
            }
        }
        checkWin();
    }

    public static void singleNumBet() {
        bettingSystem();
        genRandom();
        checkWin();
        printBalance();
    }

    public static void numGroupBet() {
        bettingSystem();
        genRandom();
        groupCheck();
        printBalance();
    }

    public static void colorBet() {
        bettingSystem();
        checkWin();
        printBalance();
    }

    public static void oddEvenBet() {
        bettingSystem();
        checkWin();
        printBalance();
    }

    public static void highLowBet() {
        bettingSystem();
        checkWin();
        printBalance();
    }


    public static void main(String[] args) {
        do {
            introduction();
            choice();
            System.out.println("Enter true or false");
            scan.nextLine();
            con = scan.nextLine();
        } while (con.equals("true")) ;
        System.out.println("You're leaving from a casino with " + balance);
    }
}
