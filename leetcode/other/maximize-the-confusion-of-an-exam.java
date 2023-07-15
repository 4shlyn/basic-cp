// https://leetcode.com/problems/maximize-the-confusion-of-an-exam

class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int start = 0;
        int end = 0;;
        int ts = 0;
        int fs = 0;
        int max = 0;
        int n = answerKey.length();
        while (end < n){
            if (answerKey.charAt(end) == 'F'){
                fs++;
            }
            else{
                ts++;
            }

            {
                while (ts>k && fs>k){ // if they're both over, move start pntr and adjust counters
                    if (answerKey.charAt(start) == 'T'){
                        ts--;
                    }
                    else{
                        fs--;
                    }
                    start++;
                }
            }
        max = Math.max(max,end-start+1);
        end++;
        }
        return max;
    }
}