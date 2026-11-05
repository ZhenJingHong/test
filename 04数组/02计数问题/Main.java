import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()) {
            long n = sc.nextLong();
            int x = sc.nextInt();
            System.out.println(f(n, x));
        }
    }

    private static long f(long n, int x) {
        long c = 0;
        long d = 1;
        while (d <= n) {
            long h = n / (d * 10);
            long m = (n / d) % 10;
            long l = n % d;
            if (x == 0) {
                if (h == 0) break;
                if (m > x) c += (h - 1) * d + d;
                else if (m == x) c += (h - 1) * d + l + 1;
                else c += (h - 1) * d;
            } else {
                if (m > x) c += (h + 1) * d;
                else if (m == x) c += h * d + l + 1;
                else c += h * d;
            }
            d *= 10;
        }
        return c;
    }
}
