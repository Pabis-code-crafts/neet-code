package org.example.missingNumber;

public class MissingNumber {
    public static void main(String[] args) {
        int[] num = {0,1,2,3,4,5,7,8};
        int sumOfRange = 0;
        int sumOfValue = 0;
        for(int i=0;i<= num.length;i++){
            sumOfRange += i;
        }
        for (int i = 0; i <= num.length-1; i++) {
            sumOfValue += num[i];
        }

        int missingNumber = sumOfRange - sumOfValue;
        System.out.println(missingNumber);

    }
}
