import java.util.Scanner;

public class sumDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find sum of digits :");
        int n = sc.nextInt();
        int sumOfDigit=0;
        int original_n =n;

        while(n>0){
            sumOfDigit += n%10;
            n = n/10;
        }
        System.out.println("Sum of digit "+original_n+" is "+sumOfDigit);
    }
}
