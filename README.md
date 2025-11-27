<h1 align="center">
  💼 Employee Management System Mini Project (Java)
</h1>

<p align="center">
  A small-scale console application built in **Java** demonstrating core Object-Oriented Programming (OOP) principles and basic service-layer architecture for managing company employee records.
</p>

---

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-007396?style=for-the-badge&logo=java" />
  <img src="https://img.shields.io/badge/Concept-Service%20Layer%20Architecture-4169E1?style=for-the-badge" />
  <img src="https://img.shields.io/badge/repo%20size-12%20KB-32CD32?style=for-the-badge" /> 
  <img src="https://img.shields.io/badge/Last%20Commit-27/11/2025-FF69B4?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Type-Console%20Application-8A2BE2?style=for-the-badge" />
</p>

---

## 📌 **Key Features & Architecture**

### **1. Dedicated Data Model**
* The **`Employee.java`** class serves as the Plain Old Java Object (POJO) to model employee attributes (ID, name, salary, etc.) using encapsulation.

### **2. Service Layer (Business Logic)**
* The **`Employee_Service.java`** class implements the core business logic, such as adding, deleting, updating, or retrieving employee data, keeping it separate from the main application view.

### **3. Application Driver**
* The **`EmployeeApp.java`** file contains the `main` method and acts as the entry point, handling the user interface (console interaction) and communicating with the Service layer.

### **4. Modular Design**
* Clear separation of concerns into Model, Service, and Application layers, making the project extensible and easy to test.

---

## 🛠 Tech Stack

### 💻 Core Technology
- <img src="https://img.icons8.com/color/30/java-coffee-cup-logo--v1.png" width="22" /> **Java** (JDK 8+)
- **OOP** (Object-Oriented Programming)

### 🧱 Architecture
- **Service Layer Pattern** (Model-Service-Controller/App)

---

## 📂 **Project Folder Structure**

<p align="center">
  <img src="https://img.shields.io/badge/Structure-Standard%20Java%20Package-90EE90?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Package-Company_Employee-FFA07A?style=for-the-badge" />
</p>

The source code is organized within the `src/Company_Employee/` package.

| File Name | Description | Layer |
| :--- | :--- | :--- |
| `Employee.java` | Defines the employee data model (POJO). | **Model** 💼 |
| `Employee_Service.java` | Contains all business logic (CRUD operations). | **Service** ⚙️ |
| `EmployeeApp.java` | Main application driver and console interface. | **View/App** 🖥️ |

---
Employee-Management-System/  
│  
├── bin/  
│   └── Company_Employee/  
│       ├── Employee.class  
│       ├── EmployeeApp.class  
│       └── Employee_Service.class  
│  
├── src/  
│   └── Company_Employee/  
│       ├── Employee.java  
│       ├── EmployeeApp.java  
│       └── Employee_Service.java  
│  
├── .classpath  
└── .project     

---

## ⚙️ **Installation and Setup**

To run this project locally, you need a Java Development Kit (JDK) installed on your system.

### **1. Clone the repository**
```bash
git clone [Your Repository URL]
```
### **2.Navigate to the source Directory**
```
cd Employee-Management-System/src/Company_Employee
```
### **3. Compile the Java files**
```
javac *.java
```
### **4. Execute the main application class**
```
java EmployeeApp
```
