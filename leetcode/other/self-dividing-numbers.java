// https://leetcode.com/problems/self-dividing-numbers

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> bob = new ArrayList<Integer>();


        for (int i=left;i<=right;i++){
            String schmob =  Integer.toString(i);
            for (int j = 0; j < schmob.length(); j++){
                int p = (Integer.parseInt(String.valueOf(schmob.charAt(j))));
                if (p == 0){
                    j = schmob.length();
                }
                else if (i % p != 0){
                    j = schmob.length();
                }
                else if (j==schmob.length()-1){
                    bob.add(i);
                }
            }
        }
        return bob;
    }
}