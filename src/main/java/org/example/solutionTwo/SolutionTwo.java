package org.example.solutionTwo;

public class SolutionTwo {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] countOfEach = new int[26];
        for(int i=0;i<s.length();i++){
            countOfEach[ s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            countOfEach[ t.charAt(i)-'a']--;
        }
        for(int i=0;i<countOfEach.length;i++){
            if(countOfEach[i]!=0){
                return false;
            }
        }
        return true;
    }
}
