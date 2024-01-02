import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++){
            for(int k=i;k<n;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=a;j++){
                System.out.print("*");
            }
            a+=2;
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            a-=2;
            for(int k=1;k<i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=a;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
