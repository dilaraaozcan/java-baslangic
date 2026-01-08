# 📊 ArrayStatisticsAnalyzer — Array Analysis Report (Java)

This project is a **Java console application** that analyzes a set of integers entered by the user and produces a detailed **array statistics report**.  
It calculates the maximum value, minimum value, sum, average, and detects **duplicate elements** within the array.

The application demonstrates how arrays, loops, and conditional logic can be combined to perform meaningful data analysis.

---

## 🎯 Project Purpose

- Practice dynamic array creation based on user input  
- Analyze numerical data stored in arrays  
- Find statistical properties such as min, max, sum, and average  
- Detect repeated values without using collections  
- Reinforce nested loop logic and conditional checks  

---

## 🧠 What the Program Does

- Asks the user how many numbers will be entered  
- Stores the numbers in an integer array  
- Iterates through the array to determine:
  - Largest number
  - Smallest number
  - Total sum
- Calculates the average value  
- Detects duplicate numbers using nested loops  
- Displays a formatted analysis report  

---

## 🧠 Analysis Logic

### ▶️ Basic Statistics
- Initializes max and min values using the first array element
- Updates values during array traversal
- Calculates the average using:
  total / number of elements

### ▶️ Duplicate Detection
- Uses nested loops to compare elements
- Ensures each duplicate is listed only once
- Displays “None” if no duplicates are found

---

## 💡 Example Execution

How many numbers will you enter? 6  
Enter numbers:  
5 3 7 3 9 5  

--- ARRAY ANALYSIS REPORT ---
Maximum Value      : 9  
Minimum Value      : 3  
Sum of Numbers     : 32  
Average            : 5.33  
Duplicates         : 5 3  
-----------------------------

---

## 📌 Java Concepts Practiced

- Dynamic array allocation  
- Enhanced `for-each` loop  
- Nested loops  
- Conditional logic (`if`)  
- Accumulator variables  
- Duplicate detection algorithms  
- Basic statistical calculations  
- User input handling with `Scanner`  

---

## 📄 Folder Structure

arrays/
└── ArrayStatisticsAnalyzer/
    ├── Main.java
    └── README.md

---

## 📝 Summary

This project provides a comprehensive example of how numerical arrays can be analyzed without using advanced data structures.  
It is ideal for strengthening core algorithm skills and understanding how raw data can be processed using basic Java constructs.
