package org.example.prac;

import java.util.*;

public class prac {
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        int[][] queries = {
                {0, 2},
                {2, 5},
                {0, 5}
        };

        int additionOfValue[] = new int[nums.length];
        additionOfValue[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            System.out.println(additionOfValue[i]);
            System.out.println(additionOfValue[i-1]);
            additionOfValue[i] = nums[i] + additionOfValue[i-1];
        }
        System.out.println(Arrays.toString(additionOfValue));
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            if(l==0){
                System.out.println(additionOfValue[r]);
            }else {
                System.out.println(additionOfValue[r]-additionOfValue[l-1]);
            }
        }

    }


}
