// https://leetcode.com/problems/best-time-to-buy-and-sell-stock

class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0]; // 4
        int min2 = -1; // 2
        int max = prices[0]; // 4
        for (int i = 1; i< prices.length; i++){
            if (min2 != -1 && (prices[i]-min2) > (max - min)){
                min = min2;
                min2 = -1;
                max = prices[i];
            }

            else if (prices[i] >= max){
                max = prices[i];
            }


            if (prices[i] < min){
                if (min2== -1){
                    min2 = prices[i];
                }
                else if (min2 > prices[i]){
                    min2 = prices[i];
                }
            }
        }
        
    return max-min;
    }
}