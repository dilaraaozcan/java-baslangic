# 🏙️ SmartCityAssistant — Java Console Application

This project is a **Java console application** that provides multiple city-related services through an interactive menu, including **taxi fare calculation**, **electricity bill calculation**, and **health analysis (BMI & ideal weight)**.  
It was developed to reinforce fundamental Java concepts such as `Scanner`, `if–else`, `switch–case`, conditional logic, and mathematical computations.

---

## ✨ Features

- Collects user authentication data:
  - Username
  - PIN creation and verification

- Provides a service selection menu:
  1. Taxi Fare Calculation  
  2. Electricity Bill Calculation  
  3. Health Analysis (BMI & Ideal Weight)

- Requests required inputs based on the selected service:
  - **Taxi:** distance, time (day/night), weekend status  
  - **Electricity:** consumption amount (kWh)  
  - **Health:** gender, height, weight  

- Performs calculations:
  - Taxi fare → base fare + distance × tariff  
  - Electricity bill → tiered pricing + tax  
  - BMI → weight / (height²)  
  - Ideal weight → calculated based on gender  

- Displays warning messages for invalid inputs

---

## 🧠 Java Concepts Practiced

- User input handling with `Scanner`  
- Conditional logic using `if–else`  
- Menu management with `switch–case`  
- Mathematical computations  
- Working with `double` and `int` data types  
- Console output formatting  

---

## 🖥 Sample Output

Username: Gece 
Create PIN: 1234  
Enter PIN: 1234  

1-Taxi  2-Electricity  3-Health  
Choice: 1  

Distance (km): 10  
Time (day/night): day  
Weekend (yes/no): no  

Taxi Fare: $18.00  

=== SUMMARY ===  
Total Amount: $18.00  

---

## 📂 Project Structure

src/
└── SmartCityAssistant.java  
README.md  

---

## 🚀 How to Run

1. Download or clone the project  
2. Open it using IntelliJ IDEA (or any Java-compatible IDE)  
3. Run the `SmartCityAssistant.java` file  
4. Follow the instructions displayed in the console  

---

## 👩‍💻 Developer Note

This mini project was created to practice core Java control structures and to maintain a clean and organized workflow while sharing small-scale projects on GitHub.
