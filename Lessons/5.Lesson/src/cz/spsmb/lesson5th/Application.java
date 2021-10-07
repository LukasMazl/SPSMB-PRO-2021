package cz.spsmb.lesson5th;

import cz.spsmb.lesson5th.utils.ArrayUtils;
import cz.spsmb.lesson5th.utils.MathUtils;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        System.out.print(Arrays.deepToString(ArrayUtils.generate(10, 10, 1, 6)));
    }
}