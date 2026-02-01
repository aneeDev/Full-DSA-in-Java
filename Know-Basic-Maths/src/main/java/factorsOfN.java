package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * <h4>All Divisors of a Number</h4>
 * <hr>
 * Given an integer n, print all the divisors of n in ascending order.
 * <p>
 * <b>Examples:</b>
 * <ul>
 *   <li>Input: n = 20<br>
 *       Output: 1 2 4 5 10 20<br>
 *       Explanation: 20 is completely divisible by 1, 2, 4, 5, 10 and 20.</li>
 *   <li>Input: n = 21191<br>
 *       Output: 1 21191<br>
 *       Explanation: As 21191 is a prime number, it has only 2 factors (1 and the number itself).</li>
 * </ul>
 * <b>Constraints:</b>
 * <ul>
 *   <li>1 &le; n &le; 10<sup>9</sup></li>
 * </ul>
 * <b>Links:</b>
 * <ul>
 *   <li>GFG: <a href="https://www.geeksforgeeks.org/problems/all-divisors-of-a-number/0">All Divisors of a Number (E)</a></li>
 * </ul>
 */
public class factorsOfN {

    /**
     * <h5>Brute Force Approach</h5>
     * Prints all the divisors of a number using brute force approach.
     * <p>
     *     <b>Complexity Analysis:</b>
     *     <ul>
     *         <li>Time Complexity: O(n), where n is the input number.</li>
     *         <li>Space Complexity: O(1) as no extra space is used
     *         </li>
     *         </ul>
     *</p>
     *
     * @param n
     */
    public static void print_divisors_brute(int n) {
        System.out.println("Factors of " + n + " are: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     * <h5>Optimized Approach</h5>
     * Prints all the divisors of a number using optimized approach.
     * <p>
     *     <b>Complexity Analysis:</b>
     *     <ul>
     *         <li>Time Complexity: O(√n), where n is the input
     *         number.</li>
     *         <li>Space Complexity: O(√n) in the worst case when
     *         n is a perfect square, we store √n divisors in the list.</li>
     *         </ul>
     *</p>
     * @param n
     */
    public static void print_divisors_optimized(int n) {
        List<Integer> res = new ArrayList<>();
        System.out.println("Factors of " + n + " are: ");
        for (int i = 1; i*i <= n; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
                if(i != n/i) {
                    res.add(n/i); // will get print in decreasing order
                }
            }
        }

        // print the second half of factors in ascending order
        for(int i = res.size() - 1; i >= 0; i--) {
            System.out.print(res.get(i) + " ");
        }
    }


    public static void main(String[] args) {
        int n = 36;
        System.out.print("Brute Force Approach: ");
        print_divisors_brute(n);
        System.out.println();
        System.out.print("Optimized Approach: ");
        print_divisors_optimized(n);
    }
}
