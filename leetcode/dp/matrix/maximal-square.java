// https://leetcode.com/problems/maximal-square

// had to get help for actual algo but makes sense, 16ms
// o(mn*mn+mn) or idrk

class Solution {
    public int maximalSquare(char[][] matrix) {
        int[][] dp = new int[matrix.length+1][matrix[0].length+1];
        int max =0;

        Arrays.fill(dp[0],0);
        for (int i=0;i<dp.length;i++){dp[i][0] = 0;}

        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                dp[i+1][j+1] = Integer.parseInt(String.valueOf(matrix[i][j]));
            }
        }

        for (int i=1; i< dp.length; i++){
            for (int j=1;j<dp[0].length;j++){
                if (dp[i][j] != 0){
                    dp[i][j] = (Math.min(Math.min(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1]) + 1);
                    if (dp[i][j]> max) max = dp[i][j];
 
                }
            }
        }

        return max*max;
    }
}
