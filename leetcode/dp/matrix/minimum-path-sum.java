// https://leetcode.com/problems/minimum-path-sum
class Solution {
    // each cache val is min value from 0,0 to x,y
    // since we can only go right and down, row on top and first column have only one way

    public int minPathSum(int[][] grid) {
        int[][] cache = new int[grid.length][grid[0].length];

        int golf = 0;
        for (int k=0;k<grid.length;k++){
            golf += grid[k][0];
            cache[k][0] = golf;
        }
        golf = 0;
        for (int p=0;p<grid[0].length;p++){
            golf+=grid[0][p];
            cache[0][p] = golf;
        }
        

        for (int i=1;i<grid.length;i++){
            for (int j=1;j<grid[0].length;j++){
                cache[i][j] = grid[i][j] + Math.min(cache[i-1][j], cache[i][j-1]);
            }
        }
        return cache[grid.length-1][grid[0].length-1];
    }
}
