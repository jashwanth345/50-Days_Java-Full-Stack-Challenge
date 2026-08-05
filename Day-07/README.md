
# 🚀 Day 07 – Employee Management System

## ☕ 50 Days of Java Full Stack Development Challenge

Welcome to **Day 07** of my **50 Days of Java Full Stack Development Challenge**!

Today's focus is on one of the most important concepts of Object-Oriented Programming in Java — **Inheritance**.

To understand inheritance practically, I built a console-based **Employee Management System** using Java.

---

## 📌 Project Overview

The **Employee Management System** demonstrates how a parent class can provide common properties and behaviors to multiple child classes.

The project contains a parent `Employee` class and three specialized employee types:

```text
                    Employee
                       │
          ┌────────────┼────────────┐
          │            │            │
      Developer      Tester       Manager
```

Each employee type inherits common properties from the `Employee` class and provides its own additional details and salary calculation.

---

## 🧠 Concepts Used

- Classes & Objects
- Constructors
- Inheritance
- Hierarchical Inheritance
- Method Overriding
- Runtime Polymorphism Basics
- `super` Keyword
- `this` Keyword
- `final` Keyword
- Static Members
- Scanner Class
- User Input
- Code Reusability

---

## 👨‍💼 Employee Class

The parent `Employee` class contains common employee information.

### Properties

- Employee ID
- Employee Name
- Basic Salary
- Company Name

### Methods

- `calculateSalary()`
- `displayDetails()`
- `companyPolicy()`

---

## 👨‍💻 Developer Class

The `Developer` class extends the `Employee` class.

### Additional Properties

- Programming Language
- Bonus

### Salary Calculation

```text
Total Salary = Basic Salary + Bonus
```

---

## 🧪 Tester Class

The `Tester` class also extends the `Employee` class.

### Additional Properties

- Testing Type
- Bonus

### Salary Calculation

```text
Total Salary = Basic Salary + Bonus
```

---

## 👨‍💼 Manager Class

The `Manager` class extends the `Employee` class.

### Additional Properties

- Team Size
- Allowance

### Salary Calculation

```text
Total Salary = Basic Salary + Allowance
```

---

## ⚙️ Features

✔ Create Developer, Tester, and Manager objects  
✔ Accept employee details from the user  
✔ Store common details using the parent `Employee` class  
✔ Calculate different salaries based on employee role  
✔ Override `calculateSalary()`  
✔ Override `displayDetails()`  
✔ Access parent constructor using `super()`  
✔ Display company policy  
✔ Display formatted employee details  

---

## 🔥 Inheritance Structure

```text
Employee
│
├── Developer
│   ├── Programming Language
│   └── Bonus
│
├── Tester
│   ├── Testing Type
│   └── Bonus
│
└── Manager
    ├── Team Size
    └── Allowance
```

---

## 🖥️ Sample Input & Output

```text
======================================
     EMPLOYEE MANAGEMENT SYSTEM
======================================

--- Enter Developer Details ---
Employee ID: 310
Name: Jashu
Basic Salary: 52000
Programming Language: Java
Bonus: 12000

--- Enter Tester Details ---
Employee ID: 300
Name: Pavan
Basic Salary: 43000
Testing Type: Automation Testing
Bonus: 12000

--- Enter Manager Details ---
Employee ID: 298
Name: Yashu
Basic Salary: 56000
Team Size: 10
Allowance: 10000


======================================
           EMPLOYEE DETAILS
======================================

---------- DEVELOPER ----------

Company Name : Panasakayy Private Limited
Employee ID  : 310
Name         : Jashu
Basic Salary : ₹52000.0
Role         : Developer
Language     : Java
Bonus        : ₹12000.0
Total Salary : ₹64000.0
Policy       : Follow company rules and regulations.

---------- TESTER -------------

Company Name : Panasakayy Private Limited
Employee ID  : 300
Name         : Pavan
Basic Salary : ₹43000.0
Role         : Tester
Testing Type : Automation Testing
Bonus        : ₹12000.0
Total Salary : ₹55000.0
Policy       : Follow company rules and regulations.

---------- MANAGER ------------

Company Name : Panasakayy Private Limited
Employee ID  : 298
Name         : Yashu
Basic Salary : ₹56000.0
Role         : Manager
Team Size    : 10
Allowance    : ₹10000.0
Total Salary : ₹66000.0
Policy       : Follow company rules and regulations.

======================================
       Program Completed!
======================================
```

---

## 📊 Salary Summary

| Role | Basic Salary | Extra | Total Salary |
|------|-------------:|------:|-------------:|
| 👨‍💻 Developer | ₹52,000 | ₹12,000 Bonus | **₹64,000** |
| 🧪 Tester | ₹43,000 | ₹12,000 Bonus | **₹55,000** |
| 👨‍💼 Manager | ₹56,000 | ₹10,000 Allowance | **₹66,000** |

---

## 💡 What I Learned

Through this project, I learned how to:

- Create parent and child classes in Java.
- Reuse properties and methods through inheritance.
- Use the `extends` keyword.
- Call parent constructors using `super()`.
- Access parent methods using `super`.
- Override methods using `@Override`.
- Implement different salary calculations for different employee roles.
- Use the `final` keyword for values and methods that should not be modified.
- Structure a Java application using OOP principles.
- Build a practical console-based application.

---

## 🛠️ Technologies Used

- ☕ Java
- 🧠 Object-Oriented Programming
- ⌨️ Java Scanner
- 💻 Eclipse IDE
- 🌿 Git
- 🐙 GitHub

---

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/jashwanth345/50-Days_Java-Full-Stack-Challenge.git
```

### 2. Open the Day 07 project

Navigate to the **Day-07** folder and open the Java project in Eclipse, IntelliJ IDEA, or VS Code.

### 3. Compile the program

```bash
javac EmployeeManagementSystem.java
```

### 4. Run the program

```bash
java EmployeeManagementSystem
```

---

## 📈 Challenge Progress

```text
Day 01  ✅ Java Basics
Day 02  ✅ Control Flow Statements
Day 03  ✅ Arrays in Java
Day 04  ✅ Methods in Java
Day 05  ✅ Strings in Java
Day 06  ✅ OOP Concepts
Day 07  ✅ Inheritance in Java

Progress: 7 / 50 Days 🚀
```

**14% of the challenge completed!**

---

## 🔗 Repository

**50 Days Java Full Stack Development Challenge**

https://github.com/jashwanth345/50-Days_Java-Full-Stack-Challenge

---

## 🚀 What's Next?

### Day 08 – Polymorphism in Java

Next, I will explore:

- Compile-Time Polymorphism
- Runtime Polymorphism
- Method Overloading
- Method Overriding
- Dynamic Method Dispatch

---

## ⭐ Support

If you find this learning journey useful, feel free to **star ⭐ the repository** and follow my progress throughout the **50 Days Java Full Stack Development Challenge**.

---

### 💻 Learn. Code. Build. Share. Grow.

**Day 07/50 Completed ✅**

> Consistency today, success tomorrow! 🚀
