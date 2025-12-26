# 🚗 SpeedCalculator — Average Speed Analysis (Java)

This project is a Java console application that calculates **average speed** based on distance and time, converts the result from **km/h to m/s**, and provides a **speed category interpretation**.  
The application is designed with a **method-based structure**, separating calculation, conversion, and classification logic into reusable functions.

---

## 🎯 Project Purpose

- Practice defining and calling multiple methods in Java  
- Perform unit conversion (km/h → m/s)  
- Implement input validation for numerical values  
- Categorize results using conditional logic  
- Build a clean, modular, and readable console application  

---

## 🧠 What the Program Does

- Takes distance (km) and time (hours) from the user  
- Calculates average speed using a dedicated method  
- Converts speed from kilometers per hour to meters per second  
- Determines a speed category based on the calculated value  
- Prints all results clearly to the console  

---

## 🧠 Method Breakdown

- **calculateSpeed(double distance, double time)**  
  - Validates time input (must be greater than 0)  
  - Calculates and returns average speed (km/h)

- **convertKmHToMs(double speed)**  
  - Converts speed from km/h to m/s  
  - Returns the converted value

- **speedCategory(double speed)**  
  - Classifies speed into categories:
    - Walking speed
    - Running / Cycling speed
    - Vehicle speed
    - High speed
  - Returns a descriptive string

---

## 💡 Example Execution

Input:
Distance (km): 10  
Time (hours): 0.5  

Output:
Average speed: 20.0 km/h  
Average speed: 5.55 m/s  
Speed category: Vehicle speed  

---

## 📌 Java Concepts Practiced

- Method definition and reuse  
- Returning values from methods  
- Input validation and program termination  
- Unit conversion formulas  
- Conditional logic (`if–else`)  
- User input handling with `Scanner`  

---

## 📄 File Structure

methods/
└── SpeedCalculator/
    ├── Main.java
    └── README.md

---

## 📝 Summary

This project demonstrates how multiple small, focused methods can work together to solve a real-world problem. It reinforces modular design, clean separation of concerns, and practical numerical computations in Java.
