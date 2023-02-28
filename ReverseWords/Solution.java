package ReverseWords;

import testing.TestCase;

public class Solution {

    String s1 = "Let's take the Leetcode contest";
    String s2 = "God Ding";

    public TestCase caseOne = new TestCase(s1);
    public TestCase caseTwo = new TestCase(s2);

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }
        return String.join(" ", words);
    }
}