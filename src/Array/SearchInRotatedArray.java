package Array;

/**
 * Created by ©Ameya on 4/5/2018 at 10:57 PM.
 */
public class SearchInRotatedArray {

    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 1, 2};
        //int index = findBinarySearch(array,0,array.length-1,5);
    }

    private static int findPivot(int[] array, int low, int high) {
        if (low > high) {
            return -1;
        }
        if (low == high) {
            return low;
        }
        int mid = (low + high) / 2;

        if (high > mid && array[mid] > array[mid + 1]) {
            return mid;
        }
        if (mid > low && array[mid] < array[mid - 1]) {
            return mid - 1;
        }
        if (array[low] >= array[mid]) {
            return findPivot(array, low, mid - 1);
        }
        return findPivot(array, mid + 1, high);

    }
}
