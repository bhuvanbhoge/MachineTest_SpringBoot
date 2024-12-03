# bhuvanNimapMachineTest

# Prerequisites
To successfully run and test this project, ensure the following tools and technologies are installed and configured on your system:

-JDK 21: Java Development Kit for compiling and running the application.
-IntelliJ IDEA (IDE): For code development, debugging, and execution.
-MySQL Workbench: For database setup and management.
-Spring Initializer: To generate the initial Spring Boot project structure.
-Postman: For testing the APIs and performing CRUD operations.
-Google Chrome: To view any additional documentation or references.
-Git & GitHub: For version control and project collaboration.


# Development Process
- Project Initialization:

  -The project was generated using Spring Initializer with the following configurations:
- Build Tool: Maven
-Spring Boot Version: Latest compatible version for JDK 21

# Dependencies:
-Lombok
-Spring Web
-Spring Data JPA
-Spring Boot DevTools
-MySQL Driver

![image](https://github.com/user-attachments/assets/9a3705b4-69bd-44f3-8e43-b00fbfd427d8)


# Database Setup:

Created a schema in MySQL for managing the required tables:
-categories
-products

![image](https://github.com/user-attachments/assets/bd1ec9c0-8dd0-4035-9693-2617094e1466)


Configured database credentials in the application.properties file:
properties
spring.datasource.url=jdbc:mysql://localhost:3306/bhuvanDB
spring.datasource.username=root
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


# Code Structure:

Followed a modular package structure for clean and maintainable code:
-Entity: Created Category and Product entities representing the database tables.
-DTO: Defined data transfer objects for handling API requests and responses.
-Repository: Developed JPA repositories for database interactions.
-Service: Implemented business logic for CRUD operations.
-Controller: Exposed RESTful endpoints for Category and Product management.

![image](https://github.com/user-attachments/assets/02c5d604-baa2-4346-a787-2e143024b180)


# Development and Execution:

The application was developed and executed using IntelliJ IDEA.
Used the "Run" button in IntelliJ IDEA to start the Spring Boot application.


# API Testing:

Validated all endpoints using Postman.
Performed CRUD operations (GET, POST, PUT, DELETE) on categories and products with different input scenarios.
Verified server-side pagination and the one-to-many relationship between Category and Product.

![Screenshot 2024-12-03 182723](https://github.com/user-attachments/assets/c8510442-6373-4533-8de1-b6328bf2cbe2)

![Screenshot 2024-12-03 182745](https://github.com/user-attachments/assets/0159b74c-b1bf-4801-8f3c-67af4165720a)

![Screenshot 2024-12-03 182758](https://github.com/user-attachments/assets/b0a947bb-6ef7-40ee-b5a8-b568f01aaffe)

![Screenshot 2024-12-03 182821](https://github.com/user-attachments/assets/7dc47bba-22c4-4504-b578-e442766bf35a)


# How to Run the Code
Clone the repository to your local machine:

git clone https://github.com/bhuvanbhoge/bhuvanNimapMachineTest.git
cd bhuvanNimapMachineTest

Open the project in IntelliJ IDEA.

Configure the database credentials in the application.properties file.

Start the MySQL server and ensure the database schema is set up.

![image](https://github.com/user-attachments/assets/7e705729-79b7-45e6-a118-3d1a71b2e049)

![image](https://github.com/user-attachments/assets/744c8f9a-6da5-48f8-9e46-a0ef64681a6c)



# Build and run the project:

- Using Maven:

mvn clean install
mvn spring-boot:run
Or directly from IntelliJ using the "Run" button.

- Test the APIs using Postman:

Base URL: http://localhost:8080/api


# How to Run the Machine Test
Set Up the Database:
Create a MySQL database and configure the schema for categories and products.
Start the Application:
Run the application as explained above.

# Perform API Tests:
Use Postman to test all required endpoints:
/api/categories: CRUD operations for categories.
/api/products: CRUD operations for products.
Verify server-side pagination and ensure product details include category information.
Validate Features:

Ensure server-side pagination works for both categories and products.
Check that the one-to-many relationship between categories and products is properly implemented.

# DB Design 
![image](https://github.com/user-attachments/assets/1bd61cac-0918-4060-9f16-56840109e835)




