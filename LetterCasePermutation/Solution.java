class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();

        if (s == null || s.length() == 0) {
            return result;
        }

        helper(result, s.toCharArray(), 0);

        return result;
    }
    public void helper(List<String> result, char[] s, int index) {
        if (index == s.length) {
            result.add(new String(s));
            return;
        }

        if (Character.isDigit(s[index])) {
            helper(result, s, index + 1);
        } else {
            s[index] = Character.toLowerCase(s[index]);
            helper(result, s, index + 1);
            s[index] = Character.toUpperCase(s[index]);
            helper(result, s, index + 1);
        }
    }
}