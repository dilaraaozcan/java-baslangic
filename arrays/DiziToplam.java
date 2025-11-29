public class Main{
    public static void main(String[] args){

        int[] sayilar = {10, 20, 30, 40, 50};
        int toplam = 0;

        for (int sayi : sayilar) {
            toplam += sayi;
        }
        System.out.println("Dizi toplamı: " + toplam);
    }
}
