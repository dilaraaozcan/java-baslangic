# 🔢 StringToIntegerConverter — Manual String to Integer Conversion

This mini project implements a manual algorithm in Java that converts a numeric string into a real `int` value **without using any built-in methods** such as `Integer.parseInt()` or `valueOf()`.  
The goal is to understand low-level operations such as character processing, ASCII-based conversion, and negative number handling.

---

## 🎯 Project Objective

- Convert digits inside a string into an integer value step by step  
- Implement custom `parseInt` logic without built-in conversion functions  
- Manually handle the negative sign (`-`)  
- Detect and handle non-numeric characters  
- Understand the logic behind character (`char`) to integer (`int`) conversion  

---

## 🧠 How the Algorithm Works

1. A string input is taken from the user.  
2. If the first character is `'-'`, the number is marked as negative and iteration starts from index 1.  
3. Each character is validated inside a loop:  
   - If the character is not between `'0'` and `'9'`, an error message is displayed and execution stops.  
4. Each digit is processed using the ASCII-based formula:  
   result = result * 10 + (c - '0')  
5. After the loop ends, if the number is marked as negative:  
   result = -result  
6. The final integer value is printed to the console.

---

## 📤 Example Usage

Input: `"1234"`  
Output: `1234`  

Input: `"-45"`  
Output: `-45`  

Input: `"12a3"`  
Output: `Invalid character: digits only are allowed!`  

Input: `"-"`  
Output: `Invalid number`

---

## 🧩 Java Concepts Learned

- ASCII-based character to integer conversion  
- String manipulation  
- Character processing with loops  
- Error handling and input validation  
- Manual handling of negative numbers  
- Basic algorithm design  

---

## 📄 File Structure

string/
└── StringToIntegerConverter/
    ├── Main.java
    └── README.md

---

This project helps build a solid understanding of primitive data type conversions and represents a clean implementation of the classic technical interview question:  
**“Can you implement `parseInt` yourself?”**
