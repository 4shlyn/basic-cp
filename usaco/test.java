import java.util.Scanner;
import java.util.HashMap;

class milk{
    public static void main(String[] args) {

        HashMap<Integer, Integer> hierarchy = new HashMap<Integer, Integer>();
        Scanner s = new Scanner(System.in);
        String[] tests = s.nextLine().split(" ");
        int cows = Integer.valueOf(tests[0]);
        int specified = Integer.valueOf(tests[2]);
        int[] order = new int[cows+1];
        String[] lary = s.nextLine().split(" ");

        // setting hierarchies starting w index 0
        for (int i = 0; i < Integer.valueOf(tests[1]); i++) {
            hierarchy.put(Integer.valueOf(lary[i]),i);
        }
        // adding in set positions
        for (int i = 0; i < specified; i++) {
            String[] temp = s.nextLine().split(" ");
            // set cow temp[0] to position temp[1]-1 bcz of indexing
            order[Integer.valueOf(temp[1])-1] = Integer.valueOf(temp[0]);

        }
        int empty = 0;
        int last = 0;
        Boolean found = false;
        for (int i = 0; i < cows; i++) {
            if (order[i] != 0) {
                if (hierarchy.keySet().contains(order[i])) {
                    if (hierarchy.get(order[i]) < empty) {
                        System.out.println(last + 1);
                        found = true;
                    }
                    else{last = i;}
                }
            } 
            else {
                empty++;
        }
    }
    if (!found) {
        System.out.println(last+2);
    }
        s.close();
    }
}
