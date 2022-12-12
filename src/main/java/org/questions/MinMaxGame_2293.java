package org.questions;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class MinMaxGame_2293 {
    public static void main(String[] args) {
        int[] nums = new int[] {1,3,5,2,4,8,2,2};
        int result = minMaxGame(nums);
        System.out.println(result);
    }

    public static int minMaxGame(int[] nums) {
        int[] newNums;
        while (nums.length != 1) {
            newNums = new int[nums.length / 2];
            for (int i = 0; i < newNums.length; i++) {
                newNums[i] = (i % 2 == 0) ? min(nums[2 * i], nums[2 * i + 1]) : max(nums[2 * i], nums[2 * i + 1]);
            }

            nums = newNums;
        }

        return nums[0];
    }
}
