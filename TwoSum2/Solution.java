package TwoSum2;

import testing.TestCase;

public class Solution {

    int[] nums1 = {2,7,11,15};
    int num1 = 9;
    public TestCase caseOne = new TestCase(nums1, num1);

    int[] nums2 = {2,3,4};
    int num2 = 6;
    public TestCase caseTwo = new TestCase(nums2, num2);

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] {left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {-1, -1};
    }
}