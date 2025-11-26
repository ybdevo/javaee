# Jakarta EE - Theory and Examples

![Java](https://img.shields.io/badge/Java-21-blue.svg)

A collection of projects and examples to illustrate core concepts of Jakarta Enterprise Edition (Jakarta EE). This repository is structured as a multi-module project where each module focuses on a specific topic.

---

## 🏛️ Project Structure

The project is divided into several modules, each corresponding to a "Day" of learning.

| Module                             | Description                                                                                                                                                                                           | Key Files                                                                                                                              |
| ---------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| **Day-01: Intro to Servlets**      | Covers the fundamentals of Java Servlets, demonstrating basic `doGet` handling.                                                                                                                       | `HelloServlet.java`, `Customer.java`                                                                                                   |
| **Day-02: Application**            | Demonstrates a practical application of servlets by creating a simple in-memory CRUD system for managing customers. It introduces the concept of a controller servlet and a POJO data model.         | `CustomerServlet.java`, `Customer.java` (as POJO)                                                                                      |
| **Day-02: Mapping Specification**  | A reference module for the various URL mapping strategies available via the `@WebServlet` annotation.                                                                                                 | `ExactMapping.java`, `ExtensionMapping.java`, `WildCardMapping.java`, `DefaultMapping.java`, `MultipleMapping.java`                     |

---

## 🛠️ Technologies Used

*   **Jakarta Enterprise Edition (Jakarta EE) 9+**
*   **Java Servlet API**
*   **Apache Tomcat** (or any other Java EE compatible web container)
*   **IntelliJ IDEA** (as the IDE)

---

## 🚀 How to Use

1.  **Clone the repository:**
    ```bash
    git clone git@github.com:ybdevo/javaee.git
    ```

2.  **Open in your IDE:**
    *   Open the project in a Java EE compatible IDE like **IntelliJ IDEA Ultimate**.

3.  **Configure the Application Server:**
    *   You will need to have an application server like **Apache Tomcat** configured in your IDE.

4.  **Run the modules:**
    *   Each module can be run individually on the application server. Select the desired module and run it on your configured server.

---

*This repository is intended for educational purposes.*