package org.example.validPalindrome;

import java.util.Locale;

public class ValidPalindrome {
    public static void main(String[] args) {
        String sentence = "Was it a car or a cat I saw?";
        sentence = sentence.toLowerCase();
        int left = 0;
        int right = sentence.length()-1;

        while(left<right){
            while (left < right && !Character.isLetterOrDigit(sentence.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(sentence.charAt(right))) {
                right--;
            }
            if(sentence.charAt(left)!=sentence.charAt(right)){
                System.out.println("false");
                return;
            }
            left++;
            right--;
        }
        System.out.println("true");

    }
}
