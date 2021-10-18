package cz.spsmb.lesson6th.utils;


public class ArrayUtils {

    /**
     * Metoda vygeneruje pole s random hodnotou.
     *
     * @param size - Velikost pole
     * @param min - Minimální hodnota
     * @param max - Maximální hodnota
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
     * Metoda vygeneruje pole s random hodnotou.
     *
     * @param width - Sirka pole
     * @param height - Vyska pole
     * @param min - Minimální hodnota
     * @param max - Maximální hodnota
     * @return - Pole s náhodnými hodnoty
     */
    public static int[][] generate(int width, int height, int min, int max) {
        int[][] array = new int[height][width];
        for (int i = 0; i < array.length; i++) {
            array[i] = generate(width, min, max);
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
     * Výpis dvourozměrného pole do terminálu
     *
     * @param array
     */
    public static void print(int[][] array) {
        System.out.print("[");
        boolean first = true;
        for (int[] item : array) {
            if (first) {
                first = !first;
            } else {
                System.out.print(", ");
            }
            print(item);
        }
        System.out.println("]");
    }

    /**
     * Součet celého pole
     *
     * @param array
     *
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
     *
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
     * @param min - Minimální hodnota
     * @param max - Maximální hodnota
     *
     * @return - Pole s random hodnotou
     */
    public static int[] generateSortedArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            min = cz.spsmb.lesson6th.utils.MathUtils.randomNumber(min, max);
            array[i] = min;
        }
        return array;
    }

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int fromIndex, int toIndex) {
        if(fromIndex >= toIndex || toIndex >= array.length) {
            return;
        }

        int pivotIndex = fromIndex;
        int pivot = array[pivotIndex];
        int moreThen = toIndex;
        int it = 0;
        for (int i = fromIndex + 1; i <= moreThen; i++) {
            if(pivot < array[i]) {
                while (array[moreThen] > pivot && moreThen > i) {
                    moreThen--;
                }
                swap(array, moreThen, i);
                if(moreThen > i) {
                    it++;
                }
            } else {
                it++;
            }
        }

        pivotIndex = fromIndex + it;
        swap(array, fromIndex, pivotIndex);
        quickSort(array, fromIndex, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, toIndex);
    }

    public static void swap(int[] array, int a, int b) {
        int c = array[a];
        array[a] = array[b];
        array[b] = c;
    }
}
