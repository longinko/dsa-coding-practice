package problems.array;

public class RemoveElement {

    //You are given an integer array nums and an integer val. Your task is to remove all occurrences of val from nums in-place.
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 4, 5};
        System.out.println(removeElement(nums, 1));

    }

    public static int removeElement(int[] nums, int val) {
        int nextValidElementPosition = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[nextValidElementPosition] = nums[i];
                nextValidElementPosition++;
            }
        }
        return nextValidElementPosition;
    }

}
