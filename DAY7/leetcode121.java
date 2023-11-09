class Solution {
    public int maxProfit(int[] prices) {
        int max = Integer.MAX_VALUE;
        int profit = 0;
        int profit_day = 0;
        int len= prices.length;

        for(int i = 0; i < len; i++){
            if(prices[i] < max){
                max = prices[i];
            }
            profit_day = prices[i] - max;
            if(profit < profit_day){
                profit = profit_day;
            }
        }
        return profit;
    }
}