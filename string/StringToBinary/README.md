# 🔢 StringToBinary — Manual Decimal to Binary Converter (Java)

This project is a Java console application that converts a **decimal number entered as a string** into its **binary representation**, without using built-in conversion methods.  
The application manually parses the string into an integer and then converts that integer into binary using algorithmic logic.

---

## 🎯 Project Purpose

- Practice manual string-to-integer conversion  
- Reinforce character-level input validation  
- Implement decimal-to-binary conversion logic  
- Handle signed numbers (+ / -) explicitly  
- Strengthen algorithmic thinking without built-in utilities  

---

## 🧠 What the Program Does

- Takes a numeric input **as a string**
- Validates the input:
  - Rejects empty input
  - Rejects standalone `+` or `-`
  - Rejects non-digit characters
- Manually converts the string to an integer using ASCII logic
- Preserves the sign of the number
- Converts the absolute integer value to binary using division by 2
- Re-applies the sign (if negative)
- Prints the binary representation to the console

---

## 🧠 Algorithm Breakdown

### 1️⃣ Input Validation
- Trims whitespace
- Checks for invalid inputs (`""`, `"+"`, `"-"`)
- Ensures all characters are digits (after sign handling)

### 2️⃣ String → Integer Conversion
- Iterates over each character
- Converts using ASCII subtraction:
  digit = ch - '0'
- Builds the integer step by step

### 3️⃣ Integer → Binary Conversion
- Handles zero as a special case
- Uses a `while` loop with:
  - Modulo (`% 2`) to get remainders
  - Division (`/ 2`) to reduce the number
- Constructs the binary string manually

### 4️⃣ Sign Handling
- Negative numbers are converted using absolute value
- The `-` sign is re-attached to the binary result

---

## 💡 Example Execution

Input:
-45

Output:
Binary equivalent: -101101

---

## 📌 Java Concepts Practiced

- Manual string parsing  
- ASCII-based character to digit conversion  
- Input validation and error handling  
- Loop-based numerical algorithms  
- Conditional logic  
- String manipulation  
- Working with signed numbers  

---

## 📄 File Structure

string/
└── StringToBinary/
    ├── Main.java
    └── README.md

---

## 📝 Summary

This project demonstrates how low-level numeric conversions work under the hood by avoiding built-in helper methods.  
It provides a strong foundation for understanding data representation, input validation, and algorithmic problem-solving in Java.
