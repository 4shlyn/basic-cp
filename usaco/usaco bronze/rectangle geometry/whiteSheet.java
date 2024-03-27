import java.util.*;

public class whiteSheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] l = sc.nextLine().split(" ");
        Sheet white = new Sheet(l[0], l[1], l[2], l[3]);
        l = sc.nextLine().split(" ");
        Sheet b1 = new Sheet(l[0], l[1], l[2], l[3]);
        l = sc.nextLine().split(" ");
        Sheet b2 = new Sheet(l[0], l[1], l[2], l[3]);

        Sheet f1 = Sheet.gary(white, b1);
        Sheet f2 = Sheet.gary(white, b2);

        if (white.area() == Sheet.intersect(white, b1) + Sheet.intersect(white, b2) - Sheet.intersect(f1, f2)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

        sc.close();
    }

}

class Sheet {
    long x1, y1, x2, y2;

    public Sheet(String x1, String y1, String x2, String y2) {
        this.x1 = Long.parseLong(x1);
        this.y1 = Long.parseLong(y1);
        this.x2 = Long.parseLong(x2);
        this.y2 = Long.parseLong(y2);
    }

    public Sheet(long x1, long y1, long x2, long y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    long area() {
        return (y2 - y1) * (x2 - x1);
    }

    static Sheet gary(Sheet p, Sheet q) {
        long xOverlap = Math.max(0, Math.min(p.x2, q.x2) - Math.max(p.x1, q.x1));
        long yOverlap = Math.max(0, Math.min(p.y2, q.y2) - Math.max(p.y1, q.y1));
        return new Sheet(Math.max(p.x1, q.x1), Math.max(p.y1, q.y1), Math.max(p.x1, q.x1) + xOverlap, Math.max(p.y1, q.y1) + yOverlap);
    }

    static long intersect(Sheet p, Sheet q) {
        long xOverlap = Math.max(0, Math.min(p.x2, q.x2) - Math.max(p.x1, q.x1));
        long yOverlap = Math.max(0, Math.min(p.y2, q.y2) - Math.max(p.y1, q.y1));
        return xOverlap * yOverlap;
    }

}
