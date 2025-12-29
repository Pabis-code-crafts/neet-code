package org.example.twoSum;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String args[]){
        int[] numbers = {1,2,3,4,5,7};
        int target = 6;
        HashMap<Integer,Integer> valuesAndIndex = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i <= numbers.length-1 ; i++) {

            int actual = target - numbers[i];
            if(valuesAndIndex.containsKey(actual)){
                res[0] = i;
                res[1] = valuesAndIndex.get(actual);
                System.out.println(Arrays.toString(res));
                return;
            }
            valuesAndIndex.putIfAbsent(numbers[i],i);
        }
    }
}
