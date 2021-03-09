package Lesson04;

import java.util.Scanner;

public class Q06ReverseNumber {
    public static void main(String[] args) {
        /*Klavyeden girilen bir integer
        sayıyı tersten yazan program
        İnput: 4981
        Output: 1894
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Ters cevrilmesini istegin sayıyı gir: ");
        int num = scan.nextInt();
/*
        String str_num = Integer.toString(num);

        System.out.println("birinci cozum yolu");
        for (int i = str_num.length()-1; i>=0; i--) {
            System.out.print(str_num.charAt(i));
        }

        System.out.println();
        System.out.println("====================");

 */
        System.out.println("İkinci cozum yolu");
        int ters = 0;
        int son;

        do {
            son = num % 10; // sayı: 1234, son:4
            num = num /10; //  num:123
            ters = ters * 10 + son; //

        } while(num>0);

        System.out.println(ters);







    }
}
