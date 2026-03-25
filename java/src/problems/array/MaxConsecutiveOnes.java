package problems.array;

//You are given a binary array nums, return the maximum number of consecutive 1's in the array.
public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};

        System.out.print(countOnes(nums));
    }

    public static int countOnes(int[] nums) {
        int counter = 0;
        int currentMax = 0;

        for (int num : nums) {
            if (num == 0) {
                currentMax = Math.max(counter, currentMax);
                counter = 0;
            } else {
                counter++;
            }
        }
        return Math.max(counter, currentMax);
    }
}
