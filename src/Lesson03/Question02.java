package Lesson03;

public class Question02 {
    public static void main(String[] args) {

    /*differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) ➞ 82
        Smallest number is -50, biggest is 32.
         */

        int[] numbers={10,4,1,4,-10,-50,32,21};
        int max=0;
        int min=0;


        for(int i=0;i<numbers.length;i++) {
           if(max<numbers[i]) {
               max=numbers[i];
           }
            if(min>numbers[i]) {
                min=numbers[i];
            }

            if(numbers[i]%2==0){
                System.out.println("çift sayılar : "+numbers[i]);
            }
        }
        System.out.println("max: " +max);
        System.out.println("min: " +min);
        System.out.println("fark: "+(max-min));
    }
}
