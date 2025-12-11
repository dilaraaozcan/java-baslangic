import java.util.Scanner;

public class CollatzAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pozitif bir sayı giriniz: ");
        int n = input.nextInt();

        if (n <= 1) {
            System.out.println("Lütfen 1'den büyük pozitif bir sayı giriniz.");
            return;
        }

        int temp = n;
        int adim = 0;
        int maxDeger = n;

        System.out.print("Collatz Serisi: " + temp);

        while (temp != 1) {
            if (temp % 2 == 0) {
                temp = temp / 2;
            } else {
                temp = 3 * temp + 1;
            }

            System.out.print(" → " + temp);
            adim++;

            if (temp > maxDeger) {
                maxDeger = temp;
            }
        }

        System.out.println("\n\n--- ANALİZ SONUÇLARI ---");
        System.out.println("Başlangıç Sayısı : " + n);
        System.out.println("Toplam Adım Sayısı : " + adim);
        System.out.println("Ulaşılan En Büyük Değer : " + maxDeger);
        System.out.println("Collatz Doğrulaması: 1'e başarıyla ulaşıldı.");
    }
}
