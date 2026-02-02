package main.java;

/**
 * <h4>Insertion Sort</h4>
 * <hr>
 * Given an array arr[] of positive integers.The task is to complete the insertsort() function which is used to implement Insertion Sort.
 *
 * <p>Bubble Sort repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
 *
 * <p>Examples:
 * <ul>
 *   <li>Input: arr[] = [4, 1, 3, 9, 7]</li>
 *   <li>Output: [1, 3, 4, 7, 9]</li>
 *   <li>Input: arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]</li>
 *   <li>Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]</li>
 *   <li>Input: arr[] = [4, 1, 9]</li>
 *   <li>Output: [1, 4, 9]</li>
 * </ul>
 * <pre>
 * int[] arr = {4, 1, 3, 9, 7};
 * insertionSort.sort(arr);
 * arr is now [1, 3, 4, 7, 9]
 * </pre>
 *
 * <p>Constraints:
 * <ul>
 *   <li>1 ≤ arr.length ≤ 10^3</li>
 *   <li>1 ≤ arr[i] ≤ 10^3</li>
 * </ul>
 *
 * @see <a href="https://www.geeksforgeeks.org/problems/insertion-sort/1">GFG: Insertion Sort</a>
 */
public class insertionSort {

    /**
     * Sorts the given array using Insertion Sort algorithm.
     * <p>
     *     <b>Complexity Analysis</b>
     *     <ul>
     *         <li>Time Complexity: O(n^2) in Worst and Average cases, O(n) in Best case (when array is already sorted)</li>
     *         <li>Space Complexity: O(1)</li>
     *     </ul>
     * </p>
     * @param arr
     */
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i-1;

            // Shift elements that are greater than key by one pos
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        insertionSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
