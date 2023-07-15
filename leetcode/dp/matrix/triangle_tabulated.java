// https://leetcode.com/problems/triangle

// tabulated, bottom up, somehow slower than recursion
// start at second last row, put cache values of last row equal to tri values
// each cache value is min value to get to the node from the bottom row

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.get(triangle.size() - 1).size()];
        for(int i=0;i<triangle.size();i++) {
            dp[triangle.size()-1][i] = triangle.get(triangle.size()-1).get(i);
        }

        for (int i=triangle.size()-2;i>=0;i--){
            for (int j=i;j>=0;j--){
                dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i+1][j],dp[i+1][j+1]);
            }
        }
        return dp[0][0];
    }
}
