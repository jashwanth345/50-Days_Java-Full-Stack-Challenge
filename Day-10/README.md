# 🔐 Day 10/50 — Encapsulation in Java

![Java](https://img.shields.io/badge/Java-22-orange?style=for-the-badge&logo=openjdk)
![OOP](https://img.shields.io/badge/OOP-Encapsulation-blueviolet?style=for-the-badge)
![Challenge](https://img.shields.io/badge/50%20Days-Day%2010-success?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)

---

# 🚀 50 Days Java Full Stack Development Challenge

## 📅 Day 10 — Encapsulation

🎯 **Day 10 Completed!**

Today's focus was **Encapsulation**, one of the four fundamental principles of Object-Oriented Programming in Java.

> 🔐 **Encapsulation = Data Hiding + Controlled Access**

The main purpose of Encapsulation is to protect an object's internal data from direct access and provide controlled ways to read or modify it.

---

# 🧠 What is Encapsulation?

**Encapsulation** is the process of wrapping data (variables) and methods that operate on that data into a single class while restricting direct access to the data.

Instead of allowing other classes to directly modify important fields, we make them `private` and provide controlled methods.

### ❌ Without Encapsulation

```java
account.balance = -5000;
```

Anyone can directly modify the balance.

### ✅ With Encapsulation

```java
account.deposit(5000);
account.withdraw(2000);
account.getBalance();
```

The object controls how its data is accessed and modified.

---

# 🔐 Data Hiding

The main implementation of Encapsulation in this project is **private fields**.

```java
private int accountNumber;
private String accountHolder;
private String accountType;
private double balance;
```

These variables cannot be directly accessed from outside the `BankAccount` class.

Instead, controlled methods are provided:

```java
public double getBalance() {
    return balance;
}
```

and:

```java
public boolean deposit(double amount) {
    
    if (amount > 0) {
        balance += amount;
        return true;
    }

    return false;
}
```

---

# 🏦 Mini Project — Bank Account Management System

For Day 10, I built a simple **Bank Account Management System** to understand Encapsulation using a real-world example.

The application manages:

- 👤 Account Number
- 👤 Account Holder
- 🏦 Account Type
- 💰 Account Balance

It also supports:

- 💵 Deposit
- 💸 Withdrawal
- 📊 Balance Checking
- 📋 Account Details
- 🔐 Data Protection

---

# 🏗️ Project Architecture

```text
                  ┌─────────────────────────┐
                  │       BankAccount       │
                  │─────────────────────────│
                  │ 🔒 accountNumber        │
                  │ 🔒 accountHolder        │
                  │ 🔒 accountType          │
                  │ 🔒 balance              │
                  │                         │
                  │ + deposit()             │
                  │ + withdraw()            │
                  │ + getBalance()          │
                  │ + getAccountNumber()    │
                  │ + getAccountHolder()    │
                  │ + displayDetails()      │
                  └────────────┬────────────┘
                               │
                               ▼
                       Controlled Access
                               │
                ┌──────────────┼──────────────┐
                ▼              ▼              ▼
            Deposit        Withdraw       Get Balance
                │              │              │
                └──────────────┼──────────────┘
                               ▼
                       🔐 Private Data
```

---

# 📂 Project Structure

```text
Day-10/
│
├── BankAccount.java
├── Main.java
└── README.md
```

---

# 💻 BankAccount Class

The `BankAccount` class contains all account-related data and operations.

### 🔒 Private Fields

```java
private int accountNumber;
private String accountHolder;
private String accountType;
private double balance;
```

Making these fields `private` prevents direct access from outside the class.

---

# 🏗️ Constructor

The constructor initializes the account details.

```java
public BankAccount(int accountNumber,
                   String accountHolder,
                   String accountType,
                   double balance) {

    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    this.accountType = accountType;
    this.balance = balance;
}
```

---

# 💰 Deposit Operation

The `deposit()` method provides controlled access to the balance.

```java
public boolean deposit(double amount) {

    if (amount > 0) {
        balance += amount;
        return true;
    }

    return false;
}
```

### Flow

```text
User
 │
 ▼
deposit(amount)
 │
 ▼
Is amount > 0?
 │
 ├── YES ──► Add to balance
 │
 └── NO ───► Reject transaction
```

---

# 💸 Withdraw Operation

The `withdraw()` method ensures that users cannot withdraw an invalid amount.

```java
public boolean withdraw(double amount) {

    if (amount > 0 && amount <= balance) {
        balance -= amount;
        return true;
    }

    return false;
}
```

### Flow

```text
User
 │
 ▼
withdraw(amount)
 │
 ▼
Amount > 0?
 │
 ▼
Amount <= Balance?
 │
 ├── YES ──► Withdraw Money
 │
 └── NO ───► Reject Transaction
```

---

# 📊 Getters

The balance is private, so we use a getter to access it.

```java
public double getBalance() {
    return balance;
}
```

Other getters:

```java
public int getAccountNumber() {
    return accountNumber;
}

public String getAccountHolder() {
    return accountHolder;
}

public String getAccountType() {
    return accountType;
}
```

---

# 🔐 Encapsulation Flow

```text
                USER
                  │
                  ▼
          ┌───────────────┐
          │  BankAccount  │
          └───────┬───────┘
                  │
          🔒 Private Data
                  │
        ┌─────────┼─────────┐
        │         │         │
        ▼         ▼         ▼
    deposit() withdraw() getBalance()
        │         │         │
        └─────────┼─────────┘
                  │
                  ▼
          Controlled Access
```

---

# 🖥️ Sample Output

```text
==========================================
       BANK ACCOUNT MANAGEMENT SYSTEM
==========================================


---------- ACCOUNT DETAILS ----------

Account Number : 101
Account Holder : Jashu
Account Type   : Savings Account
Balance        : ₹50000.0


---------- DEPOSIT ----------

Deposit Amount : ₹5000.0
Status         : Deposit Successful!
Updated Balance: ₹55000.0


---------- WITHDRAW ----------

Withdraw Amount: ₹3000.0
Status         : Withdrawal Successful!
Updated Balance: ₹52000.0


---------- BALANCE CHECK ----------

Account Number : 101
Account Holder : Jashu
Current Balance: ₹52000.0


---------- DATA PROTECTION ----------

Account Number : Private
Account Holder : Private
Balance        : Private

Access Method  : Controlled Methods
Status         : Encapsulation Applied Successfully!


==========================================
          TRANSACTION COMPLETED
==========================================
```

---

# 📊 Transaction Summary

| Operation | Amount | Balance | Status |
|---|---:|---:|---|
| Initial Balance | ₹50,000 | ₹50,000 | ✅ |
| Deposit | +₹5,000 | ₹55,000 | ✅ |
| Withdrawal | -₹3,000 | ₹52,000 | ✅ |
| Final Balance | — | **₹52,000** | ✅ |

---

# 🧩 OOP Concepts Used

| Concept | Implementation |
|---|---|
| 🔐 Encapsulation | Data and methods wrapped inside `BankAccount` |
| 🔒 Data Hiding | Fields declared as `private` |
| 🎯 Controlled Access | Getters and business methods |
| ✅ Validation | Deposit and withdrawal validation |
| 🏗️ Constructor | Initializes account information |
| ♻️ Reusability | Account operations can be reused |

---

# 🔑 Access Modifiers

Java provides four main access levels:

```text
┌───────────────┬─────────────────────────────────┐
│ Modifier      │ Accessibility                   │
├───────────────┼─────────────────────────────────┤
│ public        │ Everywhere                      │
│ protected     │ Same package + subclasses       │
│ default       │ Same package                    │
│ private       │ Same class only                 │
└───────────────┴─────────────────────────────────┘
```

For Encapsulation, `private` is especially important because it prevents direct access to internal data.

---

# 🆚 Encapsulation vs Abstraction

| Encapsulation 🔐 | Abstraction 🎭 |
|---|---|
| Hides/protects data | Hides implementation details |
| Focuses on data access | Focuses on essential functionality |
| Uses private fields | Uses abstract classes/interfaces |
| Getters/setters and methods | Abstract methods/interfaces |
| Example: private `balance` | Example: abstract `calculateInterest()` |

### Easy way to remember:

> 🔐 **Encapsulation → Protect the Data**

> 🎭 **Abstraction → Hide the Implementation**

---

# 🌍 Real-World Applications

Encapsulation is widely used in real-world software.

### 🏦 Banking

```text
Private Balance
      ↓
deposit()
withdraw()
getBalance()
```

### 👨‍💼 Employee Management

```text
Private Salary
      ↓
getSalary()
setSalary()
```

### 🛒 E-Commerce

```text
Private Product Price
      ↓
getPrice()
setPrice()
```

### 👤 User Management

```text
Private Password
      ↓
Controlled Authentication
```

---

# ⭐ Advantages of Encapsulation

### 🔐 1. Data Security

Prevents unauthorized direct modification.

### 🛠️ 2. Maintainability

Internal implementation can change without affecting other classes.

### ✅ 3. Validation

Invalid data can be rejected before updating the object.

### ♻️ 4. Reusability

Methods can be reused across different parts of the application.

### 📦 5. Modularity

Data and related operations stay together inside a class.

---

# 🎯 Key Takeaways

Through this project, I learned:

- What Encapsulation means
- How Data Hiding works
- Why fields should often be `private`
- How getters provide controlled read access
- How methods can control data modification
- How validation can protect object state
- How Encapsulation improves maintainability
- How Encapsulation applies to real-world banking systems

---

# 🛠️ Technologies Used

```text
☕ Java
🧠 Object-Oriented Programming
💻 Eclipse IDE
🌿 Git
🐙 GitHub
```

---

# ▶️ How to Run

### 1️⃣ Clone the repository

```bash
git clone https://github.com/jashwanth345/50-Days_Java-Full-Stack-Challenge.git
```

### 2️⃣ Navigate to Day 10

```bash
cd 50-Days_Java-Full-Stack-Challenge/Day-10
```

### 3️⃣ Compile

```bash
javac Main.java
```

### 4️⃣ Run

```bash
java Main
```

---

# 📈 50 Days Challenge Progress

```text
Day 01  ✅
Day 02  ✅
Day 03  ✅
Day 04  ✅
Day 05  ✅
Day 06  ✅
Day 07  ✅
Day 08  ✅
Day 09  ✅
Day 10  ✅
```

## 🔥 Progress: 10 / 50 Days

```text
██████████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░

                     20%
```

### 🎉 10 Days Down — 40 Days To Go!

---

# 🔗 GitHub Repository

### 🚀 50 Days Java Full Stack Development Challenge

🔗 **Repository:**

https://github.com/jashwanth345/50-Days_Java-Full-Stack-Challenge

---

# 🚀 What's Next?

```text
Day 09
Abstraction
     │
     ▼
Day 10
Encapsulation ✅
     │
     ▼
Day 11
Coming Next 🚀
```

---

<div align="center">

# ☕ 50 Days Java Full Stack Development Challenge

## 🔐 Day 10 — Encapsulation

### ✅ COMPLETED

**10 Days Down • 40 Days To Go 🔥**

### Learn → Code → Build → Share → Grow 🚀

⭐ Keep Learning • Keep Building • Keep Growing ⭐

</div>
