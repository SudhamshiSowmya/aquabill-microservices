 # AquaBill - Smart Water Billing Management System

AquaBill is a Smart Water Billing Management System built using Spring Boot Microservices architecture.  
The system manages users, customers, billing, payments, and notifications through independent microservices..

---

 Features

- 👤 User Management
- 🏠 Customer Management
- 🧾 Billing Management
- 💳 Payment Management
- 🔔 Notification Management
- 🌐 API Gateway
- 📡 Eureka Service Discovery
- 💾 MySQL Database
- 🎨 Responsive Frontend

---

 Tech Stack

 Backend
- Java 17
- Spring Boot
- Spring Data JPA
- Spring Cloud
- Eureka Server
- Spring Cloud Gateway
- Maven

Database
- MySQL

 Frontend
- HTML
- CSS
- JavaScript

Tools
- VS Code
- Postman
- Git
- GitHub

---

Microservices

- Eureka Server
- API Gateway
- User Service
- Customer Service
- Billing Service
- Payment Service
- Notification Service

---

 Project Structure

```text
AquaBill-Microservices
│
├── api-gateway
├── aquabill-frontend
├── billing-service
├── customer-service
├── eureka-server
├── notification-service
├── payment-service
├── user-service
└── README.md
```

---

 Architecture

```text
Frontend
    │
    ▼
API Gateway
    │
    ▼
Eureka Server
    │
    ▼
--------------------------------------------
| User Service                            |
| Customer Service                        |
| Billing Service                         |
| Payment Service                         |
| Notification Service                    |
--------------------------------------------
    │
    ▼
MySQL Database
```

---

 How to Run

1. Start MySQL.
2. Start Eureka Server.
3. Start API Gateway.
4. Start all Microservices.
5. Open the frontend using Live Server.
6. Access the application from the browser.

---

 ## API Screenshots

### User Service - GET Users
(Add users screenshot here)

### Customer Service - GET Customers
(Add customers screenshot here)

### Billing Service - GET Bills
(Add bills screenshot here)

### Payment Service - GET Payments
(Add payments screenshot here)

### Notification Service - GET Notifications
(Add notifications screenshot here)

---

Developer

**Sudhamshi Sowmya Kongari**

B.Tech - Computer Science & Engineering (AI & ML)

Parul University

---

License

This project was developed for learning and internship purposes.