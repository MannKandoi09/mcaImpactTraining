package LeetCode;

public class BuySelStock2 {
    class Solution {
        public int maxProfit(int[] prices) {
        /*
        int[] prices = { 7, 1, 5, 3, 6.4 };
        profit = 0;

        i = 1;
        i > 7 ? No

        i = 2
        5 > 1? Yes
        profit += 5- 1 = 4;

        profit = 4;

        i = 3;
        3 > 5? No

        i = 4
        6 > 3 ? Yes
        profit += 6 - 3 = 3

        profit = 7
        i = 5
        4 > 6? No

        Answer = 7
        */
            int profit = 0;
            for(int i = 1; i < prices.length; i++){
                if(prices[i] > prices[i-1]){
                    profit += prices[i] - prices[i - 1];
                }
            }
            return profit;

        }
    }
}
