import java.util.Scanner;

class algebra{
    int a,b;
    algebra( int x,int y){
        System.out.println("Constructor of algebra is called");
        a=x;
        b=y;
    }

    int add(){
        int sum;
        sum=a+b;
        return sum;
    }
    int sub(){
        int sub = a-b;
        return sub;
    }
    int mul(){
        return a*b;
    }
}
public class method {
    public static void main(String[] args) {
       // algebra sum = new algebra();
        algebra obj = new algebra(5,7);
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt() , y = sc.nextInt();
        System.out.println("Sum of input number is ");
       // int ans = obj.add(x,y);
        int ans = obj.add();
       System.out.println(ans);
        System.out.println(obj.sub());
        System.out.println(obj.mul());

        algebra obj2 = new algebra(10,67);
        System.out.println(obj2.sub());
        System.out.println(obj2.mul());
        System.out.println(obj2.add());

       /* System.out.println(Math.sqrt(24));
        System.out.println(Math.sqrt(16));

        System.out.println(Math.floor(5.9));
        System.out.println(Math.ceil(5.5));

        */

    }
}