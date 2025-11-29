# 📁 if-else — Koşul Yapıları

Bu klasör, Java’da **koşul ifadelerini (if–else)** öğrenmek ve kullanıcıdan alınan veriye göre karar yapısını uygulamak için hazırlanmış örnekleri içerir.

---

## 🎯 Bu Klasörün Amacı
- Koşul yapılarının çalışma mantığını öğrenmek  
- Kullanıcıdan veri alma pratiği yapmak  
- `if`, `else` ve karşılaştırma operatörlerini pekiştirmek  
- Basit karar mekanizmaları geliştirmek  

---

## 📌 İçerik

### ▶️ **YasKontrol.java**
Bu dosya, kullanıcıdan yaş alıp 18 yaş kriterine göre “reşit” olup olmadığını kontrol eden temel bir örnektir.

**Öğrenilen Konular:**
- `Scanner` ile kullanıcıdan veri alma  
- `if–else` yapısı  
- Karşılaştırma operatörleri (`>=`, `<`)  
- Konsol tabanlı çıktı üretme  

**Koddan Kesit:**
```java
Scanner input = new Scanner(System.in);

System.out.println("Yaşınızı giriniz: ");
int yas = input.nextInt();

if (yas >= 18) {
    System.out.println("Reşitsiniz. ");
} else {
    System.out.println("Reşit değilsiniz. ");
}
```

**Örnek Çıktılar:**
```
Yaşınızı giriniz:
20
Reşitsiniz.
```

```
Yaşınızı giriniz:
15
Reşit değilsiniz.
```

---

## ▶️ Çalıştırma  
Dosyayı IntelliJ IDEA veya herhangi bir Java IDE üzerinden çalıştırabilirsiniz.

---

📌 *Bu klasördeki örnekler, Java’da karar yapılarıyla çalışmayı öğrenmek isteyenler için başlangıç seviyesinde içerik sunar.*
