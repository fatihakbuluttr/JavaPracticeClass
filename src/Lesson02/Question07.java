package Lesson02;

public class Question07 {
    public static void main(String[] args) {

       int i = 0;

       for(i=0;i<100;i++){
           if(i%3==0){
               System.out.print(i+" ");
           }
       }
        System.out.println();
        for(i=0;i<100;i++){
            if(i%5==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for(i=0;i<100;i++){
            if(i%15==0){
                System.out.print(i+" ");
            }
        }



    }
}
