import java.util.Scanner;
public class factorial {
   static int fact(int n){
        if (n!=0)
        {
            return (n * fact(n-1));
        }
        else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = sc.nextInt();
        int result;
        result = fact(num);
        System.out.println("Factorial of number "+num+" is : "+ result);
    }
}
