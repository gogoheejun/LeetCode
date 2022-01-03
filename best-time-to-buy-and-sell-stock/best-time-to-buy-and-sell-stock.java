class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0], sellPrice = 0;
        int profit = 0;
        for(int i=0; i< prices.length; i++){
            if(prices[i] < buyPrice) buyPrice = prices[i];
            else {
                sellPrice = prices[i];
                if(sellPrice - buyPrice > profit) profit = sellPrice - buyPrice;
            }
        }
        return profit;
    }
}