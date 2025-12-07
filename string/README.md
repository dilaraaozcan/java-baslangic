# 📁 string — Metin İşlemleri

Bu klasör, Java’da String veri türünü anlamak, karakter dizileri üzerinde işlem yapmak ve hazır metotlar olmadan dönüşüm algoritmaları geliştirmek için oluşturulmuş örnekleri içerir. Hem temel string işlemleri hem de daha ileri seviyede manuel sayısal dönüşüm mantığı bulunmaktadır.

## 🎯 Bu Klasörün Amacı
- Java’da String veri türünü tanımak
- Metin üzerinde dönüşüm ve analiz yapmayı öğrenmek
- Karakter alma, uzunluk hesaplama, büyük/küçük harf dönüşümü gibi işlemleri pekiştirmek
- Döngü ile ters çevirme gibi basit algoritmaları uygulamak
- Hazır metot kullanmadan karakterleri sayıya dönüştürmeyi öğrenmek

## 📌 İçerik

### ▶️ StringIslemi.java
Bu dosya kullanıcıdan aldığı metni temel dönüşümlere tabi tutar:
- Büyük harfe çevirme
- Küçük harfe çevirme
- İlk karakteri bulma
- Son karakteri bulma
- Metni tersine çevirme (manuel algoritma)

### ▶️ StringToIntegerConverter
Bu proje, kullanıcının girdiği string ifadeyi hazır metotları kullanmadan bir tamsayıya dönüştürür. Negatif sayı kontrolü yapılır, rakam olmayan karakterler tespit edilir ve ASCII tabanlı char → int dönüşümü uygulanır.

Örnek:
Girdi: "-45"
Çıktı: -45

Girdi: "12a3"
Çıktı: Geçersiz karakter: sadece rakam giriniz!

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

## 📄 Dosya Yapısı
string/
└── StringIslemi/
└── StringToIntegerConverter/

## ▶️ Çalıştırma
Bu klasördeki .java dosyaları IntelliJ IDEA veya herhangi bir Java IDE üzerinden çalıştırılabilir.

📌 Bu klasör, hem temel string işlemlerini hem de karakter tabanlı algoritmaları öğrenmek isteyenler için hazırlanmıştır.
