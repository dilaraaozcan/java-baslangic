import java.util.ArrayList;
import java.util.Scanner;

public class PersonnelSalarySystem {
    public static void main(String[] args) {
       
        ArrayList<Object[]> personeller = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- PERSONEL MAAŞ SİSTEMİ ---");
            System.out.println("1- Veri Girişi");
            System.out.println("2- Listele");
            System.out.println("3- Çıkış");
            System.out.print("Seçiminiz: ");
            String secim = input.nextLine();

            if (secim.equals("1")) {
                System.out.print("Personel Adını giriniz: ");
                String personelAdi = input.nextLine();

                System.out.println("Personel Türü:");
                System.out.println("1- Tam Zamanlı (TZ)");
                System.out.println("2- Yarı Zamanlı (YZ)");
                System.out.print("Seçiminiz: ");
                String secim2 = input.nextLine();

                double maas = 0;

                if (secim2.equals("1")) {
                    System.out.print("Taban Ücretini giriniz: ");
                    double tabanUcret = Double.parseDouble(input.nextLine());
                    System.out.print("Aylık Satış Tutarını giriniz: ");
                    double aylikSatis = Double.parseDouble(input.nextLine());

                    double prim = aylikSatis * 0.02;
                    maas = tabanUcret + prim;

                } else if (secim2.equals("2")) {
                    System.out.print("Çalışılan Saati giriniz: ");
                    double calisilanSaat = Double.parseDouble(input.nextLine());
                    System.out.print("Saat Ücretini giriniz: ");
                    double saatUcreti = Double.parseDouble(input.nextLine());
                    System.out.print("Aylık Satış Tutarını giriniz: ");
                    double aylikSatis = Double.parseDouble(input.nextLine());

                    double prim = aylikSatis * 0.01;
                    maas = (calisilanSaat * saatUcreti) + prim;

                } else {
                    System.out.println("Hatalı personel türü!");
                    continue;
                }
                
                personeller.add(new Object[]{personelAdi, maas});
                System.out.println("Personel başarıyla eklendi.");

            } else if (secim.equals("2")) {
                if (personeller.isEmpty()) {
                    System.out.println("Henüz kayıtlı personel yok.");
                } else {
                    System.out.println("\n--- PERSONEL LİSTESİ ---");
                    for (Object[] p : personeller) {
                        System.out.println("Ad: " + p[0] + " - Toplam Ücret: " + p[1] + " TL");
                    }
                }

            } else if (secim.equals("3")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            } else {
                System.out.println("Hatalı seçim! Tekrar deneyiniz.");
            }
        }
        input.close();
    }
}
