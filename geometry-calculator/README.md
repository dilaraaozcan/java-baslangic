📐 Geometry Calculator — Java Console App

Bu proje, kullanıcının seçtiği şekle göre (üçgen veya daire) alan ve çevre hesaplaması yapan basit bir Java konsol uygulamasıdır. Temel Java konularını (Scanner, switch–case, koşullar, matematiksel hesaplamalar) öğrenmek ve pekiştirmek için hazırlanmıştır.

⸻

✨ Özellikler

– Kullanıcıya menü sunar:
	1.	Üçgen
	2.	Daire

– Seçime göre gerekli değerleri ister:
• Üçgen → üç kenar
• Daire → yarıçap

– Geçerlilik kontrolü yapar:
• Üçgende üçgen olma şartı (a + b > c vb.)
• Dairede yarıçap > 0

– Hesaplamalar:
• Üçgen çevresi = a + b + c
• Üçgen alanı (Heron formülü):
s = (a + b + c) / 2
Alan = √(s (s − a) (s − b) (s − c))

• Daire çevresi = 2πr
• Daire alanı = π r²

– Hatalı seçimlerde kullanıcıyı uyarır.

⸻

🧠 Kullanılan Yapılar

– Scanner ile giriş alma
– Switch–case ile seçim kontrolü
– if–else ile doğrulama
– Math.sqrt() ile karekök alma
– double ve int veri tipleri
– Konsol çıktısı üretme

⸻

🖥 Örnek Çıktı

Aşağıdaki gibi bir çalışma çıktısı üretebilir:

=== MENÜ ===
	1.	Üçgen
	2.	Daire
Bir seçenek seçiniz: 1

Üçgenin kenarlarını girin:
3
4
5

Çevre: 12.0
Alan 6.0

⸻

📂 Proje Yapısı

src/Main.java
README.md

⸻

🚀 Çalıştırma Adımları
	1.	Projeyi indir veya kopyala
	2.	IntelliJ IDEA veya herhangi bir IDE ile aç
	3.	Main.java dosyasını çalıştır
	4.	Konsoldaki yönergeleri takip et

⸻

👩‍💻 Geliştirici Notu

Bu proje, Java başlangıç seviyesini pekiştirmek ve GitHub üzerinde proje yönetimi pratiği yapmak amacıyla geliştirilmiştir.
