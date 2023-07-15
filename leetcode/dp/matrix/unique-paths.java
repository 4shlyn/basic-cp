// https://leetcode.com/problems/unique-paths

class Solution {

    public int uniquePaths(int m, int n) {
        // two options: go right, go down
        // dp cache now represents ways from 0,0 TO x,y -> NOT unique paths from that point
        if (m ==1 || n==1){
            return 1;}
        int cache[][] = new int[m][n];
            
        

        Arrays.fill(cache[0],1);
        for (int k=0;k<m;k++){
            cache[k][0] = 1;
        }

        for (int i=1; i<m;i++){
            for (int j = 1; j<n;j++){
                cache[i][j] = cache[i-1][j] + cache[i][j-1];
            }
        }
        return cache[m-1][n-1];

    }

    
}
