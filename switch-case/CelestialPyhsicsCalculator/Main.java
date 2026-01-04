import java.util.Scanner;
public class CelestialPhysicsCalculator {
    static final double G = 6.674 * Math.pow(10, -11);

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("---MENÜ---");
        System.out.println("1. Dünya ");
        System.out.println("2. Mars ");
        System.out.println("3. Jüpiter ");
        System.out.println("4. Ay ");
        System.out.print("Seçiminiz: ");
        int secim = input.nextInt();

        System.out.println("Şimdi ne hesaplamak istersiniz? ");
        System.out.println("1- Yerçekimi ivmesi ");
        System.out.println("2- Kaçış Hızı ");
        System.out.println("3- Yörünge Hızı ");
        System.out.print("Seçiminiz: ");
        int secim2 = input.nextInt();

        double kutle = 0;
        double yaricap = 0;

        switch (secim) {
            case 1:
                kutle = 5.97 * Math.pow(10, 24);
                yaricap = 6.37 * Math.pow(10, 6);
                break;
            case 2:
                kutle = 6.39 * Math.pow(10, 23);
                yaricap = 3.39 * Math.pow(10, 6);
                break;
            case 3:
                kutle = 1.89 * Math.pow(10, 27);
                yaricap = 6.99 * Math.pow(10, 7);
                break;
            case 4:
                kutle = 7.34 * Math.pow(10, 22);
                yaricap = 1.73 * Math.pow(10, 6);
                break;
            default:
                System.out.println("Geçersiz seçim! ");
                return;
        }

        double sonuc = 0;
        switch (secim2) {
            case 1:
                sonuc = hesaplaYercekimi(kutle, yaricap);
                System.out.printf("Yer çekimi: %.2f m/s^2\n", sonuc);
                break;
            case 2:
                sonuc = hesaplaKacisHizi(kutle, yaricap);
                double kmSaatKacis = sonuc * 3.6;
                System.out.printf("Kaçış hızı: %.2f m/s (%.2f km/saat)\n", sonuc, kmSaatKacis);
                break;
            case 3:
                sonuc = hesaplaYorungeHizi(kutle, yaricap);
                double kmSaatYorunge = sonuc * 3.6;
                System.out.printf("Yörünge hızı: %.2f m/s (%.2f km/saat)\n", sonuc, kmSaatYorunge);
                break;
            default:
                System.out.println("Geçersiz seçim! ");
                break;
        }
    }

    public static double hesaplaYercekimi (double kutle, double yaricap) {
        return ((G * kutle) / Math.pow(yaricap, 2));
    }

    public static double hesaplaKacisHizi (double kutle, double yaricap) {
        return Math.sqrt((2*G*kutle) / yaricap);
    }

    public static double hesaplaYorungeHizi (double kutle, double yaricap) {
        return Math.sqrt((G*kutle) / yaricap);
    }
}
