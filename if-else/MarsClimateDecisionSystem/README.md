# 🚀 Mars Climate Decision System — Mission Safety Analysis Application

This project is an if-else based Java console application that analyzes environmental conditions and generates appropriate mission safety decisions based on the surface temperature of Mars. The entered temperature value is first validated, then classified into predefined climate ranges. For each climate condition, the system provides a risk level, recommended maximum mission duration, and additional warnings when necessary.

---

## 🎯 Project Objectives

- Apply numeric range validation in a realistic scenario
- Use if / else-if decision chains correctly and safely
- Learn and reinforce input validation logic
- Generate multiple meaningful outputs from a single condition
- Practice building decision trees using nested if statements

---

## 🧠 Evaluation Criteria

- Is the entered temperature within a **valid range** for Mars?
- Which **climate category** does the temperature fall into?
- What is the **risk level** for this climate condition?
- What should be the recommended **maximum mission duration**?
- Are **additional warnings** required in extreme or critical cases?

---

## 🌡️ Climate Classification Logic

The climate classification is based on the following temperature ranges:

- **Below -60°C** → Extremely Cold  
- **Between -60°C and -20°C** → Cold  
- **Between -20°C and 10°C** → Mild  
- **10°C and above** → Hot  

Each category applies a different safety protocol.

---

## ⚠️ Risk and Mission Duration Assessment

For each climate condition, the system generates:
- Risk level (High, Medium, Low, Minimal)
- Recommended maximum mission duration
- Additional warning messages at critical thresholds

---

## 📤 Sample Outputs

Input: `-85`  
Climate Condition: EXTREMELY COLD — protective gear required  
Risk Level: HIGH  
Max Mission Time: 10 minutes  

Input: `-45`  
Climate Condition: COLD — exposure should be limited  
Risk Level: MEDIUM  
Max Mission Time: 30 minutes  

Input: `8`  
Climate Condition: MILD — suitable for short missions  
Risk Level: LOW  
Max Mission Time: 2 hours  

Input: `120`  
→ ERROR: Sensor data is outside the valid range for Mars.

---

## 📄 Project Structure

java-basics/
└── MarsClimateDecisionSystem/
    ├── Main.java
    └── README.md

---

This project demonstrates how conditional statements (if / else-if) in Java can be used effectively not only in theory but also within a realistic scenario. It is an ideal example for beginner-level developers to strengthen decision-making and control-flow skills.
