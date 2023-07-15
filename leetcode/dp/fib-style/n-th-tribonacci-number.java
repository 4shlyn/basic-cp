// https://leetcode.com/problems/n-th-tribonacci-number

class Solution {
    public int tribonacci(int n) {
        int t0=0,t1=1,t2=1;
        int t3 = t0+t1+t2;
        if (n==0){
            return 0;
        }
        else if (n==1 || n==2){
            return 1;
        }
        for (int i=3;i<n;i++){
            t0 = t1;
            t1 = t2;
            t2 = t3;
            t3 = t0+t1+t2;
        }
        return t3;
    }
}