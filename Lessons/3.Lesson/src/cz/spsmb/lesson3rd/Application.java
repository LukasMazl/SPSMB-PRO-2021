package cz.spsmb.lesson3rd;

import cz.spsmb.lesson4th.utils.ArrayUtils;

public class Application {

    public static void main(String[] args) {
        int[] array = cz.spsmb.lesson4th.utils.ArrayUtils.generate(10, 0, 10);
        cz.spsmb.lesson4th.utils.ArrayUtils.print(array);
        int sum = cz.spsmb.lesson4th.utils.ArrayUtils.sum(array);
        System.out.println("Sum of given list: " + sum);
        double avg = ArrayUtils.avg(array);
        System.out.println("Avg of given list: " + avg);
    }
}