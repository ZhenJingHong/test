import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=(sc.nextInt()+1)/2;
        }
        for(int i=0;i<a;i++){
            if(arr[i]!=1){
                print(arr[i]);
                System.out.println();
            }
            else if(arr[i]==1) System.out.println("*");
        }
    }
    public static void print(int a){
        for(int i=0;i<a;i++){
            for(int j=0;j<a-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=a-1;i>=0;i--){
            for(int j=0;j<a-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print("*");
            }
            if(i==1)break;
            System.out.println();
        }
    }
}
