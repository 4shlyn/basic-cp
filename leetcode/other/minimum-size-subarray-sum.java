// https://leetcode.com/problems/minimum-size-subarray-sum

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int j = 0;
        int sum = 0;
        int mn = Integer.MAX_VALUE;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum >= target){
                sum-=nums[j];
                mn = (Math.min(i-j+1,mn));
                j++;
                }
        }
        if (mn==Integer.MAX_VALUE){
            return 0;
        }

        return mn;
        
    }
}