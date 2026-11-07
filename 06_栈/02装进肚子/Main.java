import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long baseSum = 0;
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
            baseSum += b[i];
        }

        int[] diff = new int[n];
        for (int i = 0; i < n; i++) {
            diff[i] = a[i] - b[i];
        }
        Arrays.sort(diff);
        long extra = 0;
        for (int i = n - 1; i >= n - k; i--) {
            extra += diff[i];
        }
        System.out.println(baseSum + extra);
    }
}
