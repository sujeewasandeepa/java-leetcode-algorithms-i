public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int [] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        } 
        
        List<List<Integer>> result = new ArrayList<>();

        if (k == 0 || n == 0) {
            return result;
        }

        List<Integer> current = new ArrayList<>();

        helper(result, current, nums, k, 0);

        return result;
    }
    
    public void helper(List<List<Integer>> result, List<Integer> current, int[] nums, int k, int index) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            helper(result, current, nums, k, i + 1);
            current.remove(current.size() - 1);
        }
    }
}