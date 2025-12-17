import java.util.Scanner;
public class GeometryApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Geometrik Şekil Alan Hesaplayıcı ---");

        System.out.print("Dikdörtgenin kısa kenarı: ");
        double kisa = input.nextDouble();
        System.out.print("Dikdörtgenin uzun kenarı: ");
        double uzun = input.nextDouble();
        System.out.println("Dikdörtgenin Alanı: " + dikdortgenAlan(kisa, uzun));

        System.out.println("---------------------------------------");

        System.out.print("Üçgenin taban uzunluğu: ");
        double taban = input.nextDouble();
        System.out.print("Üçgenin yüksekliği: ");
        double yukseklik = input.nextDouble();
        System.out.println("Üçgenin Alanı: " + ucgenAlan(taban, yukseklik));

        System.out.println("---------------------------------------");

        System.out.print("Dairenin yarıçapı: ");
        double yariCap = input.nextDouble();
        System.out.println("Dairenin Alanı: " + daireAlan(yariCap));

        input.close();
    }

    public static double dikdortgenAlan(double a, double b) {
        return a * b;
    }

    public static double ucgenAlan(double taban, double yukseklik) {
        return (taban * yukseklik) / 2;
    }

    public static double daireAlan(double r) {
        return Math.PI * r * r;
    }
}
