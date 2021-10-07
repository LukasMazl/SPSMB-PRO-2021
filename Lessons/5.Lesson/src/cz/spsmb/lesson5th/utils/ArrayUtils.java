package cz.spsmb.lesson5th.utils;

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

    public static void print(int[][] array) {
        System.out.println("[");
        for (int[] subArray : array) {
            print(subArray);
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
            min = MathUtils.randomNumber(min, max);
            array[i] = min;
        }
        return array;
    }
}
