import java.util.Scanner;

public class decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal number to convert into binary");
        int decimal = sc.nextInt();

        int ans = 0 ;
        int pw = 1; // power of 10

        while(decimal >0){
            int parity = decimal%2;
            ans += (parity *pw);
            pw *= 10;
            decimal /= 2;
        }
        System.out.println(ans);
    }
}
