package testing;

public class TestCase {
    private int[] nums;
    private int target;
    
    public TestCase(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
    }

    public TestCase(int[] nums) {
        this.nums = nums;
    }
    
    public int[] getNums() {
        return nums;
    }
    
    public int getTarget() {
        return target;
    }
}
