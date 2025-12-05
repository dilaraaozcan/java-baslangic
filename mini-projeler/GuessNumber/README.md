# 🎯 Sayı Tahmin Oyunu — GuessNumber Game

Bu mini proje, bilgisayarın 0–100 arasında rastgele seçtiği sayıyı kullanıcıya tahmin ettirmeyi amaçlayan basit bir konsol oyunudur. Oyuncuya her tahmin sonrası “UP”, “DOWN” ve “çok yaklaştın” gibi yönlendirmeler verilir. Ayrıca geçersiz giriş kontrolü eklenmiştir: oyuncu aralık dışında 2 kere giriş yaparsa oyun otomatik olarak sonlanır.

---

## 🔍 Oyun Kuralları

- Bilgisayar 0–100 arasında rastgele bir sayı tutar.  
- Oyuncu bu sayıyı tahmin etmeye çalışır.  
- Tahmin:
  - Hedeften küçükse → **UP**
  - Hedeften büyükse → **DOWN**
  - Aradaki fark 5 veya daha azsa → **Çok yaklaştın!**
- Oyuncu:
  - **1 kez** aralık dışı sayı (0–100 dışı) girerse → uyarı alır.  
  - **2. kez** aralık dışı sayı girerse → **oyun sonlandırılır.**

---

## 🧠 Öğrenilen Java Konuları

- Rastgele sayı üretimi (`Math.random()`)  
- Kullanıcıdan input alma (`Scanner`)  
- `while` döngüsü ile sürekli tahmin alma  
- Koşul yapıları (`if`, `else if`, `else`)  
- Basit giriş doğrulama (range check)  
- Duruma göre oyunu sonlandırma  

---

## 📤 Örnek Oyun Akışı

Tahmininiz: 150  
Geçersiz giriş! Lütfen 0-100 arasında bir sayı giriniz.

Tahmininiz: 200  
İkinci kez geçersiz giriş yaptınız. Oyun sonlandırıldı.

---

Tahmininiz: 45  
UP

Tahmininiz: 60  
DOWN

Tahmininiz: 58  
Çok yaklaştın!  
DOWN

Tahmininiz: 57  
Tebrikler! Doğru tahmin!  
Toplam deneme sayısı: 4

---

## 📄 Dosya Yapısı

mini-projeler/  
 SayiTahminOyunu/  
  Main.java  
  README.md  

---

Bu proje, Java’da döngü ve koşul yapılarıyla interaktif konsol uygulamaları geliştirme pratiği yapmak için ideal bir örnektir.
