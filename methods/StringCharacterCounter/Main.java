import java.util.Scanner;
public class StringCharacterCounter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("String'i Giriniz: ");
        String inputString = input.nextLine();

        System.out.print("Karakteri Giriniz: ");
        char targetChar = input.next().charAt(0);

        int result = countCharacter(inputString, targetChar);

        System.out.println("Karakter sayısı: " + result);

        input.close();
    }

    public static int countCharacter(String text, char character) {

        int count = 0;
        int index = 0;

        while (index < text.length()) {
            if (text.charAt(index) == character) {
                count++;
            }
            index++;
        }

        return count;
    }
}
