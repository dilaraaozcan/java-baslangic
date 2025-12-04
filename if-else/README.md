# 📘 If-Else — Java Koşul Yapıları

Bu klasör, Java’da koşullu ifadelerin (if-else) kullanımını öğretmek için hazırlanmış temel örnekleri içerir. If-else yapısı, programların belirli bir şarta göre farklı yollar izlemesini sağlayan en temel kontrol mekanizmasıdır. 

Şu anda klasörde yalnızca **Yaş Kontrolü (YasKontrolu)** örneği bulunmaktadır. Yeni if-else uygulamaları eklendikçe bu README güncellenecektir.

---

## 📌 Mevcut Örnek: Yaş Kontrolü (Reşitlik Doğrulama)

Bu örnek, kullanıcıdan alınan yaş değerine göre kişinin reşit olup olmadığını belirler. Koşul ifadesi oldukça basittir:

- Eğer yaş **18 veya üzerindeyse** → “Reşitsiniz.”
- Aksi durumda → “Reşit değilsiniz.”

Bu örnek, if-else yapısını anlamanın en sade ve anlaşılır yollarından biridir.

---

## 🔍 If-Else Mantığı Nasıl Çalışır?

1. Koşul değerlendirilir: `yas >= 18`
2. Koşul doğruysa `if` bloğu çalışır.
3. Koşul yanlışsa `else` bloğu çalışır.
4. Program yalnızca bir yolu izler; her iki blok aynı anda çalışmaz.

Bu yapı, kullanıcı girdilerine göre karar verme yeteneğinin temelini oluşturur.

---

## 💡 Örnek Çıktı

Girdi:
18  
Çıktı:
Reşitsiniz.

Girdi:
14  
Çıktı:
Reşit değilsiniz.

---

## 📄 Dosya Yapısı

if-else/
   YasKontrolu/
      Main.java
      README.md

---

## 🧠 Bu Klasörle Öğrenilen Java Konseptleri

- Kullanıcıdan veri alma (`Scanner`)
- Koşullu ifadelerin temeli (`if`, `else`)
- Karar mekanizmasıyla program akışı kontrolü
- Basit doğrulama işlemleri

---

## 🚀 Gelecek Eklemeler (Klasör Genişletilirken)

Bu klasör zamanla şunlar gibi yeni if-else örnekleriyle büyütülebilir:

- Not ortalamasına göre geçme/kalma
- Sıcaklığa göre hava durumu yorumu
- Sayının pozitif/negatif/sıfır kontrolü
- Çoklu koşullar için `else if` yapısı

Yeni örnekler geldikçe bu README tek blok hâlinde genişletilecektir.
