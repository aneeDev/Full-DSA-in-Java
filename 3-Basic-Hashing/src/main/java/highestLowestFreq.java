package main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Highest and Lowest Frequency of an Element in an Array
 * <p>
 * Given an array arr[] of positive integers which may contain duplicate elements,
 * return the highest and lowest frequency element.
 * <p>
 * <b>Examples:</b>
 * <pre>
 * Input: arr[] = [10, 5, 10, 15, 10, 5]
 * Output: 10 15
 * Explanation: Here element 10 and 15 occur 3 times and 1 time respectively.
 *
 * Input: arr[] = [2, 2, 3, 4, 4, 2]
 * Output: 2 3
 * Explanation: Here element 2 and 3 occur 3 and 1 time respectively.
 * </pre>
 * <b>Constraints:</b>
 * <ul>
 *   <li>1 ≤ arr.size() ≤ 10^5</li>
 *   <li>1 ≤ arr[i] ≤ 10^9</li>
 * </ul>
 */
public class highestLowestFreq {

    /**
     * <h5>Brute Force Approach: Using visited boolean Array</h5>
     * Function to count highest and lowest frequency element in the array.
     * <p>
     *     <b>Complexity Analysis</b>
     *     <ul>
     *         <li>Time Complexity: O(n^2) in worst case, where n is the number of elements in the input array.
     *         This is because for each element, we may need to traverse the entire array to count its occurrences.</li>
     *         <li>Space Complexity: O(n) if we don't consider the output storage. The visited array takes O(n) space.</li>
     *     </ul>
     * </p>
     * @param arr
     * @return List containing highest frequency element and lowest frequency element
     */
    public static List<Integer> countFreq_brute(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int maxFreq = 0, maxFreqElem = 0;
        int minFreq = n, minFreqElem = 0;
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

            if (count >  maxFreq) {
                maxFreqElem = arr[i];
                maxFreq = count;
            }
            if (count < minFreq) {
                minFreqElem = arr[i];
                minFreq = count;
            }
        }
        ans.add(maxFreqElem);
        ans.add(minFreqElem);
        return ans;
    }

    /**
     * <h5>Better Approach: Using HashMap</h5>
     * Function to count highest and lowest frequency element in the array.
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
     * @return List containing highest frequency element and lowest frequency element
     */
    public static List<Integer> countFreq_better(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        // Build frequency map with default values as 0
        for(int ele : arr) {
            // Increment the frequency count for the element
            freqMap.put(ele, freqMap.getOrDefault(ele, 0) + 1);
        }

        List<Integer> ans = new ArrayList<>();
        int maxFreq = 0, maxFreqElem = 0;
        int minFreq = arr.length, minFreqElem = 0;

        // Traversing the map to build the result
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int element = entry.getKey();
            int frequency = entry.getValue();
            if (frequency > maxFreq) {
                maxFreqElem = element;
                maxFreq = frequency;
            }
            if (frequency < minFreq) {
                minFreqElem = element;
                minFreq = frequency;
            }
        }
        ans.add(maxFreqElem);
        ans.add(minFreqElem);
        return ans;
    }

    // Driver method to test above methods
    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 15, 10, 5};
        System.out.println("Frequency using Brute Force: " + countFreq_brute(arr));
        System.out.println("Frequency using Better Approach: " + countFreq_better(arr));
    }
}
