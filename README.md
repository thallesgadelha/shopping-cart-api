### Shopping Cart API
This project is a Shopping Cart API built using Java and Spring Boot. It provides a RESTful interface for managing a shopping cart, including user authentication, product management, and cart operations. The application utilizes Spring Security with JWT for authentication and integrates with a MySQL database for data persistence.

### Features
1. User Authentication: Secure user registration and login using JWT (JSON Web Tokens) via Spring Security.
2. Product Management: Endpoints to create, read, update, and delete products.
3. Cart Operations: Functionality to add products to the cart, view cart contents, update quantities, and remove items.
4. Order Processing: Ability to proceed to checkout and place orders.

### Technologies Used
- Java: Core programming language.
- Spring Boot: Framework for building the application.
- Spring Security: For implementing authentication and authorization.
- JWT (JSON Web Tokens): For stateless authentication.
- MySQL: Relational database for data storage.
- Maven: Dependency management and build automation.

### Getting Started
#### Prerequisites
Ensure you have the following installed:
- Java Development Kit (JDK) 17 or higher
- Apache Maven
- MySQL Server

### Installation
1. Clone the Repository:
```
git clone https://github.com/thallesgadelha/shopping-cart-api.git
```

2. Navigate to the Project Directory:
```
cd shopping-cart-api
```

3. Configure the Database:
- Create a new MySQL database named shopping_cart.
- Update the database connection settings in the application.properties file located in src/main/resources:
```
spring.datasource.url=jdbc:mysql://localhost:3306/shopping_cart
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
```

4. Build the Project:
Use Maven to build the project:
```
mvn clean install
```

5. Run the Application:
Start the application using:
```
mvn spring-boot:run
```

The application will start and be accessible at http://localhost:8080.

### Acknowledgments
Special thanks to the open-source community for providing valuable resources and tools that made this project possible.
