package main.java;

/**
 * <h4>GCD of Two Numbers</h4>
 * <hr>
 * Given two positive integers a and b, find the <a href="https://www.geeksforgeeks.org/maths/greatest-common-divisor-gcd/">GCD</a> (Greatest Common Divisor) of a and b.
 * <p>
 * <b>Note:</b> Do not use the inbuilt gcd function.
 * <p>
 * <b>Examples:</b>
 * <ul>
 *   <li>Input: a = 20, b = 28<br>
 *       Output: 4<br>
 *       Explanation: GCD of 20 and 28 is 4.</li>
 *   <li>Input: a = 60, b = 36<br>
 *       Output: 12<br>
 *       Explanation: GCD of 60 and 36 is 12.</li>
 * </ul>
 * <b>Constraints:</b>
 * <ul>
 *   <li>1 &le; a, b &le; 10<sup>9</sup></li>
 * </ul>
 * <b>Links:</b>
 * <ul>
 *   <li>GFG: <a href="https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1">GCD of Two Numbers (E)</a></li>
 * </ul>
 */
public class gcdOf2Numbers {

    /**
     * Function to return gcd of a and b using Euclidean algorithm
     * <p>
     *     <b>Complexity Analysis:</b>
     *     <ul>
     *         <li>Time Complexity: O(log(min(a, b))), where a and b are the input numbers.
     *         In each step, the size of the numbers reduces significantly.</li>
     *         <li>Space Complexity: O(1) as no extra space is used</li>
     *     </ul>
     * </p>
     * @param a
     * @param b
     * @return gcd of a and b int
     */
    public static int gcd(int a, int b) {
        while (a>0 && b>0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0)
            return b;
        return a;
    }

    public static void main(String[] args) {
        int a = 20;
        int b = 28;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }
}
