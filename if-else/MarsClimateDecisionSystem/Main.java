import java.util.Scanner;
public class MarsClimateDecisionSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mars yüzey sıcaklığını giriniz: ");
        int sicaklik = input.nextInt();

        if (sicaklik < -150 || sicaklik > 50) {
            System.out.println("HATA: Sensör verisi Mars için geçerli aralığın dışında.");
            System.out.println("Kabul edilen aralık: -150°C ile +50°C");
            input.close();
            return;
        }

        if (sicaklik < -60) {

            System.out.println("İklim Durumu : AŞIRI SOĞUK — koruyucu kıyafet zorunlu");
            System.out.println("Risk Seviyesi: YÜKSEK");
            System.out.println("Maks. Görev  : 10 dakika");

            if (sicaklik < -100) {
                System.out.println("UYARI        : Kritik sistem donma riski");
            }

        } else if (sicaklik >= -60 && sicaklik < -20) {

            System.out.println("İklim Durumu : SOĞUK — maruziyet sınırlandırılmalı");
            System.out.println("Risk Seviyesi: ORTA");
            System.out.println("Maks. Görev  : 30 dakika");

            if (sicaklik < -50) {
                System.out.println("UYARI        : Buz sisi nedeniyle görüş azalabilir");
            }

        } else if (sicaklik >= -20 && sicaklik < 10) {

            System.out.println("İklim Durumu : ILIK — kısa görevler için uygun");
            System.out.println("Risk Seviyesi: DÜŞÜK");
            System.out.println("Maks. Görev  : 2 saat");

            if (sicaklik > 5) {
                System.out.println("BİLGİ        : Sıcaklık artış eğiliminde");
            }

        } else {

            System.out.println("İklim Durumu : SICAK — uygun koşullar");
            System.out.println("Risk Seviyesi: MİNİMAL");
            System.out.println("Maks. Görev  : Sınırsız");

        }

        input.close();
    }
}
