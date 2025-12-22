# 🎯 GuessNumber Game — Number Guessing Console Game (Java)

This mini project is a simple **Java console game** where the computer randomly selects a number between 0 and 100 and the user tries to guess it.  
After each guess, the player receives hints such as **UP**, **DOWN**, or **Very close!**.  
The game also includes **input validation**: if the player enters an out-of-range value twice, the game automatically ends.

---

## 🔍 Game Rules

- The computer randomly selects a number between 0 and 100.
- The player attempts to guess the number.
- After each guess:
  - If the guess is lower than the target → **UP**
  - If the guess is higher than the target → **DOWN**
  - If the absolute difference is 5 or less → **Very close!**
- Input validation rules:
  - **First** out-of-range input (outside 0–100) → warning message
  - **Second** out-of-range input → game is terminated

---

## 🧠 Java Concepts Practiced

- Random number generation using `Math.random()`
- User input handling with `Scanner`
- Continuous input processing using a `while` loop
- Conditional logic (`if`, `else if`, `else`)
- Basic input validation (range checking)
- Game termination based on state and conditions

---

## 📤 Sample Game Flow

Your guess: 150  
Invalid input! Please enter a number between 0 and 100.

Your guess: 200  
Second invalid input detected. Game terminated.

---

Your guess: 45  
UP

Your guess: 60  
DOWN

Your guess: 58  
Very close!  
DOWN

Your guess: 57  
Congratulations! Correct guess!  
Total number of attempts: 4

---

## 📄 File Structure

mini-projects/
└── GuessNumberGame/
    ├── Main.java
    └── README.md

---

## 📝 Summary

This project is an ideal example for practicing interactive console applications in Java using loops and conditional structures. It reinforces game logic, user guidance, and input validation in a clear and engaging way.
