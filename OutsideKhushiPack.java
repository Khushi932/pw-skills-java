import khushi.pack.*;
import org.w3c.dom.ls.LSOutput;

public class OutsideKhushiPack {
        public static void main(String[] args) {
                app obj = new app();
                System.out.printf("outside package , non child class "+obj.str1);
                app3 obj3 = new app3();
                obj3.printFromChildClass();
        }

}

class app3 extends app{
        void printFromChildClass(){
                app3 obj3 = new app3();
                System.out.println("From the child class "+obj3.str1);
        }
}
