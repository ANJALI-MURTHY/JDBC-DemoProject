# JDBC-DemoProject
### README

---

# JDBC MySQL Connection Example

This README provides a detailed step-by-step guide on how to set up and run a simple Java application that connects to a MySQL database using JDBC. The guide covers the prerequisites, setup, and execution of a sample query.

---

## Table of Contents

1. [Prerequisites](#prerequisites)
2. [Project Setup](#project-setup)
3. [Database Configuration](#database-configuration)
4. [Java Code Explanation](#java-code-explanation)
5. [Running the Program](#running-the-program)
6. [Troubleshooting](#troubleshooting)
7. [Conclusion](#conclusion)

---

## Prerequisites

Before you begin, ensure you have the following:

- **Java Development Kit (JDK) 17 or later**: Ensure the JDK is installed and properly configured in your development environment.
- **Eclipse IDE**: A popular IDE for Java development.
- **MySQL Server**: Install MySQL Server on your local machine or use a remote MySQL instance.
- **MySQL Connector/J**: The JDBC driver for MySQL, which can be downloaded from the [official MySQL website](https://dev.mysql.com/downloads/connector/j/).

---

## Project Setup

### 1. Install JDK and Configure Eclipse

- Download and install the JDK 17 or later from [Eclipse Adoptium](https://adoptium.net/).
- In Eclipse, navigate to `Eclipse` > `Preferences` > `Java` > `Installed JREs`.
- Ensure your JDK is added and selected as the default.

### 2. Create a New Java Project

- Open Eclipse and create a new Java project.
- Name your project (e.g., `JDBCExample`).
- Create a new package under the `src` folder (e.g., `com.example`).

### 3. Add MySQL Connector/J to Your Project

- Download the MySQL Connector/J JAR file.
- In Eclipse, right-click on your project and select `Build Path` > `Configure Build Path`.
- Under the `Libraries` tab, click `Add External JARs...` and add the `mysql-connector-java-8.0.xx.jar` file.

---

## Database Configuration

### 1. Create the Database

- Open your MySQL client or MySQL Workbench.
- Create a new database:

  ```sql
  CREATE DATABASE test_db;
  ```

- Switch to the database:

  ```sql
  USE test_db;
  ```

### 2. Create the Table

- Create a table named `users`:

  ```sql
  CREATE TABLE users (
      id INT PRIMARY KEY AUTO_INCREMENT,
      name VARCHAR(100),
      email VARCHAR(100)
  );
  ```

- Insert sample data:

  ```sql
  INSERT INTO users (name, email) VALUES ('John Doe', 'john@example.com');
  INSERT INTO users (name, email) VALUES ('Jane Smith', 'jane@example.com');
  ```

---

## Java Code Explanation

### 1. Basic Structure

In the `com.example` package, create a new Java class named `MySQLExample`:


### 2. Explanation

- **JDBC URL**: The JDBC URL is constructed as `jdbc:mysql://localhost:3306/test_db?useSSL=false`.
- **Driver Loading**: `Class.forName("com.mysql.cj.jdbc.Driver");` loads the MySQL JDBC driver.
- **Connection**: The `DriverManager.getConnection()` method establishes a connection to the database.
- **Query Execution**: The `Statement` object executes a SQL query to select rows where the name starts with "John".
- **Result Processing**: The `ResultSet` object processes and prints the retrieved data.
- **Cleanup**: All resources (connection, statement, resultSet) are closed to prevent memory leaks.

---

## Running the Program

### 1. Build the Project

- In Eclipse, ensure your project has no build errors.
- Go to `Project` > `Build Project`.

### 2. Run the Java Program

- Right-click on the `MySQLExample` class.
- Select `Run As` > `Java Application`.
- The output will be printed to the Eclipse console, displaying users whose names start with "John".

---

## Troubleshooting

- **ClassNotFoundException for `com.mysql.cj.jdbc.Driver`**:
  - Ensure the MySQL Connector/J JAR file is correctly added to the build path.
  
- **Connection Issues**:
  - Verify the MySQL server is running and the connection URL, username, and password are correct.
  
- **Unresolved Compilation Problems**:
  - Ensure the JDK is properly configured and the required JAR files are included in the build path.

---

## Conclusion

By following the steps outlined in this README, you should be able to successfully set up a Java application that connects to a MySQL database using JDBC, executes a query, and processes the results. This basic setup can be expanded upon for more complex database interactions and serves as a foundation for Java database programming.
