package org.example.backtracking.combination;

import java.util.ArrayList;
import java.util.List;



public class combination {
    public static void main(String[] args) {
        int k = 4;
        int n = 2;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(res,1, curr, n, k);
        System.out.println(res);

    }

    private static void backtrack(List<List<Integer>> res, int index, List<Integer> curr, int n,int k) {
        if(curr.size() == n){
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int j = index; j <= k; j++) {
            curr.add(j);
            backtrack(res,j+1, curr, n, k);
            curr.remove(curr.size()-1);
        }
    }
}
