import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int bakiye = 1000;

        System.out.println("=== ATM UYGULAMASI ===");
        System.out.println("1- Para Yatır");
        System.out.println("2- Para Çek");
        System.out.println("3- Bakiye Sorgula");
        System.out.print("Seçiminiz: ");

        int secim = input.nextInt();

        if (secim == 1) {
            System.out.println("Yatırılacak miktar: ");
            int miktar = input.nextInt();
            bakiye += miktar;
            System.out.println("Yeni bakiye: " + bakiye);
        } else if (secim == 2) {
            System.out.println("Çekilecek miktar: ");
            int miktar = input.nextInt();

            if (miktar <= bakiye) {
                bakiye -= miktar;
                System.out.println("Yeni bakiye: " + bakiye);
            } else {
                System.out.println("Yetersiz bakiye! ");
            }
        } else if (secim == 3) {
            System.out.println("Mevcut bakiye: " + bakiye);
        } else {
            System.out.println("Geçersiz seçim! ");
        }
    }
}
