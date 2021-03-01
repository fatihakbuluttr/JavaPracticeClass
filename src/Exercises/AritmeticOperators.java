package Exercises;

import java.util.Scanner;

public class AritmeticOperators {
    public static void main(String[] args) {
        /// Kullanici deger girsin
        Scanner scan = new Scanner (System.in);


        ///1. degeri girin
        System.out.println("Enter first number   ");
        int num1 = scan.nextInt();


        ///2. degeri girin
        System.out.println("Enter second number   ");
        int num2 = scan.nextInt();


        //toplama
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));


        //cikarma
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));


        //carpma
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));


        //bolme
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));


    }
}
