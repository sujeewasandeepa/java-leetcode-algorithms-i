package PermutationInString;

import testing.TestCase;

public class Solution {

    public TestCase caseOne = new TestCase("ab", "eidbaooo");
    public TestCase caseTwo = new TestCase("ab", "eidboaoo");

    public boolean checkInclusion(String s1, String s2) {

        int[] charCount = new int[26];
        for (char c: s1.toCharArray()) {
            charCount[c - 'a']++;
        }

        int left = 0;
        int right = 0;
        int count = s1.length();

        while (right < s2.length()) {
            if (charCount[s2.charAt(right++) - 'a']-- >= 1) {
                count--;
            }
            if (count == 0) {
                return true;
            }
            if (right - left == s1.length() && charCount[s2.charAt(left++) - 'a']++ >= 0) {
                count++;
            }
        }
        return false;
    }
}