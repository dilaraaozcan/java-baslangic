# 🔢 CollatzAnalyzer — 3n+1 Mathematical Sequence Analysis

This project is an analysis tool based on one of the most intriguing problems in mathematics: the **Collatz Conjecture (3n+1 Problem)**.  
A positive integer provided by the user is processed according to the Collatz rules until it reaches 1, and the sequence is analyzed throughout the process.

---

## 🎯 Program Features

- Generates the Collatz sequence step by step  
- Calculates how many steps are required to reach 1  
- Determines the **maximum value** reached during the sequence  
- Produces a complete analysis report from start to finish  

---

## 🧠 Collatz Rule

For a given positive integer:

- **If the number is even:** n = n / 2  
- **If the number is odd:** n = 3n + 1  

It is conjectured that these operations will eventually lead every positive integer to 1, although this has not yet been mathematically proven.

---

## 📌 Example Usage

Input:
12

Output:
Collatz Sequence:  
12 → 6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1  

Analysis:
Starting Number: 12  
Total Step Count: 9  
Maximum Value Reached: 16  
Collatz Verification: Successfully reached 1  

---

## 📄 File Structure

mini-projects/
└── CollatzAnalyzer/
    ├── Main.java
    └── README.md

---

## ▶️ How to Run

Compile and run the `Main.java` file using IntelliJ IDEA or any Java-compatible IDE.

---

This project is an ideal example for strengthening both mathematical reasoning and programming logic by combining loops with numerical algorithms.
