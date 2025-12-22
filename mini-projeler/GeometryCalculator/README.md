# 📐 Geometry Calculator — Java Console Application

This project is a simple **Java console application** that calculates the **area and perimeter** of a selected geometric shape (triangle or circle).  
It is designed to practice and reinforce fundamental Java concepts such as `Scanner`, `switch–case`, conditional logic, and mathematical computations.

---

## ✨ Features

- Displays a menu for shape selection:
  1. Triangle
  2. Circle

- Requests required inputs based on the selected shape:
  - Triangle → three side lengths
  - Circle → radius

- Performs validity checks:
  - Triangle inequality rule (a + b > c, etc.)
  - Circle radius must be greater than 0

- Calculations:
  - Triangle perimeter = a + b + c
  - Triangle area (Heron's formula):
    s = (a + b + c) / 2  
    Area = √(s × (s − a) × (s − b) × (s − c))

  - Circle perimeter = 2πr
  - Circle area = πr²

- Displays warning messages for invalid inputs or selections

---

## 🧠 Java Concepts Practiced

- User input handling with `Scanner`
- Menu control using `switch–case`
- Input validation with `if–else`
- Mathematical calculations
- Square root calculation using `Math.sqrt()`
- Working with `double` and `int` data types
- Console output formatting

---

## 🖥 Sample Output

=== MENU ===  
1. Triangle  
2. Circle  
Select an option: 1  

Enter the sides of the triangle:  
3  
4  
5  

Perimeter: 12.0  
Area: 6.0  

---

## 📂 Project Structure

src/
└── Main.java  
README.md

---

## 🚀 How to Run

1. Download or clone the project
2. Open it using IntelliJ IDEA or any Java-compatible IDE
3. Run the `Main.java` file
4. Follow the instructions displayed in the console

---

## 👩‍💻 Developer Note

This project was developed to strengthen beginner-level Java skills and to practice basic project documentation and version control on GitHub.
