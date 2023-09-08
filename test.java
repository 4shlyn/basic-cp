import java.util.Scanner;
import java.util.HashMap;

class test {
    public static void main(String[] args) {

        HashMap<Integer, Integer> hierarchy = new HashMap<Integer, Integer>();
        Scanner s = new Scanner(System.in);
        String[] tests = s.nextLine().split(" ");
        int cows = Integer.valueOf(tests[0]);
        int specified = Integer.valueOf(tests[2]);
        int[] order = new int[cows+1];
        String[] lary = s.nextLine().split(" ");

        for (int i = 0; i < Integer.valueOf(tests[1]); i++) {
            hierarchy.put(Integer.valueOf(lary[i]), i);
        }
        for (int i = 0; i < specified; i++) {
            String[] temp = s.nextLine().split(" ");
            order[Integer.valueOf(temp[1])] = Integer.valueOf(temp[0]);

        }
        int empty = 0;
        int last = 0;
        for (int i = 0; i < cows; i++) {
            if (order[i] != 0) {
                if (hierarchy.keySet().contains(order[i])) {
                    last = i;
                    if (hierarchy.get(order[i]) < empty) {
                        System.out.println(last + 1);
                    }
                }
            } 
            else {empty++;}
        }
        s.close();
    }
}