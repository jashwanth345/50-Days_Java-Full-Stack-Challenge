# 🚀 Day 13/50 — Exception Handling in Java

![Java](https://img.shields.io/badge/Java-22-orange?style=for-the-badge&logo=openjdk)
![Topic](https://img.shields.io/badge/Topic-Exception%20Handling-blue?style=for-the-badge)
![Mini Project](https://img.shields.io/badge/Mini%20Project-Bank%20Transaction%20System-green?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)

---

# ☕ 50 Days Java Full Stack Development Challenge

## 📅 Day 13 — Exception Handling

🎉 **Day 13 Completed!**

Today's focus was **Exception Handling in Java**.

To understand the concept practically, I built a console-based:

# 🏦 Bank Transaction System

The project demonstrates how Java can handle invalid transactions using built-in and custom exceptions.

---

# 📚 Topics Covered

- Exception Handling
- `try`
- `catch`
- `finally`
- `throw`
- `throws`
- `IllegalArgumentException`
- Custom Exceptions
- Exception Handling in Banking Transactions

---

# 🧠 What is Exception Handling?

Exception handling is used to handle unexpected situations during program execution so that the application can respond properly instead of failing unexpectedly.

Java provides several keywords for exception handling:

```text
try
catch
finally
throw
throws
```

---

# 🔹 try

The `try` block contains code that may cause an exception.

Example:

```java
try {
    account.withdraw(withdrawAmount);
}
```

In this project, the transaction operations are executed inside a `try` block. :contentReference[oaicite:3]{index=3}

---

# 🔹 catch

The `catch` block handles an exception thrown by the code inside the `try` block.

The project handles two types of exceptions:

```java
catch (InsufficientBlanceException e) {

    System.out.println("❌ " + e.getMessage());

}
catch (IllegalArgumentException e) {

    System.out.println("❌ " + e.getMessage());

}
```

This allows different exceptions to be handled separately. :contentReference[oaicite:4]{index=4}

---

# 🔹 finally

The `finally` block is used to execute code after the transaction attempt.

In this project:

```java
finally {

    if (choice != 4) {
        System.out.println("✅ Transaction Completed.");
    }

}
```

This displays a transaction completion message whenever the user performs an operation other than exiting the application. :contentReference[oaicite:5]{index=5}

---

# 🔹 throw

The `throw` keyword is used to explicitly create and throw an exception.

For example, the deposit method validates the amount:

```java
if(amount <= 0) {
    throw new IllegalArgumentException(
        "Deposit amount must be greater than 0."
    );
}
```

This prevents invalid deposit amounts. :contentReference[oaicite:6]{index=6}

---

# 🔹 throws

The `throws` keyword is used in the `withdraw()` method to declare that it can throw the custom exception.

```java
public void withdraw(double amount)
        throws InsufficientBlanceException {
```

The method then performs the withdrawal operation. :contentReference[oaicite:7]{index=7}

---

# 🚨 Custom Exception

A custom exception named:

```text
InsufficientBlanceException
```

was created by extending the `Exception` class.

```java
public class InsufficientBlanceException extends Exception {

    public InsufficientBlanceException(String message) {
        super(message);
    }
}
```

This provides a dedicated exception type for the banking application. :contentReference[oaicite:8]{index=8}

> **Note:** The class name in the source code is `InsufficientBlanceException` exactly as implemented.

---

# 🏦 Mini Project — Bank Transaction System

The application provides a menu-driven banking system.

## Features

```text
================================
     BANK TRANSACTION SYSTEM
================================

1. Check Balance
2. Deposit
3. Withdraw
4. Exit
```

The application continues displaying the menu until the user chooses option `4`. :contentReference[oaicite:9]{index=9}

---

# 💻 Project Structure

```text
Day-13/
│
├── BankAccount.java
├── BankApplication.java
├── InsufficientBlanceException.java
└── README.md
```

---

# 🏦 BankAccount Class

The `BankAccount` class stores the account balance.

```java
private double balance;
```

The constructor initializes the balance:

```java
public BankAccount(double balance) {
    this.balance = balance;
}
```

The application starts with:

```java
BankAccount account = new BankAccount(5000);
```

So the initial balance is:

```text
₹5000.0
```

:contentReference[oaicite:10]{index=10} :contentReference[oaicite:11]{index=11}

---

# 💰 Check Balance

The `checkBalance()` method displays the current balance.

```java
public void checkBalance() {
    System.out.println("Current Balance:  ₹" + balance);
}
```

:contentReference[oaicite:12]{index=12}

---

# ➕ Deposit

The `deposit()` method first validates the amount.

```java
public void deposit(double amount) {

    if(amount <= 0) {
        throw new IllegalArgumentException(
            "Deposit amount must be greater than 0."
        );
    }

    balance += amount;

    System.out.println(
        "₹" + amount + "deposited successfully."
    );
}
```

### Flow

```text
Deposit Amount
      │
      ▼
Is amount > 0?
   │        │
  YES       NO
   │        │
   ▼        ▼
Deposit   Throw
Money     IllegalArgumentException
   │
   ▼
Success Message
```

:contentReference[oaicite:13]{index=13}

---

# ➖ Withdraw

The `withdraw()` method declares the custom exception:

```java
public void withdraw(double amount)
        throws InsufficientBlanceException
```

The method checks whether the amount is valid and then updates the balance.

```java
if(amount <= 0) {
    throw new IllegalArgumentException(
        "Insufficient balance!"
    );
}

balance -= amount;

System.out.println(
    "₹" + amount + " withdrawn successfully."
);
```

:contentReference[oaicite:14]{index=14}

---

# ⚠️ Important Implementation Note

The current `withdraw()` implementation declares:

```java
throws InsufficientBlanceException
```

but its actual validation currently checks only:

```java
if(amount <= 0)
```

and then subtracts the amount from the balance.

Therefore, the current source code **does not actually check whether the withdrawal amount is greater than the available balance** before subtracting it. :contentReference[oaicite:15]{index=15}

The custom exception class is present and the application catches it, but the current `BankAccount.withdraw()` implementation does not throw it based on insufficient balance.

This is a useful area for a future improvement.

---

# 🖥️ Sample Program Output

With the current program flow, a sample successful transaction sequence can look like:

```text
==============================
     BANK TRANSACTION SYSTEM
==============================
1. Check Balance
2. Deposit
3. Withdraw
4. Exit

Enter your choice: 1

Current Balance:  ₹5000.0
✅ Transaction Completed.


==============================
     BANK TRANSACTION SYSTEM
==============================
1. Check Balance
2. Deposit
3. Withdraw
4. Exit

Enter your choice: 2

Enter deposit amount: 2000

₹2000.0deposited successfully.
✅ Transaction Completed.


==============================
     BANK TRANSACTION SYSTEM
==============================
1. Check Balance
2. Deposit
3. Withdraw
4. Exit

Enter your choice: 3

Enter withdrawal amount: 1000

₹1000.0 withdrawn successfully.
✅ Transaction Completed.


==============================
     BANK TRANSACTION SYSTEM
==============================
1. Check Balance
2. Deposit
3. Withdraw
4. Exit

Enter your choice: 4

Thank you for using our bank!
```

The menu, initial balance, deposit, withdrawal, exit flow, and transaction-completed handling are implemented in `BankApplication.java`. :contentReference[oaicite:16]{index=16} :contentReference[oaicite:17]{index=17}

---

# 🔥 Exception Handling Flow

```text
                 User Input
                     │
                     ▼
              Bank Transaction
                     │
                     ▼
                  try
                     │
          ┌──────────┴──────────┐
          │                     │
       Success               Exception
          │                     │
          │              ┌──────┴──────┐
          │              │             │
          │              ▼             ▼
          │       Custom Exception   IllegalArgument
          │              │            Exception
          │              └──────┬──────┘
          │                     ▼
          │                   catch
          │                     │
          └──────────┬──────────┘
                     ▼
                  finally
                     │
                     ▼
            Transaction Completed
```

---

# 🧩 Exception Handling Components Used

| Component | Usage |
|---|---|
| `try` | Executes transaction operations |
| `catch` | Handles exceptions |
| `finally` | Displays transaction completion |
| `throw` | Explicitly throws `IllegalArgumentException` |
| `throws` | Declares `InsufficientBlanceException` |
| Custom Exception | Represents a banking-specific exception |
| `IllegalArgumentException` | Handles invalid deposit/withdrawal amounts |

---

# 🎯 Key Learnings

Through Day 13, I learned:

- How Java exceptions work
- How to use `try-catch`
- How `finally` works
- How to explicitly throw exceptions
- How `throws` declares possible exceptions
- How to create custom exceptions
- How multiple exceptions can be handled
- How exception handling can be applied to banking applications
- How validation can prevent invalid input

---

# 🌍 Real-World Applications

Exception handling is commonly used in:

### 🏦 Banking

```text
Invalid Amount
Insufficient Balance
Transaction Failure
```

### 💳 Payment Systems

```text
Payment Failure
Invalid Payment
Transaction Error
```

### 🛒 E-Commerce

```text
Invalid Order
Product Not Found
Payment Failure
```

### 🗄️ Database Applications

```text
Connection Failure
SQL Exception
Invalid Query
```

---

# 🛠️ Technologies Used

```text
☕ Java
⚠️ Exception Handling
🚨 Custom Exceptions
💻 Eclipse IDE
🌿 Git
🐙 GitHub
```

---

# ▶️ How to Run

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/jashwanth345/50-Days_Java-Full-Stack-Challenge.git
```

### 2️⃣ Navigate to Day 13

```bash
cd 50-Days_Java-Full-Stack-Challenge/Day-13
```

### 3️⃣ Compile the Java Files

```bash
javac BankAccount.java InsufficientBlanceException.java BankApplication.java
```

### 4️⃣ Run the Application

```bash
java BankApplication
```

---

# 🚀 Future Improvements

The current project can be improved by adding:

- [ ] Proper insufficient-balance validation
- [ ] Transaction history
- [ ] Account number
- [ ] Account holder name
- [ ] Multiple bank accounts
- [ ] Transfer money functionality
- [ ] Transaction IDs
- [ ] Better input validation
- [ ] Database integration using JDBC

---

# 📈 Challenge Progress

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
Day 11  ✅
Day 12  ✅
Day 13  ✅
```

## 🔥 13 / 50 Days Completed

```text
█████████████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░

                    26%
```

### 🚀 13 Days Down • 37 Days To Go!

---

# 🔗 Main GitHub Repository

:contentReference[oaicite:18]{index=18}

---

<div align="center">

# ☕ Day 13 — Exception Handling

## 🏦 Bank Transaction Exception Handling System

### ✅ COMPLETED

**Learn → Code → Build → Test → Improve 🚀**

### 🔥 13 / 50 Days Completed

### 26% of the Challenge Completed

---

**Keep Learning • Keep Coding • Keep Building 🚀**

</div>
