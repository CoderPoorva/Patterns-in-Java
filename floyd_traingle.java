import java.util.Scanner;

public class floyd_traingle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=1;
        System.out.println("enter number of rows");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a+=1;
            }
            System.out.println();
        }
    }
}
