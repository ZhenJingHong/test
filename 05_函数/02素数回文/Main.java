import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        String s = Long.toString(t);
        String r = new StringBuilder(s).reverse().toString();
        String p = s + r.substring(1);
        long n = Long.parseLong(p);
        System.out.println(f(n) ? "prime" : "noprime");
    }

    static boolean f(long n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
