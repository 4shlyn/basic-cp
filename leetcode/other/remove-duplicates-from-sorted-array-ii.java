// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        Boolean yay = true;
        for (int i =1;i<nums.length;i++){
            if (nums[i]==nums[i-1]){
                if (yay){
                    yay = false;
                    nums[k] = nums[i];

                    k++;

                }
                
            }
            else{
                nums[k] = nums[i];
                k++;
                yay = true;

                }

        }
        return k;
    }
}