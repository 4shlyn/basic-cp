// https://leetcode.com/problems/climbing-stairs

class Solution {
    int[] temp = new int[46];
    public Solution(){
        for (int i =0; i<46;i++){
            temp[i] = -1;
    }

    }
    public int climbStairs(int n) {
        // 1: 1 1
        // 2: 2 1-1, 2
        // 3: 3 1-1-1, 1-2, 2-1
        // 4: 1-1-1-1, 1-1-2, 1-2-1, 2-1-1, 2-2, 5
        // 5: 1-1-1-1-1, 1-1-1-2, 1-1-2-1, 1-2-1-1, 1-2-2, 2-1-2, 2-2-1, 2-1-1-1, 8
        // 6: 1-1-1-1-1-1, 1-1-1-1-2, 1-1-1-2-1, 1-1-2-1-1, 1-2-1-1-1, 2-1-1-1-1, 2-1-1-2, 2-1-2-1,  2-2-2, 1-2-1-2, 1-2-2-1, 2-1-2-1, 2-2-1-1, 13

        // ok this is just fib
        if (n>=1 && n <=3){return n;}
        if (temp[n]!= -1){
            return temp[n];
        }
        else{
            temp[n] = (climbStairs(n-1) + climbStairs(n-2));
            return temp[n];
        }

    }

}