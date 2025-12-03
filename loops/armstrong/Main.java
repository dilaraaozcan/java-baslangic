import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== ARMSTRONG SAYI KONTROLÜ ===");
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        if (sayi < 0) {
            System.out.println("Negatif sayılar için Armstrong kontrolü yapılmadı.");
            return;
        }

        int orijinalSayi = sayi;
        int toplam = 0;

        int basamakSayisi = String.valueOf(sayi).length();
        System.out.println("Sayının basamak sayısı: " + basamakSayisi);

        while (sayi != 0) {
            int basamak = sayi % 10;
            int kuvvet = (int) Math.pow(basamak, basamakSayisi);
            System.out.println(basamak + "^" + basamakSayisi + " = " + kuvvet);
            toplam += kuvvet;
            sayi /= 10;
        }

        System.out.println("Basamak üslerinin toplamı: " + toplam);

        if (toplam == orijinalSayi) {
            System.out.println(orijinalSayi + " bir Armstrong sayıdır.");
        } else {
            System.out.println(orijinalSayi + " bir Armstrong sayı değildir.");
        }

        input.close();
    }
}
