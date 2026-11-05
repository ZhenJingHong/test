import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int y = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            int[] d = {0,31,28,31,30,31,30,31,31,30,31,30,31};
            if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) d[2] = 29;
            int c = 0;
            int t = y;
            while (t > 0) {
                if (t % 10 == x) c++;
                t /= 10;
            }
            if (m / 10 == x) c++;
            if (m % 10 == x) c++;
            c *= d[m];
            for (int i = 1; i <= d[m]; i++) {
                if (i / 10 == x) c++;
                if (i % 10 == x) c++;
            }
            System.out.println(c);
        }
    }
}
