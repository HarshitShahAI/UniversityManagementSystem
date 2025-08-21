# University Management System

A comprehensive desktop application built with Java Swing and MySQL to manage student and faculty data in a university environment. This project provides an intuitive graphical user interface for handling various administrative tasks efficiently.

## Features

-   **Faculty Management:** Add, view, and update teacher details.
-   **Student Management:** Add, view, and update student information.
-   **Marks & Attendance:** Enter and view student marks and attendance records.
-   **Fee Management:** Manage student fee structures and payments.
-   **Examination Details:** Access and display student examination results.
-   **Secure Login:** A simple login interface to get started.

## Tech Stack

-   **Frontend:** Java Swing
--   **Backend:** Java
-   **Database:** MySQL
-   **JDBC Driver:** MySQL Connector/J

## Getting Started

Follow these instructions to get a copy of the project up and running on your local machine.

### Prerequisites

-   Java Development Kit (JDK) 8 or higher
-   MySQL Server
-   An IDE like IntelliJ IDEA, Eclipse, or NetBeans

### Installation & Setup

1.  **Clone the repository:**
    ```sh
    git clone [https://github.com/HarshitShahAI/UniversityManagementSystem.git](https://github.com/HarshitShahAI/UniversityManagementSystem.git)
    ```

2.  **Set up the MySQL Database:**
    -   Start your MySQL server.
    -   Create a new database.
        ```sql
        CREATE DATABASE universitymanagementsystem;
        ```
    -   Execute the SQL commands from the `mysql_commands.txt` file to create all the necessary tables.

3.  **Configure Database Connection:**
    -   Open the project in your IDE.
    -   Navigate to `src/University/Conn.java`.
    -   Modify the database URL, username, and password to match your local MySQL setup.
      ```java
      // src/University/Conn.java
      c = DriverManager.getConnection("jdbc:mysql:///universitymanagementsystem", "YOUR_USERNAME", "YOUR_PASSWORD");
      ```

4.  **Run the Application:**
    -   Locate the `Project.java` file in the `src/University` package.
    -   Compile and run `Project.java` to launch the application's main dashboard.

## Contributing

Contributions are welcome! If you have suggestions to improve the project, please feel free to fork the repository and create a pull request.

1.  Fork the Project
2.  Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3.  Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4.  Push to the Branch (`git push origin feature/AmazingFeature`)
5.  Open a Pull Request

---
