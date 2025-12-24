import java.util.Scanner;
public class CharacterReplacer {

    public static String replaceCharacter(String metin, char targetChar, char replaceChar){
        String result = "";
        for(int i = 0; i < metin.length(); i++){
            if(metin.charAt(i) == targetChar) {
                result += replaceChar;
            } else {
                result += metin.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Bir metin giriniz: ");
        String metin = input.nextLine();

        System.out.print("Bir karakter giriniz: ");
        String karakter = input.nextLine();
        char targetChar = karakter.charAt(0);

        System.out.print("Yeni karakteri giriniz: ");
        String replaceStr = input.next();
        char replaceChar = replaceStr.charAt(0);

        String result = replaceCharacter(metin, targetChar, replaceChar);
        System.out.println("Değiştirilmiş Versiyon: " + result);
    }
}
