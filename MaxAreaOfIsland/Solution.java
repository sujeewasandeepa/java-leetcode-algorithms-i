package MaxAreaOfIsland;

import testing.TestCase;

public class Solution {

    int [][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                     {0,0,0,0,0,0,0,1,1,1,0,0,0},
                     {0,1,1,0,1,0,0,0,0,0,0,0,0},
                     {0,1,0,0,1,1,0,0,1,0,1,0,0},
                     {0,1,0,0,1,1,0,0,1,1,1,0,0},
                     {0,0,0,0,0,0,0,0,0,0,1,0,0},
                     {0,0,0,0,0,0,0,1,1,1,0,0,0},
                     {0,0,0,0,0,0,0,1,1,0,0,0,0}};

    int [][] grid2 = {{0,0,0,0,0,0,0,0}};

    public TestCase caseOne = TestCase(grid);  
    public TestCase caseTwo = TestCase(grid2);

    public int maxAreaOfIsland(int[][] grid) {
    
        int maxArea = 0;
        int currentArea = 0;
        int row = grid.length;
        int col = grid[0].length;
        boolean [][] visited = new boolean[row][col];
    
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    currentArea = dfs(grid, i, j, visited);
                    maxArea = Math.max(maxArea, currentArea);
                }
            }
        }
    
        return maxArea;

    }

    public int dfs(int[][] grid, int i, int j, boolean[][] visited) {
    
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0 || visited[i][j]) {
            return 0;
        }
    
        visited[i][j] = true;
    
        return 1 + dfs(grid, i + 1, j, visited) + dfs(grid, i - 1, j, visited) + dfs(grid, i, j + 1, visited) + dfs(grid, i, j - 1, visited);
    }

}