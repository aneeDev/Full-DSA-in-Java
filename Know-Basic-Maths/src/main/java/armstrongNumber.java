package main.java;

/**
 * <h4>Armstrong Number</h4>
 * <hr>
 * Given an integer n, return true if and only if it is an Armstrong number.
 * <p>
 * The k-digit number n is an Armstrong number if and only if the k-th power of each digit sums to n.
 * <p>
 * <b>Examples:</b>
 * <ul>
 *   <li>Input: n = 153, Output: true<br>
 *       Explanation: 153 is a 3-digit number, and 153 = 1<sup>3</sup> + 5<sup>3</sup> + 3<sup>3</sup>.</li>
 *   <li>Input: n = 123, Output: false<br>
 *       Explanation: 123 is a 3-digit number, and 123 != 1<sup>3</sup> + 2<sup>3</sup> + 3<sup>3</sup> = 36.</li>
 * </ul>
 * <b>Constraints:</b>
 * <ul>
 *   <li>1 &le; n &le; 10<sup>8</sup></li>
 * </ul>
 * <b>Links:</b>
 * <ul>
 *   <li>GFG: <a href="https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1">Armstrong Numbers</a></li>
 *   <li>Leetcode: <a href="https://leetcode.com/problems/armstrong-number/">1134. Armstrong Number</a></li>
 * </ul>
 */
public class armstrongNumber {

    public static boolean isArmstrong(int n) {

        int originalNumber = n;
        int sum = 0;
        int numberOfDigits = String.valueOf(n).length();

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, numberOfDigits);
            n /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        int n1 = 153;

        System.out.println(n1 + " is Armstrong: " + isArmstrong(n1)); // true
    }
}
