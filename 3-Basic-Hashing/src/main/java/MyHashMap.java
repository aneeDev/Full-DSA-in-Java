package main.java;

import java.util.Arrays;

/**
 * <h4>Design HashMap</h4>
 * <b><i>Easy / Medium</i></b>
 * <hr>
 * Design a HashMap without using any built-in hash table libraries.
 *
 * <p>Implement the <b>MyHashMap</b> class:
 * <ul>
 *   <li><b>MyHashMap()</b> initializes the object with an empty map.</li>
 *   <li><b>void put(int key, int value)</b> inserts a (key, value) pair into the HashMap. If the key already exists in the map, update the corresponding value.</li>
 *   <li><b>int get(int key)</b> returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.</li>
 *   <li><b>void remove(int key)</b> removes the key and its corresponding value if the map contains the mapping for the key.</li>
 * </ul>
 *
 * <p>Example:
 * <ul>
 *   <li>Input: ["MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"]</li>
 *   <li>       [[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]]</li>
 *   <li>Output: [null, null, null, 1, -1, null, 1, null, -1]</li>
 * </ul>
 * <pre>
 * MyHashMap myHashMap = new MyHashMap();
 * myHashMap.put(1, 1); // The map is now [[1,1]]
 * myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
 * myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
 * myHashMap.get(3);    // return -1 (not found), The map is now [[1,1], [2,2]]
 * myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (update existing value)
 * myHashMap.get(2);    // return 1, The map is now [[1,1], [2,1]]
 * myHashMap.remove(2); // remove mapping for 2, The map is now [[1,1]]
 * myHashMap.get(2);    // return -1 (not found), The map is now [[1,1]]
 * </pre>
 *
 * <p>Constraints:
 * <ul>
 *   <li>0 ≤ key, value ≤ 10^6</li>
 *   <li>At most 10^4 calls will be made to put, get, and remove.</li>
 * </ul>
 *
 * @see <a href="https://www.geeksforgeeks.org/problems/design-hashmap/1">GFG: Design HashMap</a>
 * @see <a href="https://leetcode.com/problems/design-hashmap/description/">Leetcode: 706. Design HashMap</a>
 */
public class MyHashMap {

    int[] map;

    // Initialize your data structure here.
    public MyHashMap() {
        map = new int[1000001];
        Arrays.fill(map,-1);
    }

    // method to compute hash i.e insert key value pair
    public void put(int key, int value) {
        map[key] = value;
    }

    // method to get value for a key
    public int get(int key) {
        return map[key];
    }

    // method to remove a key value pair
    public void remove(int key) {
        map[key] = -1;
    }

    // Driver code to test the above methods
    public static void main(String[] args) {
        String[] commands = {"MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"};
        int[][] params = { {}, {1, 1}, {2, 2}, {1}, {3}, {2, 1}, {2}, {2}, {2} };
        Object[] output = new Object[commands.length];

        MyHashMap myHashMap = null;

        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case "MyHashMap":
                    myHashMap = new MyHashMap();
                    output[i] = null;
                    break;
                case "put":
                    myHashMap.put(params[i][0], params[i][1]);
                    output[i] = null;
                    break;
                case "get":
                    output[i] = myHashMap.get(params[i][0]);
                    break;
                case "remove":
                    myHashMap.remove(params[i][0]);
                    output[i] = null;
                    break;
            }
        }

        System.out.print("[");
        for (int i = 0; i < output.length; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(output[i]);
        }
        System.out.println("]");
    }

}
