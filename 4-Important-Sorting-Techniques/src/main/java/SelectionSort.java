package main.java;

/**
 * <h4>Selection Sort</h4>
 * <hr>
 * Sorts an array using the Selection Sort algorithm.
 *
 * <p>Selection Sort repeatedly selects the minimum element from the unsorted part and puts it at the beginning.
 *
 * <p>Example:
 * <ul>
 *   <li>Input: arr[] = [4, 1, 3, 9, 7]</li>
 *   <li>Output: [1, 3, 4, 7, 9]</li>
 *   <li>Input: arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]</li>
 *   <li>Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]</li>
 *   <li>Input: arr[] = [38, 31, 20, 14, 30]</li>
 *   <li>Output: [14, 20, 30, 31, 38]</li>
 * </ul>
 * <pre>
 * int[] arr = {4, 1, 3, 9, 7};
 * SelectionSort.sort(arr);
 * // arr is now [1, 3, 4, 7, 9]
 * </pre>
 *
 * <p>Constraints:
 * <ul>
 *   <li>1 ≤ arr.length ≤ 10^3</li>
 *   <li>1 ≤ arr[i] ≤ 10^6</li>
 * </ul>
 *
 * @see <a href="https://www.geeksforgeeks.org/problems/selection-sort/1">GFG: Selection Sort (E)</a>
 */
public class SelectionSort {

    /**
     * Sorts the given array using Selection Sort algorithm.
     * <p>
     *     <b>Complexirt Analysis</b>
     *     <ul>
     *         <li>Time Complexity: O(n^2) in all cases (Best, Average, Worst)</li>
     *         <li>Space Complexity: O(1)</li>
     *     </ul>
     * </p>
     * @param arr
     */
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIdx = i;
            for (int j = i; j <= n - 1; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
                int temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
            }
        }
    }

    // Driver method to test above
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        selectionSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
