import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] smallestAndLargest(int arr[]){

        Arrays.sort(arr);
        System.out.print(arr);
        int[] ans ={arr[0],arr[arr.length-1]};
        return ans;
    }
    static int[] kthsmallestAndLargest(int arr[]){

        Arrays.sort(arr);
        System.out.print(arr);
        int[] ans ={arr[0]};
        for(int i=0;i<arr.length;i++){
            
        }
        return ans;
    }
    static boolean sortedArray(int arr[]){
        boolean check;
        for(int i=1;i<arr.length;i++){
            //checking for increasing order
            if(arr[i]<arr[i-1]) {
                check = false;
                break;
            }
        }
        return check;
    }
    static int countOcurrences(int arr[], int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x)
                count++;
        }
        return count;
    }
    static int lastOcurrences(int arr[],int x){
        int lastIndex=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x)
                lastIndex=i;
        }
        return lastIndex;
    }

    static void printarray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
        int[] arr = new int[5];
        arr[0]=5;
        arr[1]=6;
        arr[2]=7;
        arr[3]=8;
        arr[4]=9;

        System.out.println("Enter array of " + arr.length + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        printarray(arr);
//        int[] arr2 = arr;
        // below code won't change original array this will create another copy and change value
//        int[] arr2 = arr.clone();
//        int[] arr2 = Arrays.copyOf(arr,arr.length);
        int [] arr2 = Arrays.copyOfRange(arr,1,4);
        arr2[0]=0;
        arr2[1]=0;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        printarray(arr2);

        System.out.println("Enter number x");
        int x = sc.nextInt();
        System.out.println("count of occurences of x = "+countOcurrences(arr,x));
        System.out.println("Last ocurrence of x in array : "+lastOcurrences(arr,x));
        System.out.println("Is sorted"+sortedArray(arr));
        System.out.println("sorted array"+smallestAndLargest(arr));
        int[] ans = smallestAndLargest(arr);
        System.out.println("Smallest "+ans[0]+"\n Largest"+ans[1] );
    }
}
