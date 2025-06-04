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

###### ->Email :"admin@restoran-otomasyon.com"

###### ->Parola:'Admin0\*'

---

### 5. Katkıda Bulunanlar

###### 230202139---Mehmet Osmanlar(https://github.com/Sadakazam----Ekip Üyesi)

###### 220202015---Taruk Ertuğrul Özkul(https://github.com/tarikkgit---Ekip Üyesi)

###### 230202130---Ömer Faruk Özcan(https://github.com/omerfrkozcn----Ekip Lideri)

)

### -> 230202139---Mehmet Osmanlar(Feature/controller,Feature/entity,Feature/model )

1. Business Layer: OOP Components

Proje, nesne yönelimli programlama prensiplerine göre katmanlı mimari ile yapılandırılmıştır. İş katmanını temsil eden sınıflar ve görev ayrımı yapılmıştır.

AdminController, CartController, OrderController gibi sınıflar oluşturulmuştur.

controller, service, model, entity klasörleri ile mantıksal görev ayrımı yapılmıştır.

@Entity, @Service, @Repository anotasyonlarıyla bağımlılıklar ayrıştırılmış (sınıf içerikleriyle doğrulanabilir).

2. Data Layer: ORM / Migrations Using

Veri erişimi Spring Data JPA (ORM) ile gerçekleştirilmiştir. Repository yapıları ve veri modelleri JPA standardına uygundur.

CartModel, OrderModel, UserModel gibi entity sınıfları mevcuttur.

Repository yapılarının (CartRepository, OrderRepository) varlığına işaret eden dosya yapısı vardır.

SQL yazmadan veri erişimi sağlayan yöntemler için uygun yapı mevcuttur.

3. Session / Cookie Management

Kullanıcı kimliği ve sepet işlemleri HttpSession üzerinden izlenmektedir. Session ID ile işlemler kontrol edilmektedir.

RequestUtil.java sınıfı ve getSession() ile oturum yönetimi yapılmaktadır.

Kullanıcıya özel session ile sepet tanımlanmakta ve güncellenmektedir.

### -> 220202015---Taruk Ertuğrul Özkul(Feature/repository,Feature/service,Feature/util )

1. Business Layer: OOP Components

Proje, nesne yönelimli programlama prensipleriyle katmanlı şekilde yapılandırıldı. Business layer; controller, service ve model gibi sınıflarla temsil edildi.

CartService.java, UserService.java, OrderService.java: ➜ Service katmanı oluşturuldu.

repository, service, util gibi klasörler ayrı tutulmuş ➜ görev ayrımı sağlandı

@Service, @Repository anotasyonları da kullanıldı.

2. Data Layer: ORM / Migrations Using
   Veri işlemleri için Spring Data JPA kullanıldı, repository sınıfları JpaRepository'den türetildi.

CartRepository.java, OrderRepository.java, UrunRepository.java, UserRepository.java: ➜ JpaRepository yapısı mevcuttur.

SQL yazmadan erişim sağlamak için gerekli altyapı kurulmuştur. (örneğin findBy... metotları).

Bu yapı JPA'nın sağladığı OOP tabanlı veri erişimi anlamına geliyor. 3. Session / Cookie Management

Kullanıcı kimliği ve sepet bilgisi HttpSession üzerinden takip ediliyor, session ID ile kullanıcıya özgü işlemler yapılıyor.

CommonUtil.java gibi yardımcı sınıflar session yönetimi içeriyor.

### -> 230202130---Ömer Faruk Özcan(main, develop)

1. Web Service Implementation
   @Controller anotasyonlu sınıflar bulunmakta.

Örneğin: CartController.java, AdminController.java gibi sınıflarda RESTful endpoint’ler tanımlanmıştır.

RequestMapping, PostMapping gibi Spring web anotasyonları bu yapılarda kullanılmıştır.

2. RBAC Implementation (Role-Based Access Control)

RoleModel.java, Status.java gibi sınıflar projede tanımlanmış.

Kullanıcıların rol bazlı ayrımını yapmak için gerekli entity ve enum yapıları mevcut.

Giriş yapan kullanıcıya göre yetki kontrolü yapmaya altyapı hazır.
