import java.util.Scanner;

public class zero_one_triangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of rows");
        int n=sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++){
            a=(i%2==0)?0:1;
            for(int j=1;j<=i;j++){
                   System.out.print(a+" ");
                   a=(a==1)?0:1;
            }
            System.out.println();
        }
    }
}
