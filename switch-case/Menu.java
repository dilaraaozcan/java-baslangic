import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Menü ===");
        System.out.println("1. Giriş");
        System.out.println("2. Hesap Makinesi");
        System.out.println("3. Çıkış");
        System.out.print("Lütfen bir seçenek seçin: ");
        int secim = scanner.nextInt();

        switch (secim) {

            case 1:
                System.out.print("Kullanıcı adı: ");
                String username = scanner.next();
                System.out.print("Şifre: ");
                String password = scanner.next();

                if (username.equals("admin") && password.equals("password123")) {
                    System.out.println("Giriş başarılı.");
                } else {
                    System.out.println("Giriş başarısız.");
                }
                break;

            case 2:
                System.out.println("1. Toplama");
                System.out.println("2. Çıkarma");
                System.out.println("3. Çarpma");
                System.out.println("4. Bölme");
                System.out.print("Lütfen bir işlem seçin (1-4): ");

                int islem = scanner.nextInt();

                System.out.println("İki sayı girin:");
                double num1 = scanner.nextDouble();
                double num2 = scanner.nextDouble();

                switch (islem) {

                    case 1:
                        System.out.println("Sonuç: " + (num1 + num2));
                        break;

                    case 2:
                        System.out.println("Sonuç: " + (num1 - num2));
                        break;

                    case 3:
                        System.out.println("Sonuç: " + (num1 * num2));
                        break;

                    case 4:
                        if (num2 == 0) {
                            System.out.println("Hata: Sıfıra bölünemez.");
                        } else {
                            System.out.println("Sonuç: " + (num1 / num2));
                        }
                        break;

                    default:
                        System.out.println("Geçersiz işlem.");
                }
                break;

            case 3:
                System.out.println("Programdan çıkılıyor...");
                break;

            default:
                System.out.println("Geçersiz seçenek.");
        }
    }
}
