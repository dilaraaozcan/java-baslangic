import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Bir tam sayı giriniz: ");
        int sayi = input.nextInt();

        if (sayi <= 1) {
            System.out.println("Asal sayı değildir! ");
            return;
        }

        for (int i = 2; i < sayi; i++) {
            if(sayi % i == 0) {
                System.out.println(sayi + " bir asal sayı değildir! ");
                return;
            }
        }
        System.out.println(sayi + " bir asal sayıdır! ");
    }
}
