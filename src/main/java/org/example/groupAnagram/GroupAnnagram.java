package org.example.groupAnagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupAnnagram {
    public static void main(String[] args) {
        String[] words = {"dog", "cat", "tac","act","god","pig"};
        HashMap<String, ArrayList<String>> val = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int[] value = new int[26];
            for(int j = 0; j < word.length(); j++){
                char s = word.charAt(j);
                int index = s - 'a';
                value[index]++;
            }
            String intWorded = Arrays.toString(value);
            val.putIfAbsent(intWorded, new ArrayList<>());
            val.get(intWorded).add(word);
        }
        System.out.println(new ArrayList<>(val.values()));
    }
}
