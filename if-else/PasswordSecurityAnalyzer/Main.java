import java.util.Scanner;
public class PasswordSecurityAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Şifrenizi giriniz: ");
        String sifre = input.nextLine();

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        boolean hasSpace = false;

        for (int i = 0; i < sifre.length(); i++) {
            char c = sifre.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                hasUpper = true;
            } else if (c >= 'a' && c <= 'z') {
                hasLower = true;
            } else if (c >= '0' && c <= '9') {
                hasDigit = true;
            } else if (c == ' ') {
                hasSpace = true;
            } else {
                hasSpecial = true;
            }

            if (hasSpace) {
                System.out.println("Şifre boşluk içeremez! ");
                return;
            }
        }

        int puan = 0;
        puan += hasUpper ? 1 : 0;
        puan += hasLower ? 1 : 0;
        puan += hasSpecial ? 1 : 0;
        puan += hasSpace ? 1 : 0;

        String guc;
        if (puan == 4) {
            guc = "Çok Güçlü";
        } else if (puan == 3) {
            guc = "Güçlü";
        } else if (puan == 2) {
            guc = "Orta";
        } else if (puan == 1) {
            guc = "Zayıf";
        } else {
            guc = "Çok Zayıf";
        }

        System.out.println("Şifre Analizi: ");
        System.out.println("Büyük Harf: " + hasUpper);
        System.out.println("Küçük Harf: " + hasLower);
        System.out.println("Rakam: " + hasDigit);
        System.out.println("Özel Karakter: " + hasSpecial);
        System.out.println("Şifre Gücü: " + guc);
    }
}
