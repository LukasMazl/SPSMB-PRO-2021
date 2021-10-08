package cz.spsmb.lesson5th.utils;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(ArrayUtils.sequence(21)));
        System.out.println("sorted array: " + Arrays.toString(ArrayUtils.bogo(5)));
    }
}