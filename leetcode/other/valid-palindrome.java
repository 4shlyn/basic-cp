// https://leetcode.com/problems/valid-palindrome

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String t = new String();
        for (int i=0;i<s.length();i++){
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                t+=s.charAt(i);
            }
        }

        int pointerStart = 0;
        int pointerEnd = t.length()-1;

        while (pointerStart < pointerEnd){
            if (t.charAt(pointerStart) == t.charAt(pointerEnd)){
                pointerStart++;
                pointerEnd -=1;
            }
            else{
                return false;
            }

        }
        return true;
    }
}
