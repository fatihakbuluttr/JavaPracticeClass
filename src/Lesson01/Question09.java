package day01;

/*
Soru 9: patron çalışanlarına zam yapıyor %20 oranında,
eski maaşını giren çalışanın yeni massını gösteren program yazınız
 */

import java.util.Scanner;

public class Question09 {

    public static void main(String args[]) {

        Scanner giris = new Scanner(System.in);

        System.out.print("Eski maasınzı giriniz: ");
        double maas = giris.nextInt();

        double yeniMaas = maas * 1.2;

        System.out.println("Yeni maasınız: " + yeniMaas);

    }
}
