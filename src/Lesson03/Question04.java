package Lesson03;

import java.sql.Array;
import java.util.Arrays;

public class Question04 {
    public static void main(String[] args) {
/* sortNumsAscending([1, 2, 10, 50, 5]) ➞ [1, 2, 5, 10, 50]


        int[] int_array = {1,2,10,50,5};
        Arrays.sort(int_array);

        for (int i = 0; i < int_array.length; i++) {
            System.out.print(int_array[i]+", ");
        }
        System.out.println(Arrays.toString(int_array));

 */


        int a [] = {1, 2, -10, 50, 5};
        System.out.println(Arrays.toString(a));
        for (int i=0; i<a.length; i++) {
            for(int j=0; j<a.length; j++) {
                if (a[i] < a[j]) {//
                    int yedek = a[i];//
                    a[i] = a[j]; //
                    a[j] = yedek;
                }
            }
        }

        System.out.println(Arrays.toString(a));

    }
}
