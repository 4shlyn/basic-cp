import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new FileReader("div7.in"));
        // PrintWriter pw = new PrintWriter("div7.out");
        // StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer,Integer> stuff = new HashMap<Integer,Integer>();
        Scanner sc = new Scanner(System.in);

        // int te = Integer.parseInt(st.nextToken());
        int te = Integer.parseInt(sc.nextLine());
        int[] cowids = new int[te];
        int[] psa = new int[te + 1];
        for (int i = 0; i < te; i++) {
            // int a = Integer.parseInt(br.readLine());
            int a = Integer.parseInt(sc.nextLine());
            cowids[i] = a;
            psa[i + 1] = (psa[i] + a) % 7;
        }

        long max = 0;
        for (int i = 0; i < te+1; i++) {
            if (stuff.keySet().contains(psa[i]) == false) {
                stuff.put(psa[i],i);
            } else {
                max = Math.max(max, i - stuff.get(psa[i]));
            }
        }
        System.out.println(max);
        sc.close();

        // br.close();
        // pw.close();
        System.exit(0);

    }

}