// https://leetcode.com/problems/divisor-game

class Solution {
    public boolean divisorGame(int n) {
        if (n%2==0){
            return true;
        }
        return false;
        /*
        1 false
        2 true
        3 false
        4 ALICE: 4-1, BOB: 3-1, ALICE: 2-1 true
        5 ALICE: 5-1, BOB: 4-1, ALICE: 3-1, BOB: 2-1, FALSE
        6 ALICE: 6-3, BOB: 3-1, ALICE: 2-1, TRUE

        


        you can either always subtract 1 or 2

        */


    }
}