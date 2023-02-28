package ReverseString;

import testing.TestCase;

public class Solution {
    char[] s1 = {'h', 'e', 'l', 'l', 'o'};
    char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};

    public TestCase caseOne = new TestCase(s1);
    public TestCase caseTwo = new TestCase(s2);

    public char[] reverseString(char[] s) {
        int i = 0;
        int j = s.length;

        while (i < j) {
            char temp = s[i];
            s[i] = s[j - 1];
            s[j - 1] = temp;
            i++;
            j--;
        }

        return s;
    }
}