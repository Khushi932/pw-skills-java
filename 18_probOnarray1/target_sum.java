import java.util.Scanner;

public class target_sum {
    static int paiSum (int a[], int target){
        int n = a.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=(i+1);j<n;j++){
                if(a[i] + a[j] == target){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element size");
        int n = sc.nextInt();
        int a[]= new int[n];
        System.out.println("Enter "+n+" elements:");
        for(int i=0 ;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Enter target sum");
        int target = sc.nextInt();

        System.out.println(paiSum(a,target));
    }
}
