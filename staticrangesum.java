import java.util.Scanner;

class staticrangesum {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String[] r = s.nextLine().split(" ");
    int q = Integer.valueOf(r[1]);
    String[] a = s.nextLine().split(" ");

    for (int i=0;i<q;i++){
        String[] cur = s.nextLine().split(" ");
        int t = 0;
        for (int j=Integer.valueOf(cur[0]);j<Integer.valueOf(cur[1]);j++){
            t+=Integer.valueOf(a[j]);
        }
        System.out.println(t);
    }
    s.close();
  }
}