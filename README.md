# 📦 Client Registration API with ViaCEP Integration

This is a simple educational project for registering clients, with automatic address completion based on the ZIP code using the [ViaCEP API](https://viacep.com.br/). It's built with **Spring Boot**, and includes an in-memory **H2 database**, as well as **Swagger UI** for easy interaction with the API.

## 🚀 Technologies Used

- **Spring Boot** – Main framework for building the REST API  
- **Swagger (Springdoc OpenAPI)** – For API documentation and testing  
- **H2 Database** – Lightweight in-memory database for development/testing  
- **ViaCEP API** – External service used to fetch address details from a ZIP code  

## 🔧 How It Works

1. You send a client registration request with a valid Brazilian ZIP code (CEP).
2. The API queries the ViaCEP service to fetch the address data.
3. The address fields (street, neighborhood, city, state) are auto-filled.
4. The complete client information is stored in the H2 database.

## 📑 API Documentation

Once the project is running, you can access Swagger UI at: http://localhost:8080/swagger-ui.html. 
Use this interface to interact with all available endpoints.
For more information about ViaCEP API, access: https://viacep.com.br/

## 💡 Purpose

This project was developed for learning and demonstration purposes. It showcases:
- How to integrate an external API with Spring Boot
- Basic RESTful API structure
- Use of in-memory databases for quick testing
- Swagger for self-documenting APIs

## 🧪 Running the Project

To run the project, simply clone the repository and use your preferred IDE (like IntelliJ or Eclipse).

