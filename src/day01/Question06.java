package day01;

/*
soru 6:		a = 4
		b = 5
		c = 3
 ucgenin kenar uzunlukları veriliyor eşkenar mı değil mi kontrol edelim

Ternary operator

 */

public class Question06 {

    public static void main(String[] args) {

        int a = 5;
        int b = 5;
        int c = 3;

        boolean result = ( a==b) && (b==c) && (a==c);
        System.out.println("eskenar mı:" + result);
    }

}
