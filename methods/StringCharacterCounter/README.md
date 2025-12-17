# 📘 Methods (Metotlar) — Java Metot Uygulamaları

Bu klasör, Java’da kodun tekrar kullanılabilirliğini sağlayan ve programı modüler hale getiren **metotlar** konusunu öğretmek için hazırlanmış örnek uygulamaları içerir. Şu anda temel metot kullanımını gösteren başlangıç örneği bulunmaktadır.

---

## 📌 Mevcut Örnek: Temel Metot Yapısı

Bu örnek, belirli bir işlemi ana bloktan (`main`) ayırarak ayrı bir fonksiyon olarak tanımlamayı ve bu fonksiyonu çağırmayı öğretir.

### 🔍 Mantık Nasıl Çalışır?

1. **Tanımlama:** Belirli bir işi yapan kod bloğu, `main` metodunun dışında fakat sınıf (`class`) içinde tanımlanır.
2. **Parametre Kullanımı:** Metoda işleyeceği veriler parantez içinde gönderilir.
3. **Geri Dönüş (Return):** İşlem bittikten sonra `return` anahtar kelimesi ile sonucun nasıl döndürüldüğü gösterilir.
4. **Çağırma:** Tanımlanan metot, `main` içerisinde ismiyle çağrılarak tetiklenir.

### 💡 Örnek Çıktı

Dizi: {10, 20}

Çıktı:
Sayıların toplamı: 30
İşlem başarıyla tamamlandı.

---

## 📄 Dosya Yapısı

methods/
   MetotBaslangic/
      Main.java
      README.md

---

## 🚀 Gelecek Eklemeler

Bu klasör ilerleyen zamanlarda şu metot konularıyla genişletilecektir:

- **Method Overloading:** Aynı isimli metotların farklı parametrelerle kullanımı.
- **Recursive Methods:** Kendi kendini çağıran (özyinelemeli) metotlar.
- **Return Type Farkları:** void vs int, String vb. dönüş tipleri.
- **Static ve Non-static:** Metot erişim türleri.
