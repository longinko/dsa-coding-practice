package problems.array;

//You are given an integer array nums of length n. Create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
public class ConcatenationOfArray {

    public static void main(String[] args) {
        int[] nums = {1, 4, 1, 2};
        int[] ans = getConcetenation(nums);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    private static int[] getConcetenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];
        for (int i = 0; i < n; i++) {
            ans[i] = ans[i + n] = nums[i];
        }
        return ans;
    }
}
