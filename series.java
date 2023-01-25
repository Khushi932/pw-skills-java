import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number till which you want to add odd number and subtract even number:");
        int n = sc.nextInt();
        int ans =0;
        for(int i=1; i<=n; i++){
            if(i%2 == 0){
                ans -= i;
            }
            else{
                ans += i;
            }
        }

        System.out.println("The answer of series = "+ans);
    }
}
