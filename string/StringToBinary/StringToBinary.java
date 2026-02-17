import java.util.Scanner;
public class StringToBinary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        String metin = input.nextLine().trim();

        if (metin.length() == 0 || metin.equals("-") || metin.equals("+")) {
            System.out.println("Geçersiz giriş!");
            return;
        }

        boolean negatif = false;

        if (metin.charAt(0) == '-') {
            negatif = true;
            metin = metin.substring(1);
        } else if (metin.charAt(0) == '+') {
            metin = metin.substring(1);
        }

        int sonuc = 0;

        for (int i = 0; i < metin.length(); i++) {
            char ch = metin.charAt(i);

            if (ch < '0' || ch > '9') {
                System.out.println("Hata! Sadece rakam giriniz.");
                return;
            }

            int digit = ch - '0';
            sonuc = sonuc * 10 + digit;
        }

        if (negatif) {
            sonuc = -sonuc;
        }

        int sayi = Math.abs(sonuc);
        String binary = "";

        if (sayi == 0) {
            binary = "0";
        } else {
            while (sayi != 0) {
                int kalan = sayi % 2;
                binary = kalan + binary;
                sayi = sayi / 2;
            }
        }

        if (negatif) {
            binary = "-" + binary;
        }

        System.out.println("Binary karşılığı: " + binary);
    }
}
