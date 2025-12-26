import java.util.Scanner;

public class SpeedCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi giriniz (km): ");
        double mesafe = input.nextDouble();

        System.out.print("Süreyi giriniz (saat): ");
        double sure = input.nextDouble();

        double hiz = calculateSpeed(mesafe, sure);
        double hizMs = convertKmHToMs(hiz);
        String yorum = speedCategory(hiz);

        System.out.println("Ortalama hız: " + hiz + " km/s");
        System.out.println("Ortalama hız: " + hizMs + " m/s");
        System.out.println("Hız yorumu: " + yorum);

        input.close();
    }

    public static double calculateSpeed(double mesafe, double sure) {
        if (sure <= 0) {
            System.out.println("Hata: Süre sıfır veya negatif olamaz.");
        }
        return mesafe / sure;
    }

    public static double convertKmHToMs(double hiz) {
        return hiz * 1000 / 3600;
    }

    public static String speedCategory(double hiz) {
        if (hiz < 5) {
            return "Yürüyüş hızı";
        } else if (hiz < 15) {
            return "Koşu / Bisiklet hızı";
        } else if (hiz < 90) {
            return "Araç hızı";
        } else {
            return "Yüksek hız";
        }
    }
}
