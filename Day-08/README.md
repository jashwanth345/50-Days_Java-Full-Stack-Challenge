# 💳 Payment Processing System
## 🚀 Day 08/50 – Java Full Stack Development Challenge

![Java](https://img.shields.io/badge/Java-22-orange?style=for-the-badge&logo=openjdk)
![OOP](https://img.shields.io/badge/OOP-Polymorphism-blueviolet?style=for-the-badge)
![Challenge](https://img.shields.io/badge/50_Days-Day_08-success?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)

---

## 📖 About the Project

The **Payment Processing System** is a console-based Java application developed as part of **Day 08 of my 50 Days Java Full Stack Development Challenge**.

The main goal of this project is to understand and implement **Polymorphism in Java** through a practical, real-world payment processing scenario.

The system supports three different payment methods:

- 📱 UPI Payment
- 💳 Credit Card Payment
- 🏦 Net Banking Payment

All three payment types inherit common functionality from a parent `Payment` class while providing their own implementation of payment processing.

---

# 🧠 Main Concept – Polymorphism

> **Polymorphism means "One Interface, Multiple Forms."**

Instead of creating completely separate logic for every payment type, the program uses a common `Payment` reference.

```java
Payment payment;
```

The same reference can point to different child objects:

```java
payment = new UPIPayment(...);
payment.processPayment();

payment = new CreditCardPayment(...);
payment.processPayment();

payment = new NetBankingPayment(...);
payment.processPayment();
```

Java determines which overridden `processPayment()` method should execute based on the **actual object at runtime**.

This demonstrates **Runtime Polymorphism / Dynamic Method Dispatch**.

---

# 🏗️ Project Architecture

```text
                         ┌──────────────────────┐
                         │       Payment        │
                         │──────────────────────│
                         │ transactionId        │
                         │ amount               │
                         │──────────────────────│
                         │ processPayment()     │
                         │ displayDetails()     │
                         └──────────┬───────────┘
                                    │
                    ┌───────────────┼────────────────┐
                    │               │                │
                    ▼               ▼                ▼
          ┌────────────────┐ ┌─────────────────┐ ┌──────────────────┐
          │   UPIPayment   │ │CreditCardPayment│ │NetBankingPayment │
          │────────────────│ │─────────────────│ │──────────────────│
          │ upiId          │ │ cardHolderName  │ │ bankName         │
          │────────────────│ │ cardNumber      │ │──────────────────│
          │processPayment()│ │─────────────────│ │ processPayment() │
          │displayDetails()│ │processPayment() │ │ displayDetails() │
          └────────────────┘ │displayDetails() │ └──────────────────┘
                             └─────────────────┘
```

---

# 📂 Project Structure

```text
Day-08/
│
├── Payment.java
├── UPIPayment.java
├── CreditCardPayment.java
├── NetBankingPayment.java
├── Main.java
└── README.md
```

---

# ⚙️ Class Explanation

## 💰 1. Payment – Parent Class

The `Payment` class acts as the **base class** for all payment methods.

### Properties

```java
protected String transactionId;
protected double amount;
```

### Methods

```java
processPayment()
displayDetails()
```

The constructor initializes the common transaction details.

```java
public Payment(String transactionId, double amount) {
    this.transactionId = transactionId;
    this.amount = amount;
}
```

### Responsibility

```text
Payment
   │
   ├── Stores Transaction ID
   ├── Stores Amount
   ├── Provides processPayment()
   └── Provides displayDetails()
```

---

# 📱 2. UPI Payment

`UPIPayment` extends the `Payment` class.

```java
public class UPIPayment extends Payment
```

### Additional Property

```java
private String upiId;
```

### Constructor Chaining

```java
super(transactionId, amount);
```

### Overridden Method

```java
@Override
public void processPayment() {
    System.out.println(
        "Processing ₹" + amount + " through UPI"
    );

    System.out.println("Payment Successful !!!");
}
```

### Flow

```text
UPI Payment
     │
     ▼
Transaction ID
     │
     ▼
Amount
     │
     ▼
UPI ID
     │
     ▼
processPayment()
     │
     ▼
✅ Payment Successful
```

---

# 💳 3. Credit Card Payment

`CreditCardPayment` also inherits from `Payment`.

```java
public class CreditCardPayment extends Payment
```

### Additional Properties

```java
private String cardHolderName;
private String cardNumber;
```

### Processing Flow

```text
Credit Card Payment
        │
        ▼
Transaction Details
        │
        ▼
Card Holder
        │
        ▼
Card Number
        │
        ▼
processPayment()
        │
        ▼
✅ Payment Successful
```

The class overrides both:

```java
processPayment()
displayDetails()
```

to provide Credit Card specific behavior.

---

# 🏦 4. Net Banking Payment

`NetBankingPayment` extends the same `Payment` parent class.

```java
public class NetBankingPayment extends Payment
```

### Additional Property

```java
private String bankName;
```

Example:

```text
Bank Name → State Bank of India
```

### Processing Flow

```text
Net Banking
      │
      ▼
Transaction ID
      │
      ▼
Amount
      │
      ▼
Bank Name
      │
      ▼
processPayment()
      │
      ▼
✅ Payment Successful
```

---

# 🔥 Runtime Polymorphism

This is the most important part of the project.

Instead of doing:

```java
UPIPayment upi = new UPIPayment(...);
CreditCardPayment card = new CreditCardPayment(...);
NetBankingPayment bank = new NetBankingPayment(...);
```

the application uses:

```java
Payment payment;
```

and assigns different child objects to it.

### Visual Representation

```text
                     Payment payment
                           │
             ┌─────────────┼──────────────┐
             │             │              │
             ▼             ▼              ▼
        UPIPayment   CreditCardPayment  NetBankingPayment
             │             │              │
             ▼             ▼              ▼
      UPI Version      Card Version     Bank Version
             │             │              │
             └─────────────┼──────────────┘
                           │
                           ▼
                  processPayment()
                           │
                           ▼
                Runtime Method Selection
```

🔥 The reference is the same.

🔥 The objects are different.

🔥 The behavior changes automatically.

That is **Runtime Polymorphism**.

---

# 🔄 Program Execution Flow

```text
                    ┌─────────────┐
                    │    START    │
                    └──────┬──────┘
                           │
                           ▼
                  Payment payment
                           │
                           ▼
                    UPI Payment
                           │
                  displayDetails()
                           │
                  processPayment()
                           │
                           ▼
                  Credit Card Payment
                           │
                  displayDetails()
                           │
                  processPayment()
                           │
                           ▼
                  Net Banking Payment
                           │
                  displayDetails()
                           │
                  processPayment()
                           │
                           ▼
                 ┌─────────────────┐
                 │ Program Complete│
                 └─────────────────┘
```

---

# 🖥️ Sample Program Output

```text
========== UPI PAYMENT ==========

Transaction ID : TXN101
Amount         : ₹1500.0
Payment Method : UPI
UPI ID         : jashu@upi

Processing ₹1500.0 through UPI
Payment Successful !!!


======= CREDIT CARD PAYMENT =======

Transaction ID : TXN102
Amount         : ₹5000.0
Payment Method : Credit Card
Card Holder    : Jashwanth
Card Number    : 1234-5678-9012-3456

Processing ₹5000.0 through Credit Card...
Payment Successful!!!


======= NET BANKING PAYMENT =======

Transaction ID : TXN103
Amount         : ₹10000.0
Payment Method : Net Banking
Bank Name      : State Bank of India

Processing ₹10000.0 through Net Banking...
Payment Successful!!!
```

---

# 📊 Transaction Summary

| Transaction | Payment Method | Amount | Details | Status |
|:---:|:---|---:|:---|:---:|
| TXN101 | 📱 UPI | ₹1,500 | `jashu@upi` | ✅ Successful |
| TXN102 | 💳 Credit Card | ₹5,000 | Jashwanth | ✅ Successful |
| TXN103 | 🏦 Net Banking | ₹10,000 | State Bank of India | ✅ Successful |

### 💰 Total Amount Processed

```text
₹1,500 + ₹5,000 + ₹10,000
                │
                ▼
            ₹16,500
```

---

# 🔑 OOP Concepts Used

| Concept | Implementation |
|---|---|
| 🧬 Inheritance | Payment → UPI, Credit Card, Net Banking |
| 🎭 Polymorphism | Same `Payment` reference for different objects |
| 🔄 Method Overriding | Different `processPayment()` implementations |
| ⬆️ Upcasting | Child object stored in parent reference |
| ⚡ Dynamic Dispatch | JVM selects overridden method at runtime |
| 🏗️ Constructors | Initializes transaction/payment information |
| 🔗 `super()` | Calls the parent class constructor |
| 🔒 Encapsulation | Payment-specific fields kept private |
| ♻️ Reusability | Common fields/methods stored in `Payment` |

---

# 🆚 Overloading vs Overriding

| Method Overloading | Method Overriding |
|---|---|
| Compile-time Polymorphism | Runtime Polymorphism |
| Same method name | Same method signature |
| Different parameters | Parent → Child implementation |
| Usually within same class | Requires inheritance |
| Compiler decides | JVM decides at runtime |

---

# 💡 Why Polymorphism?

Without polymorphism:

```text
UPIPayment
CreditCardPayment
NetBankingPayment

→ Separate references
→ More dependent code
→ Harder to extend
```

With polymorphism:

```text
             Payment
                │
        ┌───────┼───────┐
        ▼       ▼       ▼
       UPI     Card    Banking
        │       │       │
        └───────┼───────┘
                ▼
         Common Interface
```

### Benefits

✅ Code Reusability  
✅ Loose Coupling  
✅ Flexibility  
✅ Easy Maintenance  
✅ Easy Extension  
✅ Cleaner OOP Design  

---

# 🌍 Real-World Understanding

Imagine an e-commerce application.

A customer selects:

```text
Choose Payment Method

┌───────────────────────┐
│ 📱 UPI                │
│ 💳 Credit Card        │
│ 🏦 Net Banking        │
└───────────────────────┘
```

The application doesn't need completely different overall workflows.

It can simply work with:

```java
Payment payment;
```

and the actual payment implementation can change depending on the selected method.

This is one of the major advantages of **Polymorphism in real-world software development**.

---

# 🎯 Key Takeaways

Through this project, I learned how to:

- Understand Polymorphism practically
- Implement Runtime Polymorphism
- Use Method Overriding
- Work with Parent References and Child Objects
- Perform Upcasting
- Understand Dynamic Method Dispatch
- Reuse common functionality through Inheritance
- Build flexible Java applications
- Design classes with real-world relationships

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

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/jashwanth345/50-Days_Java-Full-Stack-Challenge.git
```

### 2️⃣ Navigate to Day 08

```bash
cd 50-Days_Java-Full-Stack-Challenge/Day-08
```

### 3️⃣ Compile

```bash
javac *.java
```

### 4️⃣ Run

```bash
java Main
```

---

# 📈 50 Days Challenge Progress

```text
Day 01  ████████████████████  ✅ Java Basics
Day 02  ████████████████████  ✅ Control Flow
Day 03  ████████████████████  ✅ Arrays
Day 04  ████████████████████  ✅ Methods
Day 05  ████████████████████  ✅ Strings
Day 06  ████████████████████  ✅ OOP Basics
Day 07  ████████████████████  ✅ Inheritance
Day 08  ████████████████████  ✅ Polymorphism
Day 09  ░░░░░░░░░░░░░░░░░░░░  🔜 Next
```

### Overall Progress

```text
████████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
8 / 50 Days Completed
```

### 🎯 **16% Complete**

**42 Days Remaining 🚀**

---

# 🔗 GitHub Repository

### 🌟 50 Days Java Full Stack Development Challenge

**Repository:**  
https://github.com/jashwanth345/50-Days_Java-Full-Stack-Challenge

If you find this learning journey useful, consider giving the repository a ⭐.

---

# 🚀 What's Next?

## Day 09/50

```text
Day 08
Polymorphism
     │
     │ ✅ Completed
     ▼
Day 09
Coming Next...
     │
     ▼
Continue Learning 🚀
```

---

<div align="center">

## ☕ 50 Days of Java Full Stack Development

### Day 08/50 — COMPLETED ✅

**Learn → Code → Build → Share → Grow 🚀**

### 8 Days Down • 42 Days To Go 🔥

⭐ Keep Learning • Keep Building • Keep Growing ⭐

</div>
