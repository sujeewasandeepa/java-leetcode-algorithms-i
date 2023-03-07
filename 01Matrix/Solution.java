package 01Matrix;

public class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[][] output = new int[mat.length][mat[0].length];

        int rows = mat.length;
        int cols = mat[0].length;

        if (rows == 0) return mat;

        // First pass: Top-Left to Bottom-Right
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 0) {
                    output[i][j] = 0;
                } else {
                    output[i][j] = Integer.MAX_VALUE - 1;
                    if (i > 0) {
                        output[i][j] = Math.min(output[i][j], output[i - 1][j] + 1);
                    }
                    if (j > 0) {
                        output[i][j] = Math.min(output[i][j], output[i][j - 1] + 1);
                    }
                }
            }
        }

        // Second pass: Bottom-Right to Top-Left
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 0; j--) {
                if (i < rows - 1) {
                    output[i][j] = Math.min(output[i][j], output[i + 1][j] + 1);
                }
                if (j < cols - 1) {
                    output[i][j] = Math.min(output[i][j], output[i][j + 1] + 1);
                }
            }
        }

        return output;
    }        
        // int[][] output = new int[mat.length][mat[0].length];

        // int rows = mat.length;
        // int cols = mat[0].length;

        // if (rows == 0) return mat;

        // for (int i=0; i<rows; i++) {
        //     for (int j=0; j<cols; j++) {
        //         if (mat[i][j] == 0 ) {
        //             output[i][j] = 0;
        //         } else {
        //             if (i > 0) {
        //                 output[i][j] = output[i-1][j] + 1;
        //             } 
        //             if (j > 0) {
        //                 output[i][j] = output[i][j-1] + 1;
        //             }
        //         }
        //     }
        // }

        // for (int i=rows-1; i>=0; i--) {
        //     for (int j=cols-1; j>=0; j--) {
        //         if (mat[i][j] == 0 ) {
        //             output[i][j] = 0;
        //         } else {
        //             if (i < rows-1) {
        //                 output[i][j] = Math.min(output[i][j], output[i+1][j] + 1);
        //             } 
        //             if (j < cols-1) {
        //                 output[i][j] = Math.min(output[i][j], output[i][j+1] + 1);
        //             }
        //         }
        //     }
        // }
        // for (int i=rows-1; i>=0; i--) {
        //     for (int j=cols-1; j>=0; j--) {
        //         if (mat[i][j] == 0 ) {
        //             output[i][j] = 0;
        //         } else {
        //             if (i < rows-1) {
        //                 output[i][j] = Math.min(output[i][j], output[i+1][j] + 1);
        //             } 
        //             if (j < cols-1) {
        //                 output[i][j] = Math.min(output[i][j], output[i][j+1] + 1);
        //             }
        //             // fix: use top-left neighbors instead of bottom-right neighbors
        //             if (i > 0) {
        //                 output[i][j] = Math.min(output[i][j], output[i-1][j] + 1);
        //             } 
        //             if (j > 0) {
        //                 output[i][j] = Math.min(output[i][j], output[i][j-1] + 1);
        //             }
        //         }
        //     }
        
        // }
    
}