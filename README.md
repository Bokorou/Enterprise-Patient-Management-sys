# Enterprise-Patient-Management-sys
An enterprise-esque patient management system using micro-services and modern DevOps tools.
I started this project to get hands-on insight and experience in what enterprise level workflows would look like for a backend/DevOps engineer.

I was exposed to use cases of Microservices as opposed to a monolithic approach to building a system like this.

---

## 🛠️ Tools
- **Spring Boot** framework for Crud operation
- Protobuf stubs for **gRPC**
- Zookeeper container to enable **Kafka** brokers
- **Postman** for testing and debugging
- **Postgresql** for data persistence
- **Docker Desktop** for local development and deployment
- **LocalStack** - Simulated AWS environment for local testing
- **AWS CDK (Cloud Development Kit)**
— **Infrastructure-as-Code** setup for **ECS**(Elastic Container Service) and related cloud services

ECS Tasks — Container orchestration for deployment on AWS

---

## 🌐 Features
- JWT authentication for extra security. This feature provides expirable tokens that verify and allow only admin to make API requests
- internal Billing record upon the creation of a new patient (however this has been very minimally designed to allow quick testing)
- ipatient creation events are pushed to **kafka for analytics processing**
- **Docker containerization**  Each microservice runs in a container for easy orchestration - for the purpose of consistent deployment
- **API gateway** Secures internal service endpoints and routes external traffic efficiently
- Integration tests
- Infrastructure-as-Code with CDK — Automates cloud setup using AWS CDK for repeatable deployments

---

## 💭 Thoughts
There's still so much more to discuss and find out about all the tools and features used in this project! This has been an extremely awarding journey that seemingly has only just begun. I'll keep updating this ReadMe to provide further information on what was done.
