<h1 align = "center"> Employee Management System </h1>

<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>

<a >
    <img alt="MySQL" src="https://img.shields.io/badge/MySQL-blue.svg">
</a>
</p>

The Employee Management System using Spring Boot is a user-friendly and efficient application that streamlines the management of employee data. This application provides an easy-to-use interface for HR personnel to manage employee information, and also allows employees to view and update their own personal details. With its advanced features such as reporting and user management, this application is a valuable tool for any organisation looking to manage their employee data effectively.

---
<br>

## Framework Used
* Spring Boot

---
<br>

## Dependencies
The following dependencies are required to run the project:

* Spring Boot Dev Tools
* Spring Web
* Spring Data JPA
* MySQL Driver
* Lombok
* Validation
* Swagger

<br>

## Database Configuration
To connect to a MySQL database, update the application.properties file with the appropriate database URL, username, and password. The following properties need to be updated:
```
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost:3306/<DatabaseName>
spring.datasource.username = <userName>
spring.datasource.password = <password>
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update

spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true

```
<br>

## Language Used
* Java

---
<br>

## Data Model

The Job data model is defined in the Job class, which has the following attributes:
<br>

* Employee Model
```
id : int
firstName : string
lastName : string
email : string
mobilenumber : string
jobrole : string
address : string
salary : int
```


## Data Flow

1. The user at client side sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.
4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

<br>


## API End Points

The following endpoints are available in the API:

* Employee Controller:
```
POST /api/employee: create a new employee record
PUT /api/employee/id/employee : update the employee record
GET /api/employees : get the all employee records
GET /api/employee/id : get the employee record
DELETE /api/employee/id : delete the employee record 
```



<br>

## DataBase Used
* SQL database
```
We have used Persistent database to implement CRUD Operations.
```
---
<br>

## Project Summary

The Employee Management System using Spring Boot is a user-friendly and efficient application that streamlines the management of employee data. This application provides an easy-to-use interface for HR personnel to manage employee information, and also allows employees to view and update their own personal details. With its advanced features such as reporting and user management, this application is a valuable tool for any organisation looking to manage their employee data effectively.




## Author

👤 **Sreenath Golla**

* GitHub: [Sreenath Golla](https://github.com/sreenath789/employee-management-system)

---

## 🤝 Contributing

Contributions, issues and feature requests are welcome!<br />Feel free to check [issues page]("url").
    
---

## Show your support

Give a ⭐️ if this project helped you!
    
---


