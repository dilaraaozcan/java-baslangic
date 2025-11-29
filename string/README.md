# 📁 string — Metin İşlemleri

Bu klasör, Java’da **String** sınıfının temel fonksiyonlarını öğrenmek ve karakter dizileri üzerinde işlem yapmak için hazırlanmış örnekleri içerir.  
Kullanıcıdan alınan bir metin üzerinde çeşitli dönüşümler ve analizler yapılmaktadır.

---

## 🎯 Bu Klasörün Amacı
- Java’da String veri türünü tanımak  
- Metin üzerinde işlem yapmayı öğrenmek  
- Karakter alma, uzunluk hesaplama, büyük/küçük harf dönüşümü gibi temel işlemleri pekiştirmek  
- Metni döngü ile ters çevirme algoritmasını uygulamak  

---

## 📌 İçerik

### ▶️ **StringIslemi.java**
Bu dosya, kullanıcıdan aldığı metin üzerinde aşağıdaki işlemleri gerçekleştirir:

- Metni **büyük** harfe çevirme  
- Küçük harfe çevirme  
- İlk karakteri bulma  
- Son karakteri bulma  
- Metni **tersine çevirme** (manuel algoritma)

---

## 🧠 Öğrenilen Konular

### 🔹 String Dönüşümleri
```java
metin.toUpperCase();
metin.toLowerCase();
```

### 🔹 Karakter Alma
```java
char ilk = metin.charAt(0);
char son = metin.charAt(metin.length() - 1);
```

### 🔹 Metni Ters Çevirme
```java
String ters = "";
for (int i = metin.length() - 1; i >= 0; i--) {
    ters += metin.charAt(i);
}
```

Bu döngü, metnin son karakterinden başlayarak ilk karakterine kadar ilerler ve ters bir metin oluşturur.

---

## 📤 Örnek Çıktı
```
Bir metin yazınız:
Merhaba
Büyük harf: MERHABA
Küçük harf: merhaba
İlk karakter: M
Son karakter: a
Ters metin: abahreM
```

---

## ▶️ Çalıştırma  
Bu klasördeki `.java` dosyası IntelliJ IDEA veya herhangi bir Java IDE üzerinden doğrudan çalıştırılabilir.

---

📌 *Bu klasör, Java’da String sınıfı ile yapılan temel işlemleri öğrenmek isteyenler için sade ve öğretici örnekler sunar.*
