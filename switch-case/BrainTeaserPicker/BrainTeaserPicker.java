import java.util.Scanner;

public class BrainTeaserPicker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== Zeka Testi Seçici =====");
        System.out.println("1 - Kolay Soru");
        System.out.println("2 - Orta Seviye Soru");
        System.out.println("3 - Zor Soru");
        System.out.println("4 - Aşırı Zor Soru");
        System.out.print("Seçiminiz: ");

        int secim = input.nextInt();
        input.nextLine(); // buffer temizleme

        switch (secim) {
            case 1:
                System.out.println("Kolay Soru: 2, 4, 6, 8, ? Dizisinin sonraki sayısı nedir?");
                System.out.print("Cevabınız: ");
                int cevap1 = input.nextInt();
                if (cevap1 == 10) {
                    System.out.println("Doğru!");
                } else {
                    System.out.println("Yanlış! Doğru cevap: 10");
                }
                break;

            case 2:
                System.out.println("Orta Soru: Bir saatte akrep ve yelkovan kaç kez üst üste gelir?");
                System.out.print("Cevabınız: ");
                int cevap2 = input.nextInt();
                if (cevap2 == 1) {
                    System.out.println("Doğru!");
                } else {
                    System.out.println("Yanlış! Doğru cevap: 1");
                }
                break;

            case 3:
                System.out.println("Zor Soru: Bir sayı 6 ile çarpılıp 9 çıkarıldığında, aynı sayının 3 ile çarpılıp 4 eklendiğinden 20 fazladır. Bu sayı kaçtır?");
                System.out.print("Cevabınız: ");
                int cevap3 = input.nextInt();

                if (cevap3 == 11) {
                    System.out.println("Doğru! Denklem: 6x - 9 = 3x + 24 → x = 11");
                } else {
                    System.out.println("Yanlış! Doğru cevap: 11");
                }
                break;

            case 4:
                System.out.println("Aşırı Zor Soru: Bir pozitif tam sayının 3 katına 4 eklendiğinde sonuç, sayının 5 katından 10 eksiktir. Bu sayı kaçtır?");
                System.out.print("Cevabınız: ");
                int cevap4 = input.nextInt();

                if (cevap4 == 7) {
                    System.out.println("Doğru! Denklem: 3x+4 = 5x-10 → x = 7");
                } else {
                    System.out.println("Yanlış! Doğru cevap: 7");
                }
                break;

            default:
                System.out.println("Geçersiz seçim! 1–4 arası bir değer girin.");
                break;
        }

        input.close();
    }
}
