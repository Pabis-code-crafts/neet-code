package org.example.dp.climbingStairs;

public class ClimbingStairs {
    public static void main(String[] args) {
        int[] steps = {1,2};
        int target = 5;
        int[] dp = new int[target+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
         for (int s = 3; s <= target; s++) {
            dp[s] = dp[s-1] + dp[s-2];
        }
        System.out.println(dp[target]);
    }
}
