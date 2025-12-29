package org.example;

import org.example.solutionFour.SolutionFour;
import org.example.solutionOne.SolutionOne;
import org.example.solutionThree.SolutionThree;
import org.example.solutionTwo.SolutionTwo;
import org.example.topKFrequency.TopKFrequency;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        SolutionOne s = new SolutionOne();
        SolutionTwo s2 = new SolutionTwo();
        SolutionThree s3 = new SolutionThree();
        SolutionFour s4 = new SolutionFour();

        Integer[] arr = {1, 2, 3, 4, 5, 7, 6, 7};

        boolean result = s.hasDuplicate(arr);
        System.out.println("Has duplicate? " + result);

        boolean result2 = s2.isAnagram("abcd", "abcd");
        System.out.println("Is anagram " + result2);

        int[] valuesInArray = {1, 2, 3, 4, 5, 7, 6, 7};
        int target = 7;

        int[] result3 = s3.indecesOfSum(valuesInArray,target);
        System.out.println("indeces of sums " + Arrays.toString(result3));

        System.out.println(
                s4.groupAnagrams(
                        new String[]{"act","pots","tops","cat","stop","hat"}
                )
        );

        TopKFrequency result5 = new TopKFrequency();
        int[] val = result5.topKFrequent(new int[]{9, 8, 7, 9, 9, 8, 6, 5, 4, 1, 2, 2, 3},3);
        for (int x : val) {
            System.out.print(x + " ");
        }
        System.out.println();


    }
}