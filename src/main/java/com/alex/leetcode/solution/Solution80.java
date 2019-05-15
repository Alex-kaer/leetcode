package com.alex.leetcode.solution;

/**
 * @author Alex
 * @date 2019/5/15
 * @desc https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/
 */
public class Solution80 {


    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length <= 1) {
            return nums.length;
        }

        int i = 0;
        int j = 1;
        int count = 1;
        for (; i< nums.length - 1; i++) {
            if (!(nums[i] == nums[i+1])) {
                nums[j] = nums[i+1];
            }
            j++;
        }
        return j;
    }

}
