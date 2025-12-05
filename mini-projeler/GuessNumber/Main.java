import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hedefSayi = (int)(Math.random() * 100);  // 0-99
        System.out.println("Bir sayı tuttum! (0 - 99 arası)");

        int deneme = 0;

        while (true) {
            System.out.print("Tahmininizi giriniz: ");
            int guess = input.nextInt();
            deneme++;

            // Negatif veya 100 üzeri tahmine ufak kontrol
            if (guess < 0 || guess > 99) {
                System.out.println("Lütfen 0 ile 99 arasında bir sayı giriniz!");
                continue;
            }

            // UP / DOWN mantığı
            if (guess < hedefSayi) {
                System.out.println("UP");

                // Yakınlık ipucu
                if (hedefSayi - guess <= 5) {
                    System.out.println("Çok yaklaştın!");
                }

            } else if (guess > hedefSayi) {
                System.out.println("DOWN");

                // Yakınlık ipucu
                if (guess - hedefSayi <= 5) {
                    System.out.println("Çok yaklaştın!");
                }

            } else {
                System.out.println("🎉 Tebrikler! Doğru tahmin!");
                break;
            }
        }

        System.out.println("Toplam deneme sayısı: " + deneme);
        input.close();
    }
}
