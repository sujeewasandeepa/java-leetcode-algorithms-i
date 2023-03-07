package RottingOranges;

import testing.TestCase;

public class Solution {

    public int orangesRotting(int[][] grid) {
        int[][] output = new int[grid.length][grid[0].length];

        int rows = grid.length;
        int cols = grid[0].length;

        int minutes = -1;
        int freshOranges = 0;

         Queue<int[]> queue = new ArrayDeque<>();

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (grid[i][j] == 1) {
                    freshOranges++;
                } else if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                }

            }
        }

        while (!queue.isEmpty()) {
            minutes++;
            int size = queue.size();

            for (int i=0; i<size; i++) {
                int[] rottenOrange = queue.poll();

                int x = rottenOrange[0];
                int y = rottenOrange[1];

                if (x > 0 && grid[x-1][y] == 1) {
                    grid[x-1][y] = 2;
                    freshOranges--;
                    queue.add(new int[]{x-1, y});
                }

                if (x < rows-1 && grid[x+1][y] == 1) {
                    grid[x+1][y] = 2;
                    freshOranges--;
                    queue.add(new int[]{x+1, y});
                }

                if (y > 0 && grid[x][y-1] == 1) {
                    grid[x][y-1] = 2;
                    freshOranges--;
                    queue.add(new int[]{x, y-1});
                }

                if (y < cols-1 && grid[x][y+1] == 1) {
                    grid[x][y+1] = 2;
                    freshOranges--;
                    queue.add(new int[]{x, y+1});
                }
            }
        }

        if (freshOranges != 0) {
            return -1;
        } else {
            if (minutes >= 0) {
                return minutes;
            } else {
                return 0;
            }
        }
    }
}