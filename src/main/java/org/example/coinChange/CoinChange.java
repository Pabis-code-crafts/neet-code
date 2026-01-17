package org.example.coinChange;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1); // why not integer.max but highest value? for this coin value it will work. but for majority it wont work.
        dp[0] = 0;

        for (int i = 1; i < dp.length; i++) {
            for(int coin:coins){
                if(i>=coin){
                    dp[i] = Math.min(dp[i],dp[i-coin] +1);
                }
            }
        }
        System.out.println(dp[amount]);
    }
}
//*“Dynamic Programming works when a problem has optimal substructure and overlapping subproblems.
//In Coin Change, the problem has optimal substructure because the minimum number of coins needed for an amount depends on the minimum coins needed for smaller amounts. For example, if I use a coin of value c as the last coin, then the solution for amount i depends on the solution for i − c.
//
//It also has overlapping subproblems because while computing different amounts, the same smaller amounts like 1, 2, or 3 are needed repeatedly. Instead of recomputing them, we store their results in a DP array.
//
//I define dp[i] as the minimum coins required to make amount i, initialize all values to a large number, and set dp[0] = 0. Then for each amount, I try all coins and update dp[i] using previously computed values.
//
//Finally, if the target amount is still unreachable, I return -1; otherwise, I return dp[amount].”*