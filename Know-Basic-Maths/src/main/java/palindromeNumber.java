package main.java;

/**
 * <h4>Palindrome Number</h4>
 * <hr>
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * <p>
 * <b>Examples:</b>
 * <ul>
 *   <li>Input: x = 121, Output: true<br>
 *       Explanation: 121 reads as 121 from left to right and from right to left.</li>
 *   <li>Input: x = -121, Output: false<br>
 *       Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.</li>
 *   <li>Input: x = 10, Output: false<br>
 *       Explanation: Reads 01 from right to left. Therefore it is not a palindrome.</li>
 * </ul>
 * <b>Constraints:</b>
 * <ul>
 *   <li>-2<sup>31</sup> &le; x &le; 2<sup>31</sup> - 1</li>
 * </ul>
 * <b>Links:</b>
 * <ul>
 *   <li>Leetcode: <a href="https://leetcode.com/problems/palindrome-number/">Palindrome Number (E)</a></li>
 *   <li>GFG: <a href="https://www.geeksforgeeks.org/problems/palindrome0746/1">Palindrome (E)</a></li>
 * </ul>
 */
public class palindromeNumber {

    /**
     * Checks if an integer is a palindrome.
     * <p>
     *     <b>Complexity Analysis:</b>
     *     <ul>
     *         <li>Time Complexity: O(log<sub>10</sub>n), where n is the number of digits
     *         in the integer x.</li>
     *         <li>Space Complexity: O(1) as no extra space is used
     *         </li>
     *         </ul>
     * </p>
     *
     * @param x
     * @return true if x is a palindrome, false otherwise
     */
    public static boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (original > 0) {
            int digit = original % 10;
            reversed = reversed * 10 + digit;
            original /= 10;
        }

        return x == reversed;
    }

    public static void main(String[] args) {
        int number = 121;
        boolean result = isPalindrome(number);
        System.out.println("Is " + number + " a palindrome? " + result);
    }
}
