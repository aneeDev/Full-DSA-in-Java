package main.java;

/**
 * <h4>Quick Sort</h4>
 * <hr>
 * Implement Quick Sort, a Divide and Conquer algorithm, to sort an array, arr[] in ascending order.
 * Given an array arr[], with starting index low and ending index high, complete the functions partition() and quickSort().
 * Use the last element as the pivot, so that all elements less than or equal to the pivot come before it, and elements greater than the pivot follow it.
 *
 * Note: low and high are inclusive.
 *
 * <p>Examples:
 * <ul>
 *   <li>Input: arr[] = [4, 1, 3, 9, 7]</li>
 *   <li>Output: [1, 3, 4, 7, 9]</li>
 *   <li>Input: arr[] = [2, 1, 6, 10, 4, 1, 3, 9, 7]</li>
 *   <li>Output: [1, 1, 2, 3, 4, 6, 7, 9, 10]</li>
 *   <li>Input: arr[] = [5, 5, 5, 5]</li>
 *  <li>Output: [5, 5, 5, 5]</li>
 * </ul>
 * <pre>
 * int[] arr = {4, 1, 3, 9, 7};
 * quickSort.sort(arr);
 * arr is now [1, 3, 4, 7, 9]
 * </pre>
 *
 * <p>Constraints:
 * <ul>
 *   <li>1 ≤ arr.length ≤ 10^5</li>
 *   <li>1 ≤ arr[i] ≤ 10^5</li>
 * </ul>
 *
 * @see <a href="https://www.geeksforgeeks.org/problems/quick-sort/1">GFG: Quick Sort (M)</a>
 */
public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if(low <  high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p);
            quickSort(arr, p+1, high);
        }
    }

    // Picking the first element as Pivot so using Hoare's Partition
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low]; // first element as pivot
        int i = low-1;
        int j = high+1;

        while (true) {
            // find the leftmost element >= pivot
            do {
                i++;
            } while (arr[i] < pivot);
            // Find the rightmost element <= pivot
            do {
                j--;
            } while (arr[j] > pivot);

            // If two pointers met
            if (i >= j) return j;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] arr = {12, 1, 6, 10, 4, 1, 3, 9, 7};
        quickSort(arr, 0, arr.length-1);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
