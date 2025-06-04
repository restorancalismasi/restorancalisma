# RESTORAN OTOMASYON PROJESİ

Bu proje bir restoran otomasyon sistemidir. Spring Boot, PostgreSQL ve Docker teknolojileri kullanılarak geliştirilmiştir.

---

## Proje İçeriği

- **Backend**: Java 17, Spring Boot
- **Veritabanı**: PostgreSQL
- **Frontend**: HTML, CSS, JS
- **Container**: Docker, Docker Compose

---

## Kurulum ve Çalıştırma

### 1. Gerekli Programlar

Projeyi çalıştırmadan önce aşağıdaki yazılımlar bilgisayarınızda kurulu olmalıdır:

- [Docker Desktop](https://www.docker.com/products/docker-desktop)
- [Java 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven](https://maven.apache.org/download.cgi) _(Yoksa `.mvnw` kullanılabilir)_
- (Opsiyonel) [Visual Studio Code](https://code.visualstudio.com/)

---

### 2. Projeyi Klonla veya Aç

https://github.com/restorancalismasi/restorancalisma.git

---

### 3. Projeyi Derle

-proje dosyası açılıp terminalde aşağıdaki kod çalıştırılır.

###### -mvn clean package

---

### 4. Docker Container Başlat

###### -docker-compose down -v # (önceki container varsa sil)

###### -docker-compose up --build

---

### 5. Uygulamayı Aç

http://localhost:8080

---

### 5. Admin Bilgileri

->Email :"admin@restoran-otomasyon.com"
->Parola:'Admin0\*'

---

### 5. Katkıda Bulunanlar

###### -> 230202130---Ömer Faruk Özcan

###### -> 230202139---Mehmet Osmanlar

###### -> 220202015---Taruk Ertuğrul Özkul
