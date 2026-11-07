import java.util.Scanner;

public class Main {
    private static final int[][] BLOCK = new int[10][10];

    static {
        BLOCK[1][3] = BLOCK[3][1] = 2;
        BLOCK[1][7] = BLOCK[7][1] = 4;
        BLOCK[1][9] = BLOCK[9][1] = 5;
        BLOCK[2][8] = BLOCK[8][2] = 5;
        BLOCK[3][7] = BLOCK[7][3] = 5;
        BLOCK[3][9] = BLOCK[9][3] = 6;
        BLOCK[4][6] = BLOCK[6][4] = 5;
        BLOCK[7][9] = BLOCK[9][7] = 8;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            if (s.length() > 9) {
                System.out.println("NO");
                continue;
            }

            boolean[] used = new boolean[10];
            boolean isValid = true;
            used[s.charAt(0) - '0'] = true;

            for (int i = 1; i < s.length(); i++) {
                int prev = s.charAt(i - 1) - '0';
                int curr = s.charAt(i) - '0';

                if (used[curr]) {
                    isValid = false;
                    break;
                }

                int mid = BLOCK[prev][curr];
                if (mid != 0 && !used[mid]) {
                    isValid = false;
                    break;
                }

                used[curr] = true;
            }

            System.out.println(isValid ? "YES" : "NO");
        }
    }
}
