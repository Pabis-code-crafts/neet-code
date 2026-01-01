package org.example.smallerNumbers;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallerNumber {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] temp = nums.clone();
        int[] ret = new int[nums.length];
        Arrays.sort(nums);
        System.out.println(Arrays.toString(temp));
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i],i);
        }
        for (int i = 0; i < temp.length;i++){
            ret[i] = map.get(temp[i]);
        }
        System.out.println(Arrays.toString(ret));



    }
}
