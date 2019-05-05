package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] grid = {{0,0,0},
                {1,0,0}};
        System.out.println(islandPerimeter(grid));

    }

    public static int islandPerimeter(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    int count = 4;
                    if (j > 0) {
                        if (grid[i][j - 1] == 1) {
                            count--;
                        }
                    }
                    if (j < grid[i].length - 1) {
                        if (grid[i][j + 1] == 1) {
                            count--;
                        }
                    }
                    if (grid.length > 1) {
                        if (i < grid.length - 1) {
                            if (grid[i + 1][j] == 1) {
                                count--;
                            }
                        }
                        if (i > 0) {
                            if (grid[i - 1][j] == 1) {
                                count--;
                            }
                        }
                    }
                    result = result + count;
                }
            }
        }
        return result;
    }
}
