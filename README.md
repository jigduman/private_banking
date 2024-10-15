# private_banking
My first project on GitHub. This is a project I did during my summer internship at QazPost. 
This project is a Java Spring Boot application that provides a simple API for managing data related to top private banks. The application supports CRUD (Create, Read, Update, Delete) operations for bank records, allowing users to add, retrieve, update, and delete bank information.

The project is designed with RESTful APIs for efficient interaction with the database, providing endpoints to manage banks' details such as net worth, minimum deposits, and descriptions.

src/
 └── main/
     └── java/
         └── com/
             └── privateBanking/
                 ├── controller/   # API controllers for handling HTTP requests
                 ├── dto/          # Data Transfer Objects
                 ├── entity/       # Entity classes representing the data model
                 ├── repository/   # Repository interfaces for data access
                 ├── services/     # Business logic for CRUD operations
                 └── CrudApplication.java  # Main class for bootstrapping the application

                     
