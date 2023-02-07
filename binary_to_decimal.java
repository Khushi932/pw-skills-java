import java.util.Scanner;

public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number to convert to decimal");
        int binary = sc.nextInt();
        int ans = 0 ; //converted decimal number
        int pw = 1; // 2^0 = 1

        while(binary >0){
            int unit_digit = binary % 10;
            ans += (unit_digit * pw);
            binary /= 10;
            pw *= 2;
        }

        System.out.println(ans);
    }
}
