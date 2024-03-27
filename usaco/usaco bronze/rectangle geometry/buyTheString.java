import java.util.*;

public class buyTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            String[] sig = sc.nextLine().split(" ");
            int c0 = Integer.parseInt(sig[1]);
            int c1 = Integer.parseInt(sig[2]);
            int h = Integer.parseInt(sig[3]);
            String[] s = sc.nextLine().split("");

            int sum = 0;
            int alternate = 0;

            if (c0 == c1) {
                System.out.println(s.length * c0);
            } else {

                if (c0 < c1) {

                    for (int j = 0; j < s.length; j++) {
                        if (s[j].equals("0")) {
                            sum += c0;
                            alternate += c0;
                        } else {
                            sum += c1;
                            alternate += (h + c0);
                        }
                    }
                } else if (c1 < c0) {
                    for (int j = 0; j < s.length; j++) {
                        if (s[j].equals("0")) {
                            sum += c0;
                            alternate += (h + c1);
                        } else {
                            sum += c1;
                            alternate += c1;
                        }
                    }
                }

                if (alternate > sum) {
                    System.out.println(sum);
                } else {
                    System.out.println(alternate);
                }
            }
        }
        sc.close();
    }
}