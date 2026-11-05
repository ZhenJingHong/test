import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            long sum = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
                if (arr[i] > max) max = arr[i];
                if (arr[i] < min) min = arr[i];
            }

            long range = (long) max - min; 
            double avg = (double) sum / n; 
            
            double s = 0.0;
            for (int value : arr) {
                double d = value - avg;
                s += d*d;
            }
            double v=s/n;

            System.out.printf("%d %.3f%n", range, v);
        }
        sc.close();
    }
}
