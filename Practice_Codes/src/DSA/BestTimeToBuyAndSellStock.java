package DSA;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
//121. Best Time to Buy and Sell Stock

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int minimum = prices[0];
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(prices[i]<minimum){
                minimum = prices[i];
            } else{
                int profit = prices[i]-minimum;
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
