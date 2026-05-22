package org.example.prac;

public class prac {
    public static void main(String[] args) {
        String sentence = "Was it a car or a cat I saw?";
        sentence = sentence.toLowerCase();
        int right = sentence.length()-1;
        int left = 0;

        while(left<right){
            while(left<right && !Character.isLetter(sentence.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetter(sentence.charAt(right))){
                right--;
            }
            if(sentence.charAt(left)!=sentence.charAt(right)){
                System.out.println("not palindrome");
                return;
            }

            left++;
            right--;



        }
        System.out.println("palindrome");

    }
}
