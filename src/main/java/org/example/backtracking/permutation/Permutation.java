package org.example.backtracking.permutation;

import java.util.ArrayList;
import java.util.List;


public class Permutation {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> res = new ArrayList<>();

        btPermutation(nums, 0, res);

        System.out.println(res);
    }

    private static void btPermutation(int[] nums, int index, List<List<Integer>> res) {

        if (nums.length == index) {
            ArrayList<Integer> curr = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                curr.add(nums[i]);
            }
            res.add(curr);
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swapNums(i,index, nums);
            btPermutation(nums,index+1,res);
            swapNums(i,index, nums);
        }

    }

    private static void swapNums(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
