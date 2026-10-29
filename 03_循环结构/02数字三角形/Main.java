import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int flag=1;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%4d",flag);
                flag++;
            }
            System.out.println();
        }
    }
}
