# 📁 Mini Projeler — Konsol Tabanlı Uygulamalar

Bu klasör, Java’nın temel yapı taşlarını kullanarak geliştirdiğim küçük ama öğretici konsol projelerini içerir.
Her proje, gerçek bir problemi çözen sade bir uygulama mantığıyla tasarlanmıştır.
Projeler ilerledikçe algoritmik karmaşıklık ve problem çözme seviyesi artmaktadır.

---

## 🎯 Bu Klasörün Amacı
- Temel Java konularını gerçek uygulamalara dönüştürmek  
- Koşul yapıları, döngüler ve kullanıcı girdileri üzerinde pratik yapmak  
- Mini projeler aracılığıyla algoritmik düşünmeyi geliştirmek  
- Öğrenme sürecini düzenli ve okunabilir bir yapıda belgelemek  

---

## ▶️ ATM — Basit ATM Uygulaması

Bu proje, kullanıcıyla etkileşimli şekilde **para yatırma, para çekme ve bakiye sorgulama**
işlemlerini yapabilen temel bir ATM simülasyonudur.

### 🧠 Öğrenilenler
- Kullanıcıdan veri alma (`Scanner`)  
- if-else karar yapıları  
- Değişkenlerin dinamik olarak güncellenmesi  
- Konsol tabanlı menü tasarımı  

### 📤 Örnek Akış
=== ATM UYGULAMASI ===  
1- Para Yatır  
2- Para Çek  
3- Bakiye Sorgula  
Seçiminiz: 2  
Çekilecek miktar:  
500  
Yeni bakiye: 500  

---

## ▶️ Geometry Calculator — Geometrik Hesaplama Aracı

Bu proje, kullanıcıdan alınan değerlere göre **daire, dikdörtgen ve üçgen**
için alan veya çevre hesaplamaları yapar.

### 🧠 Öğrenilenler
- Çoklu kullanıcı girdisi alma  
- Geometrik formüllerin uygulanması  
- Switch-case veya if-else ile işlem seçme  

### 📤 Örnek Akış
=== GEOMETRY CALCULATOR ===  
1- Daire Alanı  
2- Dikdörtgen Alanı  
3- Üçgen Alanı  
Seçiminiz: 1  
Yarıçap:  
5  
Daire Alanı: 78.5  

---

## ▶️ Sayı Tahmin Oyunu — GuessNumber Game (Geliştirilmiş)

Bu proje, bilgisayarın 0–100 arasında tuttuğu sayıyı tahmin etmeye dayalı
interaktif bir konsol oyunudur. Oyun, kullanıcı davranışlarını kontrol eden
ek kurallar ve ipucu sistemi içerir.

### 🔥 Ek Kurallar ve Özellikler
- Oyun 0–100 aralığında rastgele bir sayı üretir  
- Geçersiz tahminlerde uyarı ve oyun sonlandırma mekanizması bulunur  
- Hedefe çok yaklaşıldığında kullanıcıya ipucu verilir  
- Deneme sayacı yalnızca geçerli tahminlerde artar  

### 🧠 Öğrenilenler
- Rastgele sayı üretme (`Math.random()`)  
- while döngüsü ile sürekli giriş alma  
- Girdi doğrulama (range validation)  
- Kullanıcı deneyimini iyileştiren kontrol mekanizmaları  

### 📤 Örnek Akış
Tahmininiz: 150  
Geçersiz giriş! Lütfen 0-100 arasında bir sayı giriniz.

Tahmininiz: 200  
İkinci kez geçersiz giriş yaptınız. Oyun sonlandırıldı.

---

## ▶️ Quadratic Equation Solver — İkinci Dereceden Denklem Çözücü

Bu proje, kullanıcıdan alınan katsayılara göre
**ax² + bx + c = 0** biçimindeki denklemleri analiz eder ve
denklem türüne uygun kökleri hesaplar.

Program, ikinci dereceden denklemlerin yanı sıra
özel durumları da (birinci dereceden denklem, çözüm yok, sonsuz çözüm)
ayrıntılı şekilde ele alır.

### 🧠 Öğrenilenler
- Matematiksel problem analizi  
- Diskriminant (Delta) hesaplama  
- Reel ve karmaşık kök ayrımı  
- İç içe koşul yapıları (nested if-else)  
- Sayısal sonuçları formatlı yazdırma  

### 📤 Örnek Akış
İkinci dereceden denklemin katsayılarını girin:  
1  -3  2  

Delta: 1  
İki reel kök var:  
x1: 2.00  
x2: 1.00  

---

## ▶️ Çalıştırma

Tüm projeler kendi klasörleri içinde yer alır ve
`Main.java` veya ilgili ana sınıf dosyası doğrudan çalıştırılarak kullanılabilir.

---

📌 Bu klasör, Java öğrenme sürecimde temel kavramları
küçük ama anlamlı projelerle pekiştirmek amacıyla oluşturulmuştur.
