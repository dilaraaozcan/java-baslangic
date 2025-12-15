# 🏙️ SmartCityAssistant — Java Console App

Bu proje, kullanıcıya sunulan menü üzerinden **taksi ücreti**, **elektrik faturası** ve **sağlık (BMI & ideal kilo)** hesaplamaları yapan basit bir Java konsol uygulamasıdır.  
Temel Java konularını (Scanner, if–else, switch–case, koşullar ve matematiksel işlemler) pekiştirmek amacıyla geliştirilmiştir.

⸻

✨ Özellikler

– Kullanıcıdan giriş bilgileri alır:
• Kullanıcı adı
• PIN oluşturma ve doğrulama

– Menü üzerinden hizmet seçimi sunar:
	1.	Taksi Ücreti Hesaplama  
	2.	Elektrik Faturası Hesaplama  
	3.	Sağlık Kontrolü (BMI & İdeal Kilo)

– Seçilen hizmete göre gerekli bilgileri ister:
• Taksi → mesafe, zaman (day/night), hafta sonu durumu  
• Elektrik → tüketim miktarı (kWh)  
• Sağlık → cinsiyet, boy, kilo  

– Hesaplama işlemleri:
• Taksi ücreti → başlangıç ücreti + mesafe × tarife  
• Elektrik faturası → kademeli fiyatlandırma + vergi  
• BMI → kilo / (boy²)  
• İdeal kilo → cinsiyete göre hesaplama  

– Hatalı girişlerde kullanıcıyı uyarır.

⸻

🧠 Kullanılan Yapılar

– Scanner ile kullanıcıdan veri alma  
– if–else yapıları ile koşul kontrolü  
– switch–case ile menü yönetimi  
– Matematiksel hesaplamalar  
– double ve int veri tipleri  
– Konsol çıktısı üretme  

⸻

🖥 Örnek Çıktı

Aşağıdaki gibi bir çalışma çıktısı üretebilir:

Kullanıcı adı: Dilara  
PIN oluştur: 1234  
PIN gir: 1234  

1-Taksi  2-Elektrik  3-Sağlık  
Seçim: 1  

Mesafe (km): 10  
Zaman (day/night): day  
Hafta sonu (yes/no): no  

Taksi Ücreti: $18.00  

=== ÖZET ===  
Toplam Tutar: $18.00  

⸻

📂 Proje Yapısı

src/SmartCityAssistant.java  
README.md  

⸻

🚀 Çalıştırma Adımları

1. Projeyi bilgisayarına indir veya kopyala  
2. IntelliJ IDEA (veya herhangi bir Java IDE) ile aç  
3. SmartCityAssistant.java dosyasını çalıştır  
4. Konsoldaki yönergeleri takip et  

⸻

👩‍💻 Geliştirici Notu

Bu mini proje, Java’nın temel kontrol yapılarının öğrenilmesi ve GitHub üzerinde küçük ölçekli projelerin düzenli şekilde paylaşılması amacıyla hazırlanmıştır.
