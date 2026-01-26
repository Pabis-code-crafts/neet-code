package org.example.dp.countingBits;

import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        int valuesTill = 9;
        int dp[] = new int[valuesTill];
        int offset = 1;
        for (int i = 1; i < valuesTill; i++) {
            if (i==offset*2){
                offset=i;
            }
            dp[i] = 1+ dp[i - offset];
        }
        System.out.println(Arrays.toString(dp));
    }
}
