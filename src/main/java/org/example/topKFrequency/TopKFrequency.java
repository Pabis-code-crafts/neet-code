package org.example.topKFrequency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequency {
    public static void main(String[] args) {
        int[] nums = {1, 4, 2, 3, 3, 3};
        int k =2;
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = freq.length - 1; i > 0 && index < k; i--) {
            for (int n : freq[i]) {
                res[index++] = n;
                if (index == k) {
                    System.out.println(res);
                    return;
                }
            }
        }
        System.out.println(res);

    }
}
//“I count frequencies with a HashMap.”
//
//“I use frequency as an index to group numbers.”
//
//“Multiple numbers can share the same frequency, so each index holds a list.”
//
//“I iterate from highest frequency to lowest to get the top k.”
