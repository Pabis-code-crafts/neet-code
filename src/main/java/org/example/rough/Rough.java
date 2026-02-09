package org.example.rough;

import java.util.ArrayList;
import java.util.List;

public class Rough {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> res = new ArrayList<>();

        btPermutat(nums, 0, res);

        System.out.println(res);
    }

    private static void btPermutat(int[] nums, int index, List<List<Integer>> res) {
        if(nums.length == index){
            ArrayList<Integer> curr = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                curr.add(nums[i]);
            }
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swapNums(i,index,nums);
            btPermutat(nums,index+1,res);
            swapNums(i,index,nums);
        }
    }
    private static void swapNums(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }




}
