package Lesson07;

import java.util.Scanner;

public class UsAlma { public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Tabanı giriniz : ");
    int t = scanner.nextInt();
    System.out.print("Üssü giriniz : ");
    int u = scanner.nextInt();
    System.out.println(usAl(2, 3));
}

    public static int usAl(int t, int u) {
        int snc = 1;
        for (int i = 1; i <= u; i++) {
            snc *= t;
        }
        return snc;
    }
}
