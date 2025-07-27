package org.ak;

import java.util.HashMap;
import java.util.Map;

// Time Complexity: O(n), where n is the number of elements in the array. This is because we traverse through the array once, and for each element, we perform O(1) operations to calculate the complement and check if it is in the hashmap.

// Space Complexity: O(n), as in the worst case, we might have to store all the n elements in the hashmap.

public class TwoSum_1 {
    public int[] twoSum(int[] nums, int target) {
        // Create a map to store the numbers and their indices
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement of the current number
            int complement = target - nums[i];
            // If the complement is found in the map, return the indices
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            // Otherwise, add the number and its index to the map
            map.put(nums[i], i);
        }
        // Throw an exception if no solution is found
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        TwoSum_1 solution = new TwoSum_1();
        // Test the algorithm with example inputs
        int[] result1 = solution.twoSum(new int[]{2, 15, 11, 7}, 9);
        // Output the results
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]");
        //Output: [0, 3]

        int[] result2 = solution.twoSum(new int[]{3, 1, 4, 8, 5}, 9);
        System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]");
        // Output: [2, 4]

        int[] result3 = solution.twoSum(new int[]{10, 20, 30, 40, 50}, 90);
        System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]");
        // Output: [3, 4]
    }
}
