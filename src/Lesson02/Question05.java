package Lesson02;

import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {

        int not;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Baslangıc sayı giriniz:");
        not = scanner.nextInt();
        if (not <= 100 && not >= 0) {

            if (not < 50) {
                System.out.println("output:" + "D");
            } else if (not <= 70) {
                System.out.println("output:" + "C");
            } else if (not <= 85) {
                System.out.println("output:" + "B");
            } else {
                System.out.println("output:" + "A");
            }
        } else {
            System.out.println("yanlış not girdiniz");
        }

    }
}
