import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        int sonuc = 1;

        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;
        }
        System.out.println("Faktöriyel sonucu: " + sonuc);
    }
}
