package org.example.backtracking.subset;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backTracking(arr,res,0,curr);
        System.out.println(res);
    }

    private static void backTracking(int[] arr, List<List<Integer>> res, int index, List<Integer> curr) {
        res.add(new ArrayList<>(curr));
        for (int i = index; i < arr.length; i++) {
            curr.add(arr[i]);
            backTracking(arr,res,i+1,curr);
            curr.remove(curr.size()-1);
        }
    }


}
