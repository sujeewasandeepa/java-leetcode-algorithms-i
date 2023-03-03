package FloodFill;

import testing.TestCase;

public class Solution {

    public TestCase caseOne = new TestCase(new int[][] {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2);
    public TestCase caseTwo = new TestCase(new int[][] {{0, 0, 0}, {0, 0, 0}}, 0, 0, 0);

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int starting_val = image[sr][sc];
        int top = sr - 1;
        int bottom = sr + 1;
        int left = sc - 1;
        int right = sc + 1;

        int [][] visited = new int[image.length][image[0].length];

        if (starting_val == color) {
            return image;
        }

        image[sr][sc] = color;
        visited[sr][sc] = 1;

        if (top >= 0 && visited[top][sc] == 0 && image[top][sc] == starting_val) {
            floodFill(image, top, sc, color);
        }

        if (bottom < image.length && visited[bottom][sc] == 0 && image[bottom][sc] == starting_val) {
            floodFill(image, bottom, sc, color);
        }

        if (left >= 0 && visited[sr][left] == 0 && image[sr][left] == starting_val) {
            floodFill(image, sr, left, color);
        }

        if (right < image[0].length && visited[sr][right] == 0 && image[sr][right] == starting_val) {
            floodFill(image, sr, right, color);
        }
        return image;
    }
}