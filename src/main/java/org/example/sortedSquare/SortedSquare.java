package org.example.sortedSquare;

import java.util.Arrays;

public class SortedSquare {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int numsLength = nums.length;
        int[] res = new int[numsLength];
        int left = 0;
        int right = numsLength - 1;
        int index = numsLength - 1;

        while(left<=right){
            int leftNumber = nums[left] * nums[left];
            int rightNumber = nums[right] * nums[right];
            if(leftNumber>rightNumber){
                res[index] = leftNumber;
                left++;
            }else{
                res[index] = rightNumber;
                right--;
            }

            index--;
        }

        System.out.println(Arrays.toString(res));
    }
}
