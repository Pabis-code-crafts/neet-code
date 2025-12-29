package org.example.anagram;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String word1 = "dog";
        String word2 = "gdo";
        int[] val1 = new int[26];
        int[] val2 = new int[26];
        for (int i=0;  i<=word1.length()-1;i++){
            char s = word1.charAt(i);
            int index = s - 'a';
            val1[index]++;
        }
        for (int i=0;  i<=word2.length()-1;i++){
            char s = word2.charAt(i);
            int index = s - 'a';
            val2[index]++;
        }

        if (Arrays.equals(val1,val2)) {
            System.out.println("true");
        }else System.out.println("false");


    }
}
