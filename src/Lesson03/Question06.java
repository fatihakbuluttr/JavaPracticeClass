package Lesson03;

public class Question06 {
    public static void main(String[] args) {

        for (int k=1; k<=100; k++) {
            boolean asalmi = true;
            if (k == 1) {
                asalmi=false;
                System.out.println(k + " asal mı = " + asalmi);
                continue;
            }
            for (int i=2; i<k; i++) {
                if(k % i == 0 ) {
                    asalmi = false;
                }
            }
            System.out.println(k + " asal mı = " + asalmi);
        }
    }
}
