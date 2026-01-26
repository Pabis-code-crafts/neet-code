package org.example.dp.fibonaci;

import java.util.Arrays;

public class Fibonachi {
    public static void main(String[] args) {
        int val1 = 0;
        int val2 = 1;
        int target = 10;
        int[] list = new int[target];
        list[0] = val1;
        list[1] = val2;
        for (int i = 2; i < target; i++) {
            list[i] = list[i-1]+list[i-2];
        }
        System.out.println(Arrays.toString(list));
    }
}
