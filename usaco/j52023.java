import java.util.Scanner;

class j52023 {
    static String[][] cache;
    static String word;
    static int w, h;

    public static void main(String[] args) {
        Scanner scs = new Scanner(System.in);
        word = scs.nextLine();
        w = Integer.parseInt(scs.nextLine());
        h = Integer.parseInt(scs.nextLine());
        cache = new String[h][w];
        for (int i = 0; i < h; i++) {
            cache[i] = scs.nextLine().split(" ");
        }
        System.out.println(cache[0]);
        System.out.println(cache[1]);
        System.out.println(cache[2]);
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (cache[i][j] == "" + word.charAt(0)) {
                    if (search(1, i, j)) {
                        System.out.println("TRUE");
                        System.exit(0);
                    }
                }
            }

        }
        System.out.println("NO");

    }

    public static Boolean search(int ind, int x, int y) {
        if (ind == word.length())
            return true;
        if (x != w - 1) {
            if (cache[y][x + 1] == "" + word.charAt(ind))
                return search(ind + 1, x + 1, y);
        }
        if (x != 0) {
            if (cache[y][x - 1] == "" + word.charAt(ind))
                return search(ind + 1, x - 1, y);
        }
        if (y != h - 1) {
            if (cache[y + 1][x] == "" + word.charAt(ind))
                return search(ind + 1, x, y + 1);
        }
        if (y != 0) {
            if (cache[y - 1][x] == "" + word.charAt(ind))
                return search(ind + 1, x, y - 1);
        }
        return false;
    }
}
