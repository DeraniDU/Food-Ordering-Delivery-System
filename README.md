A comprehensive microservices-based food ordering platform designed for scalability, performance, and modular development.

🚀 Project Overview
This system uses a microservices architecture to enable high scalability and independent service deployment. Supports Docker for local development and Kubernetes for production.

Key Features
Restaurant & menu management

User registration & authentication

Order placement & tracking

Secure payment processing

Real-time delivery tracking

Multi-channel notifications

🏗️ Architecture
Microservices communicate via an API Gateway:

Frontend: Angular

API Gateway: Spring Boot

Backend Services: Spring Boot microservices

Database: PostgreSQL (per service)

Deployment: Docker & Kubernetes

⚙️ Core Services
API Gateway: Entry point, JWT auth, routing

User Service: Authentication & profile management

Restaurant Service: Restaurant & menu management

Order Service: Order placement & tracking

Payment Service: Secure payments

Delivery Service: Real-time delivery updates

Notification Service: Email, SMS, and in-app alerts

🛠️ Technologies Used
Backend: Java, Spring Boot, Spring Cloud, PostgreSQL, JWT
Frontend: Angular, TypeScript, Jasmine
DevOps: Docker, Kubernetes, Minikube

🚀 Getting Started
Prerequisites
Docker & Docker Compose

Kubernetes & Minikube

Java 17+

Node.js 16+

npm 8+

Setup Options
Docker Compose (Development)

bash
Copy
Edit
git clone [https://github.com/yourusername/food-ordering-system.git](https://github.com/DeraniDU/Food-Ordering-Delivery-System.git)
cd food-ordering-system
docker-compose up -d
Frontend: http://localhost
API Gateway: http://localhost:8080

Kubernetes (Production-like)

bash
Copy
Edit
minikube start
./build-and-deploy.sh
Frontend: http://food-ordering.local
API Gateway: http://food-ordering.local/api

🔧 Service Endpoints (Local)
API Gateway: http://localhost:8080

User Service: http://localhost:8081

Restaurant Service: http://localhost:8082

Order Service: http://localhost:8083

Payment Service: http://localhost:8084

Delivery Service: http://localhost:8085

Notification Service: http://localhost:8086

🗄️ Database Setup
Uses separate PostgreSQL databases per service:

user_service_db

restaurant_service_db

order_service_db

payment_service_db

delivery_service_db

notification_service_db

⚙️ Configuration
Key environment variables:

SPRING_DATASOURCE_URL

SPRING_DATASOURCE_USERNAME

SPRING_DATASOURCE_PASSWORD

JWT_SECRET

Kubernetes config files are under the kubernetes/ directory.

🔐 Security
JWT-based authentication

Secrets via Kubernetes

Database credentials stored securely

💻 Development
To make changes:

bash
Copy
Edit
./gradlew build
docker build -t your-service .
docker-compose up -d your-service
🧪 Testing
bash
Copy
Edit
./gradlew test
ng test
docker-compose -f docker-compose.test.yml up --abort-on-container-exit
🐛 Troubleshooting
Check PostgreSQL and API Gateway status

Review service logs

Use kubectl logs and describe for Kubernetes issues

🤝 Contributing
Fork the repo

Create a new branch

Commit your changes

Open a pull request

📄 License
MIT License. See LICENSE for details.
