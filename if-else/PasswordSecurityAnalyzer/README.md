# 🔐 PasswordStrengthChecker — Şifre Güvenlik Analiz Sistemi

Bu proje, kullanıcıdan alınan bir şifreyi karakter karakter analiz ederek şifrenin güvenlik seviyesini belirleyen bir if-else tabanlı Java uygulamasıdır. Büyük harf, küçük harf, rakam ve özel karakter kontrolü yapar; şifre boşluk içeriyorsa otomatik olarak geçersiz sayar. Tüm karakter tipleri tarandıktan sonra şifreye bir güvenlik puanı verilir ve şifre “Çok Güçlü”, “Güçlü”, “Orta”, “Zayıf” veya “Çok Zayıf” olarak sınıflandırılır.

## 🎯 Bu Projenin Amacı
- Şifrelerdeki karakter çeşitliliğini analiz etmek
- if-else yapısını gerçek bir problemde kullanmak
- char → kategori eşleşmesini (büyük/küçük harf, rakam, özel karakter) öğrenmek
- Döngü içinde boolean bayrakları güncelleyerek karar mekanizması kurmak
- Karakter tabanlı güvenlik puanlama sistemi geliştirip sonuç üretmek

## 🧠 Kontrol Edilen Güvenlik Kriterleri
- En az bir **büyük harf** var mı?
- En az bir **küçük harf** var mı?
- En az bir **rakam** var mı?
- En az bir **özel karakter** var mı?
- Şifre **boşluk içeriyor mu?** (İçeriyorsa direkt reddedilir.)
- Şifre çok kısaysa (6’dan az), otomatik olarak zayıf kabul edilir.

## 🔍 Puanlama Mantığı
Her kriter karşılandıkça şifre 1 puan kazanır:
- Büyük harf → +1  
- Küçük harf → +1  
- Rakam → +1  
- Özel karakter → +1  

Toplam puana göre sonuç:
- 4 → Çok Güçlü  
- 3 → Güçlü  
- 2 → Orta  
- 1 → Zayıf  
- 0 → Çok Zayıf  

## 📤 Örnek Çıktılar
**Girdi:** `Hello123`  
Büyük Harf: true  
Küçük Harf: true  
Rakam: true  
Özel Karakter: false  
Şifre Gücü: Güçlü  

**Girdi:** `Ab!1xY?`  
→ Şifre Gücü: Çok Güçlü  

**Girdi:** `abc 123`  
→ “Şifre boşluk içeremez!”  

## 📄 Dosya Yapısı
if-else/  
└── PasswordStrengthChecker/  
  ├── Main.java  
  └── README.md  

Bu proje, gerçek hayatta kullanılan şifre kontrol sistemlerinin temel çalışma mantığını öğretir ve if-else yapısını pratik, anlamlı bir senaryoda pekiştirmek için idealdir.
