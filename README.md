# Java EE Theory and Examples

This repository contains a series of projects and examples created to illustrate core concepts of Java Enterprise Edition (Java EE). It is structured as a multi-module project, with each module focusing on a specific topic.

## Project Structure

The project is divided into several modules, each corresponding to a "Day" of learning.

### Day-01: Introduction to Servlets

This module covers the fundamentals of Java Servlets.

*   `HelloServlet.java`: A basic servlet that demonstrates the `doGet` method.
*   `Customer.java`: Another simple servlet example.

### Day-02: Application and Mapping

This section is split into two parts:

1.  **Day-02-Application**:
    *   This module demonstrates a more practical application of servlets by creating a simple in-memory CRUD system for managing customers.
    *   `CustomerServlet.java`: Acts as a controller to handle requests.
    *   `Customer.java`: A POJO (Plain Old Java Object) used as a data model.

2.  **Day-02-Mapping-Specification**:
    *   This module provides a comprehensive reference for the different URL mapping strategies available for servlets using the `@WebServlet` annotation. Examples include:
        *   Exact Mapping
        *   Extension Mapping
        *   Wildcard Mapping
        *   Default Mapping
        *   Multiple Mappings

## Technologies Used

*   **Java Enterprise Edition (Java EE)**
*   **Java Servlet API**
*   **Apache Tomcat** (or any other Java EE compatible web container)
*   **IntelliJ IDEA** (as the IDE)

## How to Use

1.  **Clone the repository:**
    ```bash
    git clone git@github.com:ybdevo/javaee.git
    ```
2.  **Open in your IDE:**
    *   Open the project in a Java EE compatible IDE like IntelliJ IDEA Ultimate.
3.  **Configure the Application Server:**
    *   You will need to have an application server like Apache Tomcat configured in your IDE.
4.  **Run the modules:**
    *   Each module can be run individually on the application server. Select the desired module and run it on your configured server.

---
*This repository is intended for educational purposes.*
