public class continueKeyword {
    public static void main(String[] args) {
        int num;
//      myloop: for(num =1;num<=50;num++){
//            if(num % 3 == 0){
//                continue myloop;
//            }
//            System.out.println(num);
//        }

        num=1;
        while(num <=50){
            if(num % 3 ==0){
                num++;
                continue;
            }
            System.out.println(num);
            num++;
        }
    }
}
