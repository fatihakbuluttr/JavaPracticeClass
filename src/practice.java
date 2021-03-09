import java.util.Arrays;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        System.out.print("İstedigin karakteri gir: ");
        String ch = scan.next();

        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(ch);
            }
            System.out.println();

        }










    }
}
