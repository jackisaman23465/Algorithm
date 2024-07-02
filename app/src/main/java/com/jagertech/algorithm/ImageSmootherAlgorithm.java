package com.jagertech.algorithm;

public class ImageSmootherAlgorithm {
    static int[][] directions = new int[][]{
            {-1,-1},
            {-1,0},
            {-1,1},
            {0,-1},
            {0,0},
            {0,1},
            {1,-1},
            {1,0},
            {1,1},
    };
    static public int[][] start(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] smootherImage = new int[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                int sum = 0;
                int validCount = 0;
                for(int[] direction: directions){
                    int newI = i+direction[0];
                    int newJ = j+direction[1];
                    if(newI < 0 || newI >= m || newJ < 0 || newJ >=n){
                        continue;
                    }
                    sum += img[newI][newJ];
                    validCount++;
                }
                smootherImage[i][j] = (int)Math.floor(sum/(float)validCount);
            }
        }
        return smootherImage;
    }
}
