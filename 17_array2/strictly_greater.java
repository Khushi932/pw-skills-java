import java.util.Scanner;

public class strictly_greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of array:");
        int array[] = new int[5];
        for(int i=0;i<array.length;i++) {
             array[i] = sc.nextInt();
        }
        System.out.println("Enter element x");
        int x = sc.nextInt();
        for (int i=0;i<array.length;i++){
            if(array[i]>x)
                System.out.println(array[i]+" is strictly greater than "+x);
        }
    }
}
