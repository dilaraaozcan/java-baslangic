import java.util.Scanner;
public class StringChanger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir metin yazınız: ");
        String metin = input.nextLine();

        System.out.println("Büyük harf " + metin.toUpperCase());
        System.out.println("Küçük harf " + metin.toLowerCase());

        char ilk = metin.charAt(0);
        char son = metin.charAt(metin.length() - 1);

        System.out.println("İlk karakter: " + ilk);
        System.out.println("Son karakter: " + son);

        String ters = "";

        for (int i = metin.length() - 1; i >= 0; i--) {
            ters += metin.charAt(i);
        }
        System.out.println("Ters metin: " + ters);
    }
}
