package org.example.hasDuplicates;

import java.util.HashSet;

public class HasDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,1,2};
        HashSet num = new HashSet<>();
        num.add(numbers);
        if(num.size() == numbers.length){
            System.out.println("false");
        }
        System.out.println("true");
    }

}
