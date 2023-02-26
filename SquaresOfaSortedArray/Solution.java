package SquaresOfaSortedArray;

import testing.TestCase;

public class Solution {

    int[] nums1 = {-4,-1,0,3,10};
    public TestCase caseOne = new TestCase(nums1);

    public int[] sortedSquares(int[] nums) {
        int length = nums.length;

        int[] squares = new int[length];

        for (int i = 0; i < length; i++) {
            squares[i] = nums[i] * nums[i];
        }

        for (int i = 1; i < length; i++) {
            int key = squares[i];
            int j = i - 1;
            
            while (j >= 0 && squares[j] > key) {
                squares[j + 1] = squares[j];
                j = j - 1;
            }

            squares[j + 1] = key;
        }
        return squares;
    }
}