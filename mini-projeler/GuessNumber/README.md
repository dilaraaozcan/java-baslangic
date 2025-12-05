# 🎯 Sayı Tahmin Oyunu — Guess Number Game

Bu mini proje, bilgisayarın 0–99 arasında rastgele seçtiği sayıyı kullanıcının tahmin etmeye çalıştığı basit bir konsol oyunudur. Her tahminde oyuncuya “UP” veya “DOWN” yönlendirmesi yapılır ve sayı hedefe çok yaklaştığında ek bir uyarı verilir. Kod, temel Java giriş konularını pekiştirmek için sade bir yapıda tutulmuştur.

---

## 🔍 Oyun Mantığı

1. Bilgisayar 0 ile 99 arasında rastgele bir sayı üretir.
2. Kullanıcıdan tahmin alınır.
3. Tahmin:
   - Hedeften küçükse: **UP**
   - Hedeften büyükse: **DOWN**
   - Çok yakında ise: **🔥 Çok yaklaştın!**
   - Doğruysa oyun biter.
4. Oyun sonunda toplam deneme sayısı gösterilir.
5. Aralık dışı (0–99 olmayan) girişlerde kullanıcı uyarılır.

---

## 🧠 Öğrenilen Java Konuları

- `Math.random()` ile rastgele sayı üretimi  
- `Scanner` ile kullanıcıdan veri alma  
- `while` döngüsü ile sürekli tahmin alma  
- `if–else` koşul yapıları  
- Basit giriş doğrulama (range check)  
- Sayı farkına göre yakınlık ipucu verme  

---

## 📤 Örnek Oyun Çıktısı

Tahmininizi giriniz: 50  
UP  
Tahmininizi giriniz: 72  
DOWN  
Tahmininizi giriniz: 68  
Çok yaklaştın!  
DOWN  
Tahmininizi giriniz: 67  
Tebrikler! Doğru tahmin!  
Toplam deneme sayısı: 4

---

## 📄 Dosya Yapısı

mini-projeler/  
 SayiTahminOyunu/  
  Main.java  
  README.md  

---

Bu proje, temel döngü ve koşul yapısını uygulamalı şekilde öğrenmek isteyenler için ideal bir örnektir.
