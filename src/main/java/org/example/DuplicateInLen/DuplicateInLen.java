package org.example.DuplicateInLen;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInLen {
     public static void main(String[] args) {
        int[] nums = {1,2,3,1,1};
        int k = 2;
        Set<Integer> set= new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i>k){
                 set.remove(nums[i-k-1]);
            }
            if(set.contains(nums[i])){
                System.out.println("true");
                return;
            }
            set.add(nums[i]);
        }
        System.out.println("false");
    }
}
