package RotateArray;

import testing.TestCase;

// [189] Rotate Array

public class Solution {

    int[] nums1 = {1,2,3,4,5,6,7};
    int k1 = 3;
    public TestCase caseOne = new TestCase(nums1, k1);

    int[] nums2 = {-1,-100,3,99};
    int k2 = 2;
    public TestCase caseTwo = new TestCase(nums2, k2);


    public int[] rotate(int[] nums, int k) {
        int right = nums.length - 1;
        int[] newArr = new int[nums.length];
        int index = 0;
        k = k % nums.length;

        for (int i = nums.length - k; i <= right; i++) {
            newArr[index] = nums[i];
            index ++;
        }

        for (int i=0; i < nums.length - k; i++) {
            newArr[index] = nums[i];
            index ++;
        }

        return newArr;
    }
}