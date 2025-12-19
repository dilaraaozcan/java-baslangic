# 🚀 Mars İklim Karar Sistemi — Görev Güvenliği Analiz Uygulaması

Bu proje, kullanıcıdan alınan Mars yüzey sıcaklığına göre çevresel koşulları analiz eden ve uygun görev güvenliği kararlarını üreten if-else tabanlı bir Java konsol uygulamasıdır. Girilen sıcaklık değeri öncelikle doğrulanır, ardından belirlenen aralıklara göre iklim sınıflandırması yapılır. Her iklim durumu için risk seviyesi, maksimum görev süresi ve gerekli durumlarda ek uyarılar kullanıcıya sunulur.

## 🎯 Bu Projenin Amacı
- Sayısal aralık kontrollerini gerçekçi bir senaryoda uygulamak
- if / else-if karar zincirini doğru ve güvenli şekilde kullanmak
- Girdi doğrulama (input validation) mantığını öğrenmek
- Tek bir koşuldan birden fazla anlamlı çıktı üretmek
- İç içe if yapılarıyla karar ağacı oluşturmayı pekiştirmek

## 🧠 Değerlendirilen Kriterler
- Girilen sıcaklık Mars için **geçerli bir aralıkta mı?**
- Sıcaklık hangi **iklim sınıfına** giriyor?
- Bu iklim koşulu için **risk seviyesi** nedir?
- Görev için önerilen **maksimum süre** ne olmalı?
- Aşırı veya kritik durumlarda **ek uyarı** gerekli mi?

## 🌡️ İklim Sınıflandırma Mantığı
Sıcaklık aralıklarına göre yapılan sınıflandırma:

- **-60°C altı** → Aşırı Soğuk  
- **-60°C ile -20°C arası** → Soğuk  
- **-20°C ile 10°C arası** → Ilık  
- **10°C ve üzeri** → Sıcak  

Her sınıf için farklı güvenlik protokolleri uygulanır.

## ⚠️ Risk ve Görev Süresi Değerlendirmesi
Her iklim durumu için sistem şu bilgileri üretir:
- Risk Seviyesi (Yüksek, Orta, Düşük, Minimal)
- Maksimum görev süresi önerisi
- Kritik eşiklerde ek uyarı mesajları

## 📤 Örnek Çıktılar
**Girdi:** `-85`  
İklim Durumu : AŞIRI SOĞUK — koruyucu kıyafet zorunlu  
Risk Seviyesi: YÜKSEK  
Maks. Görev  : 10 dakika  

**Girdi:** `-45`  
İklim Durumu : SOĞUK — maruziyet sınırlandırılmalı  
Risk Seviyesi: ORTA  
Maks. Görev  : 30 dakika  

**Girdi:** `8`  
İklim Durumu : ILIK — kısa görevler için uygun  
Risk Seviyesi: DÜŞÜK  
Maks. Görev  : 2 saat  

**Girdi:** `120`  
→ HATA: Sensör verisi Mars için geçerli aralığın dışında.

## 📄 Dosya Yapısı
java-baslangic/  
└── MarsIklimKararSistemi/  
  ├── Main.java  
  └── README.md  

Bu proje, Java’da koşullu ifadelerin (if / else-if) yalnızca teorik değil, gerçekçi bir senaryo üzerinden nasıl etkili şekilde kullanılabileceğini göstermeyi amaçlar. Başlangıç seviyesindeki geliştiriciler için karar mekanizması kurma becerisini geliştirmek adına ideal bir örnektir.
