import java.io.*;
import java.util.*;
class speeding{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("speeding.in"));
        PrintWriter pw = new PrintWriter("speeding.out");
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] limits = new int[n*2];
        for (int i=0;i<n*2;i++){
            st = new StringTokenizer(br.readLine());
            limits[i] = Integer.parseInt(st.nextToken());
            limits[i+1] = Integer.parseInt(st.nextToken());
        }
        int max = 0;
        int duration = 0;
        for (int i=0;i<m*2;i++){
            st = new StringTokenizer(br.readLine());
            int speed = Integer.parseInt(st.nextToken());
            int length = Integer.parseInt(st.nextToken());
            for (int j=0;j<n;j++){
                if (limits[j*2])
            }
        }

        

    }
}