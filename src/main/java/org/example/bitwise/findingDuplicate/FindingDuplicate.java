package org.example.bitwise.findingDuplicate;

public class FindingDuplicate {
    public static void main(String[] args) {
        int[] val = {8,2,1,1,2};
        int result = 0;
        for (int i = 0; i < val.length; i++) {
            result = val[i]^result;
        }
        System.out.println(result);
    }
}
