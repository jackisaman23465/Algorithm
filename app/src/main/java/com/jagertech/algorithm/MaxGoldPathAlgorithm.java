package com.jagertech.algorithm;

public class MaxGoldPathAlgorithm {
    static int maxGold = 0;
    static int[] roww = {1, -1, 0, 0};
    static int[] coll = {0, 0, -1, 1};

    static public int checkIfAllZeros(int[][] grid) {
        int count = 0;
        for (int[] ints : grid) {
            for (int j = 0; j < grid[0].length; j++) {
                if (ints[j] != 0) count += ints[j];
                else return 0;
            }
        }
        return count;
    }

    static public void backtrack(int[][] grid, int x, int y, int count) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length) return;

        if (grid[x][y] != 0) {
            int curr = grid[x][y];
            grid[x][y] = 0;
            count += curr;
            maxGold = Math.max(maxGold, count);

            for (int i = 0; i < 4; i++) {
                int newX = x + roww[i];
                int newY = y + coll[i];
                backtrack(grid, newX, newY, count);
            }

            grid[x][y] = curr;
        }
    }

    static public int start(int[][] grid) {
        int count = checkIfAllZeros(grid);
        System.out.println(count);
        if (count != 0) return count;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) {
                    backtrack(grid, i, j, 0);
                }
            }
        }

        return maxGold;
    }
}
