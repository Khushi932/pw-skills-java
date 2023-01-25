import java.util.Scanner;

public class pyramidNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height");
        int r = sc.nextInt();

        for(int i = 0 ; i<=r;i++){
            for(int j = 1; j<= r-i;j++){
                System.out.print(" ");
            }
            for (int k = 1 ; k<= i; k++){
                System.out.print(k);
            }
            for(int l = i-1;l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        int i,j,k;
        for(i=r+1;i>1;i--){
            for( j=1;j>2;j--){
                System.out.print(" ");
            }
            for( k=1;k<=r-i+1;k++){
                if(k==1){
                    System.out.print(r-i+2);
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int m=k;m>=1;m--){
                if(m==1){
                    System.out.print(r-i+2);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
