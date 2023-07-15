// https://leetcode.com/problems/keyboard-row

class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiopQWERTYUIOP";
        String row2 = "asdfghjklASDFGHJKL";
        String row3 = "zxcvbnmZXCVBNM";
        int current = 0;
        List<Integer> temp = new ArrayList<Integer>();
        Boolean add = false;
        for (int i = 0; i < words.length;i++){
            current = 0;
            add = true;
            for (int j = 0; j<words[i].length();j++){
                if (row1.indexOf(words[i].charAt(j)) != -1){
                    if ((current == 0)|| (current == 1)){
                        current = 1;
                    }
                    else{
                        j = words[i].length();
                        add = false;
                    }

                }
                else if (row2.indexOf(words[i].charAt(j)) != -1){
                    if (current == 0 || current == 2){
                        current = 2;
                    }
                    else{                        
                        j = words[i].length();
                        add = false;

                    }
                }
                else{
                    if (current == 0 || current == 3){
                        current = 3;
                    }
                    else{
                        j = words[i].length();
                        add = false;
                    }
                }
            }
            if (add){
                temp.add(i);
            }
        }
        String[] gary = new String[temp.size()];
        for (int e = 0; e<temp.size();e++){
            gary[e] = words[(temp.get(e))];
        }
        return gary;
        
    }
}