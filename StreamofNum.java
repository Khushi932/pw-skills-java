import java.util.Scanner;

public class StreamofNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int i = s.nextInt();
        int sum =0;

        while(i != -1){
            sum += i;
            i = s.nextInt();
        }
        System.out.println(sum);
    }
}
