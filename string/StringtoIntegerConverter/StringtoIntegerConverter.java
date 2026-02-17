import java.util.Scanner;
public class StringtoIntegerConverter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Bir tamsayı giriniz: ");
        String text = input.nextLine();

        int sonuc = 0;
        boolean negatif = false;
        int baslangicIndex = 0;

        // Sadece "-" girilirse
        if (text.length() == 1 && text.charAt(0) == '-') {
            System.out.println("Geçersiz sayı");
            return;
        }

        // Negatif kontrolü
        if (text.charAt(0) == '-') {
            negatif = true;
            baslangicIndex = 1;
        }

        // Sayı dönüşümü
        for (int i = baslangicIndex; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c < '0' || c > '9') {
                System.out.println("Geçersiz karakter: sadece rakam giriniz!");
                return;
            }

            int digit = c - '0';
            sonuc = sonuc * 10 + digit;
        }

        if (negatif) {
            sonuc = -sonuc;
        }

        System.out.println("Dönüştürülen tamsayı: " + sonuc);
    }
}
