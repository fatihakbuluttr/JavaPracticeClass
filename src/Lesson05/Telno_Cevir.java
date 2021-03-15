package Lesson05;

import java.util.Arrays;
import java.util.Scanner;

public class Telno_Cevir {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Tel no gir: ");
        String tel=scan.next();

        String [] arr=tel.split("");

       for(String w:arr){
           switch (w){
               case "0":System.out.print("sıfır "); break;
               case "1":System.out.print("bir "); break;
               case "2":System.out.print("iki "); break;
               case "3":System.out.print("üç "); break;
               case "4":System.out.print("dört ");break;
               case "5":System.out.print("beş ");break;
               case "6":System.out.print("altı "); break;
               case "7":System.out.print("yedi ");break;
               case "8":System.out.print("sekiz ");break;
               case "9":System.out.print("dokuz ");break;

           }

       }
       //System.out.println(Arrays.toString(arr));
    }
}
