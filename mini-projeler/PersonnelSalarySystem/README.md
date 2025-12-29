# 👥 PersonnelSalarySystem — Employee Payroll Management (Java)

This project is a **Java console-based personnel salary management system** that calculates and manages employee payments based on their employment type.  
It uses a menu-driven structure and stores personnel data dynamically using an `ArrayList`.

The application demonstrates how conditional logic, loops, user input handling, and basic data structures can be combined to build a small but realistic management system.

---

## 🎯 Project Purpose

- Practice working with dynamic collections (`ArrayList`)
- Implement menu-based console applications
- Calculate salaries based on different employment models
- Use conditional logic (`if–else`) for business rules
- Store and list structured data during runtime

---

## 🧠 What the Program Does

- Displays a continuous menu until the user exits
- Allows adding new personnel records
- Supports two personnel types:
  - **Full-Time Employee**
  - **Part-Time Employee**
- Calculates salary based on:
  - Base pay, working hours, and sales commission
- Stores personnel name and calculated salary in a dynamic list
- Lists all registered personnel with their total salary
- Handles invalid menu selections gracefully

---

## 🧠 Salary Calculation Logic

### ▶️ Full-Time Employee
- Base salary is provided by the user
- Sales commission: **2%** of monthly sales
- Total salary:
  Base Salary + (Monthly Sales × 0.02)

### ▶️ Part-Time Employee
- Salary based on working hours and hourly rate
- Sales commission: **1%** of monthly sales
- Total salary:
  (Worked Hours × Hourly Rate) + (Monthly Sales × 0.01)

---

## 💡 Sample Flow

--- PERSONNEL SALARY SYSTEM ---
1- Add Personnel  
2- List Personnel  
3- Exit  
Selection: 1  

Personnel Name: Ayşe  

Personnel Type:
1- Full-Time  
2- Part-Time  
Selection: 1  

Base Salary: 15000  
Monthly Sales: 50000  

Personnel successfully added.

---

--- PERSONNEL LIST ---
Name: Ayşe - Total Salary: 16000.0 TL

---

## 📌 Java Concepts Practiced

- Dynamic data storage with `ArrayList`
- Using `Object[]` to store mixed-type data
- Menu-based program flow with `while (true)`
- Conditional logic (`if–else`)
- User input handling with `Scanner`
- Basic payroll calculation logic
- Iterating over collections with `for-each`

---

## 📄 File Structure

mini-projects/
└── PersonnelSalarySystem/
    ├── Main.java
    └── README.md

---

## 📝 Summary

This project simulates a simplified personnel payroll system and provides practical experience with collections, control flow, and real-world business logic. It is a strong example of combining multiple core Java concepts in a single console application.
