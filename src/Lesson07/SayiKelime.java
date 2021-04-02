package Lesson07;

import java.util.Scanner;

public class SayiKelime {
    public static final String[] rakamlar={"","bir","iki","üç","dört","beş","altı","yedi","sekiz","dokuz"};
    public static final String[] onlar={"","on","yirmi","otuz","kırk","elli","altmış","yetmiş","seksen","doksan"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi= scanner.nextInt();

        if(sayi<100){
            Cevir(sayi);
        }else {
            System.out.println("Sayı 100 den büyük");
        }
    }
    public static void Cevir(int n){
        int bir=n%10;
        int on=(n-bir)/10;
        System.out.println("Girilen sayı yazı olarak: "+onlar[on]+rakamlar[bir]);
    }
}
