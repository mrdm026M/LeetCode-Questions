package org.questions;

public class TwoSum_1 {
    public static void main(String[] args) {
        int target = 6;
        int[] nums = new int[]{ 3, 2, 4 };
        int[] output = twoSum(nums, target);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    output[0] = i;
                    output[1] = j;
                }
            }
        }

        return output;
    }
}
