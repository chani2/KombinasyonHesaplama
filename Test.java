 import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // n! = 1 * 2 * 3 * 4 * ... * n
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, kombinasyon;
        int total  = 1;
        int total2 = 1;
        int total3 = 1;

        System.out.println("Kume elemen sayisi giriniz : ");
        sayi1 = input.nextInt();
        System.out.println("Kume kombinasyon sayisi giriniz : ");
        sayi2 = input.nextInt();
        for ( int i = 1; i <= sayi1; i++ ){
            total *= i;
        }
        for ( int k = 1; k <= sayi2; k++ ){
            total2 *= k;
        }
        int sayi3 = sayi1 - sayi2 ;
        for (int j = 1; j <= sayi3; j++){
            total3 *= j;
        }

        kombinasyon = total / (total2*(total3));
        System.out.println(kombinasyon);
    }
}