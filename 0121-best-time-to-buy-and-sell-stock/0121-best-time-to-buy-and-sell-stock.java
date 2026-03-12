class Solution{
    public int maxProfit( int[] prices){
        int min_value = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min_value){
                min_value = prices[i];
            }
            else{
                int profit = prices[i] - min_value;
                maxprofit = Math.max(maxprofit, profit);
            }
        }
        return maxprofit;
    }
}