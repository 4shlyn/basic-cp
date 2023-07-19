// https://leetcode.com/problems/longest-palindromic-substring/

// very slow - 365ms and o(n^2) , had to look up algo
// next time try a middle character expansion way bc this is not that great

class Solution {
    public String longestPalindrome(String s) {

        Boolean[][] dp = new Boolean[s.length()][s.length()];
        for (int i=0;i<s.length();i++){
            for (int j= 0; j< s.length();j++){
                if (i==j) dp[i][j] = true;
                else{
                    dp[i][j] = false;
                }
            }
        }


        int x = 0;
        int y = 0;

        for (int diff = 1; diff<s.length(); diff++){
            for (int i=0;i<s.length()-diff;i++){
            int j = i+diff;
            if ((s.charAt(i) == s.charAt(j))){
            if (diff==1) {
                dp[i][j] = true;
                x = i; 
                y = j;
                }

            else if (dp[i+1][j-1]){
                 dp[i][j] = true;
                x = i;
                y = j;
            }
        }
        }
        }
        return s.substring(x,y+1);
    }

}
