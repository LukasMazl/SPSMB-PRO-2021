package cz.spsmb.lesson4th;

import cz.spsmb.lesson5th.utils.ArrayUtils;

public class Application {

    public static void main(String[] args) {
        int[] array = ArrayUtils.generate(10, 0, 10);
        ArrayUtils.print(array);
        int sum = ArrayUtils.sum(array);
        System.out.println("Sum of given list: " + sum);
        double avg = ArrayUtils.avg(array);
        System.out.println("Avg of given list: " + avg);
    }
}