# 📘 If-Else — Java Koşul Yapıları

Bu klasör, Java’da koşullu ifadelerin (if-else) kullanımını öğrenmek için hazırlanmış örnek projeleri içerir. If-else yapısı, bir programın belirli durumlarda farklı yollar izlemesini sağlayan temel karar mekanizmasıdır. Klasör içeriği zamanla genişletilmekte ve her yeni proje if-else mantığını gerçek bir problem üzerinden pekiştirmeyi amaçlamaktadır.

---

## 📌 Örnek 1: Yaş Kontrolü (Reşitlik Doğrulama)

Bu örnek, kullanıcıdan alınan yaş değerine göre kişinin reşit olup olmadığını kontrol eder.

- Yaş **18 veya üzerindeyse** → “Reşitsiniz.”
- Yaş **18’den küçükse** → “Reşit değilsiniz.”

Bu proje, if-else yapısını anlamak için sade bir başlangıç örneğidir.

---

## 📌 Örnek 2: PasswordStrengthChecker — Şifre Güvenlik Analiz Sistemi

Bu proje, kullanıcıdan alınan bir şifreyi karakter karakter analiz ederek şifrenin ne kadar güvenli olduğunu belirler. Aşağıdaki kriterler kontrol edilir:

- Büyük harf var mı?
- Küçük harf var mı?
- Rakam var mı?
- Özel karakter var mı?
- Boşluk içeriyor mu?

Karakter çeşitliliğine göre şifre **Zayıf**, **Orta**, **Güçlü** veya **Çok Güçlü** olarak sınıflandırılır. Böylece if-else yapısı gerçek bir güvenlik analizi senaryosu üzerinden uygulanmış olur.

---

## 🔍 If-Else Mantığı Nasıl Çalışır?

1. Bir koşul değerlendirilir.  
2. Koşul doğruysa `if` bloğu çalışır.  
3. Koşul yanlışsa `else` (veya varsa `else if`) bloğu çalışır.  
4. Program yalnızca tek bir yol izler — diğer bloklar çalışmaz.

Bu mekanizma özellikle kullanıcı girişlerini kontrol etmek ve karar vermek için kullanılır.

---

## 💡 Örnek Çıktılar

### Yaş Kontrolü
Girdi: 18  
Çıktı: Reşitsiniz.

Girdi: 14  
Çıktı: Reşit değilsiniz.

### Şifre Gücü
Girdi: `Hello123`  
Çıktı: Güçlü

Girdi: `Ab1!xY?`  
Çıktı: Çok Güçlü

Girdi: `abc 123`  
Çıktı: Şifre boşluk içeremez!

---

## 📄 Dosya Yapısı

if-else/  
├── YasKontrol/  
│  ├── Main.java  
│  └── README.md  
└── PasswordStrengthChecker/  
  ├── Main.java  
  └── README.md  

---

## 🧠 Bu Klasörde Öğrenilen Java Konseptleri

- Kullanıcıdan veri alma (`Scanner`)
- Temel koşul yapıları (`if`, `else`, `else if`)
- Karar yapıları ile program akışını yönlendirme
- Karakter analizi ve kontrol mantığı
- Çok adımlı doğrulama sistemi geliştirme

---

## 🚀 Gelecek Eklemeler

Bu klasör ilerleyen zamanda şu tarz if-else projeleriyle genişletilebilir:

- Not ortalamasına göre geçme/kalma belirleme  
- Isıya göre hava durumu yorumu  
- Sayının pozitif/negatif/sıfır kontrolü  
- Birden fazla koşul içeren çoklu karar mekanizmaları
