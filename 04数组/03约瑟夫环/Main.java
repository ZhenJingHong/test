import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();
        boolean[] a = new boolean[n];
        int r = n, c = k, s = 0;
        while (r > 1) {
            if (!a[c]) {
                s++;
                if (s == m) {
                    a[c] = true;
                    r--;
                    s = 0;
                }
            }
            c = (c + 1) % n;
        }
        for (int i = 0; i < n; i++) {
            if (!a[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}
