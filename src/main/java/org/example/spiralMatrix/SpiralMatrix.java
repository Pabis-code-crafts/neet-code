package org.example.spiralMatrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<List<Integer>> mat = new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        for(int i =0; i < matr.length; i++){
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < matr[0].length; j++) {
                row.add(matr[i][j]);
            }
            mat.add(row);
        }

        while(!mat.isEmpty()){
            res.addAll(mat.remove(0));

            for(List<Integer> row: mat){
                if(!row.isEmpty()){
                    res.add(row.remove(row.size()-1));
                }
            }

            if(!mat.isEmpty()){
                List<Integer> bottom = mat.remove(mat.size() -1);
                Collections.reverse(bottom);
                res.addAll(bottom);
            }

            for (int i = mat.size() - 1; i >= 0; i--) {
                if (!mat.get(i).isEmpty()) {
                    res.add(mat.get(i).remove(0));
                }
            }
        }
        res.stream().forEach(System.out::print);


    }



}

//Step 1: remove top row
//Step 2: remove last element of each remaining row
//Step 3: remove bottom row (reverse it)
//Step 4: remove first element of each row (bottom → top)
