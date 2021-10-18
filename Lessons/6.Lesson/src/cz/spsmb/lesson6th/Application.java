package cz.spsmb.lesson6th;

import cz.spsmb.lesson6th.utils.ArrayUtils;

public class Application {

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            int[] array = ArrayUtils.generate(i + 5, 0, 100);
            ArrayUtils.print(array);
            ArrayUtils.quickSort(array);
            ArrayUtils.print(array);
        }
    }

}