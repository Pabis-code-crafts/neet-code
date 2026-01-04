package org.example.container;

public class Container {
    public static void main(String[] args) {
       // int[] height = {1,7,2,5,4,7,3,6};
        int[] height = {1, 2, 3, 4, 5};


        int maxVolume = 0;
        int left = 0;
        int right = height.length-1;

        while(left<right){
            int volume = Math.abs(right - left) * Math.min(height[left], height[right]);
            if(height[left]>height[right]){
                right--;
            }else{
                left++;
            }
            maxVolume = Math.max(volume,maxVolume);
        }
        System.out.println(maxVolume);



    }
}
// if(prices[right]>prices[left]){
//                int newProfit = prices[right] - prices[left];
//                profit = Math.max(newProfit, profit);
/// /                if(profit<newProfit){
/// /                    profit = newProfit;
/// /                    buy = left;
/// /                    sell = right;
/// /                }
//
//            }else{
//                left = right;