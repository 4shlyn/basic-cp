import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    String[] a = sc.nextLine().split(" ");
    int max = 0;
    int sum = 0;
    for (int i = 0; i < n; i++) {
      if (sum < 0)
        sum = 0;
      sum += Integer.parseInt(a[i]);
      max = Math.max(sum, max);

    }
    System.out.println(max);
    sc.close();
  }

}
