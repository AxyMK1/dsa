package org.ak;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169 {
    public int majorityElement(int[] nums) {
        // Boyer–Moore majority vote algorithm
        // Time Complexity : O(n) where n is number of elements in input array
        // Space Complexity : O(1) as constant extra space used; 2 variables to keep track
        int major = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                major = num;
            }

            if (num == major) {
                ++count;
            } else {
                --count;
            }
        }

        return major;
    }

    public int majorityElementSort(int[] nums) {
        // sorting
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public int majorityElementHashMap(int[] nums) {

        // using hashmap
        Map<Integer, Integer> map = new HashMap<>();
        var maxCount = 0;
        var major = 0;

        for (var num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }

            if (map.get(num) > maxCount) {
                major = num;
            }
            maxCount = Math.max(map.get(num), maxCount);
        }

        return major;
    }

    public static void main(String[] args) {
        MajorityElement_169 solution = new MajorityElement_169();

        int[] nums1 = {3, 2, 3};
        System.out.println(solution.majorityElement(nums1)); // expected 3

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(solution.majorityElement(nums2)); // expected 2
    }
}
