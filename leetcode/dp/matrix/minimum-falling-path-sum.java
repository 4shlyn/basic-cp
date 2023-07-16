// https://leetcode.com/problems/minimum-falling-path-sum/
// tabulated, similar concept to triangle, went straight to non-recursive

// tc&sc should be o(nm) 

class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        dp[matrix.length-1] = matrix[matrix.length-1];

        if (matrix.length ==2){
            return Math.min(matrix[0][0],matrix[0][1]) + Math.min(matrix[1][0],matrix[1][1]);
        }
        if (matrix.length==1){
            return matrix[0][0];
        }
        for (int i=matrix.length-2;i>=0;i--){
            for (int j=0;j<matrix.length;j++){

                if (j==0){
                dp[i][j] = matrix[i][j] + Math.min(dp[i+1][j+1], dp[i+1][j]);
                }
                else if (j==matrix.length-1){
                    dp[i][j] = matrix[i][j] +Math.min(dp[i+1][j-1], dp[i+1][j]);
                }
                else{
                    dp[i][j] = matrix[i][j] +Math.min(Math.min(dp[i+1][j-1], dp[i+1][j]), dp[i+1][j+1]);
                }
            }
        }
        int e =dp[0][0];
        for (int i=0;i<matrix.length;i++){
            if (dp[0][i] < e) e = dp[0][i];
            
        }
        return e;
    }
}
