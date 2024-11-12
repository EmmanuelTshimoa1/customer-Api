# customer-Api
a sample README.md file with setup, build, run, and test instructions for the Customer API challenge in Java with Spring Boot.

This repository contains a Spring Boot REST API for managing Customer entities. The API includes basic CRUD operations and is containerized with Docker, with support for deployment on Kubernetes.

Prerequisites
Software Requirements
1. Java Development Kit (JDK) 11 or higher.
2. Maven for build automation.
3. Docker (for containerization).
4. Kubernetes (optional, for deployment).

Environment Variables
For Docker and Kubernetes deployments, you may need to set the following environment variables:

SPRING_DATASOURCE_URL – JDBC URL of your database (default: jdbc:h2:mem:testdb).
SPRING_DATASOURCE_USERNAME – Username for database (default: sa).
SPRING_DATASOURCE_PASSWORD – Password for database (default: password).

Setup Instructions
1. Clone the Repository

git clone https://github.com/EmmanuelTshimoa1/customer-Api.git
cd customer-api

2. Build the Application

Use Maven to build the application:
mvn clean install

3. Run the Application Locally

To start the API server locally:

mvn spring-boot:run
The API should be available at http://localhost:8080.

4. Run Tests

To run unit and integration tests:

mvn test

API Endpoints
The main endpoints for managing customers:

Method	Endpoint	    Description
GET	    /customers	    Retrieve all customers
GET	    /customers/{id}	Retrieve a specific customer
POST	/customers	    Create a new customer
PUT	    /customers/{id}	Update a customer
DELETE	/customers/{id}	Delete a customer

Containerization with Docker

To build and run the application in a Docker container:

1. Build the Docker Image
docker build -t customer-api:latest .

2. Run the Docker Container
docker run -p 8080:8080 customer-api:latest

Kubernetes Deployment
To deploy the application to a Kubernetes cluster, follow these steps:

1. Apply Kubernetes Manifests
Make sure your Kubernetes context is set to the correct cluster, then run:
kubectl apply -f k8s-deployment.yaml
kubectl apply -f k8s-service.yaml

2. Accessing the Service
The service will expose a NodePort by default, and you can access the API using the node IP and port.







