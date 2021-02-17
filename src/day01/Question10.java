package day01;

import java.util.Scanner;

/*
Soru 10: Patron çalışanlarına yaslarına göre zam yapacak
	40 yaş üstüne %15, altında ise %30
	Yas ve eski maaş bilgileri kullanıcıdan alınacak
 */
public class Question10 {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Yasınızı giriniz: ");
        int yas = scan.nextInt();

        System.out.print("Maasınız giriniz: ");
        double maas = scan.nextInt();

        double yeniMaas = (yas>40) ? maas*1.15 : maas*1.3;

        System.out.println("Yeni maasınız : " + yeniMaas);

    }
}
