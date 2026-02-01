package main.java;

/**
 * <h4> Count Digits </h4>
 * <b><i>Easy</i></b>
 * <hr>
 * Given a natural number n. You have to find the number of digits in it and return it.
 *
 * <p>Examples:
 * <ul>
 *   <li>Input: n = 12, Output: 2</li>
 *   <li>Input: n = 456, Output: 3</li>
 * </ul>
 *
 * <p>Constraints: 1 ≤ n ≤ 10^5
 * @see <a href="https://www.geeksforgeeks.org/problems/count-digits-1606889545/1/">GFG: Count Digits</a>
 */
public class countDigits {

    /**
     * <h5>Brute Force Approach</h5>
     * Counts the number of digits in a natural number.
     * <p>
     *  <b>Complexity Analysis:</b>
     *  <ul>
     *      <li>Time Complexity: O(d), where d is the number of digits in n.</li>
     *      <li>Space Complexity: O(1) as no extra space is used
     *  </ul>
     * </p>
     * @param n the natural number
     * @return the number of digits in n
     * <br>
     */
    public static int countDigitsBrute(int n) {
        int c = 0;
        while(n > 0) {
            n /= 10;
            c++;
        }
        return c;
    }

    /**
     * <h5>Optimized Approach</h5>
     * Counts the number of digits in a natural number using logarithm.
     * <p>
     *  <b>Complexity Analysis:</b>
     *  <ul>
     *      <li>Time Complexity: O(1) as logarithm operation takes constant time.</li>
     *      <li>Space Complexity: O(1) as no extra space is used
     *  </ul>
     * </p>
     * @param n the natural number
     * @return the number of digits in n
     * <br>
     */
    public static int countDigitsOptimized(int n) {
        return (int)(Math.log10(n)) + 1;
    }

    public static void main(String[] args) {
        int n = 456; // You can change this value or use Scanner for user input

        int bruteResult = countDigitsBrute(n);
        int optResult = countDigitsOptimized(n);
        System.out.println("Brute Force Result: " + bruteResult);
        System.out.println("Optimized Result: " + optResult);
    }
}
