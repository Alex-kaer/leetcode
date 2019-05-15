package com.alex.leetcode.solution;

/**
 * @author Alex
 * @date 2019/5/14
 * @desc https://leetcode-cn.com/problems/remove-element/
 */
public class Solution27 {

    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

}
