import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int balance = 0;
        boolean isGood = true;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                balance++;
            } else {
                if (balance == 0) {
                    isGood = false;
                    break;
                }
                balance--;
            }
        }

        if (isGood && balance == 0) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }
    }
}
