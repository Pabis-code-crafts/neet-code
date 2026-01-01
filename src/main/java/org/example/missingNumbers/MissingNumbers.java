package org.example.missingNumbers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] num= {1,2,2,3,5,4,7,8,3,3,3};
        HashSet<Integer> number = new HashSet<>();
        for (int x : num) {
            number.add(x);
        }

        ArrayList<Integer> val = new ArrayList<>();
        for (int i = 1; i <= num.length; i++) {
            if(!number.contains(i)){
                val.add(i);
            }
        }
        for (Integer value : val) {
            System.out.println(value);
        }
       // val.stream().forEach(a -> System.out.println(a));
    }
}
