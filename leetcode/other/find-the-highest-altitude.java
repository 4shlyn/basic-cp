// https://leetcode.com/problems/find-the-highest-altitude

class Solution {
    public int largestAltitude(int[] gain) {

        int difference = 0;
        int max = 0;
        for (int i = 0; i < gain.length; i++){
            difference += gain[i];
            if (difference > max){
                max = difference;
            }
        }
        return max;
    }

        
    
}