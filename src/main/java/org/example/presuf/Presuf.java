package org.example.presuf;

import java.util.Arrays;

public class Presuf {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        int n = nums.length;

        int sum = 0;

        // Step 1: total sum
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }

        int[] result = new int[n];

        // Step 2: subtract each element
        for (int i = 0; i < n; i++) {
            result[i] = sum - nums[i];
        }

        System.out.println(Arrays.toString(result));
    }

}
