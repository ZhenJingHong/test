import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        String[] strs = new String[n];
        for (int i = 0; i < n; i++) strs[i] = String.valueOf(nums[i]);

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                String ab = strs[j] + strs[j + 1];
                String ba = strs[j + 1] + strs[j];
                if (ab.compareTo(ba) < 0) {            
                    String tmp = strs[j];
                    strs[j] = strs[j + 1];
                    strs[j + 1] = tmp;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
        String s = strs[i];
        sb.append(s);
        }
        System.out.println(sb);
    }
}
