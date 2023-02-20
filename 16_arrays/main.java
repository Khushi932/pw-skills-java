import java.lang.reflect.Array;

class ArrayExample{
    void searchArray(){
        int arr[]={3,6,1,8,4,5,7};
        int search=4;
        int ans=-1;
        for(int i= 0; i<arr.length;i++){
            if(search==arr[i]){
                ans = i;
            }
        }
        System.out.println(ans);
    }
    void maxOfArray(){
        int arr[] ={3,4,1,5,9,7,0,8,6};
        int ans = 0;
        for(int i=0;i< arr.length;i++ ){
            if(arr[i]>ans){
                ans=arr[i];
            }
            System.out.println("current ans "+ans);
        }
        System.out.println("Final ans"+ans);
    }
    void sumOfArray(){
        int arr[] = {1,4,5,8,3,9,6};
        int sum = 0;
        for(int i=0; i< arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of array"+sum);
    }
    void multiSrray(){
        //int arr1[][] = new int [5][3];
        int arr[][] = {{59,97,65},{25,345,123},{134,234,66}};

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

        for(int i = 0; i<3;i++){
            for(int j = 0 ; j<arr[i].length;j++) {
                System.out.print("\t"+arr[i][j]);
            }
            System.out.println();
        }

        System.out.println(arr.length);
    }
   void demoArray(){
        int[] ages = new int[3];
        float[] weights = new float[3];
        String names[] = {"khushi","krishna","ram"};

        ages[0]=34;
        ages[1]= 12;
        ages[2]=45;

        System.out.println(ages[0]);
       System.out.println(ages[1]);
       System.out.println(ages[2]);
       System.out.println("for each loop");

       for(int age : ages){
           System.out.println(age);
       }

       System.out.println("while loop");
       int i=0;
       while (i<ages.length){
           System.out.println(ages[i]);
           i++;
       }

       System.out.println(names[0]);
       System.out.println(names[1]);
       System.out.println(names[2]);
   }
}
public class main {
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.demoArray();
        obj.multiSrray();
        obj.sumOfArray();
        obj.maxOfArray();
        obj.searchArray();
    }
}
