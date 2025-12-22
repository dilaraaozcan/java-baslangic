# 📋 Menu-Based Console Application — Java Switch-Case Example

This project is a Java console application that demonstrates the use of **switch-case** and **if-else** decision structures through a menu-driven system.  
The application allows the user to log in, use a basic calculator, or exit the program based on the selected menu option.

---

## 🎯 Project Purpose

- Practice switch-case structures with a real menu system  
- Combine if-else logic with switch-case decision flows  
- Handle user input using `Scanner`  
- Implement nested decision-making mechanisms  
- Perform basic arithmetic operations safely  

---

## 🧠 What the Program Does

When the program starts, the user is presented with a main menu:

1. **Login System**
2. **Calculator**
3. **Exit**

Based on the user’s selection, the program executes the corresponding operation.

---

## 🔐 Login System (Option 1)

- Prompts the user for a username and password  
- Checks credentials using an `if-else` condition  
- Grants access only if:
  - Username is `admin`
  - Password is `password123`
- Displays a success or failure message accordingly  

---

## 🧮 Calculator (Option 2)

The calculator provides the following operations:

1. Addition  
2. Subtraction  
3. Multiplication  
4. Division  

Program flow:
- User selects an operation
- User enters two numbers
- A nested switch-case performs the selected calculation
- Division by zero is safely handled with an error message

---

## 🚪 Exit (Option 3)

- Terminates the program gracefully with a message

---

## ⚠️ Input Validation

- Invalid menu selections are handled with a default case
- Invalid calculator operations display an error message
- Division by zero is explicitly checked and prevented

---

## 📄 File Structure

MenuApplication/
└── Main.java

---

## 🧠 Java Concepts Practiced

- switch-case decision structures  
- Nested switch-case usage  
- if-else conditions  
- User input handling with `Scanner`  
- Basic arithmetic operations  
- Error handling and input validation  

---

## 📝 Summary

This project provides a clear and practical example of how switch-case and if-else structures can be combined to build interactive, menu-driven console applications in Java. It is ideal for beginners who want to strengthen their understanding of control flow and user interaction.
