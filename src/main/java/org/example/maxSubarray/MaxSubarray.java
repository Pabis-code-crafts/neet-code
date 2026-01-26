package org.example.maxSubarray;

public class MaxSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4,6};
        int currentvalue = nums[0];
        int maxvalue = nums[0];


        for (int i = 0; i < nums.length; i++) {

            currentvalue = Math.max(nums[i], nums[i] + currentvalue);
            maxvalue = Math.max(maxvalue,currentvalue);

        }
        System.out.println(maxvalue);
    }
}
