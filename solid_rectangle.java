import java.util.Scanner;

class solid_rectangle{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter row number");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}