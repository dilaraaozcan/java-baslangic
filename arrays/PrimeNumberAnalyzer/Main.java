import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int asalSayiToplam = 0;
        String asalSayilar = "";
        int asalOlmayanToplam = 0;
        String asalOlmayanSayilar = "";

        System.out.println(" ASAL SAYI BULMA UYGULAMASI ");
        System.out.println("----------------------------");

        System.out.print("Dizi uzunluğunu giriniz: ");
        int diziUzunluk = input.nextInt();
        input.nextLine();

        int[] sayilar = new int[diziUzunluk];

        for(int i =0 ; i < diziUzunluk; i++){
            System.out.print("Dizinin "+i+ ". elemanını giriniz: ");
            sayilar[i] = input.nextInt();
        }
        for (int sayi : sayilar) {
            boolean asalMi = true;

            if (sayi < 2){
                asalMi = false;
            } else {
                for(int j =2; j < sayi; j++) {
                    if (sayi % j == 0){
                        asalMi = false;
                        break;
                    }
                }
            }
            if(asalMi){
                asalSayiToplam += sayi;
                asalSayilar += String.valueOf(sayi) + " ";
            } else  {
                asalOlmayanToplam += sayi;
                asalOlmayanSayilar += String.valueOf(sayi) + " ";
            }
        }
        System.out.println("---------ÖZET TABLO---------");
        System.out.println("ASAL SAYILAR");
        System.out.println("Asal sayılar: " + asalSayilar);
        System.out.println("Asal sayıların toplamı: " + asalSayiToplam);
        System.out.println("Asal olmayan sayılar: " + asalOlmayanSayilar);
        System.out.println("Asal olmayan sayıların toplamı: " + asalOlmayanToplam);

    }
}
