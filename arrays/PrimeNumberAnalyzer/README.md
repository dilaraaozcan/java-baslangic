# 🔢 Prime Number Analyzer — Array-Based Prime Classification (Java)

This project is a **Java console application** that analyzes a list of integers entered by the user, classifies them as **prime** or **non-prime**, and calculates the **sum of each group**.  
It demonstrates how arrays, loops, and conditional logic can be combined to perform basic numerical analysis.

---

## 🎯 Project Purpose

- Practice working with arrays in Java  
- Implement prime number checking logic  
- Classify numbers based on mathematical properties  
- Calculate cumulative totals for different categories  
- Reinforce loop and conditional structures  

---

## 🧠 What the Program Does

- Asks the user to enter the length of an array  
- Collects integer values into an array  
- Iterates through the array and:
  - Determines whether each number is prime
  - Separates prime and non-prime numbers
- Calculates:
  - Sum of prime numbers
  - Sum of non-prime numbers
- Displays a summary table with results  

---

## 🧠 Prime Number Logic

A number is considered **prime** if:
- It is greater than or equal to 2
- It has no divisors other than 1 and itself

The program checks divisibility by testing all integers from 2 up to (but not including) the number itself.

---

## 💡 Example Execution

PRIME NUMBER ANALYZER  
----------------------------  
Array length: 5  

Enter elements:
2  
4  
5  
6  
7  

--------- SUMMARY TABLE ---------  
Prime Numbers: 2 5 7  
Sum of Prime Numbers: 14  

Non-Prime Numbers: 4 6  
Sum of Non-Prime Numbers: 10  

---

## 📌 Java Concepts Practiced

- Array creation and traversal  
- Enhanced `for-each` loop  
- Nested loops  
- Prime number detection algorithm  
- Conditional logic (`if–else`)  
- Accumulator variables  
- String concatenation for output formatting  
- User input handling with `Scanner`  

---

## 📄 Folder Structure

arrays/
└── PrimeNumberAnalyzer/
    ├── Main.java
    └── README.md

---

## 📝 Summary

This project provides a clear example of how to analyze numerical data stored in arrays and apply mathematical rules to classify values.  
It is especially useful for understanding array traversal, nested loops, and basic algorithm design in Java.
