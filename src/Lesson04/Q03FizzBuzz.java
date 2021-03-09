package Lesson04;

import java.util.Scanner;

public class Q03FizzBuzz {
    public static void main(String[] args) {
         /* FizzBuzz is a well known programming assignment, asked during interviews.
        Klavyeden girilen bir sayı girilecek
        0 dan n sayısına kadar 3 e bolunebilen sayının yerine fizz
        5 e bölünebilen sayının yerine buzz
        Hem 3 hem de 5 e bölünebilen sayının yerine FizzBuzz yazacak program
        İnput: 20
        Output: 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayıyı gir: ");
        int num = scan.nextInt();

        for (int i=1; i<= num; i++) {

            if ( i % 3 == 0  && i % 5 == 0 ) {
                System.out.print(" FizzBuzz ");
            }
            else if ( i % 5 == 0) {
                System.out.print(" Buzz ");
            }
            else if (i % 3 == 0) {
                System.out.print(" Fizz ");
            } else {
                System.out.print(i + " ");
            }

        }






    }
}
