import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== NOT HESAPLAYICISI ======");

        System.out.println("Ders adını giriniz: ");
        String ders = input.next();
        System.out.println("Dersin vize notunu giriniz: ");

        int vize;
        do {
            vize = input.nextInt();
        } while (vize < 0 || vize > 100);

        System.out.println("Dersin final notunu giriniz: ");
        int fin;
        do {
            fin = input.nextInt();
        } while (fin < 0 || fin > 100);

        double ortalama = (vize * 0.4) + (fin * 0.6);
        String harf = "";
        if (ortalama >= 90) {
            System.out.println("AA");
        } else if (ortalama >= 85) {
            harf = ("BA");
        } else if (ortalama >= 75) {
            harf = ("BB");
        } else if (ortalama >= 70) {
            harf = ("CB");
        } else if (ortalama >= 60) {
            harf = ("CC");
        } else if (ortalama >= 55) {
            harf = ("DC");
        } else if (ortalama >= 50) {
            harf = ("DD");
        } else {
            harf = ("FF");
        }
        String aciklama = "";
        switch (harf) {
            case "AA":
                aciklama = ("Tebrikler, en yüksek not!");
                break;
            case "BA":
                aciklama = ("Tebrikler, yüksek not!");
                break;
            case "BB":
                aciklama = ("Tebrikler, iyi not!");
                break;
            case "CB":
                aciklama = ("Tebrikler, güzel not!");
                break;
            case "CC":
                aciklama = ("Tebrikler!");
                break;
            case "DC":
                aciklama = ("Tebrikler, şartlı geçtiniz!");
                break;
            case "DD":
                aciklama = ("Şartlı geçtiniz!");
                break;
            default:
                aciklama = ("Dersten kaldınız!");
                break;
        }
        System.out.println("===== SONUÇLAR =====");
        System.out.println("Ders adı: " + ders);
        System.out.println("Vize notu: " + vize);
        System.out.println("Final notu: " + fin);
        System.out.println("Ortalama: " + ortalama);
        System.out.println("Harf notu: " + harf);
        System.out.println("Açıklama: " + aciklama);
    }
}
