import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("=== MENÜ ===");
        System.out.println("1. Üçgen ");
        System.out.println("2. Daire ");
        System.out.println("Bir seçenek seçiniz: ");
        int secim = input.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Üçgenin kenarlarını girin: ");
                double a = input.nextDouble();
                double b = input.nextDouble();
                double c = input.nextDouble();

                if (a + b > c && a + c > b && b + c > a) {
                    double s = (a + b + c) / 2;
                    double cevre = a + b + c;
                    double alan = Math.sqrt(s*(s-a)*(s-b)*(s-c));
                    System.out.println("Çevre: " + cevre);
                    System.out.println("Alan " + alan);
                } else {
                    System.out.println("Geçersiz şekil. ");
                }
                break;
            case 2:
                System.out.println("Yarıçap değeri girin: ");
                double r = input.nextDouble();
                double PI = 3.14;
                if (r > 0){
                    double cevre = 2*r*PI;
                    double alan = r*r*PI;
                    System.out.println("Çevre: " + cevre);
                    System.out.println("Alan " + alan);
                } else {
                    System.out.println("Geçersiz şekil. ");
                }
                break;
            default:
                System.out.println("Geçersiz secim. ");
        }
    }
}