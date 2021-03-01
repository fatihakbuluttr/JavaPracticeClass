package Lesson02;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {

        int sayi, sayi2, i;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Baslangıc sayı giriniz:");
        sayi = scanner.nextInt();

        System.out.print("Bitis sayı giriniz:");
        sayi2 = scanner.nextInt();

        for(i=sayi;i<=sayi2;i++){

            if (i % 2 == 0) {

                System.out.print(i + " ");
        }


        }
    }
    }
