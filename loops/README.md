# 📁 loops — Döngü Yapıları

Bu klasör, Java’da **for**, **while** gibi döngü yapılarının temel kullanımını pekiştirmek için hazırlanan örnekleri içerir.  
Döngüler, tekrar eden işlemleri otomatikleştirmek için kullanılan temel programlama araçlarındandır.

---

## 🎯 Bu Klasörün Amacı
- Döngü mantığını öğrenmek  
- Tekrar eden işlemleri programlamayı pekiştirmek  
- Faktöriyel gibi temel algoritmaları uygulamak  
- Sayaç değişkeni ve koşullarla çalışma alışkanlığı kazanmak  

---

## 📌 İçerik

### ▶️ **Faktoriyel.java**
Bu dosya, kullanıcıdan alınan sayının **faktöriyelini hesaplayan** temel bir döngü örneğidir.

**Öğrenilen Konular:**
- `Scanner` ile kullanıcıdan veri almak  
- `for` döngüsü kullanmak  
- Sayaç değişkeni (`i`) ile ilerleme  
- Faktöriyel matematiğini uygulamak  
- Konsol çıktısı üretmek  

**Koddan Kesit:**
```java
int sonuc = 1;

for (int i = 1; i <= sayi; i++) {
    sonuc *= i;
}
System.out.println("Faktöriyel sonucu: " + sonuc);
```

**Örnek Çıktı:**
```
Bir sayı giriniz:
5
Faktöriyel sonucu: 120
```

---

## 🧠 Kısa Bilgi: Faktöriyel Nedir?
Matematikte faktöriyel:

**n! = n × (n-1) × (n-2) × ... × 1**

örneğin:

- 3! = 6  
- 5! = 120  
- 7! = 5040  

---

## ▶️ Çalıştırma  
Bu klasördeki `.java` dosyasını IntelliJ IDEA veya herhangi bir Java IDE üzerinden doğrudan çalıştırabilirsiniz.

---

📌 *Bu klasör, döngü mantığını anlamak ve temel algoritmaları uygulamak isteyenler için başlangıç seviye içerikler sunar.*
