// https://leetcode.com/problems/house-robber

class Solution {
   int cache[101];
public:
    Solution(){
        fill_n(cache, 101, -1);
    }

    int helper(vector<int>& nums, int n){
        if(n >= nums.size())    return 0;
        if(cache[n]!=-1)    return cache[n];
        
        return cache[n] = max(nums[n] + helper(nums, n+2), helper(nums, n+1));
    }
    
    int rob(vector<int>& nums) {
        return helper(nums, 0);
    }
};