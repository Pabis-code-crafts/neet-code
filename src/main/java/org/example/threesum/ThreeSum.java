package org.example.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length-2; i++) {
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = nums.length-1;

            while (left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum>0){
                    right--;
                } else if (sum<0) {
                    left++;
                }else{
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left<right && nums[left] == nums[left+1]) left++;
                    while(left<right && nums[right] == nums[right-1]) right--;
                    left++;
                    right--;
                }
            }
        }
        System.out.println(res);
    }

}

//“Any time I compare nums[left] with nums[left ± 1] or nums[right ± 1], I must ensure left < right.”
//
//Interview one-liner 🗣️
//
//“The left < right condition ensures safe index access and prevents pointer crossover during duplicate skipping.”