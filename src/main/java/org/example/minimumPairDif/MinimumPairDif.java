package org.example.minimumPairDif;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumPairDif {
    public static void main(String[] args) {
        int[] nums = {4,2,3,1,6,7,8};
        Arrays.sort(nums);
        List<List<Integer>> lis = new ArrayList<>();
        int minimum = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            int sub = nums[i] - nums[i-1];
            minimum = Math.min(minimum,sub);
        }
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]-nums[i-1]==minimum){
                lis.add(Arrays.asList(nums[i-1],nums[i]));
            }
        }
        for(List<Integer> num : lis){
            System.out.println(num);
        }

    }
}

// sort,
