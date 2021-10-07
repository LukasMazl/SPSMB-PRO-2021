package src.cz.spsmb.lesson5th;

import src.cz.spsmb.lesson5th.utils.ArrayUtils;
import src.cz.spsmb.lesson5th.utils.MathUtils;

import java.util.Arrays;

public class Application {

    public static void shakeArray(int[] arr) {
        int a;
        int rand;
        for (int i = 0; i < arr.length; i++) {
            a = arr[i];
            rand = MathUtils.randomNumber(i, arr.length);
            arr[i] = arr[rand];
            arr[rand] = a;
        }
    }

    public static boolean isSorted(int[] arr) {
        int lastNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (lastNum > arr[i]) return false;
            lastNum = arr[i];
        }
        return true;
    }

    public static void main(String[] args) {

        int[] array = ArrayUtils.generate(10, 0, 20);

        System.out.println(Arrays.toString(array));

        while(!isSorted(array)) {
            shakeArray(array);
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(MathUtils.fibonacci(21)));
    }
}

