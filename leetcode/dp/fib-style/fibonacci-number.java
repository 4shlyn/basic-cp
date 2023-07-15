// https://leetcode.com/problems/fibonacci-number

class Solution {
    int[] cache = new int[31];
    public Solution(){
        for (int i=0;i<31;i++){
            cache[i] = -1;
        }
    }
    public int fib(int n) {
        if (n == 0 || n==1){
            return n;
        }
        if (cache[n] != -1){
            return cache[n];
        }
        else{
            return (fib(n-1) + fib(n-2));
        }
        
    }
}