import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        int h=a-'A'+1;
        for(int i=1;i<=h;i++){
            for(int j=1;j<=h-i;j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print((char) ('A' + k - 1));
            }
            for (int l = i - 1; l >= 1; l--) {
                System.out.print((char) ('A' + l - 1));
            }
            System.out.println(" ");
        }
    }
}
