import java.util.Scanner;
public class ArrayStatisticsAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz? ");
        int adet = input.nextInt();
        int[] sayilar = new int[adet];

        for (int i = 0; i < adet; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            sayilar[i] = input.nextInt();
        }

        int enBuyuk = sayilar[0];
        int enKucuk = sayilar[0];
        int toplam = 0;

        for (int sayi : sayilar) {
            if (sayi > enBuyuk) enBuyuk = sayi;
            if (sayi < enKucuk) enKucuk = sayi;
            toplam += sayi;
        }
        double ortalama = (double) toplam / adet;

        String tekrarlar = "";
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = i + 1; j < sayilar.length; j++) {
                if (sayilar[i] == sayilar[j] && !tekrarlar.contains(String.valueOf(sayilar[i]))) {
                    tekrarlar += sayilar[i] + " ";
                }
            }
        }

        System.out.println("\n--- DİZİ ANALİZ RAPORU ---");
        System.out.println("En Büyük Sayı  : " + enBuyuk);
        System.out.println("En Küçük Sayı  : " + enKucuk);
        System.out.println("Sayıların Toplamı : " + toplam);
        System.out.printf("Ortalama         : %.2f\n", ortalama);
        System.out.println("Tekrar Edenler   : " + (tekrarlar.equals("") ? "Yok" : tekrarlar));
        System.out.println("--------------------------");
    }
}
