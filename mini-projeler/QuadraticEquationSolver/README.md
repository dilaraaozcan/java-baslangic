# 📐 Quadratic Equation Solver (Java)

Bu proje, Java kullanılarak ikinci dereceden denklemlerin köklerini hesaplayan
konsol tabanlı bir uygulamadır.

Program, kullanıcıdan alınan katsayılara (a, b, c) göre denklemin türünü analiz eder
ve uygun çözüm yöntemini uygular. Lineer denklemler, reel kökler ve karmaşık kökler
durumları ayrı ayrı ele alınmıştır.

---

## 🔍 Çözülen Denklem

ax² + bx + c = 0

---

## ⚙️ Programın Özellikleri

- a = 0 durumunda denklemi otomatik olarak **birinci dereceden** denklem olarak ele alır
- Çözüm yok, tek çözüm veya sonsuz çözüm durumlarını ayırt eder
- Diskriminant (Δ) hesaplar
- Δ > 0 → İki reel kök
- Δ = 0 → Çift katlı kök
- Δ < 0 → Karmaşık kökler (reel + sanal kısım)
- Sonuçları okunabilir formatta ekrana yazdırır

---

## 🧠 Kullanılan Kavramlar

- Koşullu ifadeler (if-else)
- Matematiksel formüller
- Diskriminant (Delta) analizi
- Karmaşık sayıların hesaplanması
- Kullanıcıdan veri alma (Scanner)
- Ondalıklı sayı formatlama

---

## 🛠️ Teknolojiler

- Java
- java.util.Scanner
- Math.sqrt()

---

## ▶️ Programın Çalışma Adımları

1. Kullanıcıdan a, b ve c katsayıları alınır
2. Denklem türü kontrol edilir
3. Delta hesaplanır
4. Denklem durumuna göre kökler hesaplanır
5. Sonuçlar ekrana yazdırılır

---

## 📌 Örnek Çıktı

İkinci dereceden denklemin katsayılarını girin:  
1  -3  2  

Delta: 1  
İki reel kök var:  
x1: 2.00  
x2: 1.00  

---

## 🎯 Projenin Amacı

Bu proje, temel matematiksel problemlerin Java ile nasıl çözülebileceğini
öğrenmek ve algoritmik düşünme becerisini geliştirmek amacıyla hazırlanmıştır.

---

📌 Geliştirme sürecinde daha profesyonel matematiksel ve algoritmik projeler
eklenmesi hedeflenmektedir.
