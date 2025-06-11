# Inventory Microservice

A Java Spring Boot microservice to manage product inventory, featuring:

- ✅ CRUD APIs for inventory
- 🔐 JWT authentication (utility class included)
- 📘 Swagger UI for API documentation
- 📢 Kafka integration for event publishing
- 🐳 Docker support

---

## 🛠 Technologies

- Java 17
- Spring Boot
- Spring Data JPA (with H2 in-memory DB)
- Spring Validation
- Spring Kafka
- JJWT (Java JWT)
- OpenAPI (Swagger UI)
- Docker

---

## 🚀 Running the App

### ▶️ Without Docker

```bash
mvn clean install
java -jar target/inventory-microservice-1.0.0.jar
```

### 🐳 With Docker

```bash
docker build -t inventory-microservice .
docker run -p 8080:8080 inventory-microservice
```

---

## 🔐 JWT Authentication

- `JwtUtil` is provided to generate and validate tokens.
- For production, add:
  - Login controller to issue tokens
  - `OncePerRequestFilter` to secure endpoints

---

## 📘 Swagger UI

> Accessible at: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

You can interact with all APIs via Swagger UI when the app is running.

---

## 🧪 API Endpoints (Examples)

| Method | Endpoint              | Description              |
|--------|-----------------------|--------------------------|
| POST   | `/products`           | Add a product            |
| GET    | `/products/{id}`      | Get product by ID        |
| PUT    | `/products/{id}/stock`| Update stock quantity    |
| GET    | `/products`           | List all products        |
| DELETE | `/products/{id}`      | Delete a product         |

---

## 📢 Kafka Integration

- Publishes messages to topic: `inventory-events`
- Configure Kafka broker in `application.properties`:
```properties
spring.kafka.bootstrap-servers=localhost:9092
```
- Extend `KafkaPublisher` to emit events like stock updates or new products.

---

## 🧪 H2 Database Console

> Accessible at: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`, Password: _(blank)_

---

## 📂 Folder Structure (Important Files)

```
├── controller/           # REST controllers
├── service/              # Business logic
├── model/                # JPA entities
├── repository/           # Spring Data JPA interfaces
├── config/               # Swagger & Kafka configuration
├── security/             # JWT utilities
├── dto/                  # Data Transfer Objects
├── exception/            # Custom exceptions
└── Dockerfile            # For containerizing the app
```

---

## 🔧 To Do (Optional Enhancements)

- [ ] Add Kafka consumer
- [ ] Secure endpoints using Spring Security + JWT
- [ ] Connect to PostgreSQL or MySQL for persistence
- [ ] Add unit tests and integration tests

---

## 📜 License

This project is open-sourced under the MIT License.