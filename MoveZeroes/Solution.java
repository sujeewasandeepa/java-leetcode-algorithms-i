package MoveZeroes;

import testing.TestCase;

public class Solution {

    int[] nums1 = {0,1,0,3,12};
    public TestCase caseOne = new TestCase(nums1);

    int[] nums2 = {0};
    public TestCase caseTwo = new TestCase(nums2);

    public int[] moveZeroes(int[] nums) {

        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }

        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }

        return nums;
    }
}