import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse:");
        int n = sc.nextInt();
        int original_n = n;
        int ans=0;
        while(n>0){
            ans = (ans*10) + (n % 10);
            n /= 10;
        }
        System.out.println("Reverse number is "+ans);
    }
}
