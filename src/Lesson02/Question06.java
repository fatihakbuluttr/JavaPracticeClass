package Lesson02;

import java.util.Scanner;

public class Question06 {
    public static void main(String[] args) {
        int num = 0,copy_num;
        copy_num=num;

        Scanner scanner = new Scanner(System.in);
        System.out.print("4 Haneli Bir sayı giriniz:");
        num = scanner.nextInt();
        int toplam = 0;

        for (int i = 0; i < 4; i++) {



            int son = num % 10;
            num = (num - son) / 10;
            toplam+= son;

        }
        System.out.println(copy_num+"rakamlar toplamı:"+toplam);
    }
}
