package org.example.islandBfs;

import java.util.LinkedList;
import java.util.Queue;

public class numberOfIslands {
    public static void main(String[] args) {
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','1','0'}
        };
        int totalRows = grid.length;
        int totalCol = grid[0].length;
        int islands = 0;
        int[][] directions = {{-1,0},{1,0},{0,-1},{0,1}};


        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalCol; j++) {
                if(grid[i][j]=='1'){
                    islands++;
                    islandChecker(grid,directions,i,j);
                }

            }
        }
        System.out.println(islands);




    }

    private static void islandChecker(char[][] grid, int[][] directions,int cRow, int cCol) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{cRow, cCol});
        grid[cRow][cCol]='0';

        while(!queue.isEmpty()){
            int[] cur = queue.poll();

            for (int i = 0; i < directions.length; i++) {
                int dir[] = directions[i];
                int r = cur[0] + dir[0];
                int c = cur[1] + dir[1];
                if(r>=0 &&  c>=0  && r<grid.length && c<grid[0].length && grid[r][c]=='1'){
                    queue.offer(new int[] {r,c});
                    grid[r][c] = '0';
                }
            }




        }


    }
}

// if(r>=0 &&  c>=0 && grid[r][c]=='1' && r<grid.length && c<grid[0].length)
// Always check boundaries first, then access grid[r][c]
// Prevents accidental ArrayIndexOutOfBoundsException
//

