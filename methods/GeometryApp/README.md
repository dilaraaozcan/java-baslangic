# 📐 GeometryApp — Geometrik Şekil Alan Hesaplayıcı

Bu proje, kullanıcıdan alınan veriler doğrultusunda farklı geometrik şekillerin alanlarını hesaplayan modüler bir sistemdir. Amaç, her hesaplama işlemini ayrı bir **metot** içinde yöneterek temiz ve sürdürülebilir bir kod yapısı kurmaktır.

---

## 🎯 Programın Yaptıkları

- **Dikdörtgen Alanı:** Kısa ve uzun kenar bilgilerine göre hesaplama yapar.
- **Üçgen Alanı:** Taban ve yükseklik bilgilerini kullanarak alanı bulur.
- **Daire Alanı:** Yarıçap bilgisini alarak `Math.PI` hassasiyetiyle hesaplama yapar.
- **Dinamik Girdi:** Tüm değerler `Scanner` sınıfı üzerinden kullanıcıdan alınır.
- **Modüler Yapı:** Her şekil için `return` tipi döndüren bağımsız metotlar kullanılır.

---

## 🧠 Örnek Kullanım

Girdi:
- Dikdörtgen: 5, 10
- Üçgen: 4, 6
- Daire: 3

Çıktı:
Dikdörtgenin Alanı: 50.0
Üçgenin Alanı: 12.0
Dairenin Alanı: 28.274333882308138

---

## 📌 Öğrenilen Konular

- **Method Definition:** Parametre alan ve değer döndüren (`return`) metot tasarımı.
- **Scanner Class:** Kullanıcı etkileşimi ve `double` veri tipi yönetimi.
- **Code Reusability:** Hesaplama mantığını ana bloktan ayırarak kodun tekrar kullanılabilirliğini artırma.
- **Math Library:** `Math.PI` kullanımı ile sabit değerlere erişim.

---

## 📄 Dosya Yapısı

methods/
   GeometryApp/
      Main.java
      README.md

---

## ▶️ Çalıştırma

`Main.java` dosyasını herhangi bir Java IDE (IntelliJ, Eclipse, VS Code) ile derleyip çalıştırabilirsiniz. Program başladığında sırasıyla şekil bilgilerini girmeniz istenecektir.

---

Bu proje, Java'da metot yapısını ve kullanıcı girdileriyle matematiksel işlemler yapmayı pekiştiren öğretici bir örnektir.
