package main.java;

/**
 * <h4>Bubble Sort</h4>
 * <hr>
 * Sorts an array using the Bubble Sort algorithm.
 *
 * <p>Bubble Sort repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
 *
 * <p>Examples:
 * <ul>
 *   <li>Input: arr[] = [4, 1, 3, 9, 7]</li>
 *   <li>Output: [1, 3, 4, 7, 9]</li>
 *   <li>Input: arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]</li>
 *   <li>Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]</li>
 *   <li>Input: arr[] = [1, 2, 3, 4, 5]</li>
 *   <li>Output: [1, 2, 3, 4, 5]</li>
 * </ul>
 * <pre>
 * int[] arr = {4, 1, 3, 9, 7};
 * bubbleSort.sort(arr);
 * arr is now [1, 3, 4, 7, 9]
 * </pre>
 *
 * <p>Constraints:
 * <ul>
 *   <li>1 ≤ arr.length ≤ 10^3</li>
 *   <li>1 ≤ arr[i] ≤ 10^3</li>
 * </ul>
 *
 * @see <a href="https://www.geeksforgeeks.org/problems/bubble-sort/1">GFG: Bubble Sort</a>
 */
public class bubbleSort {

    /**
     * Sorts the given array using Bubble Sort algorithm.
     * <p>
     *     <b>Complexity Analysis</b>
     *     <ul>
     *         <li>Time Complexity: O(n^2) in Worst and Average cases, O(n) in Best case (when array is already sorted)</li>
     *         <li>Space Complexity: O(1)</li>
     *     </ul>
     * </p>
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Last i elements are already sorted
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // if no swap takes place, arr is already sorted.
            if (swapped == false)
                break;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        bubbleSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

