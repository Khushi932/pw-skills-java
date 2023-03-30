import java.util.Scanner;

public class secondLargest {
    static int findMax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }
    static int findSecondLargest(int[] arr){
        int mx = findMax(arr);
        for(int i=0;i< arr.length;i++){
            if(arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);

        return secondMax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+ n + " elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Integer.MAX_VALUE);// max possible element
        System.out.println(Integer.MIN_VALUE);// min possible element

        System.out.println("Second max element : "+findSecondLargest(arr));
    }
}
