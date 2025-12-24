# 🔁 CharacterReplacer — String Character Replacement (Java)

This project is a Java console application that replaces all occurrences of a specific character in a given string with another character.  
The replacement logic is implemented inside a **separate method**, reinforcing modular design and method-based programming.

---

## 🎯 Project Purpose

- Practice defining and using methods in Java  
- Perform character-level string processing  
- Replace characters **without using built-in replace methods**  
- Strengthen loop logic and conditional checks  
- Separate business logic from user interaction  

---

## 🧠 What the Program Does

- Takes a text input from the user  
- Takes a target character to be replaced  
- Takes a new character as the replacement  
- Calls a dedicated method to:
  - Traverse the string character by character
  - Replace matching characters
  - Build and return a new modified string
- Prints the modified version to the console  

---

## 🧠 Algorithm Logic

1. The user enters a text.
2. The user enters a target character.
3. The user enters a replacement character.
4. The `replaceCharacter` method is called with:
   - the original text
   - the target character
   - the replacement character
5. Inside the method:
   - A `for` loop iterates through the string
   - Each character is checked using `charAt(i)`
   - Matching characters are replaced
   - Non-matching characters are kept as-is
6. The final modified string is returned and displayed.

---

## 💡 Example Execution

Input Text:
banana

Target Character:
a

Replacement Character:
o

Output:
Modified Version: bonono

---

## 📌 Java Concepts Practiced

- Method definition with parameters  
- Returning values from methods (`String return type`)  
- String traversal using loops  
- Character comparison with `charAt()`  
- User input handling with `Scanner`  
- Manual string manipulation  

---

## 📄 File Structure

methods/
└── CharacterReplacer/
    ├── Main.java
    └── README.md

---

## 📝 Summary

This project provides a clean and beginner-friendly example of how to manipulate strings at the character level using methods in Java. It is especially useful for understanding how loops and conditional logic work together inside reusable methods.

