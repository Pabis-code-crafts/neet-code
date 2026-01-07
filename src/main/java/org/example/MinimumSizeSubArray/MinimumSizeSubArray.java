package org.example.MinimumSizeSubArray;

public class MinimumSizeSubArray {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4,2};
        int k = 7;
        int l=0;
        int r;
        int val=0;
        int minimum = Integer.MAX_VALUE;
        for ( r=0 ; r < nums.length; r++) {
            val = val+ nums[r];
            while(val>=k){
                minimum = Math.min(minimum,r-l+1);
                val = val - nums[l];
                l=l+1;
            }
        }
        System.out.println(minimum);
    }
}
