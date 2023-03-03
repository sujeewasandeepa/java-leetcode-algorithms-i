package testing;

public class TestCase {
    private int[] nums;
    private int target;
    private char[] chars;
    private String s;
    private String s2;
    private int sr;
    private int sc;
    private int[][] matrix;

    public TestCase(int[][] matrix, int sr, int sc, int color) {
        this.matrix = matrix;
        this.sr = sr;
        this.sc = sc;
        this.target = color;
    }

    public TestCase(String s) {
        this.s = s;
    }

    public TestCase(String s1, String s2) {
        this.s = s1;
        this.s2 = s2;
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

    public String getS2() {
        return s2;
    }

    public int getSr() {
        return sr;
    }

    public int getSc() {
        return sc;
    }

    public int[][] getMatrix() {
        return matrix;
    }
}
