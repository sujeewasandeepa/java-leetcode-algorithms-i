package UniqueBinarySearchTrees;

public class Solution {

    public int caseOne = 3;

    public int numTrees(int n) {
        if (n <= 1) {
            return 1;
        }

        int num_unique_trees = 0;

        for (int i=1; i<=n; i++) {
            num_unique_trees += numTrees(i-1) * numTrees(n-i);
        }

        return num_unique_trees;
    }
}
