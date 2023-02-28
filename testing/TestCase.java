package testing;

public class TestCase {
    private int[] nums;
    private int target;
    private char[] chars;
    private String s;

    public TestCase(String s) {
        this.s = s;
    }
    
    public TestCase(char[] chars) {
        this.chars = chars;
    }

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

    public char[] getChars() {
        return chars;
    }

    public String getS() {
        return s;
    }
}
