package cz.spsmb.lesson5th;

import cz.spsmb.lesson5th.utils.ArrayUtils;
import cz.spsmb.lesson5th.utils.MathUtils;
import cz.spsmb.lesson5th.utils.MatrixUtils;
import cz.spsmb.lesson5th.utils.SortUtils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        int[][] array1 = MatrixUtils.generate(5, 5, 1, 5);
        int[][] array2 = MatrixUtils.generate(5, 5, 1, 5);
        System.out.println(Arrays.deepToString(MatrixUtils.generate(5, 5, 1, 10)));
        System.out.println(Arrays.deepToString(MatrixUtils.generate(5, 3, new String[]{"višeň", "kočka", "table"})));
        ArrayUtils.print(MatrixUtils.init(5, 5));
/*
        ArrayUtils.print(array1);
        ArrayUtils.print(array2);
*/
        ArrayUtils.print(MatrixUtils.sum(array1, array2));
        ArrayUtils.print(MatrixUtils.genFlag(6, 4));
        ArrayUtils.print(SortUtils.bogoSort(new int[]{2, 3, 1, 5, 4}));
        ArrayUtils.print(MathUtils.fibonacci(10));
    }
}   