# 📁 arrays — Dizi İşlemleri

Bu klasör, Java'da **dizi (array)** yapısını anlamak ve temel dizi işlemlerini pekiştirmek için hazırlanmış örnekleri içerir.

---

## 🎯 Bu Klasörün Amacı
- Dizi tanımlamayı öğrenmek  
- Elemanlara erişmeyi göstermek  
- Döngülerle dizi içinde işlem yapmayı pekiştirmek  
- Temel algoritma mantığını geliştirmek  

---

## 📌 İçerik

### ▶️ **DiziToplam.java**
Bu dosya, bir tamsayı dizisinin elemanlarını **foreach döngüsü** kullanarak toplar ve sonucu ekrana yazdırır.

**Öğrenilen Konular:**
- `int[]` ile dizi tanımlama  
- foreach (`for-each`) döngüsünün kullanımı  
- Toplam alma algoritması  
- Basit konsol çıktısı  

**Koddan Kesit:**
```java
int[] sayilar = {10, 20, 30, 40, 50};
int toplam = 0;

for (int sayi : sayilar) {
    toplam += sayi;
}
System.out.println("Dizi toplamı: " + toplam);
```

**Beklenen Çıktı:**
```
Dizi toplamı: 150
```

---

## ▶️ Çalıştırma  
Bu klasördeki `.java` dosyasını IntelliJ IDEA veya başka bir Java IDE üzerinden doğrudan çalıştırabilirsiniz.

---

📌 *Bu klasör, temel dizi kavramlarını öğrenmek isteyenler için başlangıç niteliğinde örnekler içerir.*

