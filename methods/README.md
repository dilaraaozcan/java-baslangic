# 📘 Methods — Java Method Applications

This folder contains Java console applications designed to teach **methods**, which enable code reusability, modular design, and cleaner program structure.  
Each subfolder focuses on a specific problem and demonstrates how methods can be used to separate logic from the `main` method.

The goal of this section is to build a strong foundation in method definition, parameter passing, and return values through practical examples.

---

## 🎯 Purpose of This Folder

- Understand how methods improve code readability and reusability  
- Learn how to define and call methods outside the `main` block  
- Practice passing parameters and returning values  
- Separate business logic from program flow  
- Apply methods to real problem scenarios  

---

## 📂 Subprojects

### ▶️ GeometryApp
A geometric area calculator that computes the areas of different shapes using **separate methods**.

Features:
- Rectangle area calculation  
- Triangle area calculation  
- Circle area calculation using `Math.PI`  
- Each calculation is handled by an independent method that returns a value  

Key concepts:
- Method definition with parameters  
- Return values (`double`)  
- Code modularity  
- Reusable calculation logic  

---

### ▶️ StringCharacterCounter
A character frequency analysis application that counts how many times a specific character appears in a given string.

Features:
- Takes a string and a target character from the user  
- Uses a dedicated method to traverse the string  
- Counts character occurrences using a loop  
- Returns the result to the `main` method  

Key concepts:
- Methods returning `int` values  
- String traversal with loops  
- Character comparison using `charAt()`  
- Clean separation between input, logic, and output  

---

## 📄 Folder Structure

methods/
├── GeometryApp/
│   ├── Main.java
│   └── README.md
├── StringCharacterCounter/
│   ├── Main.java
│   └── README.md
└── README.md

---

## 🚀 Future Additions

This folder may be expanded with more method-focused examples such as:

- Method Overloading (same method name, different parameters)  
- Recursive Methods  
- Void vs non-void return types  
- Static vs non-static methods  
- Utility-style helper methods  

---

This folder represents a structured learning path for mastering method-based programming in Java.
