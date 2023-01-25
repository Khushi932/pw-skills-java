import java.util.Scanner;

public class tripattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows ");
        int r = sc.nextInt();

        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n \nSecond pattern \n");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=(r+1-i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n \nSecond pattern method 2 \n");
        for(int i=r;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
