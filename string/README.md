# 📁 String — Text and Numeric Character Processing

This folder contains example projects designed to understand the `String` data type in Java, perform operations on character sequences, and develop **manual conversion algorithms without relying on built-in methods**.  
Both basic string manipulation tasks and character-based mathematical analysis projects are collected in this folder.

---

## 🎯 Purpose of This Folder

- Understand the `String` data type in Java  
- Learn character access, length calculation, and case transformations  
- Practice basic algorithms such as reversing text using loops  
- Learn string-to-integer conversion logic without built-in methods  
- Experiment with mathematical analysis performed on string data (DigitAnalyzer)  

---

## 📌 Contents

---

### ▶️ **StringIslemi**
Performs basic transformations on text provided by the user:

- Converting to uppercase  
- Converting to lowercase  
- Retrieving the first character  
- Retrieving the last character  
- **Manually reversing** the text  

This project helps build a solid understanding of fundamental string operations.

---

### ▶️ **StringToIntegerConverter**
This project converts a user-provided string into an integer **without using built-in parsing methods**.

Features:
- Support for negative numbers  
- Validation of non-digit characters  
- ASCII-based conversion: `digit = c - '0'`  
- User warnings for invalid input  

Examples:  
Input: `" -45 "` → Output: `-45`  
Input: `"12a3"` → Output: `"Invalid character!"`

---

### ▶️ **DigitAnalyzer**
This project analyzes a user-provided number **as a string** and extracts various mathematical properties.

Operations performed:
- Sum of digits  
- Largest digit  
- Count of even / odd digits  
- Zero detection  
- Reversing the number  
- Palindrome check  

This project represents a more advanced example that combines string analysis with mathematical algorithms.

---

## 🧠 Concepts Covered

### 🔹 Basic String Transformations
text.toUpperCase();  
text.toLowerCase();

### 🔹 Character Access
char first = text.charAt(0);  
char last = text.charAt(text.length() - 1);

### 🔹 Reversing a String
String reversed = "";  
for (int i = text.length() - 1; i >= 0; i--) {  
  reversed += text.charAt(i);  
}

### 🔹 Manual String → Integer Conversion
int digit = c - '0';  
result = result * 10 + digit;

### 🔹 Numeric Character Analysis (DigitAnalyzer)
- Digit sum  
- Maximum digit  
- Even / odd digit counting  
- Palindrome logic  
- ASCII-based character processing  

---

## 📄 Folder Structure

string/
├── StringIslemi/
├── StringToIntegerConverter/
└── DigitAnalyzer/

---

## ▶️ How to Run

All `.java` files in this folder can be executed using IntelliJ IDEA or any Java-compatible IDE.

---

📌 This folder provides a comprehensive learning space that combines string manipulation with algorithm development in Java.
