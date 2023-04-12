# student-management-springboot-mvc

## Student Management System
The Student Management System is a web application that allows users to perform CRUD (Create, Read, Update, Delete) operations on student data.
The application is built using Spring Boot, Thymeleaf, and MySQL.

## Installation
To install and run the application, follow these steps:

Clone the repository to your local machine.
Open the project in your preferred IDE (such as IntelliJ IDEA).
Update the database connection properties in application.properties.
##### Run the project.

### Usage
Once the application is running, you can access it in your web browser at http://localhost:8080/api/students.

The application allows you to perform the following operations:

1. Create a new student: Click on the "New Student" button to create a new student record.
2. View all students: Click on the "View Students" button to see a list of all students in the system.
3. Edit a student: Click on the "Edit" button next to a student record to edit its details.
4. Delete a student: Click on the "Delete" button next to a student record to delete it from the system.

# Architecture
### The application follows the Model-View-Controller (MVC) architecture pattern.

The model layer consists of the Student entity class and the StudentRepository interface, which is implemented using Spring Data JPA.
The service layer consists of the StudentService interface and its implementation class, which handles business logic related to student data.
The controller layer consists of the StudentController class, which handles HTTP requests related to student data and passes them on to the service layer.
The view layer consists of HTML templates written using Thymeleaf, which display student data in the web browser.
## Conclusion
The Student Management System is a simple yet useful web application that demonstrates the use of Spring Boot, Thymeleaf, and MySQL to perform CRUD operations on student data.
With a few modifications, it could be extended to handle more complex data models and business logic.
