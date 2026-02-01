package main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * <h4>Frequency of Elements:</h4>
 * <p>
 * Given an array arr[] of positive integers which may contain duplicate elements,
 * return the frequency of each distinct element.
 * <p>
 * <b>Examples:</b>
 * <pre>
 * Input: arr[] = [1, 2, 2, 3, 3, 5]
 * Output: [[1, 1], [2, 2], [3, 2], [5, 1]]
 * Explanation: Here element 1 and 5 occur 1 time, 2 and 3 occur 2 times.
 *
 * Input: arr[] = [1, 5, 6, 7, 7]
 * Output: [[1, 1], [5, 1], [6, 1], [7, 2]]
 * Explanation: Here element 1, 5 and 6 occur 1 time, 7 occurs 2 times.
 * </pre>
 * <b>Constraints:</b>
 * <ul>
 *   <li>1 ≤ arr.size() ≤ 10^5</li>
 *   <li>1 ≤ arr[i] ≤ 10^9</li>
 * </ul>
 * <b>Link:</b>
 * <a href="https://www.geeksforgeeks.org/problems/frequency-of-elements--111353/1">GFG: Frequency of Elements (E)</a>
 */
public class freqOfElements {

    /**
     * <h5>Brute Force Approach: Using visited boolean Array</h5>
     * Function to count frequency of each element in the array.
     * <p>
     *     <b>Complexity Analysis</b>
     *     <ul>
     *         <li>Time Complexity: O(n^2) in worst case, where n is the number of elements in the input array.
     *         This is because for each element, we may need to traverse the entire array to count its occurrences.</li>
     *         <li>Space Complexity: O(n) if we don't consider the output storage. The visited array takes O(n) space.</li>
     *     </ul>
     * </p>
     * @param arr
     * @return 2D ArrayList where each sublist contains an element and its frequency
     */
    public static ArrayList<ArrayList<Integer>> countFreq_brute(int[] arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int n = arr.length;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            // Skip this element if already processed
            if (visited[i]) {
                continue;
            }
            int count = 1; // Initialize count for current element
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true; // Mark as visited
                    count++;
                }
            }
            // Store the element and its frequency
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(arr[i]);
            temp.add(count);
            result.add(temp);
        }
        return result;
    }

    /**
     * <h5>Better Approach: Using HashMap</h5>
     * Function to count frequency of each element in the array.
     * <p>
     *     <b>Complexity Analysis</b>
     *     <ul>
     *         <li>Time Complexity: O(n), where n is the number of elements in the input array.
     *         This is because we traverse the array once to build the frequency map and then once more to construct the result.</li>
     *         <li>Space Complexity: O(k), where k is the number of distinct elements in the array.
     *         This is because we store each distinct element and its frequency in the HashMap.</li>
     *     </ul>
     * </p>
     * @param arr
     * @return 2D ArrayList where each sublist contains an element and its frequency
     */
    public static ArrayList<ArrayList<Integer>> countFreq_better(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        // Build frequency map with default values as 0
        for(int ele : arr) {
            // Increment the frequency count for the element
            freqMap.put(ele, freqMap.getOrDefault(ele, 0) + 1);
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        // Traversing the map to build the result
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(entry.getKey());
            temp.add(entry.getValue());
            ans.add(temp);
        }
        return ans;
    }

    // Driver method to test above methods
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 5};
        System.out.println("Frequency using Brute Force: " + countFreq_brute(arr));
        System.out.println("Frequency using Better Approach: " + countFreq_better(arr));
    }
}

