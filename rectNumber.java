import java.util.Scanner;

public class rectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows ");
        int r = sc.nextInt();
        System.out.println("enter number of column ");
        int c = sc.nextInt();

        for(int i=1;i<=r;i++){
            for(int j=1; j<=c;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if((i+j)%2 == 0){
                    System.out.print(1);
                }
                else{
                    System.out.print(2);
                }

            }
            System.out.println();
        }
    }
}
