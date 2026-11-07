import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        int total = 0;
        int oddCount = 0;
        int midDigit = -1;

        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
            total += a[i];
            if (a[i] % 2 != 0) {
                oddCount++;
                midDigit = i;
            }
        }

        if (oddCount > 1) {
            System.out.println(-1);
            return;
        }

        if (total == 1 && a[0] == 1) {
            System.out.println(0);
            return;
        }

        StringBuilder left = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < a[i] / 2; j++) {
                left.append(i);
            }
        }

        if (left.length() > 0 && left.charAt(0) == '0') {
            boolean found = false;
            for (int i = 0; i < left.length(); i++) {
                if (left.charAt(i) != '0') {
                    char temp = left.charAt(0);
                    left.setCharAt(0, left.charAt(i));
                    left.setCharAt(i, temp);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(-1);
                return;
            }
        }

        StringBuilder ans = new StringBuilder();
        ans.append(left);
        if (oddCount == 1) {
            ans.append(midDigit);
        }
        ans.append(left.reverse());

        System.out.println(ans);
    }
}
