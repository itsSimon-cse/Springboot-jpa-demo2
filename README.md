<<<<<<< HEAD
# Springboot-jpa-demo2
=======
# Spring Boot JPA Demo

This is a simple Spring Boot project demonstrating the usage of JPA (Java Persistence API) for working with a PostgreSQL database. 
The project includes CRUD (Create, Read, Update, Delete) operations for a `Book` entity, with an added feature of categorizing books.

## Features

- **CRUD Operations:** Basic CRUD operations for managing books.
- **Category Addition:** Ability to add and categorize books.

## Technologies Used

- **Spring Boot:** For building and managing the application.
- **Spring Data JPA:** Simplifies the data access with JPA.
- **PostgreSQL Database:** Used as the main database for persistence.
- **RESTful API:** For communication with the frontend or external systems.

## Getting Started

To run the project locally:

Clone the repository:
git clone https://github.com/itsSimon-cse/Springboot-jpa-demo2.git


Navigate to the project directory:

cd Springboot-jpa-demo2
Set up your PostgreSQL database:

Update application.properties or application.yml with your PostgreSQL database configuration.


Run the application:

./mvnw spring-boot:run
Access the application at http://localhost:8080 in your web browser.


API Endpoints
GET /getAllBooks: Get a list of all books.
GET /get/{bookID}: Get details of a specific book.
POST /createBook: Create a new book.
POST /addCategory/{category}: Add a category to a book.
GET /getByCategory/{category}: Get books by category.
DELETE /deleteBook/{bookId}: Delete a book.
PUT /updateBook/{bookId}: Update a book.

Feel free to explore the API and test the functionality using tools like Postman.
>>>>>>> origin/master
