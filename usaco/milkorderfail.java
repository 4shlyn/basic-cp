// asklgjsadg9awiuegnx,gaskdgaosrikfjsdgkao;djklg

import java.io.*;
import java.util.*;
import java.util.HashMap;

class milkingorder{
    public static void main(String[] args) throws IOException {
        HashMap<Integer, Integer> hierarchy = new HashMap<Integer, Integer>();
 		BufferedReader br = new BufferedReader(new FileReader("milkorder.in"));
		PrintWriter pw = new PrintWriter("milkorder.out");
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cows = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int specified = Integer.parseInt(st.nextToken());
        int[] order = new int[cows];
        st = new StringTokenizer(br.readLine());
        int[] lary = new int[m]; 
        for (int i=0;i<m;i++) {
            lary[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < m; i++) {
            hierarchy.put(Integer.valueOf(lary[i]), i);
        }
        for (int i = 0; i < specified; i++) {
            st = new StringTokenizer(br.readLine());
            int e = Integer.parseInt(st.nextToken());
            order[(Integer.parseInt(st.nextToken()))-1] = e;
        
        }
        br.close();
        int empty = 0;
        int last = 0;
        boolean found = false;
        for (int i = 0; i < cows; i++) {
            if (order[i] != 0) {
                if (hierarchy.keySet().contains(order[i])) {
                    if (hierarchy.get(order[i]) < empty) {
                        pw.println(last + 1);
                        pw.close();
                        System.exit(0);
                    }
                   else{ last = i;}
                }
            } 
            else {empty++;}
        }
        if (!found) {
            pw.println(last+2);
        }
pw.close();
    }
}
