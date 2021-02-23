package day01;
/*
Soru 8:  Ali’nin notu 45
	Veli’nin notu 65
	Ayse’nin notu 60

Ogretmen sınav notlarını cok dusuk olduğunu görünce soyle birseye karar veriyor
50 nin altında alanlara +20 puan
50 nin üzerinde alanlara +30 puan ekleyecek

Bunu yapan program ternary operatör kullanarak
Not: Sınavda 70 den fazla alan yokmus

 */

public class Question08 {

    public static void main (String args[]) {
        int ali = 45;
        int veli = 65;
        int ayse = 60;

        ali = (ali>50) ? ali+30 : ali+20;
        veli = (veli>50) ? veli+30 : veli+20;
        ayse = (ayse>50) ? ayse+30 : ayse+20;

        System.out.println("ali'nin yeni notu: " + ali);
        System.out.println("veli'nin yeni notu: " + veli);
        System.out.println("ayse'nin yeni notu: " + ayse);
    }
}
