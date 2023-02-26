package SearchInsertPosition;

public class SearchInsertPosition {
    // Test Cases
    int[] numsOne = {1, 3, 5, 6};
    int targetOne = 5;

    int[] numsTwo = {1, 3, 5, 6};
    int targetTwo = 2;

    int [] numsThree = {1, 3, 5, 6};
    int targetThree = 7;

    public TestCase caseOne = new TestCase(numsThree, targetThree);
    
    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int suitableIndex = 0;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            suitableIndex = middle;

            if (nums[middle] == target) {
                return middle;
            } else if(nums[middle] > target) {
                right = middle - 1;
            } else if(nums[middle] < target) {
                left = middle + 1;
            } else {
                return middle;
            }
        }

        if (nums[suitableIndex] < target){
            suitableIndex ++;
        }
        return suitableIndex;

    }
}