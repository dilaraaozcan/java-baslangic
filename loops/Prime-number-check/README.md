# 🔁 Prime Number Checker — Döngü Tabanlı Asal Sayı Kontrolü

Bu klasör, Java’da **for döngüsü** kullanarak bir sayının asal olup olmadığını test eden basit bir algoritma örneği içerir.  
Amaç, döngü yapısını ve koşul kontrolünü pratik bir senaryo üzerinden pekiştirmektir.

---

## 🔍 Mantık Nasıl İşler?

Programın çalışma prensibi oldukça basittir:

1. Kullanıcıdan bir tam sayı alınır.
2. Eğer sayı **2’nin altındaysa**, doğrudan asal olmadığı belirtilir.
3. `for` döngüsü 2’den başlayarak sayının bir eksiğine kadar tüm sayıları sırayla dener.
4. Sayı, döngüdeki herhangi bir değere **tam bölünürse**, asal olmadığı hemen yazdırılır ve program sonlanır.
5. Döngü herhangi bir bölen bulamazsa, sayı **asaldır**.

Bu yöntem, temel *primality test* algoritmasının en anlaşılır uygulamasıdır.

---

## 🧠 Bu Örnekte Öğrenilenler

- `for` döngüsünün pratik kullanımı  
- Mod alma operatörü (`%`) ile bölünebilirlik testi  
- Erken çıkış (early return) yaklaşımı  
- Koşullu ifadeler (`if`)  
- Kullanıcıdan giriş alma (`Scanner`)  

Özellikle algoritmanın akış mantığını kavramak için son derece yararlıdır.

---

## 💡 Örnek Girdiler

Girdi → `13`  
Çıktı → `13 bir asal sayıdır!`

Girdi → `15`  
Çıktı → `15 bir asal sayı değildir!`

---

## 📄 Dosya Yapısı

loops/
│
├── PrimeNumberCheck/
│     ├── Main.java
│     └── README.md
│

---

## 🚀 Geliştirme Adımları

- Bir aralıktaki tüm asal sayıları listeleyen sürüm  
- Kullanıcı çıkış yapana kadar çalışan bir menü sistemi  
- Sadece `√n`’e kadar kontrol eden optimize edilmiş algoritma  

Bu geliştirmeler, döngü ve algoritma pratiklerini bir üst seviyeye taşır.
