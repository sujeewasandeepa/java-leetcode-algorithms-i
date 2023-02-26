package BinarySearch;

// [704] Binary Search
// Array, Binary Search


public class BinarySearch {
    // test cases
    int[] numsOne = {-1, 0, 3, 5, 9, 12};
    int targetOne = 9;
    public TestCase caseOne = new TestCase(numsOne, targetOne);


    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                left = middle+1;
            } else {
                right = middle-1;
            }
        }
        return -1;
    }
}