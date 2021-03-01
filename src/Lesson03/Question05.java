package Lesson03;

import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {

        /* girilen sayi asal mı

         */


        Scanner girdi = new Scanner(System.in);
        System.out.print("Bir sayı Griniz...>");
        int sayi = girdi.nextInt();
        boolean asalmi=true;
        for (int i = 2; i <sayi; i++) {
            if(sayi%i==0){
               asalmi=false;

            }

        }
        System.out.println(sayi+" sayısı asal mı: "+asalmi);


    }
}
