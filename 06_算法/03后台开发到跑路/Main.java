import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder();

        if (sc.hasNextLine()) {
            input.append(sc.nextLine());
        }
        while (sc.hasNextLine()) {
            input.append('\n').append(sc.nextLine());
        }

        String s = input.toString();
        StringBuilder output = new StringBuilder();
        boolean inString = false;
        boolean inComment = false;
        boolean escaped = false;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (inComment) {
                if (c == '*' && i + 1 < n && s.charAt(i + 1) == '/') {
                    inComment = false;
                    i++;
                }
                continue;
            }

            if (inString) {
                output.append(c);
                if (c == '\\' && !escaped) {
                    escaped = true;
                } else if (c == '"' && !escaped) {
                    inString = false;
                    escaped = false;
                } else {
                    escaped = false;
                }
                continue;
            }

            if (c == '"') {
                inString = true;
                output.append(c);
                escaped = false;
            } else if (c == '/' && i + 1 < n && s.charAt(i + 1) == '*') {
                inComment = true;
                i++;
            } else {
                output.append(c);
            }
        }

        System.out.print(output);
    }
}
