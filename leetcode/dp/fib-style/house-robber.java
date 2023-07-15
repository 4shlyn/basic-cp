// https://leetcode.com/problems/house-robber

class Solution {
        int[] dp = new int[101];
    public Solution(){
        for (int i=0;i<101;i++){
            dp[i] = -1;
        }
    }
    public int rob(int[] nums) {
        return r(nums,nums.length-1);

    }
    public int r(int[] nums, int m){
        if (m ==0){
            return nums[0];
        }
        if (m==1){
            return Math.max(nums[0],nums[1]);
        }
        if (dp[m] != -1){
            return dp[m];
        }
        dp[m] = Math.max(r(nums,m-1), r(nums,m-2) + nums[m]);
        return dp[m];
    }
}