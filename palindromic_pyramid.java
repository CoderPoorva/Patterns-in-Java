import java.util.Scanner;

public class palindromic_pyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=i;k<n;k++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int l=2;l<=i;l++){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
