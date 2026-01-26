package org.example.dp.sumOfRange;

import java.util.Arrays;

public class SumOfRange {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        int[][] queries = {
                {0, 2},
                {1, 3},
                {2, 4}
        };

        int[] dp = new int[nums.length];

        dp[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            dp[i] = nums[i] + dp[i-1];
        }
        System.out.println(Arrays.toString(dp));
        for (int query = 0; query < queries.length; query++) {
            int[] query1 = queries[query];
            int left = query1[0]; //0
            int right = query1[1]; //2
            int value;
            if (left == 0) {
                value = dp[right];
            } else {
                value = dp[right] - dp[left - 1];
            }
            System.out.println(value);
        }



    }


}
