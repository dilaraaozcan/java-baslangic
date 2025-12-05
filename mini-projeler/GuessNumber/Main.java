import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hedefSayi = (int)(Math.random() * 101);  // 0–100 dahil
        System.out.println("Bir sayı tuttum! (0 - 100 arası)");

        int deneme = 0;
        int gecersizGiris = 0;

        while (true) {
            System.out.print("Tahmininizi giriniz: ");
            int guess = input.nextInt();

            // Aralık dışı giriş kontrolü
            if (guess < 0 || guess > 100) {
                gecersizGiris++;
                if (gecersizGiris == 1) {
                    System.out.println("Geçersiz giriş! Lütfen 0-100 arasında bir sayı giriniz.");
                    continue;
                } else {
                    System.out.println("İkinci kez geçersiz giriş yaptınız. Oyun sonlandırıldı.");
                    break;
                }
            }

            deneme++;

            if (guess < hedefSayi) {
                System.out.println("UP");
                if (hedefSayi - guess <= 5) System.out.println("Çok yaklaştın!");
            } else if (guess > hedefSayi) {
                System.out.println("DOWN");
                if (guess - hedefSayi <= 5) System.out.println("Çok yaklaştın!");
            } else {
                System.out.println("Tebrikler! Doğru tahmin!");
                break;
            }
        }

        System.out.println("Toplam deneme sayısı: " + deneme);
        input.close();
    }
}
