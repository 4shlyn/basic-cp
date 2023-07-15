// https://leetcode.com/problems/delete-and-earn

class Solution {
        int[] cache = new int[10001]; // stores highest money amnts if u gained the number, and onwards down idk how to explain ugh
    public Solution(){
        Arrays.fill(cache, -1); 

    }
    public int deleteAndEarn(int[] nums) {
        int[] shoe = new int[10001]; // amnt u get buy gaining each numba aka occurences but added up
        // Arrays.fill(shoe, 0); 
        int max = 0;
        for (int i:nums){
            shoe[i] += i;
            max = Math.max(max,i); // finds max value in list
        }

        return womp(shoe,max);
    
 }
    public int womp(int[] shoe, int n){
        if (n==1){return shoe[n];}
        if (n==2){return Math.max(shoe[1],shoe[2]);}
        if (cache[n] != -1){return cache[n];}
        cache[n] = Math.max(shoe[n]+womp(shoe,n-2), womp(shoe,n-1));
        return cache[n];


    }
    
    }
