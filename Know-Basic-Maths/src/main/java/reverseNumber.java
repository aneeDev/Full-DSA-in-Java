package main.java;

/**
 * <h4>Reverse Integer</h4>
 * <hr>
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-2<sup>31</sup>, 2<sup>31</sup> - 1], then return 0.
 * <p>
 * <b>Examples:</b>
 * <ul>
 *   <li>Input: x = 123, Output: 321</li>
 *   <li>Input: x = -123, Output: -321</li>
 *   <li>Input: x = 120, Output: 21</li>
 * </ul>
 * <b>Constraints:</b>
 * <ul>
 *   <li>-2<sup>31</sup> &le; x &le; 2<sup>31</sup> - 1</li>
 * </ul>
 * <b>Links:</b>
 * <ul>
 *   <li>Leetcode: <a href="https://leetcode.com/problems/reverse-integer/">7. Reverse Integer</a></li>
 *   <li>GFG: <a href="https://www.geeksforgeeks.org/reverse-digits-integer-overflow-handled/">Reverse digits</a></li>
 * </ul>
 */
public class reverseNumber {

    /**
     * Reverses the digits of a signed 32-bit integer.
     * <p>
     *     <b>Complexity Analysis:</b>
     *     <ul>
     *         <li>Time Complexity: O(log<sub>10</sub>n), where n is the number of digits
     *         in the integer x.</li>
     *         <li>Space Complexity: O(1) as no extra space is used
     *         </li>
     *         </ul>
     * </p>
     * @param x
     * @return the reversed integer or 0 if it overflows/underflows)
     */
    public static int reverse(int x) {
        int rev = 0;
        // negative sign is preserved as we are working with int type
        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check for overflow/underflow before multiplying by 10
            if (rev > Integer.MAX_VALUE || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow
            }
            if (rev < Integer.MIN_VALUE || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Underflow
            }
            rev = rev * 10 + digit;
        }
        return rev;
    }

    public static void main(String[] args) {
        int number = -12345;
        int reversedNumber = reverse(number);
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversedNumber);
    }
}
