# 📁 switch-case — Menü ve Karar Yapıları

Bu klasör, Java’da **switch-case** yapısını kullanarak kullanıcıya seçenek sunma, menü yönetimi ve çok adımlı karar verme mantığını pekiştirmek için hazırlanmış örnekleri içerir.

---

## 🎯 Bu Klasörün Amacı
- Switch-case kontrol yapısını öğrenmek  
- Kullanıcıya çoklu seçenek sunmak  
- Birden fazla karar mekanizmasını tek programda birleştirmek  
- İç içe switch-case kullanımını anlamak  
- Basit bir menü sistemi geliştirmek  

---

## 📌 İçerik

### ▶️ **Menu.java**
Bu program, bir konsol menüsü oluşturur ve kullanıcının seçimine göre farklı işlemler uygular:

1. **Giriş Sistemi**  
2. **Hesap Makinesi (4 işlem)**  
3. **Programdan çıkış**

---

## 🧠 Öğrenilen Konular

### 🔹 Ana Menü
```java
switch (secim) {
    case 1:  // Giriş
    case 2:  // Hesap makinesi
    case 3:  // Çıkış
}
```
Kullanıcının seçtiği menüye göre program farklı bloklara yönlenir.

---

### 🔹 Kullanıcı Girişi
Kullanıcı adı ve şifre doğrulaması yapılır:

```java
if (username.equals("admin") && password.equals("password123")) {
    System.out.println("Giriş başarılı.");
} else {
    System.out.println("Giriş başarısız.");
}
```

---

### 🔹 Hesap Makinesi (İç içe switch-case)
Kullanıcı bir işlem seçer:

```java
switch (islem) {
    case 1: // Toplama
    case 2: // Çıkarma
    case 3: // Çarpma
    case 4: // Bölme
}
```

Sıfıra bölme kontrolü de dahil edilmiştir:

```java
if (num2 == 0) {
    System.out.println("Hata: Sıfıra bölünemez.");
}
```

---

## 📤 Örnek Kullanıcı Akışı

```
=== Menü ===
1. Giriş
2. Hesap Makinesi
3. Çıkış
Lütfen bir seçenek seçin: 2

1. Toplama
2. Çıkarma
3. Çarpma
4. Bölme
Lütfen bir işlem seçin (1-4): 3
İki sayı girin:
6
7
Sonuç: 42
```

---

## ▶️ Çalıştırma  
Bu klasördeki `.java` dosyasını IntelliJ IDEA veya başka bir Java IDE üzerinden doğrudan çalıştırabilirsiniz.

---

📌 *Bu klasör, switch-case yapısını gerçek bir menü sistemi içinde uygulamak isteyenler için zengin bir örnek sunar.*
