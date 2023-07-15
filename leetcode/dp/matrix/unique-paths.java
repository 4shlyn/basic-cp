// https://leetcode.com/problems/unique-paths

class Solution {

    public int uniquePaths(int m, int n) {
        // two options: go right, go down
        // have 2d array of -1 if not known possible options from there, number if yk how many ways u can exit
        // answer will be max ways from the right box + max ways from the down box
        int cache[][] = new int[100][100];
        for (int i=0;i<100;i++){
            Arrays.fill(cache[i],-1);
        }
        if (m ==1 || n==1){
            return 1;
        }
        return helper(m,n,1,0, cache) + helper(m,n,0,1, cache);

    }

    public int helper(int m, int n, int x, int y, int[][] cache){
        if ((x==m-1) || y==n-1){
            return 1;
        }
        
        if (cache[x][y] != -1){
            return cache[x][y];
        }
        cache[x][y] = helper(m,n,x+1,y,cache) + helper(m,n,x,y+1,cache);
        return cache[x][y];
    }


    
}