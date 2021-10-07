package cz.spsmb.utils;

import java.util.Arrays;

public class ArrayUtils {

    /**
     * Metoda vygeneruje pole s random hodnotou.
     *
     * @param size - Velikost pole
     * @param min  - Minimální hodnota
     * @param max  - Maximální hodnota
     * @return - Pole s náhodnými hodnoty
     */
    public static int[] generate(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = MathUtils.randomNumber(min, max);
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
     * @param min  - Minimální hodnota
     * @param max  - Maximální hodnota
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
    public static int[] bogoSort(int[] arr){
        while(!isSorted(arr)) {
            shakeArray(arr);
        }
        return arr;
    }

    public static boolean isSorted(int[] arr){
        int lastNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (lastNum > arr[i]) return false;
            lastNum = arr[i];
        }
        return true;
    }

    public static int[] shakeArray(int[] arr){
        int numberAtCurr, currRanPos;
        for (int i = 0; i < arr.length; i++) {
            numberAtCurr = arr[i];
            currRanPos = MathUtils.randomNumber(0, arr.length);
            arr[i] = arr[currRanPos];
            arr[currRanPos] = numberAtCurr;
        }
        return arr;
    }


    public static int[] fibonacciSequence(int length){
        int[] arr = new int[length];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr;
    }
}
