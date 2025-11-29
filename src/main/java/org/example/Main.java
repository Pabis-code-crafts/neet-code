package org.example;

import org.example.solutionOne.SolutionOne;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        SolutionOne s = new SolutionOne();

        Integer[] arr = {1, 2, 3, 4, 5, 7, 6, 7};

        boolean result = s.hasDuplicate(arr);

        System.out.println("Has duplicate? " + result);

    }
}