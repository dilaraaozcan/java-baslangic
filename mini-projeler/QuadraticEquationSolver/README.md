# 📐 Quadratic Equation Solver — Java Console Application

This project is a **console-based Java application** that calculates the roots of quadratic equations.  
Based on the coefficients provided by the user (`a`, `b`, `c`), the program analyzes the equation type and applies the appropriate solution method.

Linear equations, real roots, and complex roots are all handled explicitly.

---

## 🔍 Solved Equation

ax² + bx + c = 0

---

## ⚙️ Program Features

- Automatically treats the equation as **linear** when `a = 0`
- Distinguishes between:
  - No solution
  - One solution
  - Infinite solutions
- Calculates the discriminant (Δ)
- Handles all discriminant cases:
  - Δ > 0 → Two real roots
  - Δ = 0 → One repeated real root
  - Δ < 0 → Complex roots (real + imaginary parts)
- Displays results in a clear and readable format

---

## 🧠 Java Concepts Practiced

- Conditional logic (`if–else`)
- Mathematical formulas
- Discriminant (Delta) analysis
- Complex number calculations
- User input handling with `Scanner`
- Decimal number formatting

---

## 🛠️ Technologies Used

- Java
- `java.util.Scanner`
- `Math.sqrt()`

---

## ▶️ Program Flow

1. The user enters coefficients `a`, `b`, and `c`
2. The program determines the equation type
3. The discriminant (Δ) is calculated
4. Roots are computed based on the equation case
5. Results are printed to the console

---

## 📌 Sample Output

Enter coefficients of the quadratic equation:  
1  -3  2  

Delta: 1  
Two real roots found:  
x1: 2.00  
x2: 1.00  

---

## 🎯 Project Purpose

This project was developed to demonstrate how fundamental mathematical problems can be solved using Java while improving algorithmic thinking and decision-making skills.

---

📌 More advanced mathematical and algorithmic projects are planned to be added as part of the learning process.
