import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = 0;
            for (int i = a; i <= b; i++) {
                int t = i, s = 0;
                while (t > 0) {
                    s += t % 10;
                    t /= 10;
                }
                if (s % 5 == 0) c++;
            }
            System.out.println(c);
        }
    }
}
