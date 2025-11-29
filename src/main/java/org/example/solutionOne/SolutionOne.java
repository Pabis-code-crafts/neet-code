package org.example.solutionOne;

import java.util.HashSet;

public class SolutionOne {
    public boolean hasDuplicate(Integer[] nums) {
        System.out.println(nums);
        HashSet<Integer> numberSets = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (numberSets.contains(nums[i])) {
                return true;
            }
            numberSets.add(nums[i]);

        }
        return false;
    }
}
