// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii

class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0]; // 2
        int sum = 0;
        int max = -1; // 4
        for (int i=1;i<prices.length;i++){
            if (prices[i] <= max){
                sum = sum + max - min;
                min = prices[i];
                max = -1;
        }
           else  if (prices[i] < min){
                min = prices[i];
                max = -1;
            }
            else if (prices[i] > min && prices[i] > max){
                max = prices[i];
                if (i == prices.length-1){
                    sum = sum+max-min;
                }
            }  
    }
    // if (prices[prices.length-1] > prices[0] && sum == 0){
    //     sum = prices[prices.length-1] - prices[0];
    // }
    return sum;
}
}