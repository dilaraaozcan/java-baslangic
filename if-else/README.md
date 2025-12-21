# 📘 If-Else — Java Conditional Structures

This folder contains example projects designed to learn and reinforce the use of conditional statements (`if`, `else if`, `else`) in Java.  
The if-else structure is a fundamental control mechanism that allows a program to make different decisions based on different conditions.

The folder content is gradually expanding, and each new project aims to apply if-else logic through **realistic and meaningful problems**.

---

## 📌 Example 1: Age Check (Legal Age Verification)

This example checks whether a person is of legal age based on the age value provided by the user.

- If the age is **18 or above** → “You are an adult.”
- If the age is **below 18** → “You are underage.”

This project is one of the simplest and most fundamental starting examples for learning if-else structures.

---

## 📌 Example 2: PasswordStrengthChecker — Password Security Analysis System

This project analyzes a user-provided password character by character to determine its security level. The following criteria are checked:

- Contains uppercase letters
- Contains lowercase letters
- Contains digits
- Contains special characters
- Contains whitespace

Based on character diversity, the password is classified as **Very Weak**, **Weak**, **Medium**, **Strong**, or **Very Strong**.  
This example demonstrates how if-else logic can be combined with loops and boolean flags.

---

## 📌 Example 3: Mars Climate Decision System — Mission Safety Analysis

This project is a Java console application that analyzes environmental conditions and produces mission safety decisions based on the surface temperature of Mars.

The system follows these steps:
- Validates whether the entered temperature value is **within a valid range** for Mars
- Classifies the climate condition based on temperature
- For each climate condition, generates:
  - Risk level
  - Maximum mission duration
  - Additional warnings when necessary

This example teaches the use of if-else chains together with **input validation**, **multiple output generation**, and **nested decision structures**.

---

## 🔍 How If-Else Logic Works

1. A condition is evaluated  
2. If the condition is true, the `if` block executes  
3. If the condition is false, the `else if` or `else` block executes  
4. The program follows **only one decision path**; other blocks are skipped  

This structure is especially useful for validating user input and building decision-making mechanisms.

---

## 💡 Sample Outputs

### Age Check
Input: `18`  
Output: You are an adult.

Input: `14`  
Output: You are underage.

### Password Strength
Input: `Hello123`  
Output: Strong

Input: `Ab1!xY?`  
Output: Very Strong

Input: `abc 123`  
Output: Password cannot contain spaces!

### Mars Climate Decision System
Input: `-85`  
Output: Extremely Cold — Risk Level: High

Input: `8`  
Output: Mild — Suitable for short missions

Input: `120`  
Output: Sensor data is outside the valid range

---

## 📄 Folder Structure

if-else/
├── AgeCheck/
│   ├── Main.java
│   └── README.md
├── PasswordStrengthChecker/
│   ├── Main.java
│   └── README.md
└── MarsClimateDecisionSystem/
    ├── Main.java
    └── README.md

---

## 🧠 Java Concepts Covered in This Folder

- Taking user input (`Scanner`)
- Conditional statements (`if`, `else if`, `else`)
- Numeric range validation
- Character analysis and validation
- Input validation
- Decision mechanisms producing multiple outputs
- Building decision trees using nested if statements

---

## 🚀 Future Additions

This folder may be expanded in the future with additional if-else based projects such as:

- Pass/fail determination based on grade average  
- Clothing recommendations based on weather conditions  
- Checking whether a number is positive / negative / zero  
- Discount calculation based on purchase amount  
- Basic user authorization scenarios
