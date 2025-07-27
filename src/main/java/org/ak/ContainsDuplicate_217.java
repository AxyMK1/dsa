package org.ak;

// https://leetcode.com/problems/contains-duplicate/

// Time Complexity: The algorithm takes O(n) where N is the number of elements in the input array. This is because we iterate the array only once.

// Space Complexity: The algorithm takes O(n) as it stores the numbers in a set.

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_217 {
    public boolean containsDuplicate(int[] nums) {
        // Use HashSet to store unique elements
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) {
                // If the set already contains the current element, return true
                return true;
            } else {
                set.add(n);
            }
        }
        // Return false if no duplicates found
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate_217 solution = new ContainsDuplicate_217();

        int[] nums1 = {1, 2, 3, 4};
        System.out.println(solution.containsDuplicate(nums1)); // Expected output: false

        int[] nums2 = {1, 2, 3, 1};
        System.out.println(solution.containsDuplicate(nums2)); // Expected output: true

        int[] nums3 = {};
        System.out.println(solution.containsDuplicate(nums3)); // Expected output: false

        int[] nums4 = {1, 1, 1, 1};
        System.out.println(solution.containsDuplicate(nums4)); // Expected output: true
    }
}
