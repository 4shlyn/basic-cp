// https://leetcode.com/problems/unique-paths-ii

// basically the same solution as before, except if there's an obstacle, there are 0 ways to get there
// so when adding top and left, there will essentially be no addition from whichever was inaccessible
// 0 ms, 40mb

class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int cache[][] = new int[grid.length][grid[0].length];
        
        for (int k=0;k<grid.length;k++){
            if (grid[k][0] == 1){
                k = grid.length;
            }
            else{cache[k][0] = 1;}
        }
        for (int p = 0; p<grid[0].length; p++){
            if (grid[0][p] == 1){
                p = grid[0].length;
            }
            else{cache[0][p] = 1;}
        }

        for (int i=1; i<grid.length;i++){
            for (int j = 1; j<grid[0].length;j++){
                if (grid[i][j] == 1){
                    cache[i][j] = 0;
                }
                else{cache[i][j] = cache[i-1][j] + cache[i][j-1];}
            }
        }
        return cache[grid.length-1][grid[0].length-1];

    }
}
