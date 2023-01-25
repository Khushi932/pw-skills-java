import java.util.Scanner;

public class exponent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base");
        int a = sc.nextInt();
        System.out.println("Enter power");
        int b = sc.nextInt();

        int ans=1;

        for(int i = 1; i<=b; i++){
            ans *= a;
        }

        System.out.println("The value is "+ans);
    }
}
