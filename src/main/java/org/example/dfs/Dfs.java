package org.example.dfs;

public class Dfs {
    public static void main(String[] args) {

        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','1','0'}
        };

        int[][] dir = {{-1,0},{0,-1},{1,0},{0,1}};
        int islands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]=='1'){
                    islands++;
                    islandchecker(grid, i, j);
                }
            }
        }
        System.out.println("islands : " + islands);
    }

    private static void islandchecker(char[][] grid, int row, int col) {
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == '0'){
            return;
        }
        grid[row][col] = '0';
        islandchecker(grid,row-1,col);
        islandchecker(grid,row,col-1);
        islandchecker(grid,row,col+1);
        islandchecker(grid,row+1,col);

    }
}
