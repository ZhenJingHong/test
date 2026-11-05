import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int count = 0;

        for (int i = L; i <= R; i++) {
            int num = i;
            while (num > 0) {
                if (num % 10 == 2) {
                    count++;
                }
                num /= 10;
            }
        }

        System.out.println(count);
    }
}
