package je29_arrays;

import java.util.Arrays;

public class ArraysSample {
    public static void main(String[] args) {
        Integer[] array = new Integer[6];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i : array) {
            System.out.println(array[i]);
        }
        printArray(array);
        System.out.println(array[2]);
    }


    private static void printArray(Integer[] array) {
        System.out.println(Arrays.toString(array));
    }
}
