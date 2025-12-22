# 🔢 StringCharacterCounter — Character Frequency Counter in Java

This project is a Java console application that counts how many times a specific **character** appears in a given **string**.  
The logic is implemented using a **separate method**, reinforcing modular programming and character-level string analysis.

---

## 🎯 Project Purpose

- Practice string traversal using loops  
- Count character frequency without using built-in methods  
- Strengthen understanding of method definitions and return values  
- Combine user input, loops, and conditional logic  
- Reinforce character comparison using `charAt()`  

---

## 🧠 What the Program Does

- Takes a string input from the user  
- Takes a single character to search for  
- Calls a separate method to:
  - Traverse the string character by character
  - Compare each character with the target character
  - Count how many times the character appears
- Prints the total count to the console  

---

## 🧠 Algorithm Logic

1. The user enters a string.
2. The user enters a target character.
3. The `countCharacter` method is called with:
   - the input string
   - the target character
4. Inside the method:
   - A `while` loop iterates over the string
   - Each character is compared using `charAt(index)`
   - A counter is incremented when a match is found
5. The final count is returned and displayed.

---

## 💡 Example Execution

Input String:
programming

Target Character:
g

Output:
Character count: 2

---

## 📌 Java Concepts Practiced

- Method definition and invocation  
- Returning values from methods (`return int`)  
- String length control (`length()`)  
- Character access with `charAt()`  
- While loop usage  
- User input handling with `Scanner`  

---

## 📄 File Structure

methods/
└── StringCharacterCounter/
    ├── Main.java
    └── README.md

---

## 📝 Summary

This project provides a clean and beginner-friendly example of how to analyze strings at the character level while applying method-based design in Java. It is especially useful for understanding how loops and methods work together to solve practical problems.
