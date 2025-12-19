# 📘 If-Else — Java Koşul Yapıları

Bu klasör, Java’da koşullu ifadelerin (`if`, `else if`, `else`) kullanımını öğrenmek ve pekiştirmek için hazırlanmış örnek projeleri içerir.  
If-else yapısı, bir programın farklı durumlara göre farklı kararlar almasını sağlayan temel kontrol mekanizmasıdır.

Klasör içeriği zamanla genişletilmekte; her yeni proje if-else mantığını **gerçekçi ve anlamlı bir problem** üzerinden uygulamayı hedeflemektedir.

---

## 📌 Örnek 1: Yaş Kontrolü (Reşitlik Doğrulama)

Bu örnek, kullanıcıdan alınan yaş bilgisine göre kişinin reşit olup olmadığını kontrol eder.

- Yaş **18 veya üzerindeyse** → “Reşitsiniz.”
- Yaş **18’den küçükse** → “Reşit değilsiniz.”

Bu proje, if-else yapısını öğrenmek için en sade ve temel başlangıç örneklerinden biridir.

---

## 📌 Örnek 2: PasswordStrengthChecker — Şifre Güvenlik Analiz Sistemi

Bu proje, kullanıcıdan alınan bir şifreyi karakter karakter analiz ederek şifrenin güvenlik seviyesini belirler. Aşağıdaki kriterler kontrol edilir:

- Büyük harf var mı?
- Küçük harf var mı?
- Rakam var mı?
- Özel karakter var mı?
- Boşluk içeriyor mu?

Karakter çeşitliliğine göre şifre **Çok Zayıf**, **Zayıf**, **Orta**, **Güçlü** veya **Çok Güçlü** olarak sınıflandırılır.  
Bu örnek, if-else yapısının döngüler ve boolean bayraklarla birlikte nasıl kullanılabileceğini gösterir.

---

## 📌 Örnek 3: Mars İklim Karar Sistemi — Görev Güvenliği Analizi

Bu proje, Mars yüzey sıcaklığına göre çevresel koşulları analiz eden ve görev güvenliği kararları üreten bir Java konsol uygulamasıdır.

Sistem şu adımları uygular:
- Girilen sıcaklık değerinin Mars için **geçerli olup olmadığını** kontrol eder
- Sıcaklığa göre **iklim sınıflandırması** yapar
- Her iklim durumu için:
  - Risk seviyesi
  - Maksimum görev süresi
  - Gerekli durumlarda ek uyarılar
  üretir

Bu örnek, if-else zincirlerinin **girdi doğrulama**, **çoklu çıktı üretimi** ve **iç içe karar yapıları** ile birlikte kullanımını öğretir.

---

## 🔍 If-Else Mantığı Nasıl Çalışır?

1. Bir koşul değerlendirilir  
2. Koşul doğruysa `if` bloğu çalışır  
3. Koşul yanlışsa `else if` veya `else` bloğu çalışır  
4. Program yalnızca **tek bir karar yolunu** izler, diğer bloklar çalışmaz  

Bu yapı, özellikle kullanıcı girişlerini kontrol etmek ve karar mekanizmaları kurmak için kullanılır.

---

## 💡 Örnek Çıktılar

### Yaş Kontrolü
Girdi: `18`  
Çıktı: Reşitsiniz.

Girdi: `14`  
Çıktı: Reşit değilsiniz.

### Şifre Gücü
Girdi: `Hello123`  
Çıktı: Güçlü

Girdi: `Ab1!xY?`  
Çıktı: Çok Güçlü

Girdi: `abc 123`  
Çıktı: Şifre boşluk içeremez!

### Mars Climate Decision System
Girdi: `-85`  
Çıktı: Aşırı Soğuk — Risk Seviyesi: Yüksek

Girdi: `8`  
Çıktı: Ilık — Kısa görevler için uygun

Girdi: `120`  
Çıktı: Sensör verisi geçerli aralık dışında

---

## 📄 Dosya Yapısı

if-else/  
├── YasKontrol/  
│  ├── Main.java  
│  └── README.md  
├── PasswordStrengthChecker/  
│  ├── Main.java  
│  └── README.md  
└── MarsClimateDecisionSystem/  
  ├── Main.java  
  └── README.md  

---

## 🧠 Bu Klasörde Öğrenilen Java Konseptleri

- Kullanıcıdan veri alma (`Scanner`)
- Koşullu ifadeler (`if`, `else if`, `else`)
- Sayısal aralık kontrolü
- Karakter analizi ve doğrulama
- Girdi doğrulama (input validation)
- Çoklu çıktı üreten karar mekanizmaları
- İç içe if yapıları ile karar ağacı oluşturma

---

## 🚀 Gelecek Eklemeler

Bu klasör ilerleyen zamanda şu tarz if-else projeleriyle genişletilebilir:

- Not ortalamasına göre geçme/kalma belirleme  
- Hava durumuna göre kıyafet önerisi  
- Sayının pozitif / negatif / sıfır kontrolü  
- Alışveriş tutarına göre indirim hesaplama  
- Basit kullanıcı yetkilendirme senaryosu
