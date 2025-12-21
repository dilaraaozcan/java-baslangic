# 🔁 Prime Number Checker — Loop-Based Primality Test

This folder contains a simple algorithm example that checks whether a number is prime using a **for loop** in Java.  
The goal is to reinforce loop structures and conditional checks through a practical scenario.

---

## 🔍 How the Logic Works

The program follows a straightforward approach:

1. An integer is taken from the user.
2. If the number is **less than 2**, it is immediately considered non-prime.
3. A `for` loop iterates from 2 up to one less than the number.
4. If the number is **evenly divisible** by any value in the loop, it is declared non-prime and the program terminates early.
5. If no divisors are found, the number is **prime**.

This method represents one of the clearest implementations of a basic *primality test* algorithm.

---

## 🧠 Concepts Practiced in This Example

- Practical use of the `for` loop  
- Divisibility testing with the modulo operator (`%`)  
- Early exit (early return) strategy  
- Conditional statements (`if`)  
- Taking user input (`Scanner`)  

This example is especially useful for understanding algorithm flow control.

---

## 💡 Sample Inputs

Input → `13`  
Output → `13 is a prime number!`

Input → `15`  
Output → `15 is not a prime number!`

---

## 📄 Folder Structure

loops/
│
├── PrimeNumberCheck/
│   ├── Main.java
│   └── README.md
│
└── other loop-based applications…

---

## 🚀 Possible Enhancements

- A version that lists all prime numbers within a given range  
- A menu-driven system that runs until the user chooses to exit  
- An optimized algorithm that checks divisors only up to `√n`  

These improvements help elevate loop usage and algorithmic practice to the next level.
