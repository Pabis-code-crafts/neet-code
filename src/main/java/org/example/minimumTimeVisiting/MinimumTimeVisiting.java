package org.example.minimumTimeVisiting;

public class MinimumTimeVisiting {
    public static void main(String[] args) {
        int[][] mat = {
            {1,1},{2,3},{-1,-5}
        };
        int time = 0;
        for(int i=0;i<mat.length-1;i++){
            int dx = mat[i][0];
            int dy = mat[i][1];
            int dx1 = mat[i+1][0];
            int dy1 = mat[i+1][1];

            int x = Math.abs(dx-dx1);
            int y = Math.abs(dy-dy1);

            time+= Math.max(x,y);
        }
        System.out.println(time);
    }
}
