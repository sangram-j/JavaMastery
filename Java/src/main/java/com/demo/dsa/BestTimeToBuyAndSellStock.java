package com.sj.demo.dsa;

public class BestTimeToBuyAndSellStock {

    /*You are given an array prices where prices[i] is the price of a given stock on the ith day.

    You want to maximize your profit by choosing a single day to buy one stock and choosing a
    different day in the future to sell that stock.
    */


    public static void main(String[] args) {

        int[] arr = {1, 5, 8, 3, 2, 7, 4, 0, 4, 7};

        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) { // min buying price
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) { //current price - minPrice = profit
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
