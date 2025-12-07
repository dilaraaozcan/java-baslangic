# 🔢 StringToIntegerConverter — Manuel String → Integer Dönüşümü

Bu mini proje, Java’da hiçbir hazır metot (Integer.parseInt, valueOf vb.) kullanmadan string formatındaki bir sayıyı gerçek bir int değerine dönüştüren manuel bir algoritma içerir. Amaç, karakter okuma, ASCII tabanlı dönüşüm ve negatif sayı yönetimi gibi düşük seviye işlemleri öğrenmektir.

## 🎯 Projenin Amacı
- String içindeki rakamları tek tek okuyarak sayıya dönüştürmek  
- Hazır dönüştürme fonksiyonlarını kullanmadan kendi parseInt mantığını yazmak  
- Negatif işaret (-) kontrolünü elle yapmak  
- Rakam olmayan karakterleri tespit edip hatayı yönetmek  
- char → int dönüşüm mantığını kavramak  

## 🧠 Algoritma Nasıl Çalışır?
1. Kullanıcıdan string formatında bir giriş alınır.  
2. Eğer ilk karakter '-' ise sayı negatiftir → işaret kaydedilir, döngü 1. indexten başlar.  
3. Her karakter döngü içinde kontrol edilir:  
   - '0' ile '9' arasında değilse → hata mesajı verilir ve işlem durdurulur.  
4. Her rakam ASCII tabanında şu formülle işlenir:  
   sonuc = sonuc * 10 + (c - '0')  
5. Döngü bittiğinde sayı negatife çevrilmesi gerekiyorsa:  
   sonuc = -sonuc  
6. Dönüştürülen gerçek integer ekrana yazdırılır.

## 📤 Örnek Kullanım
Girdi: "1234"  
Çıktı: 1234  

Girdi: "-45"  
Çıktı: -45  

Girdi: "12a3"  
Çıktı: Geçersiz karakter: sadece rakam giriniz!  

Girdi: "-"  
Çıktı: Geçersiz sayı  

## 🧩 Öğrenilen Java Konuları
- ASCII üzerinden char → int dönüşümü  
- String manipülasyonu  
- Döngü ile karakter işleme  
- Hata kontrolü ve girdi doğrulama  
- Negatif sayı işaretini yönetme  
- Temel algoritma tasarımı  

## 📄 Dosya Yapısı
string/  
└── StringToIntegerConverter/  
  ├── Main.java  
  └── README.md  

Bu proje, temel veri türü dönüşümlerini anlamaya yardımcı olur ve birçok teknik mülakatta geçen “parseInt’i kendin yazabilir misin?” mantığının sade bir uygulamasıdır.
