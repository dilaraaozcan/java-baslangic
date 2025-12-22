# 📐 GeometryApp — Geometric Shape Area Calculator

This project is a modular Java console application that calculates the areas of different geometric shapes based on user input.  
The main goal is to manage each calculation inside a separate **method**, resulting in a clean, readable, and maintainable code structure.

---

## 🎯 What the Program Does

- **Rectangle Area:** Calculates the area using width and height values.
- **Triangle Area:** Computes the area based on base and height.
- **Circle Area:** Calculates the area using the radius with `Math.PI` precision.
- **Dynamic Input:** All values are taken from the user via the `Scanner` class.
- **Modular Design:** Each shape calculation is handled by an independent method that returns a value.

---

## 🧠 Example Usage

Input:
- Rectangle: 5, 10
- Triangle: 4, 6
- Circle: 3

Output:
Rectangle Area: 50.0  
Triangle Area: 12.0  
Circle Area: 28.274333882308138  

---

## 📌 Concepts Learned

- **Method Definition:** Designing methods that take parameters and return values using `return`.
- **Scanner Class:** Managing user interaction and `double` data types.
- **Code Reusability:** Separating calculation logic from the main flow to improve reusability.
- **Math Library:** Accessing constant values using `Math.PI`.

---

## 📄 File Structure

methods/
└── GeometryApp/
    ├── Main.java
    └── README.md

---

## ▶️ How to Run

Compile and run the `Main.java` file using any Java IDE (IntelliJ IDEA, Eclipse, VS Code).  
When the program starts, you will be prompted to enter the required dimensions for each shape.

---

This project is an educational example that reinforces method structures and mathematical computations using user input in Java.
