# 🔁 FibonacciCalculator — Recursive Fibonacci Sequence (Java)

This project is a **Java console application** that calculates the **n-th Fibonacci number** using a **recursive method**.  
It demonstrates how recursion works in Java and how a mathematical sequence can be implemented through self-calling functions.

---

## 🎯 Project Purpose

- Understand the concept of **recursion**  
- Implement the Fibonacci sequence using recursive methods  
- Practice method definition and return values  
- Validate user input before computation  
- Reinforce mathematical thinking with algorithmic logic  

---

## 🧠 What the Program Does

- Takes an integer value `n` from the user  
- Validates that `n` is not negative  
- Calls a recursive method to compute the Fibonacci value  
- Prints the `n`-th Fibonacci number to the console  

---

## 🧠 Fibonacci Logic

The Fibonacci sequence is defined as:

F(0) = 0  
F(1) = 1  
F(n) = F(n − 1) + F(n − 2)  

The program directly implements this definition using recursion.

---

## 🧠 Algorithm Flow

1. The user enters a value for `n`.
2. If `n` is negative, the program displays an error message.
3. The `fibonacci(n)` method is called.
4. Base cases:
   - If `n == 0`, return 0
   - If `n == 1`, return 1
5. Recursive case:
   - Return `fibonacci(n - 1) + fibonacci(n - 2)`
6. The final result is printed.

---

## 💡 Example Execution

Input:
5

Output:
5th Fibonacci number: 5

---

## 📌 Java Concepts Practiced

- Recursive method definition  
- Base case vs recursive case  
- Method calls and return values  
- Input validation  
- User input handling with `Scanner`  

---

## 📄 Folder Structure

methods/
└── FibonacciCalculator/
    ├── Main.java
    └── README.md

---

## 📝 Summary

This project provides a clear and beginner-friendly example of recursion in Java.  
It closely follows the mathematical definition of the Fibonacci sequence and helps build a strong conceptual foundation for recursive problem solving.
