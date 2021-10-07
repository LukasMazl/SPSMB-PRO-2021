package cz.spsmb.lesson5th.utils;

import java.util.Arrays;

public class SortUtils {

    public static boolean isSorted(int[] array) {
        int helper = array[0];
        for (int i = 1; i < array.length; i++) {
            if (helper > array[i]) {
                return false;
            }
            helper = array[i];
        }
        return true;
    }

    public static void shakeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int r = MathUtils.randomNumber(i, array.length);
            int helper = array[i];
            array[i] = array[r];
            array[r] = helper;
        }
    }

    public static int[] bogoSort(int[] array) {
        while(!isSorted(array)) {
            shakeArray(array);
        }
        return array;
    }
}
