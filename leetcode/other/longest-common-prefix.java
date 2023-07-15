// https://leetcode.com/problems/longest-common-prefix

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longest = "";
        int n = 0;
        if (strs[0].length() == 0){
            return longest;
        }
        char cur = strs[0].charAt(0);

        while (n < strs[0].length()){
            cur = strs[0].charAt(n);
            for (int i =1; i< strs.length;i++){
                if (strs[i].length() > n) {
                    if (strs[i].charAt(n) != cur){
                        return longest;
                    }
                }
                else{
                    return longest;
                }
            }
            longest += cur;
            n++;
        }
        return longest;
    }
}