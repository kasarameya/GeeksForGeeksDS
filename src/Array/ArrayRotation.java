package Array;

import java.util.Arrays;

/**
 * Created by ©Ameya on 4/5/2018 at 6:46 PM.
 *
 * @link https://www.geeksforgeeks.org/array-rotation/
 *
 * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 *
 */
public class ArrayRotation {
    public static void main(String[] args) {
        int[] array = {3, 1, 6, 7, 2, 8};
        rotateArray(array, 4);
    }


    /**
     * Rotate the array to the right by i elements
     *
     * @param array that is to be rotated
     * @param n     the number with which the array is to be rotated
     */
    private static void rotateArray(int[] array, int n) {
        int temp[] = new int[n];
        for (int j = 0; j < n; j++) {
            temp[j] = array[j];
        }

        for (int j = 0; j < array.length - n; j++) {
            array[j] = array[j + n];
        }
        for (int j = 0; j < n; j++) {
            array[array.length - n + j] = temp[j];
        }
        System.out.println(Arrays.toString(array));
    }
}

