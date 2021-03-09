package Lesson04;

import java.util.Scanner;

public class Q04CanToFhr {
    public static void main(String[] args) {
        /*Celsius to Fahrenheit
        You are making a Celsius to Fahrenheit converter.
        Write a function to take the Celsius value as an argument and return the corresponding Fahrenheit value.
        Sample Input:  36
        Sample Output: 96.8
        The following equation is used to calculate the
        Fahrenheit value: 9/5 * celsius + 32
        white_check_mark eyes raised_hands
         */
        double celcius, fahren;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter temp. in Celsius : ");
        celcius=s.nextDouble();

        Fah_hesapla(celcius);

        System.out.println(Fah_hesapla_1(30));

        // Fah_hesapla(200);
        //Fah_hesapla(50);
    }
    public static void Fah_hesapla(double cel) {
        double fahren = 0;
        fahren = cel* 9/5 + 32;
        System.out.println(fahren);
        }

    public static double Fah_hesapla_1(double cel) {
        double fahren = 0;
        fahren = cel* 9/5 + 32;
        return fahren;
    }
}
