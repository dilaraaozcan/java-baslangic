# 🌌 CelestialPhysicsCalculator — Planetary Physics Calculator (Java)

This project is a **Java console application** that performs basic **astrophysics calculations** for different celestial bodies.  
Based on the selected planet or moon, the program calculates **gravitational acceleration**, **escape velocity**, or **orbital velocity** using classical physics formulas.

The application demonstrates how scientific constants, mathematical formulas, and method-based design can be combined in a clean and modular way.

---

## 🎯 Project Purpose

- Apply real-world physics formulas in Java  
- Practice method-based program design  
- Work with scientific notation and constants  
- Use menu-driven logic with `switch–case`  
- Reinforce mathematical and algorithmic thinking  

---

## 🧠 What the Program Does

- Displays a menu of celestial bodies:
  - Earth
  - Mars
  - Jupiter
  - Moon
- Allows the user to choose a calculation type:
  1. Gravitational acceleration  
  2. Escape velocity  
  3. Orbital velocity  
- Assigns mass and radius values based on the selected body  
- Performs calculations using dedicated methods  
- Displays results in **m/s** and **km/h** where applicable  

---

## 🧠 Physics Calculations Used

### ▶️ Gravitational Acceleration
g = (G × M) / r²

### ▶️ Escape Velocity
vₑ = √(2GM / r)

### ▶️ Orbital Velocity
vₒ = √(GM / r)

Where:
- G = 6.674 × 10⁻¹¹ (gravitational constant)
- M = mass of the celestial body
- r = radius of the celestial body

---

## 💡 Example Execution

--- MENU ---
1. Earth  
2. Mars  
3. Jupiter  
4. Moon  
Selection: 1  

What would you like to calculate?
1- Gravitational acceleration  
2- Escape velocity  
3- Orbital velocity  
Selection: 2  

Escape velocity: 11186.00 m/s (40269.60 km/h)

---

## 📌 Java Concepts Practiced

- Static constants (`static final`)
- Scientific notation (`Math.pow`)
- Mathematical formulas
- Method definition and reuse
- `switch–case` decision structures
- Console-based menus
- Formatted output (`printf`)
- User input handling with `Scanner`

---

## 📄 Folder Structure

methods/
└── CelestialPhysicsCalculator/
    ├── Main.java
    └── README.md

---

## 📝 Summary

This project provides a strong example of how Java can be used to model real scientific problems.  
It combines physics knowledge with clean software design principles, making it ideal for both educational and portfolio purposes.
