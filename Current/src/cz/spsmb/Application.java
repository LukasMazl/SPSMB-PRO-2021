package cz.spsmb;

import cz.spsmb.utils.ArrayUtils;
import cz.spsmb.utils.MatrixUtils;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        /*
        int[] array = ArrayUtils.generate(10, 0, 10);
        cz.spsmb.lesson5th.utils.ArrayUtils.print(array);
        int sum = cz.spsmb.lesson5th.utils.ArrayUtils.sum(array);
        System.out.println("Sum of given list: " + sum);
        double avg = ArrayUtils.avg(array);
        System.out.println("Avg of given list: " + avg);
         */
        int[] arrToSort = {1, 6, 4, 3, 5, 2, 10, 8, 4};
        System.out.println(Arrays.toString(ArrayUtils.bogoSort(arrToSort)));
    }
}