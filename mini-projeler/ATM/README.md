# 🏧 ATM Application — Basic Console-Based Banking System (Java)

This project is a simple **Java console application** that simulates basic ATM operations using conditional statements.  
The program allows the user to deposit money, withdraw money, or check the current balance through a menu-driven interface.

The application is designed to reinforce fundamental Java concepts such as user input handling, if–else decision structures, and variable updates.

---

## 🎯 Project Purpose

- Practice conditional logic using `if–else` statements  
- Handle user input via the `Scanner` class  
- Simulate a real-world banking scenario in a simple form  
- Understand how variables change based on user actions  
- Build a menu-driven console application  

---

## 🧠 What the Program Does

- Initializes a starting balance of **1000**
- Displays an ATM menu with the following options:
  1. Deposit money  
  2. Withdraw money  
  3. Check balance  
- Processes the user’s selection using `if–else` statements
- Updates and displays the balance accordingly
- Prevents withdrawals when the balance is insufficient
- Displays error messages for invalid menu selections

---

## 🧠 Program Flow

1. The ATM menu is displayed.
2. The user selects an option.
3. Based on the selection:
   - **Deposit:** The entered amount is added to the balance.
   - **Withdraw:** The entered amount is subtracted if sufficient balance exists.
   - **Balance Inquiry:** The current balance is displayed.
4. If the selection is invalid, an error message is shown.

---

## 💡 Sample Execution

=== ATM APPLICATION ===  
1- Deposit  
2- Withdraw  
3- Check Balance  
Your choice: 2  

Withdrawal amount:  
500  

New balance: 500  

---

## 📌 Java Concepts Practiced

- User input handling with `Scanner`  
- if–else conditional structures  
- Variable updates and state management  
- Basic input validation  
- Console-based menu design  

---

## 📄 File Structure

mini-projects/
└── ATM/
    ├── Main.java
    └── README.md

---

## 📝 Summary

This project provides a clear and beginner-friendly example of how conditional logic and user interaction can be combined to create a simple but meaningful console application in Java. It is ideal for practicing decision-making structures and basic program flow.
