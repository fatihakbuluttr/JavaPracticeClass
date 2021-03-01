package Exercises;

import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {

        //// klavyeden girilen 5 tam sayinin ortalamasini bulan programi yazalim


        /// Kullanici deger girsin
        Scanner scan = new Scanner (System.in);


        ///1. degeri girin
        System.out.println("Input first number   ");
        int num1 = scan.nextInt();


        ///2. degeri girin
        System.out.println("Input second number   ");
        int num2 = scan.nextInt();


        ///3. degeri girin
        System.out.println("Input third number   ");
        int num3 = scan.nextInt();


        ///4. degeri girin
        System.out.println("Input forth number   ");
        int num4 = scan.nextInt();


        ///5. degeri girin
        System.out.println("Input fifth number   ");
        int num5 = scan.nextInt();


        ///ortalamayi al

        System.out.println("Average of five numbers is :   "+ (num1 + num2 +num3 + num4 + num5) / 5 );






    }

}
