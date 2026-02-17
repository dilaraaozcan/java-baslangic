import java.util.Scanner;

public class SmartCityAssistant {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adı: ");
        String isim = input.nextLine();

        System.out.print("PIN oluştur: ");
        int pin = input.nextInt();

        System.out.print("PIN gir: ");
        int girilenPin = input.nextInt();

        if (girilenPin != pin) {
            System.out.println("Giriş başarısız.");
            return;
        }

        System.out.println("1-Taksi  2-Elektrik  3-Sağlık");
        System.out.print("Seçim: ");
        int secim = input.nextInt();

        double sonuc = 0;
        double bmi = 0;
        double ideal = 0;

        switch (secim) {

            case 1:
                System.out.print("Mesafe (km): ");
                double km = input.nextDouble();

                System.out.print("Zaman (day/night): ");
                String zaman = input.next();

                System.out.print("Hafta sonu (yes/no): ");
                String hafta = input.next();

                double tarife = 0;

                if (zaman.equalsIgnoreCase("day")) tarife = 1.5;
                else if (zaman.equalsIgnoreCase("night")) tarife = 2.0;
                else {
                    System.out.println("Geçersiz zaman.");
                    return;
                }

                sonuc = 3 + km * tarife;
                if (hafta.equalsIgnoreCase("yes")) sonuc *= 1.10;

                System.out.printf("Taksi Ücreti: $%.2f\n", sonuc);
                break;

            case 2:
                System.out.print("Tüketim (kWh): ");
                int kwh = input.nextInt();

                if (kwh <= 100) sonuc = kwh * 0.5;
                else if (kwh <= 200) sonuc = (100 * 0.5) + (kwh - 100) * 0.75;
                else sonuc = (100 * 0.5) + (100 * 0.75) + (kwh - 200) * 1.2;

                if (sonuc > 100) sonuc *= 1.05;

                System.out.println("Toplam Fatura: $" + sonuc);
                break;

            case 3:
                System.out.print("Cinsiyet (M/F): ");
                String cinsiyet = input.next();

                System.out.print("Boy (m): ");
                double boy = input.nextDouble();

                System.out.print("Kilo (kg): ");
                double kilo = input.nextDouble();

                bmi = kilo / (boy * boy);

                if (cinsiyet.equalsIgnoreCase("M")) ideal = 22 * boy * boy;
                else ideal = 21 * boy * boy;

                ideal = Math.round(ideal * 10.0) / 10.0;

                System.out.printf("BMI: %.2f\n", bmi);
                System.out.printf("İdeal Kilo: %.1f kg\n", ideal);
                break;

            default:
                System.out.println("Geçersiz seçim.");
                return;
        }

        System.out.println("\n=== ÖZET ===");

        if (secim == 3) {
            System.out.printf("BMI: %.2f | İdeal Kilo: %.1f kg\n", bmi, ideal);
        } else {
            System.out.println("Toplam Tutar: $" + sonuc);
        }

        System.out.println("Teşekkürler!");
    }
}
