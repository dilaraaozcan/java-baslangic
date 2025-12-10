# 📁 String — Metin ve Sayısal Karakter İşlemleri

Bu klasör, Java’da String veri türünü anlamak, karakter dizileri üzerinde işlem yapmak ve hazır metotlar olmadan manuel dönüşüm algoritmaları geliştirmek için hazırlanmış örnekleri içerir. Hem temel string işlemleri hem de karakter tabanlı matematiksel analiz projeleri bu klasörde toplanmıştır.

---

## 🎯 Bu Klasörün Amacı
- Java’da String veri tipini kavramak  
- Karakter alma, uzunluk hesaplama, büyük/küçük harf dönüşümlerini öğrenmek  
- Döngü ile metni ters çevirme gibi temel algoritmaları uygulamak  
- Hazır metotlar olmadan string → integer dönüşüm mantığını öğrenmek  
- String üzerinden matematiksel analiz yapmayı deneyimlemek (DigitAnalyzer)

---

## 📌 İçerik

---

### ▶️ **StringIslemi**
Kullanıcıdan alınan metin üzerinde temel dönüşümler gerçekleştirir:

- Büyük harfe çevirme  
- Küçük harfe çevirme  
- İlk karakteri bulma  
- Son karakteri bulma  
- Metni **manuel olarak ters çevirme**  

Bu proje, temel string fonksiyonlarını anlamayı sağlar.

---

### ▶️ **StringToIntegerConverter**
Bu proje, kullanıcının girdiği string ifadeyi **hazır metotlar olmadan** tamsayıya dönüştürür.

Özellikler:
- Negatif sayı desteği  
- Rakam dışı karakter kontrolü  
- ASCII tabanlı dönüşüm: `digit = c - '0'`  
- Hatalı girişlerde kullanıcıya uyarı verme  

Örnek:  
Girdi: `" -45 "` → Çıktı: `-45`  
Girdi: `"12a3"` → Çıktı: `"Geçersiz karakter!"`

---

### ▶️ **DigitAnalyzer**
Bu proje, kullanıcıdan alınan bir sayıyı **string olarak analiz eder** ve matematiksel özelliklerini çıkarır.

Yaptığı işlemler:
- Basamakların toplamı  
- En büyük basamak  
- Çift / tek basamak sayıları  
- Sıfır içerme kontrolü  
- Sayıyı tersine çevirme  
- Palindrome kontrolü  

Bu proje, string analizini matematiksel algoritmalarla birleştiren ileri seviye bir örnektir.

---

## 🧠 Öğrenilen Konular

### 🔹 Temel String Dönüşümleri
metin.toUpperCase();  
metin.toLowerCase();

### 🔹 Karakter Alma
char ilk = metin.charAt(0);  
char son = metin.charAt(metin.length() - 1);

### 🔹 Metni Ters Çevirme
String ters = "";  
for (int i = metin.length() - 1; i >= 0; i--) {  
 ters += metin.charAt(i);  
}

### 🔹 Manuel String → Integer Dönüşümü
int digit = c - '0';  
sonuc = sonuc * 10 + digit;

### 🔹 Sayısal Karakter Analizi (DigitAnalyzer)
- Basamakların toplamı  
- Max basamak  
- Çift / tek sayımı  
- Palindrome mantığı  
- ASCII tabanlı karakter işleme  

---

## 📄 Dosya Yapısı
string/  
├── StringIslemi/  
├── StringToIntegerConverter/  
└── DigitAnalyzer/  

---

## ▶️ Çalıştırma
Bu klasördeki `.java` dosyaları IntelliJ IDEA veya herhangi bir Java IDE üzerinden çalıştırılabilir.

---

📌 Bu klasör, string işlemleri ile algoritma geliştirmeyi birleştiren kapsamlı bir öğrenme alanı sunar.
