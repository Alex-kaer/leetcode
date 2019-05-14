package com.alex.leetcode.solution;

/**
 * @author Alex
 * @date 2019/5/14
 * @desc https://leetcode-cn.com/problems/remove-element/
 */
public class Solution27 {

    public int removeElement(int[] nums, int val) {

        int start = 0;
        int end = nums.length - 1;
        while (end > start) {
            if (nums[start] != val) {
                start ++;
            }else {

                while (nums[end] == val && end > start) {
                    end --;
                }
                change(nums, start, end);
            }
        }
        return start + 1;
    }


    private void change(int[] nums, int i, int j) {
        int m = nums[i];
        nums[i] = nums[j];
        nums[j] = m;
    }

}
