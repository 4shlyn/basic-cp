import java.io.*;
import java.util.*;

class paintingbarn {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("paintbarn.in"));
        PrintWriter pw = new PrintWriter("paintbarn.out");
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] gary = new int[1001][1001];
        int mx = 0;
        int my = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            mx = Math.max(mx, x2);
            my = Math.max(my, y2);
            for (int j = y1; j < y2; j++) {
                gary[j][x1] += 1;
                gary[j][x2] -= 1;
            }

        }
        int l = 0;
        int c = 0;
        for (int i = 0; i < my; i++) {
            l = 0;
            for (int j = 0; j < mx; j++) {
                l += gary[i][j];
                if (l == k) {
                    c++;
                }
            }
        }
        pw.println(c);
        pw.close();
        br.close();
        System.exit(0);

    }
}