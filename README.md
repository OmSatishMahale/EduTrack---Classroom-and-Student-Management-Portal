## Batch Management API (Spring Boot + MongoDB)

A backend REST API built using Spring Boot for managing batch details. The application allows users to perform CRUD operations on batch data and demonstrates a clean layered architecture using Controller, Service, and Repository patterns.

## Overview

This project is designed to handle batch-related data such as batch name and fees. It uses MongoDB as the database and exposes RESTful endpoints for interacting with the system.

The application is lightweight, scalable, and structured following best practices in backend development.

## Tech Stack
Backend: Java, Spring Boot
Database: MongoDB
Architecture: REST API (Controller → Service → Repository)
Tools: Maven

## Features
Create new batch entries
Fetch all batch records
Fetch batch by ID
Update batch details
Delete batch by ID
Clean layered architecture

## Project Structure
src/main/java/com/marvellous/Portal/
├── Controller/
│   └── BatchEntryController.java
├── Service/
│   └── BatchEntryService.java
├── Repository/
│   └── BatchEntryRepository.java
├── Entity/
│   └── BatchEntry.java
└── PortalApplication.java

## API Endpoints
  Get All Batches
    GET /batches
  Create Batch
    POST /batches
  Update Batch
    PUT /batches/id/{id}
  Delete Batch
    DELETE /batches/id/{id}
    
## Getting Started
  Prerequisites
    Java 17+
    Maven
    MongoDB running locally
    
## Run the Application
  mvn clean install
  mvn spring-boot:run

## Future Improvements
  Add validation (DTO layer)
  Exception handling (Global Exception Handler)
  Swagger API documentation
  Authentication (JWT)
  Pagination & filtering

## Learning Outcomes
  Building REST APIs using Spring Boot
  Integrating MongoDB with Spring Data
  Understanding layered architecture
  Handling CRUD operations efficiently
  
## Contributing

Contributions are welcome. Feel free to fork the repository and improve it.
