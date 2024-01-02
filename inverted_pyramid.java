import java.util.Scanner;

public class inverted_pyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        // controls row
        for(int i=1;i<=n;i++){
            //control for spaces
           for(int k=n-1;k>=i;k--){
            System.out.print(" ");
           }
           //controls column
           for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
