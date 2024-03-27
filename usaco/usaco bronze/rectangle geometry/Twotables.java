import java.util.Scanner;

public class Twotables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long te = Long.parseLong(sc.nextLine());
        for (long i = 0; i < te; i++) {
            String[] z = sc.nextLine().split(" ");
            long w = Long.parseLong(z[0]);
            long h = Long.parseLong(z[1]);
            String[] s = sc.nextLine().split(" ");
            Table t = new Table(s[0], s[1], s[2], s[3]);
            String[] ihatescanners = sc.nextLine().split(" ");
            long ow = Long.parseLong(ihatescanners[0]);
            long oh = Long.parseLong(ihatescanners[1]);

            long a = Integer.MAX_VALUE;
            long b = Integer.MAX_VALUE;
            int cry = 0;

            if ((t.w + ow) > w && (t.h + oh) > h) {
                System.out.println(-1);
            } else {

                if ((t.x1 <= ow) && (((w - t.x2) <= ow) && w != 1)) {
                    a = Math.min(ow - t.x1, ow - (w - t.x2));
                    cry++;
                }

                if (t.y1 <= oh && h - t.y2 <= oh && h != 1) {
                    b = Math.min(oh - t.y1, oh - (h - t.y2));
                    cry++;

                }
                if (cry==2) {
                    a = 0;
                }
                System.out.println(Math.min(a, b));

            }
        }
        sc.close();
    }
}//lsakfnklasdjfhkjsdflksajfsdf

class Table {
    public long x1, y1, x2, y2, w, h;

    public Table(String x1, String y1, String x2, String y2) {
        this.x1 = Long.parseLong(x1);
        this.y1 = Long.parseLong(y1);
        this.x2 = Long.parseLong(x2);
        this.y2 = Long.parseLong(y2);
        this.w = this.x2 - this.x1;
        this.h = this.y2 - this.y1;
    }

}