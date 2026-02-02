package main.java;

/**
 * <h4>Sort 0s, 1s and 2s</h4>
 * <hr>
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 * You must solve this problem without using the library's sort function.
 *
 * <p>Examples:
 * <ul>
 *   <li>Input: arr[] = [0, 1, 2, 0, 1, 2]</li>
 *   <li>Output: [0, 0, 1, 1, 2, 2]</li>
 *   <li>Input: arr[] = [2,0,2,1,1,0]</li>
 *   <li>Output: [0,0,1,1,2,2]</li>
 *   <li>Input: arr[] = [2,0,1]</li>
 *   <li>Output: [0,1,2]</li>
 * </ul>
 *
 * <p>Constraints:
 * <ul>
 *    <li>n == nums.length</li>
 *   <li>1 ≤ n ≤ 300</li>
 *   <li>nums[i] is either 0,1 and 2</li>
 * </ul>
 *
 * @see <a href="https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1">GFG: Sort 0s,1s and 2s (M)</a>
 * @see <a href="https://www.geeksforgeeks.org/problems/merge-sort/1">Leetcode: 75. Sort Colors (M)</a>
 */
public class Sort012 {

    /**
     * Sorts the given array using <b>Dutch National Flag Algorithm</b>.
     * 3-pointers
     * <p>
     *     <b>Complexity Analysis</b>
     *     <ul>
     *         <li>Time Complexity: O(n)</li>
     *         <li>Space Complexity: O(1)</li>
     *     </ul>
     * </p>
     * @param nums
     */
    public static void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0, mid = 0, high = n-1;
        while(mid <= high) {
            if(nums[mid] == 0) {
                // it has to be in the beginning
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, high, mid);
                high--;
            }
        }
    }
    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
        sortColors(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
