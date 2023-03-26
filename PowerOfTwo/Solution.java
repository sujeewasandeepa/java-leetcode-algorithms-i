package PowerOfTwo;

class Solution {
    // need to read the explanation of this solution
    // https://leetcode.com/problems/power-of-two/discuss/63964/Using-nand(n-1)-trick
    
    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        while (n % 2 == 0) n /= 2;
        return n == 1;
    }
}