import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int m=sc.nextInt();
        boolean[] tree=new boolean[l+1];
        while(m-->0) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            for(int i=a;i<=b;i++) {
                tree[i]=true;
            }
        }
        int count=0;
        for(int i=0;i<=l;i++) {
            if(!tree[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
