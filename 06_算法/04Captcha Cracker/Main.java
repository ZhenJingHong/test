import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder out = new StringBuilder();

        while (T-- > 0) {
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            int i = 0;
            int n = s.length();

            while (i < n) {
                char c = s.charAt(i);

                if (c == '0' || c == '2' || c == '4' || c == '6' || c == '9') {
                    sb.append(c);
                    i++;
                } else if (c == 'z' && i + 4 <= n && s.startsWith("zero", i)) {
                    sb.append('0');
                    i += 4;
                } else if (c == 't' && i + 3 <= n && s.startsWith("two", i)) {
                    sb.append('2');
                    i += 3;
                } else if (c == 'f' && i + 4 <= n && s.startsWith("four", i)) {
                    sb.append('4');
                    i += 4;
                } else if (c == 's' && i + 3 <= n && s.startsWith("six", i)) {
                    sb.append('6');
                    i += 3;
                } else if (c == 'n' && i + 4 <= n && s.startsWith("nine", i)) {
                    sb.append('9');
                    i += 4;
                } else {
                    i++;
                }
            }

            out.append(sb).append('\n');
        }

        System.out.print(out);
    }
}
