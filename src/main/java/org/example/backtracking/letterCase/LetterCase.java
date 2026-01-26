package org.example.backtracking.letterCase;

import java.util.ArrayList;
import java.util.List;

public class LetterCase {
    public static void main(String[] args) {
        String s = "a1b";
        List<String> res = new ArrayList<>();
        backtrack(s.toCharArray(), 0, res);
        System.out.println(res);
    }

    static void backtrack(char[] arr, int index, List<String> res) {
        if (index == arr.length) {
            res.add(new String(arr));
            return;
        }

        // If letter → two choices
        if (Character.isLetter(arr[index])) {

            // lowercase
            arr[index] = Character.toLowerCase(arr[index]);
            backtrack(arr, index + 1, res);

            // uppercase
            arr[index] = Character.toUpperCase(arr[index]);
            backtrack(arr, index + 1, res);

        } else {
            // digit → only one path
            backtrack(arr, index + 1, res);
        }
    }
}

