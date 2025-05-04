package problems.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 * <p>
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * <p>
 * Approach:
 * - Use a hashmap to store number → index mappings.
 * - For each number in array, check if (target - number) exists in the map.
 * - If found, return indices.
 * <p>
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class Ls_1_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seenNumbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seenNumbers.containsKey(complement)) {
                return new int[]{seenNumbers.get(complement), i};
            }
            seenNumbers.put(nums[i], i);
        }

        throw new IllegalArgumentException("No solution found.");
    }

    public static void main(String[] args) {
        Ls_1_TwoSum solver = new Ls_1_TwoSum();
        int[] result = solver.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}

