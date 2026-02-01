package main.java;

/**
 * <h4>Prime Number</h4>
 * <hr>
 * Given a number n, determine whether it is a prime number or not.
 * <p>
 * <b>Note:</b> A prime number is a number greater than 1 that has no positive divisors other than 1 and itself.
 * <p>
 * <b>Examples:</b>
 * <ul>
 *   <li>Input: n = 7<br>
 *       Output: true<br>
 *       Explanation: 7 has exactly two divisors: 1 and 7, making it a prime number.</li>
 *   <li>Input: n = 25<br>
 *       Output: false<br>
 *       Explanation: 25 has more than two divisors: 1, 5, and 25, so it is not a prime number.</li>
 *   <li>Input: n = 1<br>
 *       Output: false<br>
 *       Explanation: 1 has only one divisor (1 itself), which is not sufficient for it to be considered prime.</li>
 * </ul>
 * <b>Constraints:</b>
 * <ul>
 *   <li>1 &le; n &le; 10<sup>9</sup></li>
 * </ul>
 * <b>Links:</b>
 * <ul>
 *   <li>GFG: <a href="https://www.geeksforgeeks.org/problems/prime-number2314/1">Prime Number (E)</a></li>
 * </ul>
 */
public class primeNumber {

    /**
     * <h5>Optimized Version</h5>
     * Determine if a number is prime.
     * <p>
     *     <b>Complexity Analysis:</b>
     *     <ul>
     *         <li>Time Complexity: O(√n), where n is the input
     *         number. We check for factors up to the square root of n.</li>
     *         <li>Space Complexity: O(1) as no extra space is used
     *         </li>
     *         </ul>
     * </p>
     * @param n
     * @return true if n is prime, false otherwise
     */
    public static boolean isPrime(int n) {
        // Check for edge cases
        if (n <= 1) {
            return false;
        }

        // Check for factors from 2 to less than sqrt(n)
        // not equal to sqrt(n) to avoid counting perfect squares as prime
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 25;
        boolean prime = isPrime(n);
        System.out.println(n + " is prime: " + prime);
    }
}
