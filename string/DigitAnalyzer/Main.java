import java.util.Scanner;
public class DigitAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        String sayi = input.nextLine();

        int toplam = 0;
        int max = 0;
        int cift = 0;
        int tek = 0;
        boolean sifirVar = false;
        String ters = "";

        for (int i = 0; i < sayi.length(); i++) {
            char ch = sayi.charAt(i);

            if (ch < '0' || ch > '9') {
                System.out.println("Geçersiz karakter! Lütfen sadece sayı giriniz.");
                return;
            }

            int digit = ch - '0';

            toplam += digit;

            if (digit > max) {
                max = digit;
            }

            if (digit % 2 == 0) {
                cift++;
            } else {
                tek++;
            }

            if (digit == 0) {
                sifirVar = true;
            }

            ters = ch + ters;
        }

        boolean palindrome = ters.equals(sayi);
        
        System.out.println("Basamak Toplamı: " + toplam);
        System.out.println("En Büyük Basamak: " + max);
        System.out.println("Çift Basamak Sayısı: " + cift);
        System.out.println("Tek Basamak Sayısı: " + tek);
        System.out.println("Sıfır İçeriyor mu: " + (sifirVar ? "Evet" : "Hayır"));
        System.out.println("Ters Hali: " + ters);
        System.out.println("Palindrome mu: " + (palindrome ? "Evet" : "Hayır"));
    }
}
