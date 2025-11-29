import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Yaşınızı giriniz: ");
        int yas = input.nextInt();

        if (yas >= 18) {
            System.out.println("Reşitsiniz. ");
        } else {
            System.out.println("Reşit değilsiniz. ");
        }
    }
}
