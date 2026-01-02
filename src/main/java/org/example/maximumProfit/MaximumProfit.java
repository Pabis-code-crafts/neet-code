package org.example.maximumProfit;

public class MaximumProfit {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int profit = 0;
        int left = 0;
        int right = 1;
//        int buy = -1;
//        int sell = -1;
        while(right<prices.length){
            if(prices[right]>prices[left]){
                int newProfit = prices[right] - prices[left];
                profit = Math.max(newProfit, profit);
//                if(profit<newProfit){
//                    profit = newProfit;
//                    buy = left;
//                    sell = right;
//                }

            }else{
                left = right;
            }
            right++;
        }
        System.out.println(profit);
    }
}
