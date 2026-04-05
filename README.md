# Spring REST Product Management

Spring Boot REST API for managing products (add, list, fetch by ID, and update).

This project was created during Capgemini training on **4 April 2026**.

## Tech Stack

- Java 17
- Spring Boot 4
- Spring Data JPA
- H2 Database
- Maven

## API Endpoints

- `POST /product` - Create a product
- `GET /product` - Get all products
- `GET /product/{id}` - Get product by ID
- `PUT /product` - Update product

Sample payload:

```json
{
  "productName": "iPhone",
  "price": 79999,
  "category": "mobile"
}
```

## Run Locally

```bash
./mvnw spring-boot:run
```

App runs on `http://localhost:8080`.

## Postman Output

![Postman Output 1](PostmanScreenshots/image1.png)
![Postman Output 2](PostmanScreenshots/image2.png)
![Postman Output 3](PostmanScreenshots/image3.png)
![Postman Output 4](PostmanScreenshots/image4.png)
![Postman Output 5](PostmanScreenshots/image5.png)
![Postman Output 6](PostmanScreenshots/image6.png)
