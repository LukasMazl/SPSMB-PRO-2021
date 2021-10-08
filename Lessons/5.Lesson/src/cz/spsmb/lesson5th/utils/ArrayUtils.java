package cz.spsmb.lesson5th.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayUtils {

    /**
     * Metoda vygeneruje pole s random hodnotou.
     *
     * @param size - Velikost pole
     * @param min - Minimální hodnota
     * @param max - Maximální hodnota
     * @return - Pole s náhodnými hodnoty
     */
    public static int[] generate(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            //array[i] = cz.spsmb.lesson5th.utils.MathUtils.randomNumber(min, max);
        }
        return array;
    }

    /**
     * Výpis jednorozměrného pole do terminálu
     *
     * @param array
     */
    public static void print(int[] array) {
        System.out.print("[");
        boolean first = true;
        for (int item : array) {
            if (first) {
                first = !first;
            } else {
                System.out.print(", ");
            }
            System.out.print(item);
        }
        System.out.println("]");
    }

    /**
     * Součet celého pole
     *
     * @param array
     *
     * @return - součet celého pole
     */
    public static int sum(int[] array) {
        int sum = 0;
        for (int item : array) {
            sum += item;
        }
        return sum;
    }

    /**
     * Průměrná hodnota pole
     *
     * @param array
     *
     * @return
     */
    public static double avg(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        return sum(array) / (double) array.length;
    }

    /**
     * Metoda vygeneruje seřazené pole s random hodnotou.
     *
     * @param size - Velikost pole
     * @param min - Minimální hodnota
     * @param max - Maximální hodnota
     *
     * @return - Pole s random hodnotou
     */
    public static int[] generateSortedArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            min = MathUtils.randomNumber(min, max);
            array[i] = min;
        }
        return array;
    }

    public static int[] sequence(int length) {
        int[] numArray = new int[length];
        if (numArray.length > 1) {
            numArray[1] = 1;
        }

        for (int i = 2; i < numArray.length; i++) {
            int index = (numArray[i - 2]) + (numArray[i - 1]);
            numArray[i] = index;
        }

        return numArray;
    }

    public static Integer[] bogo(int length) {
        Scanner sc = new Scanner(System.in);
        Integer[] bogoArray = new Integer[length];

        for (int i = 0; i < bogoArray.length; i++) {
            int num = sc.nextInt();
            bogoArray[i] = num;
        }
        List<Integer> bogoList = Arrays.asList(bogoArray);
        for (int i = 1; i < bogoArray.length; i++) {
            if (bogoArray[i] < bogoArray[i - 1]) {
                Collections.shuffle(bogoList);
                bogoList.toArray(bogoArray);
                i = 0;
            }
        }
        return bogoArray;
    }
}
