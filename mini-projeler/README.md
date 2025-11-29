# 📁 mini-projeler — Konsol Tabanlı Uygulamalar

Bu klasör, Java’nın temel yapı taşlarını kullanarak hazırlanmış **küçük ama öğretici mini konsol projelerini** içerir.  
Her proje, gerçek hayattaki bir problemi çözmeye yönelik sade bir uygulama şeklinde tasarlanmıştır.

---

## 🎯 Bu Klasörün Amacı
- Temel Java konularını gerçek uygulamalara dönüştürmek  
- Koşul yapıları, kullanıcı girişi ve değişken yönetimi pratiği yapmak  
- Mini projelerle algoritma mantığını güçlendirmek  
- Gelişim sürecini düzenli olarak belgelemek  

---

# 📌 İçerik

## ▶️ **1. ATM.java — Basit ATM Uygulaması**

Bu mini proje; **para yatırma, para çekme ve bakiye sorgulama** özelliklerine sahip temel bir ATM simülasyonudur.

### 🧠 Öğrenilen Konular
- `Scanner` ile kullanıcıdan veri alma  
- `if–else` karar yapıları  
- Değişken güncelleme (bakiye artırma/azaltma)  
- Koşullu işlem kontrolü (yetersiz bakiye)  
- Konsol tabanlı menü tasarımı  

### 🔍 Koddan Kesit
```java
int bakiye = 1000;

if (secim == 1) {
    bakiye += miktar;
} else if (secim == 2) {
    if (miktar <= bakiye) {
        bakiye -= miktar;
    } else {
        System.out.println("Yetersiz bakiye!");
    }
}
```

### 📤 Örnek Akış
```
=== ATM UYGULAMASI ===
1- Para Yatır
2- Para Çek
3- Bakiye Sorgula
Seçiminiz: 2
Çekilecek miktar:
500
Yeni bakiye: 500
```

---

# ▶️ Çalıştırma  
Bu klasördeki `.java` dosyalarını IntelliJ IDEA veya herhangi bir Java IDE üzerinden doğrudan çalıştırabilirsiniz.

---

📌 *Bu klasör, öğrendiğim Java temellerini küçük projelerle pekiştirmek için oluşturulmuştur. Zamanla yeni mini projeler eklenecektir.*
