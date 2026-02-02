package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * <h4>Merge Sort</h4>
 * <hr>
 * Given an array arr[], its starting position l and its ending position r. Sort the array using the merge sort algorithm.
 *
 * <p>Examples:
 * <ul>
 *   <li>Input: arr[] = [4, 1, 3, 9, 7]</li>
 *   <li>Output: [1, 3, 4, 7, 9]</li>
 *   <li>Input: arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]</li>
 *   <li>Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]</li>
 * </ul>
 * <pre>
 * int[] arr = {4, 1, 3, 9, 7};
 * InsertionSort.sort(arr);
 * arr is now [1, 3, 4, 7, 9]
 * </pre>
 *
 * <p>Constraints:
 * <ul>
 *   <li>1 ≤ arr.length ≤ 10^5</li>
 *   <li>1 ≤ arr[i] ≤ 10^5</li>
 * </ul>
 *
 * @see <a href="https://www.geeksforgeeks.org/problems/merge-sort/1">GFG: Merge Sort (M)</a>
 */
public class MergeSort {

    /**
     * Sorts the given array using Merge Sort algorithm.
     * <p>
     *     <b>Complexity Analysis</b>
     *     <ul>
     *         <li>Time Complexity: O(nlog<sub>2</sub>n) for dividing and conquering the elements</li>
     *         <li>Space Complexity: O(n)</li>
     *     </ul>
     * </p>
     * @param arr
     */
    public static void mergeSort(int[] arr, int l, int r) {

        // when there is single element
        if(l >= r) return;

        int mid = (l+r)/2;
        mergeSort(arr, l, mid); // sort the first half
        mergeSort(arr, mid+1, r); // sort the second half
        merge(arr, l, mid, r); // merge the two arrays
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        List<Integer> temp = new ArrayList<>();
        int left = l; // pointer for the first array
        int right = mid+1; // pointer for the second array

        while(left <= mid && right <= r) {
            // first array element is small
            if(arr[left] <= arr[right]) {
                // insert in the array and increase the pointer
                temp.add(arr[left]);
                left++;
            } else {
                // second array element is small so insert and increase the pointer
                temp.add(arr[right]);
                right++;
            }
        }

        // after completing the any of the half append all the remaining elements
        while(left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while(right <= r) {
            temp.add(arr[right]);
            right++;
        }
        for(int i = l; i <= r; i++) {
            arr[i] = temp.get(i-l);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        mergeSort(arr, 0, arr.length-1);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
