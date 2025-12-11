# 🔢 CollatzAnalyzer — 3n+1 Matematiksel Seri Analizi

Bu proje, matematik dünyasının en ilgi çekici problemlerinden biri olan *Collatz Conjecture (3n+1 Problemi)* üzerine oluşturulmuş bir analiz aracıdır. Kullanıcıdan alınan pozitif bir sayı, Collatz kurallarına göre 1’e ulaşana kadar işlenir ve süreç boyunca ortaya çıkan değerler incelenir.

---

## 🎯 Programın Özellikleri
- Collatz serisini adım adım üretir  
- Kaç adımda 1’e ulaşıldığını hesaplar  
- Seri boyunca ulaşılan **en yüksek sayıyı** bulur  
- Başlangıçtan sona tam bir analiz raporu sunar  

---

## 🧠 Collatz Kuralı
Bir tam sayı için:

- **Çiftse:** n = n / 2  
- **Tekse:** n = 3n + 1  

Bu işlemler her pozitif sayıyı sonunda 1’e götürür *diye düşünülür*, fakat bu henüz matematikte kanıtlanmamıştır.

---

## 📌 Örnek Kullanım

Girdi:
12

Çıktı:
Collatz Serisi:  
12 → 6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1

Analiz:
Başlangıç Sayısı: 12  
Toplam Adım Sayısı: 9  
Ulaşılan En Büyük Değer: 16  
Collatz Doğrulaması: 1'e başarıyla ulaşıldı.

---

## 📄 Dosya Yapısı
mini-projeler/  
└── CollatzAnalyzer/  
  ├── Main.java  
  └── README.md  

---

## ▶️ Çalıştırma
`Main.java` dosyasını IntelliJ IDEA veya herhangi bir Java IDE’de derleyip çalıştırabilirsiniz.

Bu proje, döngüler ve sayısal algoritmaları birleştirerek hem matematik hem de programlama mantığını geliştirmek için ideal bir örnektir.
