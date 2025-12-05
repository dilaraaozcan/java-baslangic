# 📁 mini-projeler — Konsol Tabanlı Uygulamalar

Bu klasör, Java’nın temel yapı taşlarını kullanarak geliştirdiğim küçük ama öğretici konsol projelerini içerir. Her proje gerçek bir problemi çözen sade bir uygulama mantığıyla tasarlanmıştır. Zamanla yeni mini projeler eklendikçe klasör genişleyecektir.

---

## 🎯 Bu Klasörün Amacı
- Temel Java konularını gerçek uygulamalara dönüştürmek  
- Koşul yapıları, kullanıcı girişleri ve değişken yönetimi üzerinde pratik yapmak  
- Mini projeler aracılığıyla algoritmik düşünmeyi geliştirmek  
- Öğrenme sürecini düzenli ve okunabilir bir yapıda saklamak  

---

## ▶️ ATM — Basit ATM Uygulaması

Bu proje, kullanıcıyla etkileşimli şekilde **para yatırma, para çekme ve bakiye sorgulama** işlemlerini yapabilen basit bir ATM simülasyonudur.

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

Bu proje, kullanıcıdan alınan verilere göre **daire, dikdörtgen ve üçgen** alan/çevre hesaplamaları yapar.

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

## ▶️ Sayı Tahmin Oyunu — GuessNumber Game (Geliştirilmiş Sürüm)

Bu proje, bilgisayarın 0–100 arasında tuttuğu sayıyı tahmin etmeye çalışan interaktif bir konsol oyunudur.  
Oyuncuya her tahminde “UP”, “DOWN” ve yakınlık ipuçları verilir. Ayrıca oyun, **geçersiz girişlerde güvenlik kontrolü** içerir:

### 🔥 Yeni Kurallar & Ek Özellikler
- Oyun 0–100 aralığında bir sayı üretir.  
- Oyuncu bu aralığın dışına:
  - **1. kez çıkarsa:** Uyarı alır → oyun devam eder.  
  - **2. kez çıkarsa:** Oyun otomatik olarak sonlandırılır.  
- Tahmin hedeften 5 sayı yakınsa → “Çok yaklaştın!” mesajı verilir.  
- Deneme sayacı yalnızca geçerli tahminlerde artar.

### 🧠 Öğrenilenler
- Rastgele sayı üretme (`Math.random()`)  
- while döngüsü ile sürekli tahmin alma  
- Girdi doğrulama (range validation)  
- Kullanıcı deneyimini iyileştiren ipucu sistemi  
- Koşul yapıları ile oyun kontrolü  

### 📤 Örnek Akış
Tahmininiz: 150  
Geçersiz giriş! Lütfen 0-100 arasında bir sayı giriniz.

Tahmininiz: 200  
İkinci kez geçersiz giriş yaptınız. Oyun sonlandırıldı.

---  

Tahmininiz: 45 → UP  
Tahmininiz: 60 → DOWN  
Tahmininiz: 58 → Çok yaklaştın! → DOWN  
Tahmininiz: 57 → Tebrikler!  

---

## ▶️ Çalıştırma

Tüm projeler kendi klasörleri içinde bulunur ve `Main.java` dosyası doğrudan çalıştırılarak kullanılabilir.

---

📌 Bu klasör, Java öğrenme sürecimde temel kavramları küçük ve anlaşılır projelerle pekiştirmek amacıyla oluşturulmuştur.
