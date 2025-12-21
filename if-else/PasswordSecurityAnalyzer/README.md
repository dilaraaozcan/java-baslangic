# 🔐 PasswordSecurityAnalyzer — Password Security Analysis System

This project is an if-else based Java console application that determines the security level of a user-provided password by analyzing it character by character. The application checks for uppercase letters, lowercase letters, digits, and special characters, and automatically rejects passwords that contain whitespace. After scanning all character types, a security score is calculated and the password is classified as “Very Strong”, “Strong”, “Medium”, “Weak”, or “Very Weak”.

---

## 🎯 Project Objectives

- Analyze character diversity in passwords
- Apply if-else logic to a real-world problem
- Learn character-to-category mapping (uppercase, lowercase, digit, special character)
- Build decision mechanisms using boolean flags inside loops
- Develop a character-based security scoring system and generate meaningful results

---

## 🧠 Security Criteria Evaluated

- Contains at least one **uppercase letter**
- Contains at least one **lowercase letter**
- Contains at least one **digit**
- Contains at least one **special character**
- Contains **whitespace** (if so, the password is immediately rejected)
- If the password length is too short (less than 6 characters), it is automatically considered weak

---

## 🔍 Scoring Logic

Each satisfied criterion adds 1 point to the password score:
- Uppercase letter → +1  
- Lowercase letter → +1  
- Digit → +1  
- Special character → +1  

Classification based on total score:
- 4 → Very Strong  
- 3 → Strong  
- 2 → Medium  
- 1 → Weak  
- 0 → Very Weak  

---

## 📤 Sample Outputs

Input: `Hello123`  
Uppercase: true  
Lowercase: true  
Digit: true  
Special Character: false  
Password Strength: Strong  

Input: `Ab!1xY?`  
→ Password Strength: Very Strong  

Input: `abc 123`  
→ “Password cannot contain spaces!”

---

## 📄 Project Structure

if-else/
└── PasswordSecurityAnalyzer/
    ├── Main.java
    └── README.md

---

This project teaches the fundamental working logic of real-world password validation systems and is ideal for reinforcing if-else structures through a practical and meaningful scenario.
