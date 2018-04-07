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
        int[] array = {3, 1, 6, 7, 2, 1, 5, 9, 15, 8};
        System.out.println(Arrays.toString(array));
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
        //Copy the elements to be moved in a temp array
        for (int j = 0; j < n; j++) {
            temp[j] = array[j];
        }

        //Move the elements to the left by n indices
        for (int j = 0; j < array.length - n; j++) {
            array[j] = array[j + n];
        }
        //Copy the elements of temp array into their proper position in orignal array
        for (int j = 0; j < n; j++) {
            array[array.length - n + j] = temp[j];
        }
        System.out.println(Arrays.toString(array));
    }
}

